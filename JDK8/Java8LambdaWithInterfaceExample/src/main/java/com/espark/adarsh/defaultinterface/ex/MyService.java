package com.espark.adarsh.defaultinterface.ex;

/**
 * Created by Adarsh on 10/7/15.
 */
public interface MyService{

    default public void provideService(){
        System.out.println("MyService Default provideService()");
    }
}
