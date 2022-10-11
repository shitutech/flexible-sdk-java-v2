package com.shitu.api;

import com.shitu.api.request.AbstractFlexibleRequest;
import com.shitu.api.response.AbstractApiResponse;

/**
 * @author andrew
 * @date 2021-10-27 3:38 PM
 */
public interface SdkClient {

    /**
     * 执行http请求的客户端api
     *
     * @param request 请求参数
     * @return 响应结果
     * @throws ClientSdkException 异常
     */
    <R extends AbstractApiResponse> ResponseVO<R> execute(AbstractFlexibleRequest<R> request) throws ClientSdkException;
}
