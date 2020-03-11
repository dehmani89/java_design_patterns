package com.dehmani;

import com.dehmani.singleton.*;

public class Main {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("                           ##");
        System.out.println("                         ######");
        System.out.println("                    ################");
        System.out.println("               ##########################");
        System.out.println("          ####################################");
        System.out.println("     ##############################################");
        System.out.println("########################################################");
        System.out.println("              In main method of Main class");
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
