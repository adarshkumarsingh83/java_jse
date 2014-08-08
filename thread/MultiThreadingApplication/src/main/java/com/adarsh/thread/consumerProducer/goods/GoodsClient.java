package com.adarsh.thread.consumerProducer.goods;

public class GoodsClient {

    public static void main(String[] args) {

        GoodShop g = new GoodShop();
        @SuppressWarnings("unused")
        GoodsProducer gp = new GoodsProducer(g);
        @SuppressWarnings("unused")
        GoodsConsumer gc = new GoodsConsumer(g);
    }
}
