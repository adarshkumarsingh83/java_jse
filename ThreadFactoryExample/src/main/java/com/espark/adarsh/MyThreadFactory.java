package com.espark.adarsh;

import java.util.concurrent.ThreadFactory;

/**
 * Created by Adarsh on 8/18/15.
 */
public class MyThreadFactory implements ThreadFactory {

    private Thread thread;
    private String name;
    private Integer priority;

    public MyThreadFactory(final String name, final Integer priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public Thread newThread(Runnable runnable) {
        this.thread = new Thread(runnable, name);
        this.thread.setPriority(priority);
        return this.thread;
    }
}
