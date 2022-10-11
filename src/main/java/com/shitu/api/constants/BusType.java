package com.shitu.api.constants;

/**
 * 业务类型
 *
 * @author andrew
 * @date 2021-10-27 11:28 AM
 */
public enum BusType {

    /**
     * 委托代征
     */
    ENTRUSTED_COLLECTED("1", "委托代征"),
    /**
     * 个体户注册(分包)
     */
    INDIVIDUAL_REGISTRATION("2", "个体户注册"),
    /**
     * 自然人代开
     */
    NATURAL_PERSON("3", "自然人代开"),
    /**
     * 临时税务登记
     */
    PROVISIONAL_TAX_REGISTRATION("4", "临时税务登记");

    BusType(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }

    private final String type;
    private final String desc;

    public String getType() {
        return type;
    }

    public String getDesc() {
        return desc;
    }
}
