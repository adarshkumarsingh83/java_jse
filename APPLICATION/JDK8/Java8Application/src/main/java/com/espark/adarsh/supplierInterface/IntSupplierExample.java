package com.espark.adarsh.supplierInterface;

import java.util.function.IntSupplier;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class IntSupplierExample {

    public static void main(String[] args) {
        System.out.println("Data " + intSupplier(() -> Integer.MAX_VALUE));
        System.out.println("Data " + intSupplier(() -> Integer.MIN_VALUE));
    }

    public static Integer intSupplier(IntSupplier intSupplier) {
        return intSupplier.getAsInt();
    }
}
