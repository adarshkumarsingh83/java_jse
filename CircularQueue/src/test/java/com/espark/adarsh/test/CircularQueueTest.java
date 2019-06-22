package com.espark.adarsh.test;

import com.espark.adarsh.CircularQueue;

public class CircularQueueTest {

    public static void main(String[] args) throws Exception {
        CircularQueue<Integer> circularQueue=new CircularQueue(5);

        for(int i=0;i<5;i++) {
            System.out.println("Insert Operation "+circularQueue.enqueue(i));
        }

        circularQueue.display();

        System.out.println("Removal Operation "+circularQueue.dequeue());
        System.out.println("Removal Operation "+circularQueue.dequeue());
        System.out.println("Removal Operation "+circularQueue.dequeue());

        for(int i=10;i<3;i=i+10) {
            System.out.println("Insert Operation "+circularQueue.enqueue(i));
        }
        circularQueue.display();
        System.out.println("Insert Operation "+circularQueue.enqueue(50));
        System.out.println("Insert Operation "+circularQueue.enqueue(60));
        System.out.println("Insert Operation "+circularQueue.enqueue(70));
        System.out.println("Insert Operation "+circularQueue.enqueue(80));
        circularQueue.display();

        for(int i=0;i<10;i++){
            System.out.println("Removal Operation "+circularQueue.dequeue());
        }
    }
}
