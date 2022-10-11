package com.shitu.api.response;

import java.io.Serializable;
import java.util.StringJoiner;

/**
 * 商户信息查询返回
 *
 * @author andrew
 * @date 2021-10-27 11:08 AM
 */
public final class QueryAcctInfoResponse extends AbstractApiResponse implements Serializable {
    private static final long serialVersionUID = -7997998744445396840L;

    /**
     * 账户余额 单位元，精确到两位小数点 示例： 10.05元
     */
    private String balance;
    /**
     * 可用余额 单位元，精确到两位小数点 示例： 10.05元
     */
    private String availableFee;
    /**
     * 冻结金额 单位元，精确到两位小数点 示例： 10.05元
     */
    private String frozenBalance;

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAvailableFee() {
        return availableFee;
    }

    public void setAvailableFee(String availableFee) {
        this.availableFee = availableFee;
    }

    public String getFrozenBalance() {
        return frozenBalance;
    }

    public void setFrozenBalance(String frozenBalance) {
        this.frozenBalance = frozenBalance;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", QueryAcctInfoResponse.class.getSimpleName() + "[", "]")
                .add("balance='" + balance + "'")
                .add("availableFee='" + availableFee + "'")
                .add("frozenBalance='" + frozenBalance + "'")
                .toString();
    }
}
