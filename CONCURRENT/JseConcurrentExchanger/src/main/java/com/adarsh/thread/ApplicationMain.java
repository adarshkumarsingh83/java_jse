package com.adarsh.thread;

import java.util.concurrent.Exchanger;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/16/14
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) throws Exception {

        final Exchanger exchanger = new Exchanger();

        DataExchangerThread exchangerRunnable1 =
                new DataExchangerThread("MyExchangerThread_1", exchanger, "ADARSH KUMAR");
        DataExchangerThread exchangerRunnable2 =
                new DataExchangerThread("MyExchangerThread_2", exchanger, "RADHA SINGH");

        exchangerRunnable1.start();
        exchangerRunnable2.start();

        exchangerRunnable1.join();
        exchangerRunnable2.join();

    }
}
