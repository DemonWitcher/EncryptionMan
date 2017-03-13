package com.witcher.encryptionmanlib;

import java.security.MessageDigest;

/**
 * Created by witcher on 2017/3/13 0013.
 */

public class MD5Encryption {

    static String MD5(String content) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(content.getBytes());
        byte bytes[] = md.digest();
        int i;
        StringBuilder stringBuilder = new StringBuilder("");
        for (byte b : bytes) {
            i = b;
            if (i < 0) {
                i += 256;
            }
            if (i < 16) {
                stringBuilder.append("0");
            }
            stringBuilder.append(Integer.toHexString(i));
        }
        return stringBuilder.toString();
    }

}
