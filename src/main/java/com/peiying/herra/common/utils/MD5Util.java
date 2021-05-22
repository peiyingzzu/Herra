package com.peiying.herra.common.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class MD5Util {
    private static final Logger LOGGER = LoggerFactory.getLogger(MD5Util.class);

    public static String getMD5(String str) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            LOGGER.error("MD5加密，获取实例失败", e);
            return null;
        }
        byte[] bytes = str.getBytes();

        messageDigest.update(bytes, 0, bytes.length);

        BigInteger i = new BigInteger(1, messageDigest.digest());

        return String.format("%1$032X", i);
    }
    public static void main(String[] args) {
    	String md5 = getMD5("password");
    	System.out.println(md5);
	}
}
