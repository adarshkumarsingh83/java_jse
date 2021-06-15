package com.espark.adarsh.callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by adarsh kumar on 7/24/16.
 */
public class CallableExecutor {

    public static void main(String[] args) throws Exception {
        final MyCallable myCallable = new MyCallable(1, 20);
        final ExecutorService service = Executors.newSingleThreadExecutor();
        final Future<Integer> future = service.submit(myCallable);
        Integer result = future.get();
        System.out.println(result);
        service.shutdown();
    }
}
