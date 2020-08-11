package com.adarsh.concurrent;

import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * The word Deque comes from the term "Double Ended Queue". A Deque is thus a queue where you can insert and remove elements
 * from both ends of the queue.
 * The LinkedBlockingDeque is a Deque which will block if a thread attempts to take elements out of it while it is empty,
 * regardless of what end the thread is attempting to take elements from.
 */
public class LinkedBlockingDequeExample {

    public static void main(String[] args) throws Exception {
       final BlockingDeque<String> deque = new LinkedBlockingDeque<String>(){
            {
                addFirst("1");
                addLast("2");
            }
        };

        String two = deque.takeLast();
        String one = deque.takeFirst();
        System.out.println(one + " " + two);
    }

}
