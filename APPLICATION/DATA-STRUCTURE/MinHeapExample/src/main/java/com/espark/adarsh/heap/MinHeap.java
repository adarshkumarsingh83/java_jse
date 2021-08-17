package com.espark.adarsh.heap;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {

    private List<Integer> heap;
    private int size;
    private int maxSize;

    private static final int FRONT = 1;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new ArrayList<Integer>(this.maxSize + 1);
        this.heap.add(0, Integer.MIN_VALUE);
    }

    // Method 1
    // Returning the position of
    // the parent for the node currently
    // at pos
    private int parent(int pos) {
        return pos / 2;
    }

    // Method 2
    // Returning the position of the
    // left child for the node currently at pos
    private int leftChild(int pos) {
        return (2 * pos);
    }

    // Method 3
    // Returning the position of
    // the right child for the node currently
    // at pos
    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    // Method 4
    // Returning true if the passed
    // node is a leaf node
    private boolean isLeaf(int pos) {

        if (pos > (size / 2) && pos <= size) {
            return true;
        }

        return false;
    }

    // Method 5
    // To swap two nodes of the heap
    private void swap(int fpos, int spos) {
        Integer tmp = heap.get(fpos);
        heap.add(fpos, heap.get(spos));
        heap.add(spos, tmp);
    }

    // Method 6
    // To heapify the node at pos
    private void minHeapify(int pos) {

        // If the node is a non-leaf node and greater
        // than any of its child
        if (!isLeaf(pos)) {
            if (heap.get(pos) > heap.get(leftChild(pos))
                    || heap.get(pos) > heap.get(rightChild(pos))) {

                // Swap with the left child and heapify
                // the left child
                if (heap.get(leftChild(pos))
                        < heap.get(rightChild(pos))) {
                    swap(pos, leftChild(pos));
                    minHeapify(leftChild(pos));
                }

                // Swap with the right child and heapify
                // the right child
                else {
                    swap(pos, rightChild(pos));
                    minHeapify(rightChild(pos));
                }
            }
        }
    }

    // Method 7
    // To insert a node into the heap
    public void insert(int element) {

        if (size >= maxSize) {
            return;
        }

        heap.add(++size, element);
        int current = size;

        while (heap.get(current) < heap.get(parent(current))) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Method 8
    // To print the contents of the heap
    public void print() {
        for (int i = 1; i <= size / 2; i++) {

            // Printing the parent and both childrens
            System.out.print(
                    " PARENT : " + heap.get(i)
                            + " LEFT CHILD : " + heap.get(2 * i)
                            + " RIGHT CHILD :" + heap.get(2 * i + 1));

            // By here new line is required
            System.out.println();
        }
    }

    // Method 9
    // To remove and return the minimum
    // element from the heap
    public int remove() {
        int popped = heap.get(FRONT);
        heap.add(FRONT, heap.get(size--));
        minHeapify(FRONT);
        return popped;
    }

}
