package com.shitu.api.request;

import com.shitu.api.ClientSdkException;
import com.shitu.api.response.AbstractApiResponse;

/**
 * @author andrew
 * @date 2021-10-27 7:16 PM
 */
public abstract class AbstractFlexibleRequest<R extends AbstractApiResponse> implements FlexibleRequest<R> {

    protected void checkParams() throws ClientSdkException {
    }

    /**
     * 实际的请求参数的json格式的字符串
     *
     * @return json字符串
     */
    protected abstract String doGetParams();

    /**
     * 获取请求参数
     *
     * @return 校验参数并返回实际请求参数
     */
    @Override
    public String getParam() {
        checkParams();
        return doGetParams();
    }

}
