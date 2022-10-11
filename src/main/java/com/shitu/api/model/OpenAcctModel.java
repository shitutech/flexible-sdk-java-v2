package com.shitu.api.model;

import java.io.Serializable;

import com.shitu.api.constants.PayPass;

/**
 * @author andrew
 * @date 2021-10-25 10:50 AM
 */
@Deprecated
public final class OpenAcctModel implements Serializable {
    private static final long serialVersionUID = 6287231244128424577L;

    private OpenAcctModel() {
    }

    /**
     * 服务商号
     */
    private String providerNo;
    /**
     * 会员ID
     */
    private String memberId;
    /**
     * 支付通道
     */
    private String payPass;
    /**
     * 银行编号
     */
    private String bankNo;
    /**
     * 开户行名称
     */
    private String bankName;
    /**
     * 卡号
     */
    private String cardNo;
    /**
     * 银行预留手机号
     */
    private String bankPhone;
    /**
     * 人脸图片
     */
    private String imgFace;
    /**
     * 证件有效期开始日期
     */
    private String validDateStart;
    /**
     * 证件有效期截止日期
     */
    private String validDateEnd;
    /**
     * 住址
     */
    private String address;
    /**
     * IP 地址
     */
    private String ipAdr;

    /**
     * 银行卡照片
     */
    private String imgBank;

    /**
     * 活体视频5mb
     */
    private String videoBase64;

    public String getProviderNo() {
        return providerNo;
    }

    public void setProviderNo(String providerNo) {
        this.providerNo = providerNo;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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

    public String getImgFace() {
        return imgFace;
    }

    public void setImgFace(String imgFace) {
        this.imgFace = imgFace;
    }

    public String getValidDateStart() {
        return validDateStart;
    }

    public void setValidDateStart(String validDateStart) {
        this.validDateStart = validDateStart;
    }

    public String getValidDateEnd() {
        return validDateEnd;
    }

    public void setValidDateEnd(String validDateEnd) {
        this.validDateEnd = validDateEnd;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIpAdr() {
        return ipAdr;
    }

    public void setIpAdr(String ipAdr) {
        this.ipAdr = ipAdr;
    }

    public String getImgBank() {
        return imgBank;
    }

    public void setImgBank(String imgBank) {
        this.imgBank = imgBank;
    }

    public String getVideoBase64() {
        return videoBase64;
    }

    public void setVideoBase64(String videoBase64) {
        this.videoBase64 = videoBase64;
    }

    @Override
    public String toString() {
        return "OpenAcctModel [providerNo=" + providerNo + ", memberId=" + memberId + ", payPass=" + payPass
                + ", bankNo=" + bankNo + ", bankName=" + bankName + ", cardNo=" + cardNo + ", bankPhone=" + bankPhone
                + ", imgFace=" + imgFace + ", validDateStart=" + validDateStart + ", validDateEnd=" + validDateEnd
                + ", address=" + address + ", ipAdr=" + ipAdr + ", imgBank=" + imgBank + ", videoBase64=" + videoBase64
                + "]";
    }

    public static final class Builder {
        private String providerNo;
        private String memberId;
        private String payPass;
        private String bankNo;
        private String bankName;
        private String cardNo;
        private String bankPhone;
        private String imgFace;
        private String validDateStart;
        private String validDateEnd;
        private String address;
        private String ipAdr;
        private String imgBank;
        private String videoBase64;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder providerNo(String providerNo) {
            this.providerNo = providerNo;
            return this;
        }

        public Builder memberId(String memberId) {
            this.memberId = memberId;
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

        public Builder bankNo(String bankNo) {
            this.bankNo = bankNo;
            return this;
        }

        public Builder bankName(String bankName) {
            this.bankName = bankName;
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

        public Builder imgFace(String imgFace) {
            this.imgFace = imgFace;
            return this;
        }

        public Builder validDateStart(String validDateStart) {
            this.validDateStart = validDateStart;
            return this;
        }

        public Builder validDateEnd(String validDateEnd) {
            this.validDateEnd = validDateEnd;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder ipAdr(String ipAdr) {
            this.ipAdr = ipAdr;
            return this;
        }

        public Builder imgBank(String imgBank) {
            this.imgBank = imgBank;
            return this;
        }

        public Builder videoBase64(String videoBase64) {
            this.videoBase64 = videoBase64;
            return this;
        }

        public OpenAcctModel build() {
            OpenAcctModel openAcctModel = new OpenAcctModel();
            openAcctModel.setProviderNo(providerNo);
            openAcctModel.setMemberId(memberId);
            openAcctModel.setPayPass(payPass);
            openAcctModel.setBankNo(bankNo);
            openAcctModel.setBankName(bankName);
            openAcctModel.setCardNo(cardNo);
            openAcctModel.setBankPhone(bankPhone);
            openAcctModel.setImgFace(imgFace);
            openAcctModel.setValidDateStart(validDateStart);
            openAcctModel.setValidDateEnd(validDateEnd);
            openAcctModel.setAddress(address);
            openAcctModel.setIpAdr(ipAdr);
            openAcctModel.setImgBank(imgBank);
            openAcctModel.setVideoBase64(videoBase64);
            return openAcctModel;
        }
    }
}
