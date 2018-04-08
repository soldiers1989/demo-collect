package com.sun.bytes.demo;

/**
 * @author Jungle
 * @create 2018-02-06 15:29
 */
public class StaticClass {


    public static String test(String name) {
        System.out.println("来了了爱了。。。。。。。" + name);
        try {
            Thread.sleep(100000);
            System.out.println("休眠完成..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }

}
