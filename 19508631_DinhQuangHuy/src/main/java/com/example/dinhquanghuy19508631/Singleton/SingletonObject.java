package com.example.dinhquanghuy19508631.Singleton;

public class SingletonObject {
    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {
        //Xử lí
    }

    public static SingletonObject getInstance() {
        if(instance == null)
        {
            instance = new SingletonObject();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello World!!");
    }
}
