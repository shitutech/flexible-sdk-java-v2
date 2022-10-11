package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.QueryOrderModel;
import com.shitu.api.response.OrderQueryResponse;

import java.util.Objects;

/**
 * @author andrew
 * @date 2021-10-28 5:44 PM
 */
public class OrderQueryRequest extends AbstractFlexibleRequest<OrderQueryResponse> {

    private final QueryOrderModel bizModel;

    public OrderQueryRequest(QueryOrderModel bizModel) {
        Objects.requireNonNull(bizModel);
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
        return Constant.Api.API_ORDER_QUERY_BATCH;
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<OrderQueryResponse> getResponseClass() {
        return OrderQueryResponse.class;
    }

    public QueryOrderModel getBizModel() {
        return bizModel;
    }
}
