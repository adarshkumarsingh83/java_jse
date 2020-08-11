package com.adarsh.thread;

import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 9:08 PM
 * To change this template use File | Settings | File Templates.
 */
public class DoubleResourceGrabber extends Thread {

    private Semaphore first;
    private Semaphore second;

    public DoubleResourceGrabber(String name, Semaphore s1, Semaphore s2) {
        super(name);
        first = s1;
        second = s2;
    }

    public void run() {
        try {
            first.acquire();
            System.out.println(Thread.currentThread().getName() + " Acquired External " );

            System.out.println(Thread.currentThread().getName() + " Acquired Internal ");
            second.acquire();
             for(int index=0;index<100;index++){
                 System.out.print(".");
                 Thread.sleep(200);
             }
            System.out.println("\n"+Thread.currentThread().getName() + " Released Internal ");
            second.release();

            System.out.println(Thread.currentThread().getName() + " Released External \n");
            first.release();
        } catch (InterruptedException ex) {
            System.out.print(ex.getLocalizedMessage());
        }
    }

}
