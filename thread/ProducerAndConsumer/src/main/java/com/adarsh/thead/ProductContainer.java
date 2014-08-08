package com.adarsh.thead;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 12/10/12
 * Time: 3:27 PM
 * To change this template use File | Settings | File Templates.
 */
public class ProductContainer {
    int n;
    boolean valueSet = false;

    synchronized int get() {
        if (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught");
            }
        System.out.println("Got:" + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        if (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Interrupted Exception caught");
            }
        this.n = n;
        valueSet = true;
        System.out.println("\nPut:" + n);
        notify();
    }
}
