package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.GetSupportBankModel;
import com.shitu.api.response.GetSupportBankResponse;

public class GetSupportBankRequest extends AbstractFlexibleRequest<GetSupportBankResponse> {

    private final GetSupportBankModel bizModel;

    public GetSupportBankRequest(GetSupportBankModel bizModel) {
        this.bizModel = bizModel;
    }

    @Override
    public String getApi() {
        return Constant.Api.API_QUERY_CHANNEL_BANK_LIST;
    }

    @Override
    public Class<GetSupportBankResponse> getResponseClass() {
        return GetSupportBankResponse.class;
    }

    @Override
    protected String doGetParams() {
        return JSON.toJSONString(this.getBizModel());
    }

    public GetSupportBankModel getBizModel() {
        return bizModel;
    }

}
