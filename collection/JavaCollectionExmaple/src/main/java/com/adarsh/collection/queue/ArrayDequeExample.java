package com.adarsh.collection.queue;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/17/14
 * Time: 11:26 AM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayDequeExample {
    private ArrayDeque<String> arrayDeque;

    @Before
    public void init() {
        arrayDeque = new ArrayDeque<String>();
        for (int i = 1; i < 11; i++) {
            arrayDeque.add("" + i);
        }
    }

    @Test
    public void readingWithForEachLoop() {
        for (String s : arrayDeque) {
            System.out.print(s + "\t");
        }
    }

    @Test
    public void readingWithIterator() {
        for (Iterator<String> iterator = arrayDeque.iterator(); iterator.hasNext(); ) {
            System.out.print(iterator.next() + "\t");
        }
    }

    @Test
    public void frontOperationTest() {
        arrayDeque.addFirst("" + 10);
        System.out.println("Add First " + arrayDeque);
        System.out.println("Get First " + arrayDeque.getFirst() + " " + arrayDeque);
        System.out.println("Peek First " + arrayDeque.peekFirst() + " " + arrayDeque);
        System.out.println("Pool First " + arrayDeque.pollFirst() + " " + arrayDeque);
        System.out.println("Remove First " + arrayDeque.removeFirst() + " " + arrayDeque);
        arrayDeque.push(" " + 1);
        System.out.println("Push First " + arrayDeque);
        System.out.println("Pop First " + arrayDeque.pop()+" "+arrayDeque);
        arrayDeque.offerFirst(""+1);
        System.out.println("Offer First " +arrayDeque);
    }


    @Test
    public void endOperationTest() {
        arrayDeque.addLast(""+10);
        System.out.println("Add Last" +arrayDeque);
        System.out.println("Get Last " + arrayDeque.getLast() + " " + arrayDeque);
        System.out.println("Peek Last " + arrayDeque.peekLast() + " " + arrayDeque);
        System.out.println("Pool Last " + arrayDeque.pollLast() + " " + arrayDeque);
        System.out.println("Remove Last " + arrayDeque.removeLast() + " " + arrayDeque);
        arrayDeque.offerLast(""+1);
        System.out.println("Offer Last " +arrayDeque);
        System.out.println("Remove Last Occurrence " +arrayDeque.removeLastOccurrence(10)+" "+arrayDeque);
    }
}
