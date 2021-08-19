package com.espark.adarsh.heap;


public class MinHeap {

    private static final int FRONT = 1;
    private Integer[] heap;
    private int size;
    private int maxSize;

    public MinHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        this.heap = new Integer[this.maxSize + 1];
        this.heap[0] = Integer.MIN_VALUE;
    }


    /*
    Returning the position of
    the parent for the node currently at pos
     */
    private int parent(int pos) {
        return pos / 2;
    }

    /*
     Returning the position of the
     left child for the node currently at pos
     */
    private int leftChild(int pos) {
        return (2 * pos);
    }

    /*
     Returning the position of
     the right child for the node currently at pos
     */
    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    /*
     Returning true if the passed
     node is a leaf node
     */
    private boolean isLeaf(int pos) {
        if (pos > (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    /*
     To swap two nodes of the heap
     */
    private void swap(int fpos, int spos) {
        Integer tmp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = tmp;
    }

    /*
     To heapify the node at pos
     */
    private void minHeapify(int pos) {

        // If the node is a non-leaf node and greater
        // than any of its child
        if (!this.isLeaf(pos)) {
            if (heap[pos] > heap[this.leftChild(pos)]
                    || heap[pos] > heap[this.rightChild(pos)]) {

                // Swap with the left child and heapify
                // the left child
                if (heap[this.leftChild(pos)]
                        < heap[this.rightChild(pos)]) {
                    this.swap(pos, this.leftChild(pos));
                    this.minHeapify(leftChild(pos));
                }

                // Swap with the right child and heapify
                // the right child
                else {
                    this.swap(pos, this.rightChild(pos));
                    this.minHeapify(this.rightChild(pos));
                }
            }
        }
    }

    /*
    To insert a node into the heap
     */
    public void insert(int element) {

        if (size >= maxSize) {
            return;
        }

        heap[++size] = element;
        int current = size;

        while (heap[current] < heap[this.parent(current)]) {
            this.swap(current, this.parent(current));
            current = this.parent(current);
        }
    }

    /*
    To print the contents of the heap
     */
    public void print() {
        for (int i = 1; i <= size / 2; i++) {

            // Printing the parent and both childrens
            System.out.println(" PARENT : " + heap[i] + " LEFT CHILD : " + heap[2 * i] + " RIGHT CHILD :" + heap[2 * i + 1]);
            // By here new line is required
            System.out.println();
        }
    }

    /*
    To remove and return the minimum
    element from the heap
     */
    public int remove() {
        int popped = heap[FRONT];
        heap[FRONT] = heap[size--];
        this.minHeapify(FRONT);
        return popped;
    }
}
