package com.witcher.encryptionmanlib;

/**
 * Created by witcher on 2017/3/13 0013.
 */

public class EncryptionManagerByJava {

    /**
     * AES KEY 可以自行替换
     */
    private static final String KEY_FOR_AES = "12345678";
    /**
     * RSA 私钥 可以自行替换
     */
    private static final String KEY_FOR_RSA_PRIVATE = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBALFFNcAk2No1ewzc\n" +
            "w6yqvbOPQB7G++OXr6/9/Zq+gbW/lvkVIbgbVef7+Dev1t3l0XwWglUgize5YQu7\n" +
            "oYl6M9oxxjljkFF+TDiRdSkLYeR+EQbFEMFDGvypREgQzwZB72VXegEhb/MEZJWb\n" +
            "Ar0g0qS43ykCKXaGYVas9zhfu789AgMBAAECgYBcOSRojQLgKviUTXnjJ4S/mKQE\n" +
            "HwNGeVCmX54DVl8G3eC+Pvcm39nGcbjFx84h7QEZ7F/rx52F5QSO5RN6AUBdwi0e\n" +
            "zxwFmKdyDLDPtjlvZ3DTapwtwOW8976aiKyXj/W5cJ/w9ZWHJyLQZDHPdZROE37N\n" +
            "hs88Dv8p/t1uwlfphQJBAOborRIXVUUFeaHFVxr3CxHZf9bnRGNVlO9n6SHIqoFo\n" +
            "N06z+2pyk9Nu2J0u0QoQCbTQCjx6zmBdMgQPwVHM3RMCQQDEiHCtkJYiTsg3NpIl\n" +
            "sEhWlViT1rJ0Jijr/3K5TRIwFCPfa/Y4kQy2sV65G/AtlmvGOHQ2q8Jy5LKsjru0\n" +
            "qQxvAkEAw0ROX3cl37lyk2/ral0xmkWgyx5Fge80hIQN7Ujhj4+O/dpMKUd9ZRZe\n" +
            "zgVyNx066BHqJhz/+xO0oSSlqcQhywJAc9HshXy13ZYMC+3PBwLyPoRY5Rcbp7Nt\n" +
            "Xlb2ZxlyZH8Z/OsE+aURlwDET9aVHmiNLw3J/wYN2+PHIEYlfHw7ZQJAHk5kIcPO\n" +
            "f95ZqdELIJBMhACetWipMniLy3Vli/UqxDXcLW98JkAK8xEQnnnHpr+I4IyZ0ek+\n" +
            "F8bUQTrpYqEl3g==";
    /**
     * RSA 公钥 可以自行替换
     */
    private static final String KEY_FOR_RSA_PUBLIC = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCxRTXAJNjaNXsM3MOsqr2zj0Ae\n" +
            "xvvjl6+v/f2avoG1v5b5FSG4G1Xn+/g3r9bd5dF8FoJVIIs3uWELu6GJejPaMcY5\n" +
            "Y5BRfkw4kXUpC2HkfhEGxRDBQxr8qURIEM8GQe9lV3oBIW/zBGSVmwK9INKkuN8p\n" +
            "Ail2hmFWrPc4X7u/PQIDAQAB";

    /**
     * 128位 AES加密
     * @param content 正文
     * @throws Exception e
     */
    public static String encryptAes(String content) throws Exception {
       return AesEncryption.encryptAes(KEY_FOR_AES,content);
    }
    /**
     * 128位 AES解密
     * @param content 正文
     * @throws Exception e
     */
    public static String decryptAes(String content) throws Exception {
        return AesEncryption.decryptAes(KEY_FOR_AES,content);
    }
    /**
     * 1024位 公钥加密,对应私钥解密
     * @param content 正文
     * @throws Exception e
     */
    public static byte[] encryptRsaPublic(String content)throws Exception  {
        return RsaEncryption.encryptPublic(content, KEY_FOR_RSA_PUBLIC);
    }
    /**
     * 1024位 私钥解密,对应公钥加密
     * @param content 正文
     * @throws Exception e
     */
    public static String decryptRsaPrivate(byte[] content) throws Exception  {
        return RsaEncryption.decryptPrivate(content,KEY_FOR_RSA_PRIVATE);
    }
    /**
     * 1024位 私钥加密,对应公钥解密
     * @param content 正文
     * @throws Exception e
     */
    public static byte[] encryptRsaPrivate(String content)throws Exception  {
        return RsaEncryption.encryptPrivate(content, KEY_FOR_RSA_PRIVATE);
    }
    /**
     * 1024位 公钥解密,对应私钥加密
     * @param content 正文
     * @throws Exception e
     */
    public static String decryptRsaPublic(byte[] content) throws Exception  {
        return RsaEncryption.decryptPublic(content,KEY_FOR_RSA_PUBLIC);
    }
    /**
     * 32位 MD5
     * @param content 正文
     * @throws Exception e
     */
    public static String md5(String content) throws Exception {
        return MD5Encryption.MD5(content);
    }

    /**
     * 基于android自带Base64 Base64.DEFAULT 编码
     * @param content 正文
     * @throws Exception e
     */
    public static String encryptBase64(String content)throws Exception{
        return Base64Encryption.encryptBase64(content);
    }
    /**
     * 基于android自带Base64 Base64.DEFAULT 解码
     * @param content 正文
     * @throws Exception e
     */
    public static String decryptBase64(String content) throws Exception{
        return Base64Encryption.decryptBase64(content);
    }
}
