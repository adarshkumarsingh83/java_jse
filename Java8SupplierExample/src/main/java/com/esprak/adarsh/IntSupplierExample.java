package com.esprak.adarsh;

import java.util.function.BinaryOperator;
import java.util.function.IntSupplier;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class IntSupplierExample {

    public static Integer intSupplier(IntSupplier intSupplier) {
        return intSupplier.getAsInt();
    }

    public static void main(String[] args) {

        //1 approach
        final IntSupplier intSupplier=new IntSupplier() {
            @Override
            public int getAsInt() {
                return Integer.MAX_VALUE;
            }
        };
        System.out.println("Data " + intSupplier(intSupplier));


        //2 approach
        System.out.println("Data " + intSupplier(new IntSupplier() {
            @Override
            public int getAsInt() {
                return Integer.MAX_VALUE;
            }
        }));


        //3 approach
        System.out.println("Data " + intSupplier(() -> {
            return Integer.MAX_VALUE;
        }));

        //4 approach
        System.out.println("Data " + intSupplier(() -> Integer.MAX_VALUE));
        System.out.println("Data " + intSupplier(() -> Integer.MIN_VALUE));
    }

}
