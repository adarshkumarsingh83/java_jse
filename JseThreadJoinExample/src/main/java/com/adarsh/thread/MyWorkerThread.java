package com.adarsh.thread;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 3/7/14
 * Time: 11:02 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyWorkerThread extends Thread {

    private String threadName;
    private Long sleepTime;
    private String threadMsg;
    private int loopCount;

    public MyWorkerThread(String threadName, Long sleepTime, String threadMsg, int loopCount) {
        this.threadName = threadName;
        this.sleepTime = sleepTime;
        this.threadMsg = threadMsg;
        this.loopCount = loopCount;
    }

    @Override
    public void run() {
        System.out.println("Starting Run() " + Thread.currentThread().getName());
        while (loopCount >= 0) {
            try {
                System.out.println(Thread.currentThread().getName() + " " + threadMsg + ":=>  " + loopCount);
                Thread.sleep(sleepTime);
            } catch (Exception e) {
                e.printStackTrace();
            }
            loopCount--;
        }
        System.out.println("Ending Run() " + Thread.currentThread().getName());
    }
}
