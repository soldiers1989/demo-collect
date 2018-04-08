package org.sun.h2.db.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.Callable;

/**
 * @author Jungle
 * @create 2018-03-12 17:35
 */
public class DemoMain {

    private static Logger logger = LoggerFactory.getLogger(DemoMain.class);

    public static void main(String[] args){

        TaskExecutor.instance.submitWorkItem(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                logger.debug("01线程信息测试.." + Thread.currentThread().getId());
                Thread.sleep(2000);
                return null;
            }
        });
        TaskExecutor.instance.submitWorkItem(new Callable<Void>() {
            @Override
            public Void call() throws Exception {
                logger.debug("02线程信息测试.." + Thread.currentThread().getId());
                Thread.sleep(2000);
                return null;
            }
        });
    }

}
