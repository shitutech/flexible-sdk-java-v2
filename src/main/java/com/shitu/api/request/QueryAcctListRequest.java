package com.shitu.api.request;

import java.util.Objects;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.QueryAcctListModel;
import com.shitu.api.response.QueryAcctListResponse;

public class QueryAcctListRequest extends AbstractFlexibleRequest<QueryAcctListResponse> {

    private final QueryAcctListModel bizModel;

    public QueryAcctListRequest(QueryAcctListModel bizModel) {
        Objects.requireNonNull(bizModel);
        this.bizModel = bizModel;
    }

    @Override
    public String getApi() {
        return Constant.Api.API_QUERY_ACCOUNT_LIST;
    }

    @Override
    public Class<QueryAcctListResponse> getResponseClass() {
        return QueryAcctListResponse.class;
    }

    @Override
    protected String doGetParams() {
        return JSON.toJSONString(this.getBizModel());
    }

    public QueryAcctListModel getBizModel() {
        return bizModel;
    }

}
