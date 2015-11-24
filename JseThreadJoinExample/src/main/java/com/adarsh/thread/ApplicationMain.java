package com.adarsh.thread;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 11:07 AM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting Main() " + Thread.currentThread().getName());
        final MyWorkerThread myWorkerThread1 = new MyWorkerThread(System.getProperty("user.name") + " ThreadOne ", 100L, " worker one ", 100);
        final MyWorkerThread myWorkerThread2 = new MyWorkerThread(System.getProperty("user.name") + " ThreadTwo ", 100L, " worker two ", 100);
        myWorkerThread1.start();
        myWorkerThread2.start();
        myWorkerThread1.join();
        myWorkerThread2.join();
        System.out.println("Ending Main() " + Thread.currentThread().getName());
    }

}
