package com.dehmani.patterns.singleton;

// Java code to create singleton class using Static block approach
public class StaticBlockClass{
    private static StaticBlockClass instance;

    private StaticBlockClass(){}

    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockClass();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockClass getInstance(){
        return instance;
    }

    /**
     * Print a simple hello message
     */
    public void sayHello(){
        System.out.println("########################################################");
        System.out.println("StaticBlock says Hello");
        System.out.println("########################################################\n");
    }
}
