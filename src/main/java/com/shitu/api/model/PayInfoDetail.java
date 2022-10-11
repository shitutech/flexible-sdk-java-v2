package com.shitu.api.model;

import java.io.Serializable;

/**
 * @author andrew
 * @date 2021-10-28 11:47 AM
 */
public final class PayInfoDetail implements Serializable {

    private static final long serialVersionUID = -6492348714228694207L;

    private PayInfoDetail() {
    }

    /**
     * 会员系统ID
     */
    private String systemId;
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 开户行编号(isDefaultCard=0必传)
     */
    private String bankNo;
    /**
     * 开户行名称(isDefaultCard=0必传)
     */
    private String bankName;
    /**
     * 结算卡卡号(isDefaultCard=0必传)
     */
    private String cardNo;
    /**
     * 银行预留手机号(isDefaultCard=0必传)
     */
    private String bankPhone;
    /**
     * 支付宝号, 发放到支付宝账号必传
     */
    private String aliPayNo;
    /**
     * 金额
     */
    private String fee;

    public static final class Builder {
        private String systemId;
        private String name;
        private String idCard;
        private String bankNo;
        private String bankName;
        private String cardNo;
        private String bankPhone;
        private String aliPayNo;
        private String fee;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder bankPhone(String bankPhone) {
            this.bankPhone = bankPhone;
            return this;
        }

        public Builder cardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }

        public Builder bankName(String bankName) {
            this.bankName = bankName;
            return this;
        }

        public Builder bankNo(String bankNo) {
            this.bankNo = bankNo;
            return this;
        }

        public Builder systemId(String systemId) {
            this.systemId = systemId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder idCard(String idCard) {
            this.idCard = idCard;
            return this;
        }

        public Builder fee(String fee) {
            this.fee = fee;
            return this;
        }

        public Builder alipayNo(String alipayNo) {
            this.aliPayNo = alipayNo;
            return this;
        }

        public PayInfoDetail build() {
            PayInfoDetail payInfoDetail = new PayInfoDetail();
            payInfoDetail.setSystemId(systemId);
            payInfoDetail.setName(name);
            payInfoDetail.setIdCard(idCard);
            payInfoDetail.setAliPayNo(aliPayNo);
            payInfoDetail.setBankName(bankName);
            payInfoDetail.setBankPhone(bankPhone);
            payInfoDetail.setBankNo(bankNo);
            payInfoDetail.setCardNo(cardNo);
            payInfoDetail.setFee(fee);
            return payInfoDetail;
        }
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }

    public String getAliPayNo() {
        return aliPayNo;
    }

    public void setAliPayNo(String aliPayNo) {
        this.aliPayNo = aliPayNo;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

}
