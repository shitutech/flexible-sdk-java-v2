package com.shitu.api.response;

/**
 * 查询子订单详情返回
 *
 * @author andrew
 * @date 2021-10-27 11:06 AM
 */
public final class SubOrderQueryResponse extends AbstractApiResponse {

    /**
     * 批次流水号
     */
    private String batchOrderId;

    /**
     * 会员ID
     */
    private String memberId;
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

    public String getBatchOrderId() {
        return batchOrderId;
    }

    public void setBatchOrderId(String batchOrderId) {
        this.batchOrderId = batchOrderId;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
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

    @Override
    public String toString() {
        return "SubOrderQueryResponse [batchOrderId=" + batchOrderId + ", memberId=" + memberId + ", name=" + name
                + ", idCard=" + idCard + ", fee=" + fee + ", orderNo=" + orderNo + ", payStatus=" + payStatus
                + ", payTime=" + payTime + ", remark=" + remark + "]";
    }

}
