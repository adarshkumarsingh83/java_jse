package com.adarsh.thead;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 12/10/12
 * Time: 3:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        System.out.println("Press Control-c to stop");
        ProductContainer productContainer = new ProductContainer();
        new Producer(productContainer);
        new Consumer(productContainer);
    }
}
