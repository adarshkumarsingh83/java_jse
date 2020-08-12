package com.espark.adarsh.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 CompletableFuture.supplyAsync
 supplyAsync accepts a Supplier as an argument and complete its job asynchronously.
 The result of supplier is run by a task from ForkJoinPool.commonPool() as default.
 We can also pass our Executor.
 Finally supplyAsync method returns CompletableFuture on which we can apply other methods.

 thenAccept method accepts Consumer as an argument. On the completion of any completion stage,
 thenAccept method applies Consumer on the result and returns CompletableFuture.

 */
public class CompletableFutureExample1 {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> list = Arrays.asList(10, 20, 30, 40);
        list.stream().map((Integer data) -> CompletableFuture.supplyAsync(() -> getNumber(data)))
                .map(compFuture -> compFuture.thenApply((Integer n) -> n * n))
                .map(t -> t.join())
                .forEach(s -> System.out.println(s));
    }

    private static int getNumber(int a) {
        return a * a;
    }
}
