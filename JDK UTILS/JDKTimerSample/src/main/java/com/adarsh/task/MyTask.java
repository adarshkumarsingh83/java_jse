package com.adarsh.task;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 19/2/13
 * Time: 9:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class MyTask extends TimerTask {


    Timer timer=null;

    public void setTimer(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("ReminderTask is completed by Java timer");

        //Not necessary because we call System.exit
        timer.cancel();

        //Stops the AWT thread (and everything else)
        //System.exit(0);
    }

}