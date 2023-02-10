package com.shitu.api.response;

import java.io.Serializable;
import java.util.List;

public class QueryAcctListResponse extends AbstractApiResponse {

    private List<PayAccountDetail> payAccountList;

    @Override
    public String toString() {
        return "QueryAcctListResponse [payAccountList=" + payAccountList + "]";
    }

    public List<PayAccountDetail> getPayAccountList() {
        return payAccountList;
    }

    public void setPayAccountList(List<PayAccountDetail> payAccountList) {
        this.payAccountList = payAccountList;
    }

    public static final class PayAccountDetail implements Serializable {
        private String merchantNo;
        private String accountName;
        private String accountNo;
        private String payPass;
        private String accountType;
        private String providerNo;
        private String providerName;

        public String getMerchantNo() {
            return merchantNo;
        }

        public void setMerchantNo(String merchantNo) {
            this.merchantNo = merchantNo;
        }

        public String getAccountName() {
            return accountName;
        }

        public void setAccountName(String accountName) {
            this.accountName = accountName;
        }

        public String getAccountNo() {
            return accountNo;
        }

        public void setAccountNo(String accountNo) {
            this.accountNo = accountNo;
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

        public void setProviderNo(String providerNo) {
            this.providerNo = providerNo;
        }

        public String getProviderName() {
            return providerName;
        }

        public void setProviderName(String providerName) {
            this.providerName = providerName;
        }

        @Override
        public String toString() {
            return "PayAccountDetail [merchantNo=" + merchantNo + ", accountName=" + accountName + ", accountNo="
                    + accountNo + ", payPass=" + payPass + ", accountType=" + accountType + ", providerNo=" + providerNo
                    + ", providerName=" + providerName + "]";
        }
    }

}
