package com.shitu.api.response;

import java.io.Serializable;
import java.util.List;

/**
 * 按批次号查询所有订单信息响应
 *
 * @author andrew
 * @date 2021-10-27 10:58 AM
 */
public final class OrderQueryResponse extends AbstractApiResponse {

    /**
     * 批次流水号
     */
    private String batchOrderId;
    /**
     * 自定义流水号
     */
    private String batchOrderNo;
    /**
     * 商户号
     */
    private String merchantNo;
    /**
     * 服务商号
     */
    private String providerNo;
    /**
     * 任务编号
     */
    private String taskCode;
    /**
     * 产品编号
     */
    private String productCode;
    /**
     * 手续费承担方(查询类型1返回)
     * 1:企业承担 2:客户承担
     */
    private String costUndertaker;
    /**
     * 业务类型
     */
    private String busType;
    /**
     * 支付通道
     */
    private String payPass;
    /**
     * 批次状态[0:已提交1:已接单2:已拒单3:发放中4:发放成功5:已撤销6:发放失败 7:发放部分成功]
     */
    private String batchStatus;
    /**
     * 支付详细信息
     */
    private List<OrderPayDetail> payList;

    public String getBatchOrderId() {
        return batchOrderId;
    }

    public void setBatchOrderId(String batchOrderId) {
        this.batchOrderId = batchOrderId;
    }

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

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

    public String getBusType() {
        return busType;
    }

    public void setBusType(String busType) {
        this.busType = busType;
    }

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public List<OrderPayDetail> getPayList() {
        return payList;
    }

    public void setPayList(List<OrderPayDetail> payList) {
        this.payList = payList;
    }

    @Override
    public String toString() {
        return "OrderQueryResponse [batchOrderId=" + batchOrderId + ", batchOrderNo=" + batchOrderNo + ", merchantNo="
                + merchantNo + ", providerNo=" + providerNo + ", taskCode=" + taskCode + ", productCode=" + productCode
                + ", costUndertaker=" + costUndertaker + ", busType=" + busType + ", payPass=" + payPass
                + ", batchStatus=" + batchStatus + ", payList=" + payList + "]";
    }

    public static final class OrderPayDetail implements Serializable {

        /**
         * 会员ID
         */
        private String memberId;
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
        /**
         * 支付时间 格式：yyyyMMddHHmmss
         */
        private String payTime;
        /**
         * 备注
         */
        private String remark;

        @Override
        public String toString() {
            return "OrderPayDetail [memberId=" + memberId + ", systemId=" + systemId + ", name=" + name + ", idCard="
                    + idCard + ", fee=" + fee + ", orderNo=" + orderNo + ", payStatus=" + payStatus + ", payTime="
                    + payTime + ", remark=" + remark + "]";
        }

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
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

        public String getPayTime() {
            return payTime;
        }

        public void setPayTime(String payTime) {
            this.payTime = payTime;
        }

        public String getRemark() {
            return remark;
        }

        public void setRemark(String remark) {
            this.remark = remark;
        }

    }

    public String getBatchOrderNo() {
        return batchOrderNo;
    }

    public void setBatchOrderNo(String batchOrderNo) {
        this.batchOrderNo = batchOrderNo;
    }
}
