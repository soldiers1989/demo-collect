package com.sun.bytes.demo;

import java.math.BigInteger;

/**
 * @author Jungle
 * @create 2018-01-24 11:07
 */
public class DataWorld {


    public static void main(String[] args){
        // 测算左移动大小 - 左移动 = 乘以 2^位数
        int number = 10;
        int leftNum = number << 8;
        int mulNum = number * BigInteger.valueOf(2).pow(8).intValue();
        System.out.println(leftNum);
        System.out.println(mulNum);

        // 右移多少位就是除以2^位数
        int number2 = 255;
        int rightNum = number2 >> 2;
        System.out.println(rightNum);

        // int 与byte四则运算
        int number3 = 122;
        byte bytea = 0x01;
        int byteNum = number3 + bytea;
        System.out.println("byteNum : " + byteNum);

        // 左移运算
        // >>> 无符号右移
        int number4 = -200;
        System.out.println(" -200 >>> 2 : " + (200 >>> 2));
    }

}
