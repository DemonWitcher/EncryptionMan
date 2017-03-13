package com.witcher.encryptionmanlib;

import android.util.Base64;

/**
 * Created by witcher on 2017/3/13 0013.
 */

public class Base64Encryption {

    static byte[] decode(String content){
        return Base64.decode(content, Base64.DEFAULT);
    }

    static String encryptBase64(String content) throws Exception {
        return Base64.encodeToString(content.getBytes(), Base64.DEFAULT);
    }

    static String decryptBase64(String content) throws Exception {
        return new String(decode(content));
    }
}
