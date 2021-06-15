package com.adarsh.thread;

import java.util.concurrent.CyclicBarrier;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/16/14
 * Time: 3:56 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        final Runnable barrier1Action = new Runnable() {
            public void run() {
                System.out.println("BarrierAction 1 executed ");
            }
        };
        final Runnable barrier2Action = new

                Runnable() {
                    public void run() {
                        System.out.println("BarrierAction 2 executed ");
                    }
                };

        CyclicBarrier barrier1 = new CyclicBarrier(2, barrier1Action);
        CyclicBarrier barrier2 = new CyclicBarrier(2, barrier2Action);

        CyclicBarrierWorkThread barrierRunnable1 =
                new CyclicBarrierWorkThread(barrier1, barrier2);

        CyclicBarrierWorkThread barrierRunnable2 =
                new CyclicBarrierWorkThread(barrier1, barrier2);

        barrierRunnable1.start();
        barrierRunnable2.start();
    }
}
