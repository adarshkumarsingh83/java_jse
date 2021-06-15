package com.espark.adarsh;

import java.util.*;
import java.util.concurrent.ForkJoinPool;

public class ApplicationMain {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        List<String> messageData=new ArrayList<>();
        messageData.add("this is adarsh ");
        messageData.add("this is amit ");
        messageData.add("this is radha ");
        messageData.add("this is sonu ");
        messageData.add("this is monu ");
        messageData.add("this is radhey ");
        MessageRecursiveTask messageRecursiveAction=new MessageRecursiveTask(messageData,1);
        List<String> dataResponse = pool.invoke(messageRecursiveAction);
        dataResponse.stream().forEach(System.out::println);
    }
}
