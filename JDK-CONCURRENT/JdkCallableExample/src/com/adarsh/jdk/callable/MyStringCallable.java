package com.adarsh.jdk.callable;


import java.util.concurrent.Callable;

public class MyStringCallable implements Callable<String> {

    private static Integer str = 0;

    @Override
    public String call() throws Exception {
        str++;
        return "MyCount" + str;

    }
}
