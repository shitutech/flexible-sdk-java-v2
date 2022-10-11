package com.shitu.api.model;

import java.io.Serializable;

public class SubOrderQueryModel implements Serializable {
    private SubOrderQueryModel() {
    }

    private String isCustom;
    private String batchOrderNo;
    private String orderNo;

    public String getIsCustom() {
        return isCustom;
    }

    public void setIsCustom(String isCustom) {
        this.isCustom = isCustom;
    }

    public String getBatchOrderNo() {
        return batchOrderNo;
    }

    public void setBatchOrderNo(String batchOrderNo) {
        this.batchOrderNo = batchOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "SubOrderQueryModel [isCustom=" + isCustom + ", batchOrderNo=" + batchOrderNo + ", orderNo=" + orderNo
                + "]";
    }

    public static final class Builder {
        private Builder() {
        }

        private String isCustom;
        private String batchOrderNo;
        private String orderNo;

        public static Builder builder() {
            return new Builder();
        }

        public Builder isCustom(String isCustom) {
            this.isCustom = isCustom;
            return this;
        }

        public Builder batchOrderNo(String batchOrderNo) {
            this.batchOrderNo = batchOrderNo;
            return this;
        }

        public Builder orderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }

        public SubOrderQueryModel build() {
            SubOrderQueryModel bizModel = new SubOrderQueryModel();
            bizModel.setBatchOrderNo(batchOrderNo);
            bizModel.setIsCustom(isCustom);
            bizModel.setOrderNo(orderNo);
            return bizModel;
        }
    }
}
