package com.study.designpattern.singleton;

public class SingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            SingleTon instance = SingleTon.getInstance();
            System.out.println(instance);
        }
    }
}
