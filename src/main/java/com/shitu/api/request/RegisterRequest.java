package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.ClientSdkException;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.RegisterModel;
import com.shitu.api.response.RegisterResponse;
import com.shitu.api.utils.FileUtil;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Objects;

/**
 * 用户注册接口
 *
 * @author andrew
 * @date 2021-10-27 3:14 PM
 */
public final class RegisterRequest extends AbstractFlexibleRequest<RegisterResponse> {

    private final RegisterModel bizModel;

    public RegisterRequest(RegisterModel bizModel) {
        Objects.requireNonNull(bizModel);
        this.bizModel = bizModel;
    }

    public RegisterModel getBizModel() {
        return bizModel;
    }

    public void setFrontImg(File frontImg) {
        if (null != frontImg && getBizModel().getImgIdCardFront() == null) {
            getBizModel().setImgIdCardFront(Base64
                    .getEncoder()
                    .encodeToString(FileUtil.fileToBytes(frontImg)));
        }
    }

    public void setBgImg(File bgImg) {
        if (null != bgImg && getBizModel().getImgIdCardBack() == null) {
            getBizModel().setImgIdCardBack(Base64
                    .getEncoder()
                    .encodeToString(FileUtil.fileToBytes(bgImg)));
        }
    }

    public void setFaceImg(File imgFace) {
        if (null != imgFace && getBizModel().getImgFace() == null) {
            getBizModel().setImgFace(Base64
                    .getEncoder()
                    .encodeToString(FileUtil.fileToBytes(imgFace)));
        }
    }

    /**
     * API route
     *
     * @return route
     */
    @Override
    public String getApi() {
        return Constant.Api.API_ACCT_REGISTER;
    }

    @Override
    protected void checkParams() throws ClientSdkException {
        if (getBizModel().getImgIdCardFront() == null || getBizModel().getImgIdCardBack() == null) {
            throw new ClientSdkException("身份证正反面照片不能为空");
        }

        if (getBizModel().getImgIdCardFront().getBytes(StandardCharsets.UTF_8).length > Constant.FILE_MAX_SIZE
                || getBizModel().getImgIdCardBack().getBytes(StandardCharsets.UTF_8).length > Constant.FILE_MAX_SIZE) {
            throw new ClientSdkException("图片大小不能超过2MB");
        }

        if (getBizModel().getImgFace() != null
                && getBizModel().getImgFace().getBytes(StandardCharsets.UTF_8).length > Constant.FILE_MAX_SIZE) {
            throw new ClientSdkException("图片大小不能超过2MB");
        }
    }

    /**
     * 实际的请求参数的json格式的字符串
     *
     * @return json字符串
     */
    @Override
    protected String doGetParams() {
        return JSON.toJSONString(getBizModel());
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<RegisterResponse> getResponseClass() {
        return RegisterResponse.class;
    }
}
