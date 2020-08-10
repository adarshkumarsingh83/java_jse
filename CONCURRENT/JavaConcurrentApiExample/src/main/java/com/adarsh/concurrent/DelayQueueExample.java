package com.adarsh.concurrent;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 The DelayQueue keeps the elements internally until a certain delay has expired.
 The elements must implement the interface java.util.concurrent.Delayed.
 */
public class DelayQueueExample {

    public static void main(String[] args)throws Exception{

        DelayQueue queue = new DelayQueue();

        Delayed element1 = new DelayedElement();



        //keeping element into queue
        queue.put(element1);

        //taking element from queue
        Delayed element2 = queue.take();

        System.out.println(element1+" "+element2);
    }

    private static class DelayedElement implements Delayed{

        @Override
        public long getDelay(TimeUnit unit) {
            return 0;
        }
        @Override
        public int compareTo(Delayed o) {
            return 0;
        }
    }
}
