package com.dehmani.patterns.singleton;

/**
 * Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.
 * This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which
 * can be accessed directly without need to instantiate the object of the class.
 */
public class SingletonPatternDemo {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("                           ##");
        System.out.println("                         ######");
        System.out.println("                    ################");
        System.out.println("               ##########################");
        System.out.println("          ####################################");
        System.out.println("     ##############################################");
        System.out.println("########################################################");
        System.out.println("              In main method of _SingletonPatternDemo class");
        System.out.println("########################################################\n");

        //Check if EagerInitializationClass has an instance running and call say hello method
        EagerInitializationClass.getInstance().sayHello();

        //Check if StaticBlockClass has an instance running and call say hello method
        StaticBlockClass.getInstance().sayHello();

        //Check if LazyInitialization has an instance running and call say hello method
        LazyInitializationClass.getInstance().sayHello();

        //Check if ThreadSafeSingleton has an instance running and call say hello method
        ThreadSafeSingletonClass.getInstance().sayHello();

        //Check if ThreadSafeSingleton has an instance running and call say hello method
        LazyInitializationWithDoubleCheckLockingClass.getInstance().sayHello();

        //Check if BillPughSingletonImplementation has an instance running and call say hello method
        BillPughSingletonImplementationClass.getInstance().sayHello();

    }
}
