package com.esprak.adarsh;

import java.util.function.BinaryOperator;
import java.util.function.DoubleSupplier;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class DoubleSupplierExample {

    public static Double doubleSupplier(DoubleSupplier doubleSupplier) {
        return doubleSupplier.getAsDouble();
    }

    public static void main(String[] args) {

        //1 approach
        final DoubleSupplier doubleSupplier=new DoubleSupplier() {
            @Override
            public double getAsDouble() {
                return Double.MAX_VALUE;
            }
        };
        System.out.println("Data " + doubleSupplier(doubleSupplier));

        //2 approach
        System.out.println("Data " + doubleSupplier(new DoubleSupplier() {
            @Override
            public double getAsDouble() {
                return Double.MAX_VALUE;
            }
        }));

        //3 approach
        System.out.println("Data " + doubleSupplier(() -> {
            return Double.MAX_VALUE;
        }));

        //4 approach
        System.out.println("Data " + doubleSupplier(() -> Double.MAX_VALUE));
        System.out.println("Data " + doubleSupplier(() -> Double.MIN_VALUE));
    }


}