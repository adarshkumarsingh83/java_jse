package com.adarsh.concurrent;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/**
 * The PriorityBlockingQueue is an unbounded concurrent queue. It uses the same ordering rules as the java.util.PriorityQueue class.
 * You cannot insert null into this queue.
 * All elements inserted into the PriorityBlockingQueue must implement the java.lang.Comparable interface. The elements thus order
 * themselves according to whatever priority you decide in your Comparable implementation.
 * Notice that the PriorityBlockingQueue does not enforce any specific behaviour for elements that have equal priority (compare() == 0).
 * Also notice, that in case you obtain an Iterator from a PriorityBlockingQueue, the Iterator does not guarantee to
 * iterate the elements in priority order.
 */
public class PriorityBlockingQueueExample {

    public static void main(String[] args) throws Exception {
        BlockingQueue queue = new PriorityBlockingQueue();

        //String implements java.lang.Comparable
        queue.put("Value");
        String value = (String) queue.take();
        System.out.println(value);
    }
}
