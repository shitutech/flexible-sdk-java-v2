package com.shitu.api.constants;

/**
 * 用户信息查询类型
 *
 * @author andrew
 * @date 2021-10-27 11:48 AM
 */
public enum AcctQueryType {

    /**
     * 查询基本信息
     */
    QRY_BASIC_INFO("1"),

    /**
     * 查询开户信息
     */
    QRY_OPEN_ACCT_INFO("2"),

    /**
     * 查询会员id, 通过身份证号查询
     */
    QRY_MEMBER_ID("3");

    private final String type;

    AcctQueryType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
