package com.chaosstudio.learn.singleton;

public class SimpleStatic2 {
    private static final SimpleStatic2 instance;
    static {
        instance = new SimpleStatic2();
    }

    private SimpleStatic2() {
        System.out.println("init simple static 2");
    }

    public static SimpleStatic2 getInstance() {
        return instance;
    }
}
