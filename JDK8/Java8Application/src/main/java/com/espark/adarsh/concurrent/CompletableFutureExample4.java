package com.espark.adarsh.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 CompletableFuture.getNow
 getNow is a method that if calling completion stage is not completed then the value passed to getNow
 will be set to result.
 */
public class CompletableFutureExample4 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        list.stream().map(s -> CompletableFuture.supplyAsync(() -> s + s))
                .map(f -> f.getNow("Not Done"))
                .forEach(s -> System.out.println(s));
    }
}
