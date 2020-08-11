package com.adarsh.concurrent.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/16/14
 * Time: 4:21 PM
 * To change this template use File | Settings | File Templates.
 */
public class JavaLockExample {

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();
        lock.lock();

           //critical section

        lock.unlock();
    }
}
