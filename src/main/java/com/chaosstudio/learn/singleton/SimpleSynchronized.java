package com.chaosstudio.learn.singleton;

public class SimpleSynchronized {
    private static SimpleSynchronized instance;
    private SimpleSynchronized() {
        System.out.println("init simple synchronized");
    }

    public static synchronized SimpleSynchronized getInstance() {
        if (instance == null) instance = new SimpleSynchronized();
        return instance;
    }
}
