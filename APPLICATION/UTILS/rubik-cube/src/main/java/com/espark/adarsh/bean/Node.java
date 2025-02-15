package com.espark.adarsh.bean;



public class Node <T>{
    private T date;
    private Node<T> top;
    private Node<T> bottom;
    private Node<T> left;
    private Node<T> right;

    public Node() {
    }

    public Node(T date,Node<T> bottom, Node<T> left, Node<T> right, Node<T> top) {
        this.bottom = bottom;
        this.date = date;
        this.left = left;
        this.right = right;
        this.top = top;
    }

    public Node<T> getBottom() {
        return bottom;
    }

    public void setBottom(Node<T> bottom) {
        this.bottom = bottom;
    }

    public T getDate() {
        return date;
    }

    public void setDate(T date) {
        this.date = date;
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

    public Node<T> getTop() {
        return top;
    }

    public void setTop(Node<T> top) {
        this.top = top;
    }
}
