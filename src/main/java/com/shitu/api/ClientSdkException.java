package com.shitu.api;

/**
 * sdk请求处理异常: 包含客户端参数错误, 请求服务器超时等
 * @author andrew
 * @date 2021-10-27 2:57 PM
 */
public class ClientSdkException extends RuntimeException {

    private static final long serialVersionUID = -3676090940904925500L;

    public ClientSdkException() {
        this("客户端异常");
    }

    public ClientSdkException(String message) {
        super(message);
    }

    public ClientSdkException(Throwable t) {
        super(t);
    }

    public ClientSdkException(String message, Throwable e) {
        super(message, e);
    }
}
