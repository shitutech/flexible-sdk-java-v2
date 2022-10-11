package com.shitu.api.response;

import java.util.List;
import java.util.StringJoiner;

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
     * 业务类型(查询类型1返回)
     * 1: 委托代征
     * 2: 个体户注册
     * 3: 自然人代开
     * 4: 临时税务登记
     */
    private List<String> busTypeList;

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
     * 账户状态 (查询类型2返回)
     * 0: 未开通
     * 1: 开通中
     * 2: 开通成功
     * 3: 开通失败
     */
    private String acctStatus;
    /**
     * 会员ID (查询类型3返回)
     */
    private String memberId;

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

    public List<String> getBusTypeList() {
        return busTypeList;
    }

    public void setBusTypeList(List<String> busTypeList) {
        this.busTypeList = busTypeList;
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

    public String getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(String acctStatus) {
        this.acctStatus = acctStatus;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", QueryAcctResponse.class.getSimpleName() + "[", "]")
                .add("name='" + name + "'")
                .add("idCard='" + idCard + "'")
                .add("busTypeList=" + busTypeList)
                .add("bankNo='" + bankNo + "'")
                .add("bankName='" + bankName + "'")
                .add("cardNo='" + cardNo + "'")
                .add("bankPhone='" + bankPhone + "'")
                .add("acctStatus='" + acctStatus + "'")
                .add("memberId='" + memberId + "'")
                .toString();
    }
}
