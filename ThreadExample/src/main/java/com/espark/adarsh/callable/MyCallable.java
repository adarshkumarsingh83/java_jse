package com.espark.adarsh.callable;

import java.util.concurrent.Callable;

/**
 * Created by adarsh kumar on 7/24/16.
 */
public class MyCallable implements Callable<Integer> {

    private Integer startValue;
    private Integer endValue;

    public MyCallable(Integer startValue, Integer endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    @Override
    public Integer call() throws Exception {
        Integer sumOfValues = 0;
        for (int i = startValue; i < endValue; i++) {
            sumOfValues += i;
        }
        return sumOfValues;
    }
}