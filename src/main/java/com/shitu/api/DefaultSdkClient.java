package com.shitu.api;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.shitu.api.request.AbstractFlexibleRequest;
import com.shitu.api.request.FlexibleRequest;
import com.shitu.api.response.AbstractApiResponse;
import com.shitu.api.utils.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author andrew
 * @date 2021-10-27 3:42 PM
 */
public final class DefaultSdkClient implements SdkClient {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private final ClientConfig config;

    public DefaultSdkClient(ClientConfig config) throws ClientSdkException {
        if (null == config) {
            throw new ClientSdkException("客户端未配置");
        }
        this.config = config;
    }

    /**
     * 执行http请求的客户端api
     *
     * @param request 请求参数
     * @return 响应结果
     * @throws ClientSdkException 异常
     */
    @Override
    public <R extends AbstractApiResponse> ResponseVO<R> execute(AbstractFlexibleRequest<R> request) throws ClientSdkException {
        if (null == request) {
            throw new ClientSdkException("请求参数为空");
        }
        String apiRoute = request.getApi();
        String url = this.config.getDomain().concat(apiRoute);
        if (logger.isDebugEnabled()) {
            logger.debug("准备请求接口[{}], 原始请求参数为: {}", url, request.getParam());
        }
        ApiRequest req = generateApiRequest(request);
        Class<R> clazz = request.getResponseClass();
        if (logger.isDebugEnabled()) {
            logger.debug("准备请求接口[{}], 加密后的参数为: {}", url, JSON.toJSONString(req));
        }
        // post json;
        try {
            String resp = WebUtils.postJson(url, req, 5000, 15000, null);
            if (logger.isDebugEnabled()) {
                logger.debug("请求接口[{}]响应的结果为: {}", url, resp);
            }
            if (null == resp) {
                throw new ClientSdkException("请求超时");
            }
            return JSON.parseObject(resp, new TypeReference<ResponseVO<R>>(clazz){});
        } catch (Exception e) {
            logger.error("请求接口[{}]处理失败, 异常信息为: ", url, e);
            throw new ClientSdkException(e);
        }
    }

    private <R extends AbstractApiResponse> ApiRequest generateApiRequest(FlexibleRequest<R> request) throws ClientSdkException {
        try {
            String requestTime = DateTimeUtil.getDateStr();
            String aesKey = AesUtil.getAesKey();
            String nonceStr = StringUtil.getNonceStr();

            // 加密请求参数
            String requestData = AesUtil.encrypt(request.getParam(), aesKey);
            // 加密aesKey
            String encryptedKey = SignUtil.encryptByPublicKey(aesKey,
                    this.config.getSystemPublicKey());
            // 生成签名
            String toSign = requestTime + nonceStr + this.config.getMerchantNo()
                    + requestData + encryptedKey;
            String sign = SignUtil.sign(toSign, this.config.getPrivateKey());

            return ApiRequest.Builder.builder()
                    .encryptKey(encryptedKey)
                    .nonce(nonceStr)
                    .requestData(requestData)
                    .sign(sign)
                    .requestTime(requestTime)
                    .merchantNo(this.config.getMerchantNo())
                    .build();
        } catch (Exception e) {
            throw new ClientSdkException("客户端异常", e);
        }
    }
}
