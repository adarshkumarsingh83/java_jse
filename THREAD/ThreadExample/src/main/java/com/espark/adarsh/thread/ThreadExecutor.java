package com.espark.adarsh.thread;

/**
 * Created by adarsh kumar on 7/24/16.
 */
public class ThreadExecutor {
    public static void main(String[] args) throws Exception {
        MyThread myThread = new MyThread("radha");
        myThread.start();

        System.out.println("Waiting " + Thread.currentThread().getName());
        Thread.currentThread().wait(1000);
    }
}
