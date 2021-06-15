package com.espark.adarsh;

import com.espark.adarsh.thread.MyThread;
import com.espark.adarsh.util.Counter;

public class ApplicationMain {
    public static void main(String[] args) {
        ThreadLocal<Counter> counter = ThreadLocal.withInitial(() -> new Counter(0L));
        MyThread t1 = new MyThread(counter);
        MyThread t2 = new MyThread(counter);
        t1.start();
        t2.start();
    }
}
