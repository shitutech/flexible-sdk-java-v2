package com.shitu.api.constants;

/**
 * 用户信息变更类型
 *
 * @author andrew
 * @date 2021-10-27 11:51 AM
 */
public enum AcctChangeType {

    /**
     * 变更注册手机号
     */
    CHG_REG_PHONE("1"),
    /**
     * 变更影像件
     */
    CHG_IMAGE_PIECE("2"),
    /**
     * 拓展业务类型
     */
    EXT_BUS_TYPE("3"),
    /**
     * 变更结算卡信息
     */
    CHG_CARD_INFO("4");

    private final String changeType;

    AcctChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getChangeType() {
        return changeType;
    }
}
