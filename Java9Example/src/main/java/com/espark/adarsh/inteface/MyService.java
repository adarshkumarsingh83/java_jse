package com.espark.adarsh.inteface;

public interface MyService{

    public String greet(String name);

    default String getMsg(String name){
        return getWish()+" "+name.toUpperCase()+" from "+getName();
    }

    static String getWish(){
        return "welcome";
    }

    private String getName(){
        return System.getProperty("user.name");
    }
}
