package com.shitu.api.model;

import java.io.Serializable;

import com.shitu.api.constants.PayPass;

public class QueryAcctListModel implements Serializable {
    private QueryAcctListModel() {
    }

    private String payPass;
    private String accountType;
    private String providerNo;

    public static final class Builder {
        private String payPass;
        private String accountType;
        private String providerNo;

        private Builder() {

        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder payPass(PayPass payPass) {
            this.payPass = payPass.getPayPass();
            return this;
        }

        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder providerNo(String providerNo) {
            this.providerNo = providerNo;
            return this;
        }

        public QueryAcctListModel build() {
            QueryAcctListModel bizModel = new QueryAcctListModel();
            bizModel.setAccountType(accountType);
            bizModel.setPayPass(payPass);
            bizModel.setProviderNo(providerNo);
            return bizModel;
        }

    }

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getProviderNo() {
        return providerNo;
    }

    @Override
    public String toString() {
        return "QueryAcctListModel [payPass=" + payPass + ", accountType=" + accountType + ", providerNo=" + providerNo
                + "]";
    }

    public void setProviderNo(String providerNo) {
        this.providerNo = providerNo;
    }

}
