package com.adarsh.thread;

import java.util.concurrent.locks.Lock;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 4:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyThread extends Thread {

    private Lock lock;
    private MyWorker myWorker;

    public MyThread(String name, Lock lock, MyWorker myWorker) {
        super(name);
        this.lock = lock;
        this.myWorker = myWorker;
    }

    @Override
    public void run() {
        try {
            this.myWorker.work(this.lock);
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
