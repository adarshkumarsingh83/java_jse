package com.espark.adarsh.thread.consumer;

import java.util.List;

/**
 * Created by Adarsh on 9/3/15.
 */
public class MyConsumer extends Thread {

    private Object lock = null;
    private List list;

    public MyConsumer(String name, Object lock, List list) {
        super(name);
        this.lock = lock;
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (lock) {
                if (list.size() == 1) {
                    System.out.println("Consumer consumes => " + list.remove(0));
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
