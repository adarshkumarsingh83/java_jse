package com.espark.adarsh.thread;

import com.espark.adarsh.util.Counter;

public class MyThread extends Thread {

    private ThreadLocal<Counter> counter;

    public MyThread(ThreadLocal counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println(this.counter.get().count());
    }
}
