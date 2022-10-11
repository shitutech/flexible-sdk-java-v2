package com.shitu.api.model;

import java.io.Serializable;

import com.shitu.api.constants.PayPass;

/**
 * 用户信息查询接口
 *
 * @author andrew
 * @date 2021-10-27 9:16 AM
 */
public final class QueryAcctModel implements Serializable {
    private static final long serialVersionUID = 1186795870925489678L;

    /**
     * 会员系统ID
     */
    private String systemId;

    /**
     * 支付通道
     */
    private String payPass;

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getSystemId() {
        return systemId;
    }

    public static final class Builder {
        private String systemId;
        private String payPass;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder systemId(String systemId) {
            this.systemId = systemId;
            return this;
        }

        @Deprecated
        public Builder payPass(String payPass) {
            this.payPass = payPass;
            return this;
        }

        public Builder payPass(PayPass payPass) {
            this.payPass = payPass.getPayPass();
            return this;
        }

        public QueryAcctModel build() {
            QueryAcctModel queryAcctModel = new QueryAcctModel();
            queryAcctModel.setSystemId(systemId);
            queryAcctModel.setPayPass(payPass);
            return queryAcctModel;
        }
    }
}
