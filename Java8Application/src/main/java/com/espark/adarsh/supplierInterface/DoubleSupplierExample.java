package com.espark.adarsh.supplierInterface;

import java.util.function.DoubleSupplier;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class DoubleSupplierExample {
    public static void main(String[] args) {
        System.out.println("Data " + doubleSupplier(() -> Double.MAX_VALUE));
        System.out.println("Data " + doubleSupplier(() -> Double.MIN_VALUE));
    }

    public static Double doubleSupplier(DoubleSupplier doubleSupplier) {
        return doubleSupplier.getAsDouble();
    }
}
