package com.sun.bytes.demo;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Jungle
 * @create 2018-03-07 15:00
 */
public class Tokenn {

    public static void main(String[] args){
        int ts = (int)(System.currentTimeMillis() / 1000);
        try {
            getToken("aaaa", ts,"2222");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static String md5(byte[] source) throws NoSuchAlgorithmException {
        char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(source);
        byte[] tmp = md.digest();
        char[] str = new char[32];
        int k = 0;

        for(int i = 0; i < 16; ++i) {
            str[k++] = hexDigits[tmp[i] >>> 4 & 15];
            str[k++] = hexDigits[tmp[i] & 15];
        }

        return new String(str);
    }

    public static String getToken(String remote_filename, int ts, String secret_key) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        // ISO8859-1
        String charsetName = "UTF-8";

        // 文件ID的字节数组
        byte[] bsFilename = remote_filename.getBytes("UTF-8");

        // 秘钥的字节数组
        byte[] bsKey = secret_key.getBytes(charsetName);

        // 时间戳的字节数组
        byte[] bsTimestamp = (new Integer(ts)).toString().getBytes(charsetName);

        // 一个新的数组：总能长度为：文件长度 + 秘钥长度 + 时间错长度总和
        byte[] buff = new byte[bsFilename.length + bsKey.length + bsTimestamp.length];

        System.arraycopy(bsFilename, 0, buff, 0, bsFilename.length);
        System.arraycopy(bsKey, 0, buff, bsFilename.length, bsKey.length);
        System.arraycopy(bsTimestamp, 0, buff, bsFilename.length + bsKey.length, bsTimestamp.length);

        // 组合一个新的字节数组，然后进行md5
        return md5(buff);
    }

}
