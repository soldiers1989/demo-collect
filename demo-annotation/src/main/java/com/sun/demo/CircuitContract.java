package com.sun.demo;


import com.sun.annotation.CircuitAnnotation;

@CircuitAnnotation(value = "add")
public class CircuitContract {

    public void add(){
        System.out.println("加法来了..");
    }

    public static void main(String[] args) {
        new CircuitContract().add();
    }

}
