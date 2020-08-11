package com.adarsh.thread.test;

import com.adarsh.thread.MyWorkerThread;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 11:21 AM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationThreadTest {

    private MyWorkerThread myWorkerThread1 = null;
    private MyWorkerThread myWorkerThread2 = null;

    @Before
    public void init() {
        this.myWorkerThread1 = new MyWorkerThread(System.getProperty("user.name") + " ThreadOne ", 100L, " worker one ", 100);
        this.myWorkerThread2 = new MyWorkerThread(System.getProperty("user.name") + " ThreadTwo ", 100L, " worker two ", 100);
    }

    @Test
    public void joinTest1() throws Exception {
        /* Main Thread will wait util all the  myWorkerThread1 & myWorkerThread1 will complete */
        System.out.println("Starting Main() " + Thread.currentThread().getName());
        this.myWorkerThread1.start();
        this.myWorkerThread2.start();
        this.myWorkerThread1.join();
        this.myWorkerThread2.join();
        System.out.println("Ending Main() " + Thread.currentThread().getName());
    }

    @Test
    public void joinTest2() throws Exception {
        /* Main Thread will wait util 100 millisecond expire for the  myWorkerThread1 & myWorkerThread1
        if both thread is working then also it will complete and exist  */
        System.out.println("Starting Main() " + Thread.currentThread().getName());
        this.myWorkerThread1.start();
        this.myWorkerThread2.start();
        this.myWorkerThread1.join(100);
        this.myWorkerThread2.join(100);
        System.out.println("Ending Main() " + Thread.currentThread().getName());
    }

    @After
    public void destroy() {
        this.myWorkerThread1 = null;
        this.myWorkerThread2 = null;
    }
}
