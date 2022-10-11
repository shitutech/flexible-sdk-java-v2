package com.shitu.api.model;

import java.io.Serializable;

import com.shitu.api.constants.PayPass;

/**
 * 变更结算卡
 * 
 * @author andrew
 * @date 2021-10-27 10:32 AM
 */
public final class UpdateSettlementCardModel implements Serializable {
    private static final long serialVersionUID = -8640158084754123370L;

    /**
     * 会员系统id
     */
    private String systemId;

    /**
     * 支付通道
     */
    private String payPass;
    /**
     * 银行编号
     */
    private String bankNo;

    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 银行预留手机号
     */
    private String bankPhone;

    /**
     * 银行卡照片base64格式
     */
    private String imgBank;

    public static final class Builder {
        private String systemId;
        private String payPass;
        private String bankNo;
        private String cardNo;
        private String bankPhone;
        private String imgBank;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
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

        public Builder bankNo(String bankNo) {
            this.bankNo = bankNo;
            return this;
        }

        public Builder cardNo(String cardNo) {
            this.cardNo = cardNo;
            return this;
        }

        public Builder bankPhone(String bankPhone) {
            this.bankPhone = bankPhone;
            return this;
        }

        public Builder imgBank(String imgBank) {
            this.imgBank = imgBank;
            return this;
        }

        public Builder systemId(String systemId) {
            this.systemId = systemId;
            return this;
        }

        public UpdateSettlementCardModel build() {
            UpdateSettlementCardModel updateAcctModel = new UpdateSettlementCardModel();
            updateAcctModel.setSystemId(systemId);
            updateAcctModel.setPayPass(payPass);
            updateAcctModel.setBankNo(bankNo);
            updateAcctModel.setCardNo(cardNo);
            updateAcctModel.setBankPhone(bankPhone);
            updateAcctModel.setImgBank(imgBank);
            return updateAcctModel;
        }
    }

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    public String getBankNo() {
        return bankNo;
    }

    public void setBankNo(String bankNo) {
        this.bankNo = bankNo;
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

    public String getImgBank() {
        return imgBank;
    }

    public void setImgBank(String imgBank) {
        this.imgBank = imgBank;
    }
}
