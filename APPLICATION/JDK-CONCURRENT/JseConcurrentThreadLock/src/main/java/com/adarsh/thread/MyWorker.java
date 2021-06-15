package com.adarsh.thread;

import java.util.concurrent.locks.Lock;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 4:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class MyWorker {
    private int loop;

    public MyWorker(int loop) {
        this.loop = loop;
    }

    public void work(Lock lock) throws Exception {
        System.out.println(Thread.currentThread().getName() + " Entering for Work");
        lock.lock();
        System.out.println(Thread.currentThread().getName() + " Got the lock");
        int index = 0;
        while (index <= loop) {
            System.out.print(Thread.currentThread().getName()+"\t");
            index++;
        }
        System.out.println(Thread.currentThread().getName() + " Releasing the lock");
        lock.unlock();
        System.out.println(Thread.currentThread().getName() + " Exiting for Work \n");
    }
}
