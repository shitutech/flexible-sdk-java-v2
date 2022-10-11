package com.shitu.api.response;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author andrew
 * @date 2021-10-27 10:07 AM
 */
public abstract class AbstractApiResponse implements Serializable {
    private static final long serialVersionUID = -428765909514644754L;

    private String statusCode;
    private String msg;

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AbstractApiResponse.class.getSimpleName() + "[", "]")
                .add("statusCode='" + statusCode + "'")
                .add("msg='" + msg + "'")
                .toString();
    }
}
