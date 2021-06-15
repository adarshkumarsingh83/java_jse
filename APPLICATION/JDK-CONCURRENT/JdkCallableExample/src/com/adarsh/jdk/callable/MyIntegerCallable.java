package com.adarsh.jdk.callable;

import java.util.concurrent.Callable;


public class MyIntegerCallable implements Callable<Integer> {
    private static Integer counter = 0;

    @Override
    public Integer call() throws Exception {
        return counter++;
    }
}
