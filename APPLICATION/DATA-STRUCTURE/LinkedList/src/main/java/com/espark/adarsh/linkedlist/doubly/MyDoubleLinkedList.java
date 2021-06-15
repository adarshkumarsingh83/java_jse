package com.espark.adarsh.linkedlist.doubly;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adarsh on 8/27/15.
 */
public class MyDoubleLinkedList<T> {
    class Node<T> {

        private T data;

        private Node next = null;
        private Node previous = null;

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }

    private Node<T> start = null;
    private Node<T> end = null;
    private Integer count = new Integer(0);


    public void addData(T data) {
        if (start == null) {
            this.start = new Node<T>();
            this.start.setData(data);
            this.start.setPrevious(null);
            this.start.setNext(null);
            this.end = start;
            count++;
        } else {
            final Node<T> temp = new Node<T>();
            temp.setData(data);
            this.end.setNext(temp);
            temp.setPrevious(this.end);
            temp.setNext(null);
            this.end = temp;
            count++;
        }
    }

    public T getFirstData() {
        T data = null;
        if (count > 0) {
            return this.start.getData();
        }
        return data;
    }

    public T getLastData() {
        T data = null;
        if (count > 0) {
            return this.end.getData();
        }
        return data;
    }

    public List<T> getAllData() {
        final List<T> list = new ArrayList<T>(this.count);
        if (count > 0) {
            Node<T> node = start;
            while (node != null) {
                list.add(node.getData());
                node = node.getNext();
            }
        }
        return list;
    }

    public T removeFirstData() {
        T data = null;
        if (count > 0) {
            data = this.start.getData();
            start = start.getNext();
            start.setPrevious(null);
            this.count--;
        }
        return data;
    }


    public T removeLastData() {
        T data = null;
        if (count > 0) {
            Node<T> node = start;
            Node<T> temp = node;
            while (node.getNext() != null) {
                temp = node;
                node = node.getNext();
            }
            data = node.getData();
            temp.setNext(null);
            this.end = temp;
            if (this.count == 1) {
                this.start = null;
                this.end = null;
                this.count = 0;
            }
            this.count--;
        }
        return data;
    }

    public void displayLinkList() {
        System.out.println();
        if (this.count > 0) {
            Node<T> node = start;
            while (node != null) {
                System.out.print(" " + node.getData());
                node = node.getNext();
            }
        }
    }

    public void removeNode(T data) {
        if (count > 0) {
            Node<T> node = start;
            if (node.getData().equals(data)) {
                start = start.getNext();
            } else if (this.end.getData().equals(data)) {
                Node<T> temp = node;
                while (node.getNext() != null) {
                    temp = node;
                    node = node.getNext();
                }
                temp.setNext(null);
                this.end = temp;
                this.count--;
            } else {
                Node<T> temp = node;
                while (node.getNext() != null) {
                    if (node.getData().equals(data)) {
                        temp.setNext(node.getNext());
                        count--;
                        break;
                    }
                    temp = node;
                    node = node.getNext();
                }
            }
        }
    }

    public void swapList() {
        Node<T> newStart = start;
        Node<T> newEnd = end;
        Node<T> previous = start;
        Node<T> first = start;
        Node<T> middle = null;
        Node<T> next = start;
        Node<T> list = start;
        boolean flag = true;
        if (count > 0) {
            for (list = start, previous = start; list != null; ) {
                if (flag) {
                    newStart = previous.getNext();
                    flag = false;
                }

                first = list;
                middle = first.getNext();
                next = middle.getNext();

                first.setNext(next);
                middle.setNext(first);
                previous.setNext(middle);
                list = next;
                previous = first;
            }

        }
        this.end = newEnd;
        this.start = newStart;
    }

    public void reverseDisplay() {
        Node<T> newStart = start;
        Node<T> newEnd = end;
        Node<T> list = end;

        while (list != null) {
            System.out.print(" " + list.getData());
            list = list.getPrevious();
        }
    }

    public Integer getCount() {
        return count;
    }
}
