package com.shitu.api.utils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Locale;
import java.util.Random;

/**
 * @author andrew
 * @date 2021-10-27 4:50 PM
 */
public final class AesUtil {

    private static final String CIPHER_ALGORITHM = "AES/ECB/PKCS5Padding";
    private static final String KEY_ALGORITHM = "AES";

    public static String getAesKey() throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance(KEY_ALGORITHM);
        kg.init(128);
        byte[] bytes = kg.generateKey().getEncoded();
        return Base64.getEncoder().encodeToString(bytes);
    }

    public static String encrypt(String cipherText, String secretKey) throws Exception {
        Cipher cipher = Cipher.getInstance(CIPHER_ALGORITHM);
        SecretKeySpec key = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), KEY_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] data = cipher.doFinal(cipherText.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(data);
    }


    public static void main(String[] args) throws Exception {
        String origin = "hello";
        String key = getAesKey();
        String en = encrypt(origin, key);
        System.out.println(en);
    }
}
