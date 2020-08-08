package com.espark.adarsh.thread;

/**
 * Created by adarsh kumar on 7/24/16.
 */
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Welcome to the application " + Thread.currentThread().getName());
        }

    }
}
