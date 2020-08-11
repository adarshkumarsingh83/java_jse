package com.adarsh.jdk.main;


import com.adarsh.jdk.callable.MyDateCallable;
import com.adarsh.jdk.callable.MyIntegerCallable;
import com.adarsh.jdk.callable.MyStringCallable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

public class ApplicationMain {

    public static void main(String args[]) {
        //Get ExecutorService from Executors utility class, thread pool size is 10
        final ExecutorService executor = Executors.newFixedThreadPool(10);
        //create a list to hold the Future object associated with Callable
        final List<Future<? extends Object>> list = new ArrayList<>();

        //Create MyCallable instance
        final Callable<String> callableString = new MyStringCallable();
        final Callable<Integer> callableInteger = new MyIntegerCallable();
        final Callable<Date> callableDate = new MyDateCallable();

        for (int i = 0; i < 100; i++) {

            //submit Callable tasks to be executed by thread pool
            final Future<String> futureString = executor.submit(callableString);
            final Future<Integer> futureInteger = executor.submit(callableInteger);
            final Future<Date> futureDate = executor.submit(callableDate);

            //add Future to the list, we can get return value using Future
            list.add(futureString);
            list.add(futureInteger);
            list.add(futureDate);
        }

        for (Future<? extends Object> fut : list) {
            try {
                //print the return value of Future, notice the output delay in console
                // because Future.get() waits for task to get completed
                System.out.println( "::" + fut.get());
            } catch (InterruptedException | ExecutionException e) {
                System.out.println(e.getLocalizedMessage());
            }
        }
        //shut down the executor service now
        executor.shutdown();
    }
}