package com.espark.adarsh.supplierInterface;

import java.util.function.BooleanSupplier;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class BooleanSupplierExample {
    public static void main(String[] args) {
        System.out.println("Data " + booleanSupplier(() -> Boolean.TRUE));
    }

    public static Boolean booleanSupplier(BooleanSupplier booleanSupplier) {
        return booleanSupplier.getAsBoolean();
    }
}
