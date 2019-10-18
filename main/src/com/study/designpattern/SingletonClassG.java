package com.study.designpattern;

public class SingletonClassG {
    private volatile static SingletonClassG singletonClassG = null;

    private SingletonClassG () {}

    public SingletonClassG getSingletonClassG () {
        if (singletonClassG == null) {
            synchronized (SingletonClassG.class) {
                if (singletonClassG == null) {
                    singletonClassG = new SingletonClassG();
                }
            }
        }
        return singletonClassG;
    }
}
