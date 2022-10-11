package com.shitu.api;

import com.shitu.api.response.AbstractApiResponse;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * @author andrew
 * @date 2021-10-27 11:12 AM
 */
public final class ResponseVO<T extends AbstractApiResponse> implements Serializable {

    private static final long serialVersionUID = -6061223749304827657L;

    /**
     * 成功标识
     */
    private Boolean success;

    /**
     * 返回处理消息
     */
    private String message;

    /**
     * 返回代码
     */
    private Integer code;

    /**
     * 返回数据对象 data
     */
    private T result;

    /**
     * 时间戳
     */
    private Long timestamp;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", ResponseVO.class.getSimpleName() + "[", "]")
                .add("success=" + success)
                .add("message='" + message + "'")
                .add("code=" + code)
                .add("result=" + result)
                .add("timestamp=" + timestamp)
                .toString();
    }
}
