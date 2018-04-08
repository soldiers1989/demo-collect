package com.sun.bytes.demo;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockCurrent {

    static class NumberWrapper {
        public int value = 1;
    }

    private static String current ;

    public static void main(String[] args) {

        //初始化可重入锁
        final Lock lock = new ReentrantLock();

        //第一个条件当屏幕上输出到3
        final Condition reachThreeCondition = lock.newCondition();
        //第二个条件当屏幕上输出到6
        final Condition reachSixCondition = lock.newCondition();
        final Condition notEmpt = lock.newCondition();

        //NumberWrapper只是为了封装一个数字，一边可以将数字对象共享，并可以设置为final
        //注意这里不要用Integer, Integer 是不可变对象
        final NumberWrapper num = new NumberWrapper();

        //初始化A线程
        Thread threadA = new Thread(new Runnable() {

            public void run() {
                lock.lock();
                try {
                    if(null == current){
                        System.out.println("开启等待...., current is null.");
                        notEmpt.await();
                        System.out.println("等待结束....,current:" + current);
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });

        Thread threadB = new Thread(new Runnable() {
            public void run() {
                lock.lock();
                try {
                    Thread.sleep(3000);
                    current = "3";
                    notEmpt.signalAll();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }

            }
        });

        //启动两个线程
        threadA.start();
        threadB.start();
    }

}
