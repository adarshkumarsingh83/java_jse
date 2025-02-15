package com.espark.adarsh.bean;


public class Cube<T> {
    private int size;
    private Node<T>[] xHorizontalAxis;
    private Node<T>[] yVerticalAxis;
    private Node<T> front;
    private Node<T> right;
    private Node<T> back;
    private Node<T> left;
    private Node<T> top;
    private Node<T> bottom;

    public Node<T> getBack() {
        return back;
    }

    public void setBack(Node<T> back) {
        this.back = back;
    }

    public Node<T> getBottom() {
        return bottom;
    }

    public void setBottom(Node<T> bottom) {
        this.bottom = bottom;
    }

    public Node<T> getFront() {
        return front;
    }

    public void setFront(Node<T> front) {
        this.front = front;
    }

    public Node<T> getLeft() {
        return left;
    }

    public void setLeft(Node<T> left) {
        this.left = left;
    }

    public Node<T> getRight() {
        return right;
    }

    public void setRight(Node<T> right) {
        this.right = right;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> top) {
        this.top = top;
    }

    public Node<T>[] getxHorizontalAxis() {
        return xHorizontalAxis;
    }

    public void setxHorizontalAxis(Node<T>[] xHorizontalAxis) {
        this.xHorizontalAxis = xHorizontalAxis;
    }

    public Node<T>[] getyVerticalAxis() {
        return yVerticalAxis;
    }

    public void setyVerticalAxis(Node<T>[] yVerticalAxis) {
        this.yVerticalAxis = yVerticalAxis;
    }
}
