package com.dehmani.singleton;

// Java code to explain double check locking
public class LazyInitializationWithDoubleCheckLockingClass
{
    // private instance, so that it can be accessed by only the getInstance() method
    private static LazyInitializationWithDoubleCheckLockingClass instance;

    private LazyInitializationWithDoubleCheckLockingClass(){
        // private constructor
    }

    public static LazyInitializationWithDoubleCheckLockingClass getInstance(){
        if (instance == null){
            //synchronized block to remove overhead
            synchronized (LazyInitializationWithDoubleCheckLockingClass.class){
                if(instance==null){
                    // if instance is null, initialize
                    instance = new LazyInitializationWithDoubleCheckLockingClass();
                }
            }
        }
        return instance;
    }

    /**
     * Print a simple hello message
     */
    public void sayHello(){
        System.out.println("########################################################");
        System.out.println("LazyInitializationWithDoubleCheckLocking says Hello");
        System.out.println("########################################################\n");
    }
}
