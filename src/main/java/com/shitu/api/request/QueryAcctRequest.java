package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.QueryAcctModel;
import com.shitu.api.response.QueryAcctResponse;

import java.util.Objects;

/**
 * 用户信息查询接口
 * 
 * @author andrew
 * @date 2021-10-27 7:02 PM
 */
public class QueryAcctRequest extends AbstractFlexibleRequest<QueryAcctResponse> {

    private final QueryAcctModel bizModel;

    public QueryAcctRequest(QueryAcctModel bizModel) {
        Objects.requireNonNull(bizModel);
        this.bizModel = bizModel;
    }

    /**
     * API route
     *
     * @return route
     */
    @Override
    public String getApi() {
        return Constant.Api.API_ACCT_QUERY;
    }

    /**
     * 实际的请求参数的json格式的字符串
     *
     * @return json字符串
     */
    @Override
    protected String doGetParams() {
        return JSON.toJSONString(this.bizModel);
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<QueryAcctResponse> getResponseClass() {
        return QueryAcctResponse.class;
    }
}
