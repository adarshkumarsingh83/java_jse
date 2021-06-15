package com.espark.adarsh;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by Adarsh on 8/17/15.
 */
public class MyApplicationMain {
    public static void main(String[] args)throws Exception{
        final ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        final MyWorker myWorker=new MyWorker(reentrantReadWriteLock);
        final MyWorkerThread myWorkerThread1=new MyWorkerThread("adarsh",myWorker);
        final MyWorkerThread myWorkerThread2=new MyWorkerThread("amit",myWorker);
        final MyWorkerThread myWorkerThread3=new MyWorkerThread("radha",myWorker);
        final MyWorkerThread myWorkerThread4=new MyWorkerThread("sonu",myWorker);
        final MyWorkerThread myWorkerThread5=new MyWorkerThread("monu",myWorker);
        final ExecutorService executorService = Executors.newFixedThreadPool(5);
        final Set<Callable<String>> callable = new HashSet<Callable<String>>();
        callable.add(myWorkerThread1);
        callable.add(myWorkerThread2);
        callable.add(myWorkerThread3);
        callable.add(myWorkerThread4);
        callable.add(myWorkerThread5);
        final List<Future<String>> futureList= executorService.invokeAll(callable);
        if(futureList.isEmpty()){
            executorService.shutdown();
            System.exit(0);
        }

    }
}
