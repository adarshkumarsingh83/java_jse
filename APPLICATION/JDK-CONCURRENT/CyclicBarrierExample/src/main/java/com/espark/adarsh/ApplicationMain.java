package com.espark.adarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Adarsh on 8/21/15.
 */
public class ApplicationMain {

    private static List list = new ArrayList();

    public static void main(String[] args) throws Exception {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(3, new Runnable() {
            public void run() {
                for(int i=0;i<10;i++){
                    addListValue();
                }
            }
        });
        MyWorker myWorker1 = new MyWorker(1, 10, list, cyclicBarrier);
        MyWorker myWorker2 = new MyWorker(1, 10, list, cyclicBarrier);
        MyWorker myWorker3 = new MyWorker(1, 10, list, cyclicBarrier);
        MyWorker myWorker4 = new MyWorker(1, 10, list, cyclicBarrier);
        MyWorker myWorker5 = new MyWorker(1, 10, list, cyclicBarrier);
        myWorker1.start();
        myWorker2.start();
        myWorker3.start();
        myWorker4.start();
        myWorker5.start();
    }

    public static void addListValue(){
        int sum = 0;
        try{
            for (int i = 0; i < list.size(); i++) {
                sum += (int) list.get(i);
            }
            Thread.currentThread().sleep(1000);
            System.out.println("Sum of the Calculation " + sum);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
