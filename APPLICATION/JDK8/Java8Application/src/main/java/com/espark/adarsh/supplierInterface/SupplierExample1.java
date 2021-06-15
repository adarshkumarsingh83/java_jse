package com.espark.adarsh.supplierInterface;

import java.util.function.Supplier;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class SupplierExample1 {
    public static void main(String[] args) {
        System.out.println("Response " + supplier(() -> System.getProperty("user.name")));
    }
    public static String supplier(Supplier<String> supplier) {
        return supplier.get();
    }
}
