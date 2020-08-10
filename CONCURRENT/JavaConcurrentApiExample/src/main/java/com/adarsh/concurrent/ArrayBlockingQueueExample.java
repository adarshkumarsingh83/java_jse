package com.adarsh.concurrent;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * ArrayBlockingQueue is a bounded, blocking queue that stores the
 * elements internally in an array. That it is bounded means that it
 * cannot store unlimited amounts of elements. There is an upper bound
 * on the number of elements it can store at the same time. You set the upper
 * bound at instantiation time, and after that it cannot be changed.
 */
public class ArrayBlockingQueueExample {

    public static void main(String[] args) throws Exception {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(1024);
        queue.put("1");
        String string = queue.take();
        System.out.println(string);
    }
}
