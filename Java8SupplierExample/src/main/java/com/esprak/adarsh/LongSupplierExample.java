package com.esprak.adarsh;

import java.util.function.BinaryOperator;
import java.util.function.LongSupplier;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class LongSupplierExample {

    private static Long longSupplier(LongSupplier longSupplier) {
        return longSupplier.getAsLong();
    }

    public static void main(String[] args) {

        //1 approach
        final LongSupplier longSupplier = new LongSupplier() {
            @Override
            public long getAsLong() {
                return Long.MAX_VALUE;
            }
        };
        System.out.println("Data " + longSupplier(longSupplier));

        //2 approach
        System.out.println("Data " + longSupplier(new LongSupplier() {
            @Override
            public long getAsLong() {
                return Long.MAX_VALUE;
            }
        }));

        //3 approach
        System.out.println("Data " + longSupplier(() -> {
            return Long.MAX_VALUE;
        }));

        //4 approach
        System.out.println("Data " + longSupplier(() -> Long.MAX_VALUE));
        System.out.println("Data " + longSupplier(() -> Long.MIN_VALUE));
    }

}
