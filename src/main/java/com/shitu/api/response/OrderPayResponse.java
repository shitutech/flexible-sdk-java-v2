package com.shitu.api.response;

import java.io.Serializable;
import java.util.List;

/**
 * @author andrew
 * @date 2021-10-27 1:57 PM
 */
public final class OrderPayResponse extends AbstractApiResponse {

    /**
     * 系统批次流水号
     */
    private String batchOrderId;
    /**
     * 自定义流水号
     */
    private String batchOrderNo;

    /**
     * code = 1001 时有值, 表示提交成功
     */
    private List<PayOrderDetail> payList;
    /**
     * code = 1002 时有值, 表示提交失败
     */
    private List<FailOrderDetail> failList;

    public String getBatchOrderId() {
        return batchOrderId;
    }

    public void setBatchOrderId(String batchOrderId) {
        this.batchOrderId = batchOrderId;
    }

    public List<PayOrderDetail> getPayList() {
        return payList;
    }

    public void setPayList(List<PayOrderDetail> payList) {
        this.payList = payList;
    }

    public List<FailOrderDetail> getFailList() {
        return failList;
    }

    public void setFailList(List<FailOrderDetail> failList) {
        this.failList = failList;
    }

    @Override
    public String toString() {
        return "OrderPayResponse [batchOrderId=" + batchOrderId + ", batchOrderNo=" + batchOrderNo + ", payList="
                + payList + ", failList=" + failList + "]";
    }

    public static final class PayOrderDetail implements Serializable {
        private static final long serialVersionUID = -4783731287360513408L;

        /**
         * 会员系统ID
         */
        private String systemId;
        /**
         * 会员名称
         */
        private String name;
        /**
         * 身份证号
         */
        private String idCard;
        /**
         * 开户行编号
         */
        private String bankNo;
        /**
         * 开户行名称
         */
        private String bankName;
        /**
         * 结算卡卡号
         */
        private String cardNo;
        /**
         * 银行预留手机号
         */
        private String bankPhone;
        /**
         * 金额
         */
        private String fee;
        /**
         * 交易流水号
         */
        private String orderNo;
        /**
         * 支付状态[0:待支付 1:支付中 2:支付成功 3:支付失败4:已撤回]
         */
        private String payStatus;

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

        public String getFee() {
            return fee;
        }

        public void setFee(String fee) {
            this.fee = fee;
        }

        public String getOrderNo() {
            return orderNo;
        }

        public void setOrderNo(String orderNo) {
            this.orderNo = orderNo;
        }

        public String getPayStatus() {
            return payStatus;
        }

        public void setPayStatus(String payStatus) {
            this.payStatus = payStatus;
        }

        @Override
        public String toString() {
            return "PayOrderDetail [systemId=" + systemId + ", name=" + name + ", idCard=" + idCard + ", bankNo="
                    + bankNo + ", bankName=" + bankName + ", cardNo=" + cardNo + ", bankPhone=" + bankPhone + ", fee="
                    + fee + ", orderNo=" + orderNo + ", payStatus=" + payStatus + "]";
        }

        public String getSystemId() {
            return systemId;
        }

        public void setSystemId(String systemId) {
            this.systemId = systemId;
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
    }

    public static final class FailOrderDetail implements Serializable {

        private static final long serialVersionUID = -7688186465347172599L;

        /**
         * 会员系统ID
         */
        private String systemId;
        /**
         * 会员名称
         */
        private String name;
        /**
         * 身份证号
         */
        private String idCard;
        /**
         * 开户行编号
         */
        private String bankNo;
        /**
         * 开户行名称
         */
        private String bankName;
        /**
         * 结算卡卡号
         */
        private String cardNo;
        /**
         * 银行预留手机号
         */
        private String bankPhone;
        /**
         * 支付宝号 支付通道2返回
         */
        private String aliPayNo;

        /**
         * 金额
         */
        private String fee;
        /**
         * 备注
         */
        private String remark;

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

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

        @Override
        public String toString() {
            return "FailOrderDetail [systemId=" + systemId + ", name=" + name + ", idCard=" + idCard + ", bankNo="
                    + bankNo + ", bankName=" + bankName + ", cardNo=" + cardNo + ", bankPhone=" + bankPhone
                    + ", aliPayNo=" + aliPayNo + ", fee=" + fee + ", remark=" + remark + "]";
        }

        public String getSystemId() {
            return systemId;
        }

        public void setSystemId(String systemId) {
            this.systemId = systemId;
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
    }

    public String getBatchOrderNo() {
        return batchOrderNo;
    }

    public void setBatchOrderNo(String batchOrderNo) {
        this.batchOrderNo = batchOrderNo;
    }
}
