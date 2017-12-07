package com.chaosstudio.learn.singleton;

public class Main {
    public static void main(String[] args) throws InterruptedException, ClassNotFoundException {
        // layz load
        Thread.sleep(2000);
        Simple simple = Simple.getInstance();
        SimpleEnum simpleEnum = SimpleEnum.INSTANCE;
        simpleEnum.usefullMethod();
    }
}
