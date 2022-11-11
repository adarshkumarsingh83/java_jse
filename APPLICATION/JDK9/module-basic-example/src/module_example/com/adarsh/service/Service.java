package com.adarsh.service;
public interface Service {
     default void doService(){
        System.out.println("Service performed");
    }
}
