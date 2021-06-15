package com.adarsh.schedular;

import com.adarsh.task.MyTask;

import java.util.Timer;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 19/2/13
 * Time: 9:16 AM
 * To change this template use File | Settings | File Templates.
 */
public class TaskScheduler {

    Timer timer = null;

    public TaskScheduler(final MyTask timerTask, final long seconds) {
        //At this line a new Thread will be created
        timer = new Timer();
        //setting timer into Mytask
        timerTask.setTimer(timer);
        //delay in milliseconds
        timer.schedule(timerTask, seconds );
    }
}
