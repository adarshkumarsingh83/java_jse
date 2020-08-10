package com.espark.adarsh.defaultinterface.ex;

import java.util.function.Function;

/**
 * Created by Adarsh on 10/7/15.
 */
public class DefaultMethodAndAbstractMethodInheritanceExample{

    public static void main(String[] args) {

        MyService myService=new ServiceProvider();
        myService.provideService();

        YourService yourService=new ServiceProvider();
        yourService.provideService();

        ServiceProvider serviceProvider=new ServiceProvider();
        serviceProvider.provideService();

    }

}

