package com.adarsh.thread.test;

import com.adarsh.thread.MyThread;
import com.adarsh.thread.MyWorker;
import org.junit.Test;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 4:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class ThreadLockTest {

    @Test
    public void testConcurrentLock() throws Exception {
        System.out.println("String Test testConcurrentLock()" + Thread.currentThread().getName());
        final int threadCount = 20;
        final Lock lock = new ReentrantLock();
        final MyWorker myWorker = new MyWorker(threadCount);
        for (int index = 0; index < 20; index++) {
            Thread thread = new MyThread("Thread" + index, lock, myWorker);
            thread.start();
            thread.join();
        }
        System.out.println("Ending Test testConcurrentLock()" + Thread.currentThread().getName());
    }
}
