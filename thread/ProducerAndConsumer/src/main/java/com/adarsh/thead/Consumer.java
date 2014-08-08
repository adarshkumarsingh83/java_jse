package com.adarsh.thead;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 12/10/12
 * Time: 3:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Consumer implements Runnable {

    ProductContainer productContainer;

    Consumer(ProductContainer productContainer) {
        this.productContainer = productContainer;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            productContainer.get();
        }
    }
}