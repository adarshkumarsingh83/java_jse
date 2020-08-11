package com.espark.adarsh;

/**
 * Created by Adarsh on 8/18/15.
 */
public class ApplicationMain {
    public static void main(String[] args) {
        final MyWorker myWorker1=new MyWorker(System.getProperty("user.name").toUpperCase());
        new Thread(myWorker1).start();
        new Thread(myWorker1).start();
        new Thread(myWorker1).start();
        new Thread(myWorker1).start();
        new Thread(myWorker1).start();
    }
}
