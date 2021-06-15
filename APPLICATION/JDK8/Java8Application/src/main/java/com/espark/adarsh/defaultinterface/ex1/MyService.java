package com.espark.adarsh.defaultinterface.ex1;

/**
 * Created by Adarsh on 10/7/15.
 */
public interface MyService{

    public static void wishMsg(){
        System.out.println("welcome");
    }

    default public void provideService(){
        System.out.println("MyService Default provideService()");
    }
}
