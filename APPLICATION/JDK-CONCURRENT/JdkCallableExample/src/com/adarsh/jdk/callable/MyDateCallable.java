package com.adarsh.jdk.callable;

import java.util.Date;
import java.util.concurrent.Callable;


public class MyDateCallable implements Callable<Date> {
    @Override
    public Date call() throws Exception {
        return new Date();
    }
}
