package com.witcher.encryptionmanlib;

/**
 * Created by witcher on 2017/3/12 0012.
 */

public class EncryptionManager {

    /**
     * AES,RSA
     * MD5,BASE64
     */

    static {
        System.loadLibrary("libencryptionman");
    }
    public static native String encryptAes(String source);
    public static native String decryptAes(String source);
    public static native String encryptRsa(String source);
    public static native String decryptRsa(String source);
    public static native String md5(String source);
    public static native String base64(String source);
}
