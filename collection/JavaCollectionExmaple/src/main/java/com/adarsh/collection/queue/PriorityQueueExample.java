package com.adarsh.collection.queue;

import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/17/14
 * Time: 11:03 AM
 * To change this template use File | Settings | File Templates.
 */
public class PriorityQueueExample {


    @Test
       public void basicOperation() {
        final PriorityQueue priorityQueue = new PriorityQueue();
        for (int i = 1; i < 11; i++) {
            priorityQueue.add( i);
        }
        System.out.println("\nPriorityQueue Data " + priorityQueue);

        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print( iterator.next()+"\t");
        }

        // print size
        System.out.println("\nsize: " + priorityQueue.size());
        // return highest priority element in the queue without removing it
        System.out.println("peek: " + priorityQueue.peek());
        // print size
        System.out.println("size: " + priorityQueue.size());
        // return highest priority element and removes it from the queue
        System.out.println("poll: " + priorityQueue.poll());
        // print size
        System.out.println("size: " + priorityQueue.size());

    }

    @Test
    public void customOrderingOperation() {
        final PriorityQueue priorityQueue = new PriorityQueue(10,new Comparator<Integer>() {
            public int compare(Integer one, Integer two) {
                return two - one;
            }
        });
        for (int i = 0; i < 10; i++) {
            priorityQueue.add( i);
        }
        System.out.println("\nPriorityQueue Data " + priorityQueue);

        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.print( iterator.next()+"\t");
        }

    }
}
