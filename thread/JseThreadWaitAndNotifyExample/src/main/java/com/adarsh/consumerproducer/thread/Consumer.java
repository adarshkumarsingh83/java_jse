package com.adarsh.consumerproducer.thread;

import com.adarsh.consumerproducer.store.MyMessageStore;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 12:12 PM
 * To change this template use File | Settings | File Templates.
 */
public class Consumer extends Thread {

    private int maxSize;
    private long sleepTime;
    private MyMessageStore myMessageStore;

    public Consumer(String threadName, int maxSize, long sleepTime, MyMessageStore myMessageStore) {
        super(threadName);
        this.maxSize = maxSize;
        this.sleepTime = sleepTime;
        this.myMessageStore = myMessageStore;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(Thread.currentThread().getName() + " Got message: " + this.getMessage() + " Current Size At the Time of Consuming " + myMessageStore.getSize());
                sleep(sleepTime);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    private String getMessage() throws InterruptedException {
        synchronized (myMessageStore) {
            myMessageStore.notify();
            while (myMessageStore.getSize() == 0) {
                //By executing wait() from a synchronized block,
                // a thread gives up its hold on the lock and goes to sleep.
                myMessageStore.wait();
            }
            return myMessageStore.getMessage();
        }
    }
}