package com.shitu.api.request;

import java.util.Objects;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.QueryBankCardListModel;
import com.shitu.api.response.QueryBankCardListResponse;

public class QueryBankCardListRequest extends AbstractFlexibleRequest<QueryBankCardListResponse> {

    private final QueryBankCardListModel bizModel;

    public QueryBankCardListRequest(QueryBankCardListModel bizModel) {
        Objects.requireNonNull(bizModel);
        this.bizModel = bizModel;
    }

    @Override
    public String getApi() {
        return Constant.Api.API_QUERY_MEMBER_BANK_LIST;
    }

    @Override
    public Class<QueryBankCardListResponse> getResponseClass() {
        return QueryBankCardListResponse.class;
    }

    @Override
    protected String doGetParams() {
        return JSON.toJSONString(this.getBizModel());
    }

    public QueryBankCardListModel getBizModel() {
        return bizModel;
    }
}
