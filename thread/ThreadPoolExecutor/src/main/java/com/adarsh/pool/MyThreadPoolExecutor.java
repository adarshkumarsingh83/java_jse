package com.adarsh.pool;


import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 6/12/12
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyThreadPoolExecutor {

    private static final int POOL_SIZE = 2;

    private static final int MAX_POOL_SIZE = 2;

    private static final long KEEP_ALIVE_TIME = 10;

    private static ThreadPoolExecutor threadPoolExecutor = null;

    private static final ArrayBlockingQueue<Runnable> queue = new ArrayBlockingQueue<Runnable>(5);

    public MyThreadPoolExecutor() {
        threadPoolExecutor = new ThreadPoolExecutor(POOL_SIZE, MAX_POOL_SIZE,
                KEEP_ALIVE_TIME, TimeUnit.SECONDS, queue);

    }

    public void runTask(Runnable task) {
        // System.out.println("Task count.."+threadPoolExecutor.getTaskCount() );
        // System.out.println("Queue Size before assigning the
        // task.."+queue.size() );
        threadPoolExecutor.execute(task);
        // System.out.println("Queue Size after assigning the
        // task.."+queue.size() );
        // System.out.println("Pool Size after assigning the
        // task.."+threadPoolExecutor.getActiveCount() );
        // System.out.println("Task count.."+threadPoolExecutor.getTaskCount() );
        System.out.println("Task count.." + queue.size());

    }

    public void shutDown() {
        threadPoolExecutor.shutdown();
    }

}
