package com.adarsh.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/16/14
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class WorkerThread extends Thread {

    private CountDownLatch latch = null;

    public WorkerThread(String name, CountDownLatch latch) {
        super(name);
        this.latch = latch;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " Waiting for Latch Count come to Zero ");
        try {
            latch.await();
        } catch (InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println(Thread.currentThread().getName() + " Done with the Task ");
    }
}