package com.adarsh.concurrent.countdownlatch;

import java.util.concurrent.CountDownLatch;

/**
 * A java.util.concurrent.CountDownLatch is a concurrency construct that allows one or more threads to wait for a
 * given set of operations to complete.
 * A CountDownLatch is initialized with a given count. This count is decremented by calls to the countDown()
 * method. Threads waiting for this count to
 * reach zero can call one of the await() methods. Calling await() blocks the thread until the count reaches zero.
 */
public class CountDownLatchExmaple {

    public static void main(String[] args) throws Exception {
        CountDownLatch latch = new CountDownLatch(3);

        Waiter waiter = new Waiter(latch);
        Decrementer decrementer = new Decrementer(latch);

        new Thread(waiter).start();
        new Thread(decrementer).start();

        Thread.sleep(4000);
    }
}
