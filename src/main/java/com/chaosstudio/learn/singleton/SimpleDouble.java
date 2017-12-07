package com.chaosstudio.learn.singleton;

public class SimpleDouble {
    private volatile static SimpleDouble instance;
    private SimpleDouble() {
    }
    public static SimpleDouble getInstance() {
        if (instance == null) {
            synchronized (SimpleDouble.class) {
                instance = new SimpleDouble();
            }
        }
        return instance;
    }
}
