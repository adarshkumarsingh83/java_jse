package com.adarsh.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/16/14
 * Time: 3:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class CountDownLatchDecrementerThread extends Thread {

    private CountDownLatch latch = null;
    private long count;

    public CountDownLatchDecrementerThread(CountDownLatch latch) {
        this.latch = latch;
        this.count = latch.getCount();
    }

    public void run() {
        System.out.println(Thread.currentThread().getName()+" run method ");
        try {
            for (int i = 0; i <= count; i++) {
                Thread.sleep(1000);
                this.latch.countDown();
                System.out.println("Current Latch Count :=> "+latch.getCount());
            }
        } catch (InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println(Thread.currentThread().getName()+" run method ");
    }
}