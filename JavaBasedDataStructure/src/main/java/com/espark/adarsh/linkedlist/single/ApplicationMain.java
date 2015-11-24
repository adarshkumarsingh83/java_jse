package com.espark.adarsh.linkedlist.single;

import java.util.Comparator;

/**
 * Created by Adarsh on 8/25/15.
 */
public class ApplicationMain {
    public static void main(String[] args) {
        final MyLinkedList<Integer> linkList = new MyLinkedList<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1<o2){
                    return -1;
                }else if (o1>o2){
                    return 1;
                }else{
                    return 0;
                }
            }
        });
        /*for (int i = 10; i <= 100; i += 10) {
            linkList.addData(i);
        }*/

        int [] data ={5,3,997,8,89,12,34,98,901,3,5,9};
        for(int d:data){
            linkList.addData(d);
        }

        linkList.displayLinkList();

       /* System.out.println("\nFirst Data Removed "+linkList.removeFirstData());
        linkList.displayLinkList();

        System.out.println("\nLast Data Removed "+linkList.removeLastData());
        linkList.displayLinkList();

        System.out.println("\nGet All the Data "+linkList.getAllData());*/
       /* linkList.swapList();
        linkList.displayLinkList();

        linkList.swapList();
        linkList.displayLinkList();

        System.out.println();
        linkList.reverseDisplay();*/

        // linkList.sortDataList();
        // linkList.displayLinkList();


        linkList.sortListNodes();
        linkList.displayLinkList();
    }
}
