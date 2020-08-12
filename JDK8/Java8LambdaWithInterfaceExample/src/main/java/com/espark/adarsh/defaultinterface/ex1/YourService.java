package com.espark.adarsh.defaultinterface.ex1;

/**
 * Created by Adarsh on 10/7/15.
 */
public interface YourService{

    default public void provideService(){
        System.out.println("YourService Default provideService()");
    }
}
