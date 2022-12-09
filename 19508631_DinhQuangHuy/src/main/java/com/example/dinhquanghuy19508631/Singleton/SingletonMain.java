package com.example.dinhquanghuy19508631.Singleton;

public class SingletonMain {
    public static void main(String[] args) {
        SingletonObject singletonObject = SingletonObject.getInstance();
        System.out.println(singletonObject.hashCode());
    }
}
