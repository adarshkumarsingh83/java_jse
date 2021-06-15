package com.espark.adarsh.defaultinterface.ex1;

import com.espark.adarsh.defaultinterface.ex.OurService;

/**
 * Created by Adarsh on 10/7/15.
 */
public class ServiceProvider implements MyService, YourService {

    public void provideService() {

         //calling super default method
        MyService.super.provideService();

        //calling super default method
        YourService.super.provideService();
        System.out.println("ServiceProvider provideService()");

        MyService.wishMsg();
    }
}