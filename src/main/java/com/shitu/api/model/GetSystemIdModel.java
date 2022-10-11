package com.shitu.api.model;

import java.io.Serializable;

/**
 * 用户信息查询接口
 *
 * @author andrew
 * @date 2021-10-27 9:16 AM
 */
public final class GetSystemIdModel implements Serializable {
    private GetSystemIdModel() {
    }

    /**
     * 会员ID
     */
    private String memberId;

    /**
     * 身份证号
     */
    private String idCard;

    /**
     * 查询类型: 3: 根据身份证号查询会员id, 4: 根据会员id查询会员系统id
     */
    private String type;

    @Override
    public String toString() {
        return "GetSystemIdModel [memberId=" + memberId + ", idCard=" + idCard + ", type=" + type + "]";
    }

    public static final class Builder {
        private String memberId;
        private String type;
        private String idCard;

        private Builder() {
        }

        public static Builder builder() {
            return new Builder();
        }

        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder idCard(String idCard) {
            this.idCard = idCard;
            return this;
        }

        public GetSystemIdModel build() {
            GetSystemIdModel model = new GetSystemIdModel();
            model.setMemberId(memberId);
            model.setIdCard(idCard);
            model.setType(type);
            return model;
        }
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
