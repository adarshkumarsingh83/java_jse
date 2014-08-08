package com.adarsh.thread.consumerProducer.goods;

public class GoodShop {
    int n;
    boolean b = false;

    synchronized void put(int n) {
        try {

            if (b) {
                System.out.println(b);
                wait();
            } else {
                System.out.println(b);
                System.out.println(" put " + n);
                this.n = n;
                b = true;
                notify();
            }
        } catch (InterruptedException e) {
            System.out.println("Exception Generated " + e);
        }
    }

    synchronized void get() {
        try {
            if (!b) {
                System.out.println(b);
                wait();
            } else {
                System.out.println(b);
                System.out.println(" get " + n);
                b = false;
                notify();
            }
        } catch (InterruptedException e) {
            System.out.println("Exception Generated " + e);
        }
    }

}
