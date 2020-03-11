package com.dehmani.singleton;

//Java Code to create singleton class With Lazy initialization
public class LazyInitializationClass
{
    private static LazyInitializationClass instance;

    private LazyInitializationClass(){}

    public static LazyInitializationClass getInstance(){
        if(instance == null){
            instance = new LazyInitializationClass();
        }
        return instance;
    }

    /**
     * Print a simple hello message
     */
    public void sayHello(){
        System.out.println("########################################################");
        System.out.println("LazyInitialization says Hello");
        System.out.println("########################################################\n");
    }
}
