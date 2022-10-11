package com.shitu.api.model;

import java.io.Serializable;

import com.shitu.api.constants.PayPass;

public class GetSupportBankModel implements Serializable {
    private GetSupportBankModel() {
    }

    private String payPass;

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    public static class Builder {
        private String payPass;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder payPass(PayPass payPass) {
            this.payPass = payPass.getPayPass();
            return this;
        }

        public GetSupportBankModel build() {
            GetSupportBankModel model = new GetSupportBankModel();
            model.setPayPass(payPass);
            return model;
        }
    }

    @Override
    public String toString() {
        return "GetSupportBankModel [payPass=" + payPass + "]";
    }
}
