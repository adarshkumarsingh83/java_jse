package com.espark.adarsh;

import java.util.concurrent.Semaphore;

/**
 * Created by Adarsh on 8/18/15.
 */
public class MyTask {

    private Semaphore semaphore;

    public MyTask(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    public void doWork() {
        while (true) {
            try {
                this.semaphore.acquire();
                System.out.print("\nWelcome ");
                Thread.sleep(100);
                System.out.print(" Radha");
                this.semaphore.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }
}
