package com.chaosstudio.learn.singleton;

public class Simple {

    private static Simple instance;

    private Simple() {
        System.out.println("init simple");
    }

    public static Simple getInstance() {
        if (instance == null) {
            instance = new Simple();
        }
        return instance;
    }

}
