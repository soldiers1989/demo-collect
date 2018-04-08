package com.sun.bytes.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Jungle
 * @create 2018-02-06 15:59
 */
public class MainClass {

    private static ExecutorService executorService = Executors.newFixedThreadPool(8);

    public static void main(String[] args){

        for(int i =0 ; i < 10; i++){
            final int tmp = i;
            executorService.submit(new Runnable() {
                public void run() {
                    StaticClass.test(tmp+"");
                }
            });
        }


    }

}
