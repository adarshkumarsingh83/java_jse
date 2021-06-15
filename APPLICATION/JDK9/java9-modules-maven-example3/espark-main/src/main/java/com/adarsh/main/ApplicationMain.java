package com.adarsh.main;


import com.adarsh.service.EntityService;

public class ApplicationMain {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("com.adarsh.service.impl.EntityServiceImpl");
        Object o = clazz.getDeclaredConstructor().newInstance();
        ((EntityService) o).getEntities().stream().forEach(entity -> System.out.println(entity));
    }
}
