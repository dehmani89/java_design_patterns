package com.dehmani.singleton;

// Java code for Bill Pugh Singleton Implementaion
public class BillPughSingletonImplementationClass
{

    private BillPughSingletonImplementationClass(){}

    private static class SingletonHelper{
        private static final BillPughSingletonImplementationClass INSTANCE = new BillPughSingletonImplementationClass();
    }

    public static BillPughSingletonImplementationClass getInstance(){
        return SingletonHelper.INSTANCE;
    }
    /**
     * Print a simple hello message
     */
    public void sayHello(){
        System.out.println("########################################################");
        System.out.println("BillPughSingletonImplementation says Hello");
        System.out.println("########################################################\n");
    }
}
