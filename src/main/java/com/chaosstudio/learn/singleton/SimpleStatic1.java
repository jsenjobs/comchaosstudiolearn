package com.chaosstudio.learn.singleton;

public class SimpleStatic1 {
    private static SimpleStatic1 instance = new SimpleStatic1();
    private SimpleStatic1() {
        System.out.println("init simple static 1");
    }

    public static SimpleStatic1 getInstance() {
        return instance;
    }
}
