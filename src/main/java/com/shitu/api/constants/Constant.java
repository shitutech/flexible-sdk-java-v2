package com.shitu.api.constants;

/**
 * 常量定义
 *
 * @author andrew
 * @date 2021-10-27 11:19 AM
 */
public enum Constant {
    ;

    /**
     * 上传文件最大限制为2Mb(base64编码后)
     */
    public static final int FILE_MAX_SIZE = 2 * 1024 * 1024;
    /**
     * 活体认证视频最大5mb(base64编码后)
     */
    public static final int VIDEO_FILE_MAX_SIZE = 5 * 1024 * 1024;

    public interface Api {
        /**
         * 商户信息查询
         */
        public static final String API_MERCHANT_QUERY = "/v2/acct/info";
        /**
         * 注册用户
         */
        public static final String API_ACCT_REGISTER = "/v2/acct/register";

        /**
         * 查询账户信息
         */
        public static final String API_ACCT_QUERY = "/v2/acct/query";
        /**
         * 修改账户信息
         */
        public static final String API_ACCT_UPDATE = "/v2/acct/update";
        /**
         * 下单支付(提现)
         */
        public static final String API_ORDER_PAY = "/v2/order/pay";
        /**
         * 批次号查询所有订单信息
         */
        public static final String API_ORDER_QUERY_BATCH = "/v2/order/query/batch";
        /**
         * 查询子订单信息
         */
        public static final String API_ORDER_QUERY_SUB = "/v2/order/query/detail";
        /**
         * 查询会员的系统id
         */
        public static final String API_GET_SYSTEM_ID = "/v2/system/id";

        /**
         * 查询会员绑定的银行卡列表
         */
        public static final String API_QUERY_MEMBER_BANK_LIST = "/v2/bank/cards";

        /**
         * 查询通道支持的银行列表
         */
        public static final String API_QUERY_CHANNEL_BANK_LIST = "/v2/bank/list";

        /**
         * 商户账户信息查询接口
         */
        public static final String API_QUERY_ACCOUNT_LIST = "/v2/acct/query/list";
    }
}
