package com.shitu.api.response;

/**
 * 用户信息查询接口响应信息
 *
 * @author andrew
 * @date 2021-10-27 9:20 AM
 */
public final class QueryAcctResponse extends AbstractApiResponse {

    /**
     * 姓名(查询类型1返回)
     */
    private String name;
    /**
     * 身份证号(查询类型1返回)
     */
    private String idCard;

    /**
     * 开户行编号(查询类型1返回)
     */
    private String bankNo;
    /**
     * 开户行(查询类型1返回)
     */
    private String bankName;
    /**
     * 卡号(查询类型1返回)
     */
    private String cardNo;
    /**
     * 银行预留手机号(查询类型1返回)
     */
    private String bankPhone;

    /**
     * 会员系统ID
     */
    private String systemId;

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

    public String getSystemId() {
        return systemId;
    }

    public void setSystemId(String systemId) {
        this.systemId = systemId;
    }

    @Override
    public String toString() {
        return "QueryAcctResponse [name=" + name + ", idCard=" + idCard + ", bankNo=" + bankNo + ", bankName="
                + bankName + ", cardNo=" + cardNo + ", bankPhone=" + bankPhone + ", systemId=" + systemId + "]";
    }

}
