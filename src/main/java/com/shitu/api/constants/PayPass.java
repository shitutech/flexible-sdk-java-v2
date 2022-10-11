package com.shitu.api.constants;

public enum PayPass {

    // 众邦银行
    ZHONG_BANG("1"),
    // 支付宝
    ZFB("2"),

    // 招商银行
    ZHAO_SHANG("4");

    PayPass(String payPass) {
        this.payPass = payPass;
    }

    private String payPass;

    public String getPayPass() {
        return payPass;
    }

    public void setPayPass(String payPass) {
        this.payPass = payPass;
    }
}
