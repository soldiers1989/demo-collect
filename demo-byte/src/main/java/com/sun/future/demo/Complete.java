package com.sun.future.demo;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class Complete {

    public static void main(String[] args) {
        CompletableFuture future = CompletableFuture.supplyAsync(new Supplier() {
            public Object get() {
                System.out.println(".....");
                return null;
            }
        });
        while(true){}
    }
}
