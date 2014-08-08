package com.adarsh.thread.consumerProducer.goods;

public class GoodsProducer implements Runnable {

    Thread t;
    GoodShop g;
    static int i = 1;

    public GoodsProducer(GoodShop g) {
        t = new Thread(this);
        t.start();
        this.g = g;
    }

    public void run() {

        try {
            while (true) {
                Thread.sleep(500);
                g.put(i);
                i++;
            }
        } catch (InterruptedException e) {
            System.out.println("Exception Generated " + e);
        }
    }
}
