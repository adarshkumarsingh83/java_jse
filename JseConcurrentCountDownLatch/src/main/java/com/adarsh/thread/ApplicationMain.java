package com.adarsh.thread;

import java.util.concurrent.CountDownLatch;

/**
 * A java.util.concurrent.CountDownLatch is a concurrency construct that allows one or more threads to wait for a
 * given set of operations to complete.
 * A CountDownLatch is initialized with a given count. This count is decremented by calls to the countDown()
 * method. Threads waiting for this count to
 * reach zero can call one of the await() methods. Calling await() blocks the thread until the count reaches zero.
 */
public class ApplicationMain {

    public static void main(String[] args) throws Exception {

        final CountDownLatch latch1 = new CountDownLatch(5);
        new CountDownLatchDecrementerThread(latch1).start();
        WorkerThread workerThread = new WorkerThread("MyThread", latch1);
        workerThread.start();
        workerThread.join();
    }
}
