package com.adarsh.concurrent.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/16/14
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExchangerRunnable implements Runnable{

    Exchanger exchanger = null;
    Object    object    = null;

    public ExchangerRunnable(Exchanger exchanger, Object object) {
        this.exchanger = exchanger;
        this.object = object;
    }

    public void run() {
        try {
            Object previous = this.object;

            this.object = this.exchanger.exchange(this.object);

            System.out.println(
                    Thread.currentThread().getName() +
                            " exchanged " + previous + " for " + this.object
            );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}