package com.adarsh.thread;

import java.util.concurrent.Exchanger;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/16/14
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class DataExchangerThread extends Thread {

    private Object thradDataObject = null;
    private Exchanger exchanger = null;

    public DataExchangerThread(String name, Exchanger exchanger, Object thradDataObject) {
        super(name);
        this.exchanger = exchanger;
        this.thradDataObject = thradDataObject;
    }

    public void run() {
        try {
            Object previous = this.thradDataObject;
            this.thradDataObject = this.exchanger.exchange(this.thradDataObject);
            System.out.println(
                    Thread.currentThread().getName() +
                            " exchanged " + previous + " for " + this.thradDataObject
            );
        } catch (InterruptedException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}