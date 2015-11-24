package com.adarsh.concurrent.exchanger;

import java.util.concurrent.Exchanger;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/16/14
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class ExchangerExample {

    public static void main(String[] args) {
        Exchanger exchanger = new Exchanger();

        ExchangerRunnable exchangerRunnable1 =
                new ExchangerRunnable(exchanger, "A");

        ExchangerRunnable exchangerRunnable2 =
                new ExchangerRunnable(exchanger, "B");

        new Thread(exchangerRunnable1).start();
        new Thread(exchangerRunnable2).start();
    }
}
