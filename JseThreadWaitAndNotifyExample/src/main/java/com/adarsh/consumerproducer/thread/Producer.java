package com.adarsh.consumerproducer.thread;

import com.adarsh.consumerproducer.store.MyMessageStore;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class Producer extends Thread {

    private int maxSize;
    private long sleepTime;
    private MyMessageStore myMessageStore;

    public Producer(String threadName, int maxSize, long sleepTime, MyMessageStore myMessageStore) {
        super(threadName);
        this.maxSize = maxSize;
        this.sleepTime = sleepTime;
        this.myMessageStore = myMessageStore;
    }

    @Override
    public void run() {
        try {
            while (true) {
                this.putMessage();
                sleep(sleepTime);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    private void putMessage() throws InterruptedException {
        synchronized (myMessageStore) {
            while (myMessageStore.getSize() == maxSize) {
                myMessageStore.wait();
            }
            myMessageStore.setMessage(System.getProperty("user.name") + " " + new java.util.Date());
            System.out.println(Thread.currentThread().getName() + " Put message Current Size At the time of Producing "+myMessageStore.getSize());
            //Later, when the necessary event happens, the thread that is running it calls notify()
            // from a block synchronized on the same object.
            myMessageStore.notify();
        }
    }
}