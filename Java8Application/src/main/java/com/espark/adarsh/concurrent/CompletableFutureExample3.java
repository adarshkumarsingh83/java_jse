package com.espark.adarsh.concurrent;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by Adarsh on 8/19/15.
 */
public class CompletableFutureExample3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        list.stream().map(s-> CompletableFuture.supplyAsync(() -> s + s))
                .map(f->f.whenComplete((result,error)->System.out.println(result+" Error:"+error)))
                .count();
    }

}
