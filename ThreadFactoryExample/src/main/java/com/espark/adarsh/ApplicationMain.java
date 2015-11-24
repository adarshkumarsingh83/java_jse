package com.espark.adarsh;

import org.apache.commons.lang3.text.WordUtils;

/**
 * Created by Adarsh on 8/18/15.
 */
public class ApplicationMain {

    public static void main(String[] args) {

        new MyThreadFactory(System.getProperty("user.name").toLowerCase(),Thread.NORM_PRIORITY).newThread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Welcome "+Thread.currentThread().getName());
                }
            }
        }).start();

        new MyThreadFactory(System.getProperty("user.name").toUpperCase(),Thread.MIN_PRIORITY).newThread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Welcome "+Thread.currentThread().getName());
                }
            }
        }).start();

        new MyThreadFactory(WordUtils.capitalize(System.getProperty("user.name")),Thread.MAX_PRIORITY).newThread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    System.out.println("Welcome "+Thread.currentThread().getName());
                }
            }
        }).start();
    }
}
