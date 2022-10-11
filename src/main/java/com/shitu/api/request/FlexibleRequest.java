package com.shitu.api.request;

import com.shitu.api.ClientSdkException;
import com.shitu.api.response.AbstractApiResponse;

/**
 * 请求并响应结果
 * @author andrew
 * @date 2021-10-27 3:11 PM
 */
public interface FlexibleRequest<R extends AbstractApiResponse> {

    /**
     * API route
     * @return route
     */
    String getApi();

    /**
     * api的请求参数
     * @return 具体请求参数
     * @throws ClientSdkException 请求参数校验获取失败
     */
    String getParam() throws ClientSdkException;

    /**
     * 得到当前API的响应结果类型
     * @return 响应类型R
     */
    Class<R> getResponseClass();
}
