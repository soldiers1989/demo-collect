package com.sun.bytes.demo;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/**
 * @author Jungle
 * @create 2018-03-07 14:08
 */
public class Byte {

    public static void main(String[] args){
        ByteBuffer buf = ByteBuffer.allocate(4);
        buf.order(ByteOrder.BIG_ENDIAN);
        buf.putInt(258);
        System.out.println(Arrays.toString(buf.array()));
        buf.clear();
        buf.order(ByteOrder.LITTLE_ENDIAN);
        buf.putInt(258);
        System.out.println(Arrays.toString(buf.array()));

        System.out.println(Arrays.toString(reverseArray(buf.array())));
    }

    public static byte[] reverseArray(byte[] bytes) {
        byte[] new_array = new byte[bytes.length];
        for (int i = 0; i < bytes.length; i++) {
            new_array[i] = bytes[bytes.length - i - 1];
        }
        return new_array;
    }




    public static byte[] long2Bytes(long num) {
        byte[] byteNum = new byte[8];
        for (int ix = 0; ix < 8; ++ix) {
            int offset = 64 - (ix + 1) * 8;
            byteNum[ix] = (byte) ((num >> offset) & 0xff);
        }
        return byteNum;
    }

}
