package com.adarsh.concurrent.collections;

import org.junit.Test;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * The LinkedBlockingQueue keeps the elements internally in a linked structure (linked nodes).
 * This linked structure can optionally have an upper bound if desired. If no upper bound is specified,
 * Integer.MAX_VALUE is used as the upper bound.
 * The LinkedBlockingQueue stores the elements internally in FIFO (First In, First Out) order.
 * The head of the queue is the element which has been in queue the longest time, and the tail of the queue is
 * the element which has been in the queue the shortest time.
 */
public class LinkedBlockingQueueExample {

    @Test
    public void test() throws Exception {
        BlockingQueue<String> bounded = new LinkedBlockingQueue<String>(1024);
        bounded.put("Value");
        String value = bounded.take();
        System.out.println(value);
    }
}
