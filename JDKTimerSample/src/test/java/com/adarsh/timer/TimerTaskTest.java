package com.adarsh.timer;

import com.adarsh.schedular.TaskScheduler;
import com.adarsh.task.MyTask;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 19/2/13
 * Time: 9:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class TimerTaskTest {

    @Test
    public void timerTest() throws InterruptedException {
        final MyTask myTask=new MyTask();
        TaskScheduler taskScheduler=new TaskScheduler(myTask,1000);
        Thread.currentThread().join();
    }
}
