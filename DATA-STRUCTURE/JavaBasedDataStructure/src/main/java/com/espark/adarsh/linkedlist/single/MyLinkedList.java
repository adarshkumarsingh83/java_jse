package com.espark.adarsh.linkedlist.single;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Adarsh on 8/25/15.
 */
public class MyLinkedList<T> {

    class Node<T> {

        private T data;

        private Node next = null;

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
    }

    private Node<T> start = null;
    private Node<T> end = null;
    private Integer count = new Integer(0);
    private Comparator<T> comparator = null;

    public MyLinkedList() {
        this.comparator = null;
    }

    public MyLinkedList(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public void addData(T data) {
        if (start == null) {
            this.start = new Node<T>();
            this.start.setData(data);
            this.end = start;
            count++;
        } else {
            final Node<T> temp = new Node<T>();
            temp.setData(data);
            this.end.setNext(temp);
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
        Node<T> newEnd = null;
        Node<T> list = start;

        while (newEnd != start) {
            list = start;
            while (list.getNext() != newEnd) {
                list = list.getNext();
            }
            System.out.print(" " + list.getData());
            newEnd = list;
        }

    }

    public void sortDataList() {

        for (Node<T> list = start; list.getNext() != null; list = list.getNext()) {

            for (Node<T> listNext = list.getNext(); listNext != null; listNext = listNext.getNext()) {

                if (this.comparator.compare(list.getData(), listNext.getData()) == 1) {

                    T tempData = listNext.getData();
                    listNext.setData(list.getData());
                    list.setData(tempData);
                }
            }
        }
    }

    public void sortListNodes(boolean ascending) {
        final int sort = (ascending ? 1 : -1);

        if (this.count > 1) {

            Node<T> newStart = start;
            boolean flag = true;
            Node<T> previousListNode = start;
            for (Node<T> list = start; list.getNext() != null; list = list.getNext(), flag = false) {
                Node<T> previousNode = list;
                for (Node<T> listNext = list.getNext(); listNext != null; listNext = listNext.getNext()) {
                    final int result = this.comparator.compare(list.getData(), listNext.getData());
                    if (result == sort) {
                        if (flag && start.getNext() == listNext) {
                            Node<T> temp1 = listNext.getNext();
                            Node<T> temp2 = list.getNext();
                            list.setNext(temp1);
                            listNext.setNext(temp2);
                            temp2.setNext(list);
                            list = listNext;
                        } else {
                            Node<T> temp1 = listNext.getNext();
                            previousNode.setNext(list);
                            Node<T> temp2 = list.getNext();
                            list.setNext(temp1);
                            listNext.setNext(temp2);
                            previousListNode.setNext(listNext);
                            list = listNext;
                        }
                    }
                    if (flag) {
                        newStart = list;
                    }
                    if (listNext.getNext() == null) {
                        end = listNext;
                    }
                    previousNode = listNext;
                   // displayLinkList(newStart);
                }
                previousListNode = list;
               // displayLinkList(newStart);
            }
            start = newStart;
        } else {
            System.out.println("List is already sorted ");
        }
    }

    public Integer getCount() {
        return count;
    }


    public void displayLinkList(Node<T> start) {
        System.out.println();
        if (this.count > 0) {
            Node<T> node = start;
            while (node != null) {
                System.out.print(" " + node.getData());
                node = node.getNext();
            }
        }
    }

}
