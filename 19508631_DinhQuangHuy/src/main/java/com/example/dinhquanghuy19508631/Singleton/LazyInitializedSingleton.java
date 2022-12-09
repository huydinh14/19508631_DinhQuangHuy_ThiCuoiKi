package com.example.dinhquanghuy19508631.Singleton;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton(){
        new Student();
    }

    public static synchronized LazyInitializedSingleton getInstance(){
        if(instance==null)
        {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
