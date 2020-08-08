package com.espark.adarsh;

import java.util.concurrent.Semaphore;

/**
 * Created by Adarsh on 8/18/15.
 */
public class ApplicationMain {
    public static void main(String[] args) {
        final Semaphore semaphore = new Semaphore(1);
        final MyTask myTask=new MyTask(semaphore);
        final MyWorker myWorker1 = new MyWorker(myTask);
        final MyWorker myWorker2 = new MyWorker(myTask);
        final MyWorker myWorker3 = new MyWorker(myTask);
        final MyWorker myWorker4 = new MyWorker(myTask);
        final MyWorker myWorker5 = new MyWorker(myTask);
        new Thread(myWorker1).start();
        new Thread(myWorker2).start();
        new Thread(myWorker3).start();
        new Thread(myWorker4).start();
        new Thread(myWorker5).start();

    }
}
