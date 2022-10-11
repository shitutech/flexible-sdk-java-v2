package com.shitu.api;

import com.shitu.api.utils.StringUtil;

/**
 * 对接方客户端配置
 * 
 * @author andrew
 * @date 2021-10-27 2:38 PM
 */
public class ClientConfig {

    public static final String DEFAULT_DOMAIN = "https://fec.51wanquan.com/api/fec";

    public ClientConfig(String merchantNo, String providerNo,
            String productNo, String taskCode,
            String privateKey, String systemPublicKey) throws ClientSdkException {
        this(DEFAULT_DOMAIN, merchantNo, providerNo, productNo, taskCode, privateKey, systemPublicKey);
    }

    public ClientConfig(String domain, String merchantNo, String providerNo,
            String productNo, String taskCode,
            String privateKey, String systemPublicKey) throws ClientSdkException {
        StringUtil.requireNonNullOrEmpty(domain, merchantNo, providerNo, productNo, taskCode, privateKey,
                systemPublicKey);
        this.domain = domain;
        this.merchantNo = merchantNo;
        this.providerNo = providerNo;
        this.productNo = productNo;
        this.taskCode = taskCode;

        this.privateKey = privateKey;
        this.systemPublicKey = systemPublicKey;
    }

    /**
     * 请求域名
     */
    private String domain;

    /**
     * 对接方商户号
     */
    private String merchantNo;

    /**
     * 服务商编号
     */
    private String providerNo;

    /**
     * 产品编号
     */
    private String productNo;

    /**
     * 任务编号
     */
    private String taskCode;

    /**
     * 接入方私钥
     */
    private String privateKey;
    /**
     * 服务平台方提供的公钥
     */
    private String systemPublicKey;

    private long connectTimeout;
    private long readTimeout;

    public String getDomain() {
        return domain;
    }

    public ClientConfig setDomain(String domain) {
        this.domain = domain;
        return this;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public ClientConfig setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
        return this;
    }

    public String getProviderNo() {
        return providerNo;
    }

    public ClientConfig setProviderNo(String providerNo) {
        this.providerNo = providerNo;
        return this;
    }

    public String getProductNo() {
        return productNo;
    }

    public ClientConfig setProductNo(String productNo) {
        this.productNo = productNo;
        return this;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public ClientConfig setTaskCode(String taskCode) {
        this.taskCode = taskCode;
        return this;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public ClientConfig setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public String getSystemPublicKey() {
        return systemPublicKey;
    }

    public ClientConfig setSystemPublicKey(String systemPublicKey) {
        this.systemPublicKey = systemPublicKey;
        return this;
    }
}
