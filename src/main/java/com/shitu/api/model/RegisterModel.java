package com.shitu.api.model;

import java.io.Serializable;

/**
 * @author andrew
 * @date 2021-10-23 7:19 PM
 */
public final class RegisterModel implements Serializable {
    private static final long serialVersionUID = -1870173208237945212L;

    private RegisterModel() {
    }

    /**
     * 服务商号
     */
    private String providerNo;
    /**
     * 姓名
     */
    private String name;
    /**
     * 身份证号
     */
    private String idCard;
    /**
     * 手机号
     */
    private String phone;
    /**
     * 身份证正面
     */
    private String imgIdCardFront;
    /**
     * 身份证反面
     */
    private String imgIdCardBack;
    /**
     * 业务类型 1委托代征2.个体户注册(分包)3.自然人代开4.临时税务登记5.人力派遣&外包 6.个体户注册(众包)
     */
    private String busType;

    /**
     * 面部高清照, base64格式, 且base64编码后不超过2M
     */
    private String imgFace;

    public String getProviderNo() {
        return providerNo;
    }

    public void setProviderNo(String providerNo) {
        this.providerNo = providerNo;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImgIdCardFront() {
        return imgIdCardFront;
    }

    public void setImgIdCardFront(String imgIdCardFront) {
        this.imgIdCardFront = imgIdCardFront;
    }

    public String getImgIdCardBack() {
        return imgIdCardBack;
    }

    public void setImgIdCardBack(String imgIdCardBack) {
        this.imgIdCardBack = imgIdCardBack;
    }

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public void setImgFace(String imgFace) {
        this.imgFace = imgFace;
    }

    public String getImgFace() {
        return imgFace;
    }

    public static final class Builder {
        private String providerNo;
        private String name;
        private String idCard;
        private String phone;
        private String imgIdCardFront;
        private String imgIdCardBack;
        private String busType;
        private String imgFace;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder providerNo(String providerNo) {
            this.providerNo = providerNo;
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

        public Builder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public Builder imgIdCardFront(String imgIdCardFront) {
            this.imgIdCardFront = imgIdCardFront;
            return this;
        }

        public Builder imgIdCardBack(String imgIdCardBack) {
            this.imgIdCardBack = imgIdCardBack;
            return this;
        }

        public Builder busType(String busType) {
            this.busType = busType;
            return this;
        }

        public Builder imgFace(String imgFace) {
            this.imgFace = imgFace;
            return this;
        }

        public RegisterModel build() {
            RegisterModel registerModel = new RegisterModel();
            registerModel.setProviderNo(providerNo);
            registerModel.setName(name);
            registerModel.setIdCard(idCard);
            registerModel.setPhone(phone);
            registerModel.setImgIdCardFront(imgIdCardFront);
            registerModel.setImgIdCardBack(imgIdCardBack);
            registerModel.setBusType(busType);
            registerModel.setImgFace(imgFace);
            return registerModel;
        }
    }
}
