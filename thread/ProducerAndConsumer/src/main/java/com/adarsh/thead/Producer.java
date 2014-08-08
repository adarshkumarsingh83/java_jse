package com.adarsh.thead;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 12/10/12
 * Time: 3:28 PM
 * To change this template use File | Settings | File Templates.
 */
public class Producer implements Runnable {

    ProductContainer productContainer;

    Producer(ProductContainer productContainer) {
        this.productContainer = productContainer;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
            productContainer.put(i++);
        }
    }
}