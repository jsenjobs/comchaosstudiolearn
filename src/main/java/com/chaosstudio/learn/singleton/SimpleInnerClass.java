package com.chaosstudio.learn.singleton;

public class SimpleInnerClass {
    private static class InnerSingle {
        private static final SimpleInnerClass instance = new SimpleInnerClass();
    }
    private SimpleInnerClass() {
        System.out.println("init simple inner class");
    }
    public static SimpleInnerClass getInstance() {
        return InnerSingle.instance;
    }
}
