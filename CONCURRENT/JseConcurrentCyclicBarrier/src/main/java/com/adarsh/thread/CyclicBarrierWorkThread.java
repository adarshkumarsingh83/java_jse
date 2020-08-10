package com.adarsh.thread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * A synchronization aid that allows a set of threads to all wait for
 * each other to reach a common barrier point.  CyclicBarriers are
 * useful in programs involving a fixed sized party of threads that
 * must occasionally wait for each other. The barrier is called
 * <em>cyclic</em> because it can be re-used after the waiting threads
 * are released.
 */
public class CyclicBarrierWorkThread extends Thread {

    private CyclicBarrier barrier1 = null;
    private CyclicBarrier barrier2 = null;

    public CyclicBarrierWorkThread(
            CyclicBarrier barrier1,
            CyclicBarrier barrier2) {

        this.barrier1 = barrier1;
        this.barrier2 = barrier2;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                    " waiting at barrier 1");
            //all thread will come to this point and wait and then execute this
            this.barrier1.await();

            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() +
                    " waiting at barrier 2");
            //all thread will come to this point and wait and then execute this
            this.barrier2.await();

            System.out.println(Thread.currentThread().getName() +
                    " done!");

        } catch (InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
        } catch (BrokenBarrierException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}
