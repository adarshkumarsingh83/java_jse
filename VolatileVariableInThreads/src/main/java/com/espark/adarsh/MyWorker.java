package com.espark.adarsh;

import java.util.concurrent.Callable;

/**
 * Created by Adarsh on 8/18/15.
 */
public class MyWorker implements Callable<Integer> {

    private volatile static Integer counter=0;

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName()+" Counter Before Increment "+counter);
        counter+=1;
        Thread.sleep(50);
        System.out.println(Thread.currentThread().getName()+" Counter After Increment "+counter);
        return counter;
    }
}
