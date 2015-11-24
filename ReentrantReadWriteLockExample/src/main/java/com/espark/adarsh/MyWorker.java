package com.espark.adarsh;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Adarsh on 8/17/15.
 */
public class MyWorker {

    //private final ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();

    private String wishMessage;
    private ReentrantReadWriteLock reentrantReadWriteLock;
    private Lock readLock = null;
    private Lock writeLock = null;

    public MyWorker(ReentrantReadWriteLock reentrantReadWriteLock) {
        this.readLock = reentrantReadWriteLock.readLock();
        this.writeLock = reentrantReadWriteLock.writeLock();
    }

    public String getWishMessage() {
        readLock.lock();
        try {
            return wishMessage;
        } finally {
            readLock.unlock();
        }
    }

    public void setWishMessage(final String wishMessage) {
        writeLock.lock();
        try {
            this.wishMessage = wishMessage;
        } finally {
            writeLock.unlock();
        }
    }
}
