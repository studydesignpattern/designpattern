package com.study.designpattern;

/**
 * 单例模式 双重校验锁实现
 */
public class SingletonClassG {
    /**
     * volatile 的作用好像是防止指令重排序 类加载的过程分三步好像 线程B进来后保证看到不是null值
     */
    private volatile static SingletonClassG singletonClassG = null;


    private SingletonClassG () {}

    public static  SingletonClassG getSingletonClassG () {
        //判断singletonClassG是否为null 是的话 直接返回了
        if (singletonClassG == null) {
            //加锁保证多线程安全
            synchronized (SingletonClassG.class) {
                //再次确认singletonClassG是否为null   因为两个线程可能同时来获取锁 线程A获取成功，并实例化之后
                //线程B进来不应该再继续new实例
                if (singletonClassG == null) {
                    singletonClassG = new SingletonClassG();
                }
            }
        }
        return singletonClassG;
    }
}
