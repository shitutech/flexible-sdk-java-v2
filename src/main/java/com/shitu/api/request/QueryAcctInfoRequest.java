package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.QueryAccountInfoModel;
import com.shitu.api.response.QueryAcctInfoResponse;

/**
 * @author andrew
 * @date 2021-10-28 5:49 PM
 */
public class QueryAcctInfoRequest extends AbstractFlexibleRequest<QueryAcctInfoResponse> {

    private final QueryAccountInfoModel bizModel;

    public QueryAcctInfoRequest(QueryAccountInfoModel bizModel) {
        this.bizModel = bizModel;
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
        return Constant.Api.API_MERCHANT_QUERY;
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<QueryAcctInfoResponse> getResponseClass() {
        return QueryAcctInfoResponse.class;
    }

    public QueryAccountInfoModel getBizModel() {
        return bizModel;
    }
}
