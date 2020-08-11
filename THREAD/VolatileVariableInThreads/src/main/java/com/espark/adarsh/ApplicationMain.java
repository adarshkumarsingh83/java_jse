package com.espark.adarsh;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by Adarsh on 8/18/15.
 */
public class ApplicationMain {
    public static void main(String[] args)throws Exception{
        final Set<Callable<Integer>> myWorkers=new HashSet<>();
        for(int i=0;i<50;i++){
            myWorkers.add(new MyWorker());
        }
        final ExecutorService executorService = Executors.newFixedThreadPool(50);
        final List<Future<Integer>> futureList= executorService.invokeAll(myWorkers);

        for(Future<Integer> value:futureList){
            System.out.println("==> "+value.get()+" "+value.isDone());
        }

        if(futureList.isEmpty()){
            executorService.shutdown();
            System.exit(0);
        }

    }
}
