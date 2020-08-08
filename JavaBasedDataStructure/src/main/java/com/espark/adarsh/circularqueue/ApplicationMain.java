package com.espark.adarsh.circularqueue;

/**
 * Created by Adarsh on 8/26/15.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        MyCircularQueue<Integer> circularQueue = new MyCircularQueue<Integer>(5);
        for (int i = 0; i < 8; i++) {
            circularQueue.addData(i);
        }
        System.out.println("Circular Queue " + circularQueue);
        Integer data = null;
        try {
            while ((data = circularQueue.getData()) != null) {
                System.out.print(" " + data);
            }
        } catch (Exception e) {

        }

        System.out.println("\nCircular Queue " + circularQueue);
    }
}
