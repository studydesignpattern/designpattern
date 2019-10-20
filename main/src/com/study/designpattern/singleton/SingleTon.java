package com.study.designpattern.singleton;

/**
 * 单例模式
 *
 * @author lsc
 */
public class SingleTon {

    /**
     * 单例模式的本质就是控制类实例的初始化
     * 也就是控制内存的分配
     * java分配内存是通过构造器
     * 所以单例模式的构造器必须作为私有的，防止构造器被多次调用
     */
    private SingleTon() {

    }

    /**
     * 对外提供公有的getInstance方法，供外部获取实例
     *
     * @return SingleTon
     */
    public static SingleTon getInstance() {
        return SingleTonHolder.singleTon;
    }

    /**
     * 使用内部静态私有类来初始化实例
     * 保证在第一次调用实例的时候才初始化
     * 同时也能保证在多线程高并发场景下不出错
     */
    private static class SingleTonHolder {
        private static final SingleTon singleTon = new SingleTon();
    }
}
