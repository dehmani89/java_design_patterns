package com.dehmani.patterns.singleton;

// Java code to create singleton using Eager Initialization
public class EagerInitializationClass
{
    private static final EagerInitializationClass instance = new EagerInitializationClass();

    //private constructor to avoid client applications to use constructor
    private EagerInitializationClass(){}

    public static EagerInitializationClass getInstance(){
        return instance;
    }

    /**
     * Print a simple hello message
     */
    public void sayHello(){
        System.out.println("########################################################");
        System.out.println("EagerInitialization says Hello");
        System.out.println("########################################################\n");
    }
}