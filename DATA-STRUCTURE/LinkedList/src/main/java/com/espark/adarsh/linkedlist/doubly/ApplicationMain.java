package com.espark.adarsh.linkedlist.doubly;

/**
 * Created by Adarsh on 8/25/15.
 */
public class ApplicationMain {
    public static void main(String[] args) {
        final MyDoubleLinkedList<Integer> linkList = new MyDoubleLinkedList<Integer>();
        for (int i = 10; i <= 100; i += 10) {
            linkList.addData(i);
        }

        linkList.displayLinkList();

       /* System.out.println("\nFirst Data Removed "+linkList.removeFirstData());
        linkList.displayLinkList();

        System.out.println("\nLast Data Removed "+linkList.removeLastData());
        linkList.displayLinkList();

        System.out.println("\nGet All the Data "+linkList.getAllData());*/
        linkList.swapList();
        linkList.displayLinkList();

        linkList.swapList();
        linkList.displayLinkList();

        System.out.println();
        linkList.reverseDisplay();

    }
}
