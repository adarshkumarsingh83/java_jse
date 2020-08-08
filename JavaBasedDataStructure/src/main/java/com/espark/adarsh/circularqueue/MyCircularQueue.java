package com.espark.adarsh.circularqueue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adarsh on 8/26/15.
 */
public class MyCircularQueue<T> {

    private Integer maxSize;
    private Integer currentSize = -1;
    private Integer fountPointer = -1;
    private Integer rearPointer = -1;
    private List<T> dataContainer;

    public MyCircularQueue(Integer maxSize) {
        this.maxSize = maxSize - 1;
        this.dataContainer = new ArrayList<T>(this.maxSize);
    }

    public void addData(T data) {
        if (this.currentSize < this.maxSize) {
            final Integer nextPosition = this.getNext();
            this.dataContainer.add(nextPosition, data);
            this.rearPointer += 1;
            this.currentSize += 1;
        }
    }

    public T getData() {
        if (this.fountPointer == this.rearPointer) {
            throw new RuntimeException("Circular Queue is Empty");
        }
        this.fountPointer += 1;
        final T data = this.dataContainer.get(fountPointer);
        return data;
    }

    public Integer size() {
        return this.currentSize;
    }

    private Integer getNext() {
        int nextPosition = (rearPointer + 1) % this.maxSize;
        if (nextPosition != maxSize) {
            return nextPosition;
        } else {
            throw new RuntimeException("CircularQueue is full");
        }
    }

    @Override
    public String toString() {
        return this.dataContainer.toString();
    }
}
