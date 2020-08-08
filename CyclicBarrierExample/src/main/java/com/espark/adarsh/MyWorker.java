package com.espark.adarsh;

import java.util.List;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by Adarsh on 8/21/15.
 */
public class MyWorker extends Thread {

    private List list;
    private int startValue;
    private int endValue;
    private CyclicBarrier cyclicBarrier;

    public MyWorker(int startValue, int endValue, List list, CyclicBarrier cyclicBarrier) {
        this.startValue = startValue;
        this.endValue = endValue;
        this.list = list;
        this.cyclicBarrier = cyclicBarrier;
    }

    public void run() {
       this.list.add(this.getSum(this.startValue, this.endValue));
        try {
            this.cyclicBarrier.await();
        } catch (InterruptedException ex) {
            return;
        } catch (BrokenBarrierException ex) {
            return;
        }
    }

    public int getSum(int startValue, int endValue) {
        int sum = 0;
        for (int i = startValue; i < endValue; i++) {
            sum += i;
        }
        System.out.println("Per Thread Addition:"+sum);
        return sum;
    }
}
