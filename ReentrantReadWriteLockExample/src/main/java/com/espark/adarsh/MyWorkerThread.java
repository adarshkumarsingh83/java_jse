package com.espark.adarsh;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Adarsh on 8/17/15.
 */
public class MyWorkerThread implements Callable {

    private String name;
    private MyWorker myWorker;

    public MyWorkerThread(String name,MyWorker myWorker) {

        this.name=name;
        this.myWorker=myWorker;
    }

    @Override
    public String call() {
        int count=0;
        try{
            while(count<10){
                this.myWorker.setWishMessage("hi "+name);
                Thread.sleep(100);
                System.out.println(this.myWorker.getWishMessage());
                count++;
            }
        }catch (Exception e){

        }
        return "end";
    }
}
