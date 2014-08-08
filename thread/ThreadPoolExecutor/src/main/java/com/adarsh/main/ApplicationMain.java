package com.adarsh.main;

import com.adarsh.pool.MyThreadPoolExecutor;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 6/12/12
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) {
       String[] taskName=new String[]{"first task","secound task","thrid task","fourth task","fifth task","sixth task"};
        MyThreadPoolExecutor myThreadPoolExecutor = new MyThreadPoolExecutor();

        for(final String task:taskName){
            myThreadPoolExecutor.runTask(new Runnable() {
                public void run() {
                    for (int i = 0; i < 10; i++) {
                        try {
                            System.out.println(task);
                            Thread.sleep(1000);
                        } catch (InterruptedException ie) {
                        }
                    }
                }
            });
        }
        /**
         * shutting down the Thread Pool executor
         */
        myThreadPoolExecutor.shutDown();
    }
}
