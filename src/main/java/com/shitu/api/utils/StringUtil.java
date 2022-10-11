package com.shitu.api.utils;

import com.shitu.api.ClientSdkException;

import java.util.Random;

/**
 * @author andrew
 * @date 2021-10-27 2:43 PM
 */
public class StringUtil {

    private static final String NONCE_STR = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    /**
     * 字符串是否为空
     * @param text 字符串
     * @return true/false
     */
    public static boolean isEmpty(String text) {
        return text == null || text.length() == 0;
    }

    /**
     * 检查参数不为空
     *
     * @param target 参数
     * @throws IllegalArgumentException 非空参数异常
     */
    public static void requireNonNullOrEmpty(Object target) throws IllegalArgumentException {
        if (target == null || "".equals(target.toString())
                || "".equals(target.toString().trim())) {
            throw new IllegalArgumentException("参数为空");
        }
    }

    /**
     * 检查参数不为空
     *
     * @param targets 参数列表
     * @throws IllegalArgumentException 非空参数异常
     */
    public static void requireNonNullOrEmpty(Object... targets) throws ClientSdkException {
        if (targets.length == 0) {
            return;
        }

        for (Object target : targets) {
            if (target == null || "".equals(target.toString())
                    || "".equals(target.toString().trim())) {
                throw new ClientSdkException("参数为空");
            }
        }
    }

    public static String getNonceStr() {
        return getRandomString(32);
    }

    private static String getRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            sb.append(NONCE_STR.charAt(number));
        }
        return sb.toString();
    }
}
