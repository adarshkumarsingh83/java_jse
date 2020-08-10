package com.adarsh.concurrent.collections;

import java.util.concurrent.SynchronousQueue;

/**
 * The SynchronousQueue is a queue that can only contain a single element internally.
 * A thread inserting an element into the queue is blocked until another thread takes that element from the queue.
 * Likewise, if a thread tries to take an element and no element is currently present, that thread is blocked until a
 * thread insert an element into the queue.
 */
public class SynchronousQueueExample {

    public static void main(String[] args) throws Exception {

        /*
        SynchronousQueue in which each insert
        operation must wait for a corresponding remove operation by another
        thread, and vice versa.
       */
        final SynchronousQueue synchronousQueue = new SynchronousQueue<String>();
        synchronousQueue.put("1");


        /* Retrieves, but does not remove, the head of this queue,or return null */
        System.out.println(synchronousQueue.peek());

        /*Retrieves and removes the head of this queue or return null */
        System.out.println(synchronousQueue.poll());
        synchronousQueue.put("2");
        /*Retrieves and removes the head of this queue or return null */
        System.out.println(synchronousQueue.poll());
    }
}
