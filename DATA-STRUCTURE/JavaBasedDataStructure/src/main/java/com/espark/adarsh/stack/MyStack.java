package com.espark.adarsh.stack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adarsh on 8/28/15.
 */
public class MyStack<T> {

    private Integer maxSize = 5;
    private Integer position = -1;
    private List<T> list = new ArrayList<T>(maxSize);

    public MyStack() {
        this.list = new ArrayList<T>(maxSize);
    }

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        this.list = new ArrayList<T>(maxSize);
    }

    public void pushData(T data) {
        if (this.position < maxSize) {
            this.list.add(data);
            position += 1;
        } else {
            throw new RuntimeException("Stack is full");
        }
    }

    public T popData() {
        T data = null;
        if (this.position > -1) {
            data = this.list.get(list.size() - 1);
            this.position -= 1;
        }
        return data;
    }

    public Integer getSiz(){
        return this.position;
    }

    public void display() {
        System.out.println(this.list);
    }
}
