package com.espark.adarsh.inteface;

public class MyServiceImpl implements MyService {

    @Override
    public String greet(String name) {
        return getMsg(name);
    }
}
