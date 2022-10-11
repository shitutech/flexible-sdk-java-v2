package com.shitu.api;

import java.io.Serializable;

/**
 * @author andrew
 * @date 2021-10-27 11:11 AM
 */
public final class ApiRequest implements Serializable {
    private static final long serialVersionUID = 7932791738008929213L;

    /**
     * 发起请求的时间，格式：yyyyMMddHHmmssSSS
     */
    private String requestTime;
    /**
     * 随机字符串
     */
    private String nonce;

    /**
     * 商户号
     */
    private String merchantNo;

    /**
     * 签名
     */
    private String sign;
    /**
     * 业务数据AES加密后的结果
     */
    private String requestData;
    /**
     * 对称密钥AES Key使用系统公钥加密后的结果
     */
    private String encryptKey;

    public String getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(String requestTime) {
        this.requestTime = requestTime;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getRequestData() {
        return requestData;
    }

    public void setRequestData(String requestData) {
        this.requestData = requestData;
    }

    public String getEncryptKey() {
        return encryptKey;
    }

    public void setEncryptKey(String encryptKey) {
        this.encryptKey = encryptKey;
    }

    public static final class Builder {
        private String requestTime;
        private String nonce;
        private String merchantNo;
        private String sign;
        private String requestData;
        private String encryptKey;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder requestTime(String requestTime) {
            this.requestTime = requestTime;
            return this;
        }

        public Builder nonce(String nonce) {
            this.nonce = nonce;
            return this;
        }

        public Builder merchantNo(String merchantNo) {
            this.merchantNo = merchantNo;
            return this;
        }

        public Builder sign(String sign) {
            this.sign = sign;
            return this;
        }

        public Builder requestData(String requestData) {
            this.requestData = requestData;
            return this;
        }

        public Builder encryptKey(String encryptKey) {
            this.encryptKey = encryptKey;
            return this;
        }

        public ApiRequest build() {
            ApiRequest apiRequest = new ApiRequest();
            apiRequest.setRequestTime(requestTime);
            apiRequest.setNonce(nonce);
            apiRequest.setMerchantNo(merchantNo);
            apiRequest.setSign(sign);
            apiRequest.setRequestData(requestData);
            apiRequest.setEncryptKey(encryptKey);
            return apiRequest;
        }
    }
}
