package com.espark.adarsh;

import com.espark.adarsh.inteface.MyService;
import com.espark.adarsh.inteface.MyServiceImpl;
import com.espark.adarsh.resource.ResourceDriver;

public class ApplicationMain {
    public static void main(String[] args) {
        interfaceCall();
        System.out.println();
        resourceCall();
        System.out.println();
    }

    public static void interfaceCall(){
        MyService myService=new MyServiceImpl();
        System.out.println(myService.greet("radha singh "));
    }

    public static void resourceCall(){
        ResourceDriver resourceDriver=new ResourceDriver();
        resourceDriver.doOperationOnResource("db");
    }
}
