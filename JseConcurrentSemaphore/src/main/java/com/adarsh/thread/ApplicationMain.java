package com.adarsh.thread;

import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 9:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) throws Exception {
        System.out.println(Thread.currentThread().getName() + " Entering ");

        final boolean firstComeFirstServer = true;
        final int semaphore1ParallelProcessing = 1;
        final int semaphore2ParallelProcessing = 1;

        final Semaphore semaphore1 = new Semaphore(semaphore1ParallelProcessing, firstComeFirstServer);
        final Semaphore semaphore2 = new Semaphore(semaphore2ParallelProcessing, firstComeFirstServer);

        final Thread t1 = new DoubleResourceGrabber("Adarsh ", semaphore1, semaphore2);
        final Thread t2 = new DoubleResourceGrabber("Radha ", semaphore1, semaphore2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(Thread.currentThread().getName() + " Existing ");
    }
}
