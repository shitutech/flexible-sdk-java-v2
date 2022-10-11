package com.shitu.api.model;

import java.io.Serializable;
import java.util.List;

import com.shitu.api.constants.PayPass;

/**
 * @author andrew
 * @date 2021-10-27 10:48 AM
 */
public final class OrderPayModel implements Serializable {
    private static final long serialVersionUID = 4287550960485509838L;

    /**
     * 服务商号
     */
    private String providerNo;
    /**
     * 账户类型: 1. 商户开户, 2. 服务商开户
     */
    private String accountType;
    /**
     * 任务编号
     */
    private String taskCode;
    /**
     * 产品编号
     */
    private String productCode;
    /**
     * 手续费承担方
     */
    private String costUndertaker;
    /**
     * 支付通道
     */
    private String payPass;
    /**
     * 是否启用自定义流水号
     */
    private String isCustom;
    /**
     * 批次号 格式：20200101-00001 当天日期+五位序列号 （isCustom=0时不为空）
     */
    private String batchNumber;
    /**
     * 不超过20位 自定义流水号 （isCustom=1时不为空）
     */
    private String batchOrderNo;
    /**
     * 是否使用默认绑定卡(0否, 1是, 支付宝到户传1)
     */
    private String isDefaultCard;

    /**
     * 支付信息
     */
    private List<PayInfoDetail> payList;

    public String getProviderNo() {
        return providerNo;
    }

    public void setProviderNo(String providerNo) {
        this.providerNo = providerNo;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getCostUndertaker() {
        return costUndertaker;
    }

    public void setCostUndertaker(String costUndertaker) {
        this.costUndertaker = costUndertaker;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    public List<PayInfoDetail> getPayList() {
        return payList;
    }

    public void setPayList(List<PayInfoDetail> payList) {
        this.payList = payList;
    }

    public static final class Builder {
        private String providerNo;
        private String taskCode;
        private String productCode;
        private String costUndertaker;
        private String batchNumber;
        private String payPass;
        private List<PayInfoDetail> payList;
        private String isCustom;
        private String batchOrderNo;
        private String isDefaultCard;
        private String accountType;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder accountType(String accountType) {
            this.accountType = accountType;
            return this;
        }

        public Builder isCustom(String isCustom) {
            this.isCustom = isCustom;
            return this;
        }

        public Builder batchOrderNo(String batchOrderNo) {
            this.batchOrderNo = batchOrderNo;
            return this;
        }

        public Builder isDefaultCard(String isDefaultCard) {
            this.isDefaultCard = isDefaultCard;
            return this;
        }

        public Builder providerNo(String providerNo) {
            this.providerNo = providerNo;
            return this;
        }

        public Builder taskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }

        public Builder productCode(String productCode) {
            this.productCode = productCode;
            return this;
        }

        public Builder costUndertaker(String costUndertaker) {
            this.costUndertaker = costUndertaker;
            return this;
        }

        public Builder batchNumber(String batchNumber) {
            this.batchNumber = batchNumber;
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

        public Builder payList(List<PayInfoDetail> payList) {
            this.payList = payList;
            return this;
        }

        public OrderPayModel build() {
            OrderPayModel orderPayModel = new OrderPayModel();
            orderPayModel.setProviderNo(providerNo);
            orderPayModel.setAccountType(accountType);
            orderPayModel.setTaskCode(taskCode);
            orderPayModel.setProductCode(productCode);
            orderPayModel.setCostUndertaker(costUndertaker);
            orderPayModel.setPayPass(payPass);
            orderPayModel.setIsCustom(isCustom);
            orderPayModel.setBatchNumber(batchNumber);
            orderPayModel.setBatchOrderNo(batchOrderNo);
            orderPayModel.setIsDefaultCard(isDefaultCard);
            orderPayModel.setPayList(payList);
            return orderPayModel;
        }
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

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

    public String getIsDefaultCard() {
        return isDefaultCard;
    }

    public void setIsDefaultCard(String isDefaultCard) {
        this.isDefaultCard = isDefaultCard;
    }
}
