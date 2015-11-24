package com.espark.adarsh.thread.producer;

import java.util.List;

/**
 * Created by Adarsh on 9/3/15.
 */
public class MyProducer extends Thread {

    private Object lock = null;
    private List list;

    public MyProducer(String name, Object lock, List list) {
        super(name);
        this.lock = lock;
        this.list = list;
    }

    @Override
    public void run() {
        final String data = "Adarsh";
        while (true) {
            synchronized (lock) {
                if (list.size() == 0) {
                    System.out.println("Producer produces => " + data);
                    list.add(data);
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        }
    }
}
