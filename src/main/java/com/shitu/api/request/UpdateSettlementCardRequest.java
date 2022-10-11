package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.UpdateSettlementCardModel;
import com.shitu.api.response.UpdateSettlementCardResponse;
import com.shitu.api.utils.FileUtil;

import java.io.File;
import java.util.Base64;
import java.util.Objects;

/**
 * 用户信息变更接口
 * 
 * @author andrew
 * @date 2021-10-28 5:36 PM
 */
public class UpdateSettlementCardRequest extends AbstractFlexibleRequest<UpdateSettlementCardResponse> {

    private final UpdateSettlementCardModel bizModel;

    public UpdateSettlementCardRequest(UpdateSettlementCardModel bizModel) {
        Objects.requireNonNull(bizModel);
        this.bizModel = bizModel;
    }

    public UpdateSettlementCardModel getBizModel() {
        return bizModel;
    }

    public void setImgBank(File imgBank) {
        if (null != imgBank && getBizModel().getImgBank() == null) {
            getBizModel().setImgBank(Base64
                    .getEncoder()
                    .encodeToString(FileUtil.fileToBytes(imgBank)));
        }
    }

    /**
     * 实际的请求参数的json格式的字符串
     *
     * @return json字符串
     */
    @Override
    protected String doGetParams() {
        return JSON.toJSONString(this.getBizModel());
    }

    /**
     * API route
     *
     * @return route
     */
    @Override
    public String getApi() {
        return Constant.Api.API_ACCT_UPDATE;
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<UpdateSettlementCardResponse> getResponseClass() {
        return UpdateSettlementCardResponse.class;
    }
}
