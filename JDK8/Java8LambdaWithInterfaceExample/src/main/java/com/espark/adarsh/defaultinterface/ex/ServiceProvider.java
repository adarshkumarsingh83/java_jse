package com.espark.adarsh.defaultinterface.ex;

/**
 * Created by Adarsh on 10/7/15.
 */
public class ServiceProvider implements MyService, YourService, OurService {

    public void provideService() {
        //calling super default method
        MyService.super.provideService();
        System.out.println("ServiceProvider provideService()");
        OurService.provideService();
    }
}
