package com.espark.adarsh.concurrent;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {

    private static Random random=new Random();

    public static int genrateValue() {

        int value = random.nextInt(100);
        System.out.println("\nValue  "+value+" "+ Thread.currentThread().getName()+" \n ");
        try {
            System.out.println("System will take time to generate the value ");
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return value;
    }

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture<Integer> future=
        CompletableFuture.supplyAsync(CompletableFutureExample::genrateValue);
        future.thenAccept(System.out::println);

        future.completeOnTimeout(-1,1,TimeUnit.SECONDS);
        System.out.println("if value is not generated with it 1 mins default -1 will be return ");
        Thread.sleep(1000);

        CompletableFuture<Integer> copiedFuture = future.copy();
    }
}
