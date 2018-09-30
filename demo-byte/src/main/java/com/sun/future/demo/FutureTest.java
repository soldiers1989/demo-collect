package com.sun.future.demo;

import com.google.common.util.concurrent.*;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FutureTest {

    public static ListenableFuture<Integer> test(){
        ListeningExecutorService executorService = MoreExecutors.listeningDecorator(Executors.newCachedThreadPool());
        final ListenableFuture<Integer> listenableFuture = executorService.submit(new Callable<Integer>() {

            public Integer call() throws Exception {
                System.out.println("call execute..");
                TimeUnit.SECONDS.sleep(1);
                return 7;
            }
        });
        return listenableFuture;
    }

    public static void main(String[] args){
        ListenableFuture<Integer> result = test();

        Futures.addCallback(result,new FutureCallback<Integer>(){

            public void onSuccess(Integer result) {
                System.out.println();
            }

            public void onFailure(Throwable t) {

            }
        });
    }

}
