package com.espark.adarsh.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 CompletableFuture.thenApply
 thenApply method accepts a function as an argument. Once the calling CompletableFuture completes ,
 then on the result
 of this stage, that function is applied by thenApply method and returns a CompletableFuture.


 */
public class CompletableFutureExample2 {
    public static void main(String[] args) throws InterruptedException {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        list.stream().map(data -> CompletableFuture.supplyAsync(() -> "Processing:" + data))
                .map(compFuture -> compFuture.thenAccept(s -> System.out.println(s)))
                .map(t -> t.join())
                .count();
    }
}
