package com.adarsh;

import com.adarsh.free.FreeService;
import com.adarsh.paid.PaidService;

public class ServiceDriver {
    public static void main(String[] args) throws Exception{
        System.out.println("execution started ");
        Thread.currentThread().sleep(10000);
        System.out.println("execution half completed");
        FreeService freeService = new FreeService();
        freeService.freeService();
        PaidService paidService = new PaidService();
        paidService.paidService();
        System.out.println("execution half completed");
    }
}
