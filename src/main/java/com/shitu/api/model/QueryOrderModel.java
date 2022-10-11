package com.shitu.api.model;

import java.io.Serializable;

public class QueryOrderModel implements Serializable {
    private String isCustom;
    private String batchOrderId;
    private String batchOrderNo;

    private QueryOrderModel() {
    }

    public String getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(String isCustom) {
        this.isCustom = isCustom;
    }

    public String getBatchOrderId() {
        return batchOrderId;
    }

    public void setBatchOrderId(String batchOrderId) {
        this.batchOrderId = batchOrderId;
    }

    public String getBatchOrderNo() {
        return batchOrderNo;
    }

    public void setBatchOrderNo(String batchOrderNo) {
        this.batchOrderNo = batchOrderNo;
    }

    @Override
    public String toString() {
        return "QueryOrderModel [isCustom=" + isCustom + ", batchOrderId=" + batchOrderId + ", batchOrderNo="
                + batchOrderNo + "]";
    }

    public static final class Builder {
        private String isCustom;
        private String batchOrderId;
        private String batchOrderNo;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder isCustom(String isCustom) {
            this.isCustom = isCustom;
            return this;
        }

        public Builder batchOrderId(String batchOrderId) {
            this.batchOrderId = batchOrderId;
            return this;
        }

        public Builder batchOrderNo(String batchOrderNo) {
            this.batchOrderNo = batchOrderNo;
            return this;
        }

        public QueryOrderModel build() {
            QueryOrderModel bizModel = new QueryOrderModel();
            bizModel.setBatchOrderId(batchOrderId);
            bizModel.setIsCustom(isCustom);
            bizModel.setBatchOrderNo(batchOrderNo);
            return bizModel;
        }
    }
}