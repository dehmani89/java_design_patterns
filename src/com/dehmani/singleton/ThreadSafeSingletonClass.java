package com.dehmani.singleton;

// Java program to create Thread Safe Singleton class
public class ThreadSafeSingletonClass
{
    private static ThreadSafeSingletonClass instance;

    private ThreadSafeSingletonClass(){}

    public static synchronized ThreadSafeSingletonClass getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingletonClass();
        }
        return instance;
    }

    /**
     * Print a simple hello message
     */
    public void sayHello(){
        System.out.println("########################################################");
        System.out.println("ThreadSafeSingleton says Hello");
        System.out.println("########################################################\n");
    }
}
