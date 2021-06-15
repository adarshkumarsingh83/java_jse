package com.espark.adarsh;

import java.util.concurrent.Semaphore;

/**
 * Created by Adarsh on 8/18/15.
 */
public class MyWorker implements Runnable {

    private MyTask myTask;

    public MyWorker(MyTask myTask){
        this.myTask=myTask;
    }

    public void run(){
        while(true){
          this.myTask.doWork();
        }
    }
}
