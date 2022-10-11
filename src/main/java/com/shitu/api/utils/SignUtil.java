package com.shitu.api.utils;

import com.shitu.api.ClientSdkException;

import javax.crypto.Cipher;
import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.Locale;

/**
 * @author andrew
 * @date 2021-10-27 4:09 PM
 */
public final class SignUtil {

    private static final String SIGN_ALGORITHM = "SHA1WithRsa";
    private static final String KEY_ALGORITHM = "RSA";

    /**
     * 公钥加密
     *
     * @param cipherText 明文
     * @param publicKey 加密公钥
     * @return RSA加密的字符串
     * @throws Exception 加密异常
     */
    public static String encryptByPublicKey(String cipherText, String publicKey) throws Exception {
        PublicKey pk = getPublicKeyFromX509(publicKey);
        Cipher cipher = Cipher.getInstance(KEY_ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, pk);
        byte[] data = cipher.doFinal(cipherText.getBytes(StandardCharsets.UTF_8));
        return Base64.getEncoder().encodeToString(data);
    }

    /**
     * 生成签名
     * @param cipherText 代签名字符串
     * @param privateKey 私钥
     * @return 签名字符串
     * @throws Exception 异常信息
     */
    public static String sign(String cipherText, String privateKey) throws Exception {
        PrivateKey pk = getPrivateKeyFromPKCS8(privateKey);
        Signature signature = Signature.getInstance(SIGN_ALGORITHM);
        signature.initSign(pk);
        signature.update(cipherText.getBytes(StandardCharsets.UTF_8));
        byte[] sign = signature.sign();
        return Base64.getEncoder().encodeToString(sign);
    }

    private static PublicKey getPublicKeyFromX509(String publicKey) throws Exception {
        if (null == publicKey || publicKey.length() == 0) {
            throw new ClientSdkException("PublicKey must not be null or Empty");
        }
        KeyFactory kf = KeyFactory.getInstance(KEY_ALGORITHM);
        return kf.generatePublic(new X509EncodedKeySpec(Base64.getDecoder().decode(publicKey)));
    }

    private static PrivateKey getPrivateKeyFromPKCS8(String privateKey) throws Exception {
        if (null == privateKey || privateKey.length() == 0) {
            throw new ClientSdkException("PrivateKey must not be null or Empty");
        }
        KeyFactory kf = KeyFactory.getInstance(KEY_ALGORITHM);
        return kf.generatePrivate(new PKCS8EncodedKeySpec(Base64.getDecoder().decode(privateKey)));
    }
}
