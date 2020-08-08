package com.espark.adarsh.supplierInterface;

import java.util.function.LongSupplier;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class LongSupplierExample {
    public static void main(String[] args) {
        System.out.println("Data " + longSupplier(() -> Long.MAX_VALUE));
        System.out.println("Data " + longSupplier(() -> Long.MIN_VALUE));
    }

    private static Long longSupplier(LongSupplier longSupplier) {
        return longSupplier.getAsLong();
    }
}
