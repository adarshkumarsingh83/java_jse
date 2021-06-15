package com.adarsh.jdk7.nio;

/**
 * @Author Adarsh
 * @Product Lucas.
 * Created By: Adarsh
 * Created On Date: 1/16/2015  Time: 11:20 PM
 * This Class provide the implementation for the functionality of..
 */

import java.io.IOException;
import java.nio.channels.AsynchronousChannelGroup;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class AsynchronousChannelGroupTest {
    public static void main(String[] args) throws IOException, InterruptedException {
        Runnable r= new AsynchronousChannelGroupTest(). new SampleThread();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(r);
        AsynchronousChannelGroup acg = AsynchronousChannelGroup.withCachedThreadPool(service, 2);

        System.out.println(acg.isShutdown());
        acg.awaitTermination(2,TimeUnit.SECONDS);
        acg.shutdownNow();
    }
    class SampleThread implements Runnable {
        @Override
        public void run() {
            for (int cnt =0; cnt<5 ; cnt++) {
                System.out.println("run:" + cnt);
            }
        }
    }
}