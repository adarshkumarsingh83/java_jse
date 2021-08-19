package com.espark.adarsh;

import com.espark.adarsh.heap.MaxHeap;
import com.espark.adarsh.heap.MinHeap;

public class ApplicationMain {

    public static void main(String[] args) {
        maxHeapDriver();
        System.out.printf("\n\n");
        minHeapDriver();
    }

    public static void minHeapDriver() {
        MinHeap minHeap = new MinHeap(15);

        // Inserting element to minHeap
        // using insert() method

        // Custom input entries
        minHeap.insert(5);
        minHeap.insert(3);
        minHeap.insert(17);
        minHeap.insert(10);
        minHeap.insert(84);
        minHeap.insert(19);
        minHeap.insert(6);
        minHeap.insert(22);
        minHeap.insert(9);

        // Print all elements of the heap
        minHeap.print();

        // Removing minimum value from above heap
        // and printing it
        System.out.println("The Min val is " + minHeap.remove());
    }

    public static void maxHeapDriver() {
        MaxHeap maxHeap = new MaxHeap(15);

        // Inserting element to minHeap
        // using insert() method

        // Custom input entries
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);

        // Print all elements of the heap
        maxHeap.print();

        // Removing minimum value from above heap
        // and printing it
        System.out.println("The Max val is " + maxHeap.remove());
    }
}
