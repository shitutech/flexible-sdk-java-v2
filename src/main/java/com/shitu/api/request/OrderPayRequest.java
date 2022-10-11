package com.shitu.api.request;

import com.alibaba.fastjson.JSON;
import com.shitu.api.constants.Constant;
import com.shitu.api.model.OrderPayModel;
import com.shitu.api.response.OrderPayResponse;

import java.util.Objects;

/**
 * 订单支付接口(提现)
 *
 * @author andrew
 * @date 2021-10-28 5:42 PM
 */
public class OrderPayRequest extends AbstractFlexibleRequest<OrderPayResponse> {

    private final OrderPayModel bizModel;

    public OrderPayRequest(OrderPayModel bizModel) {
        Objects.requireNonNull(bizModel);
        this.bizModel = bizModel;
    }

    public OrderPayModel getBizModel() {
        return bizModel;
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
     * API route
     *
     * @return route
     */
    @Override
    public String getApi() {
        return Constant.Api.API_ORDER_PAY;
    }

    /**
     * 得到当前API的响应结果类型
     *
     * @return 响应类型R
     */
    @Override
    public Class<OrderPayResponse> getResponseClass() {
        return OrderPayResponse.class;
    }
}
