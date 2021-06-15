package com.esprak.adarsh;

import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class BooleanSupplierExample {

    public static Boolean booleanSupplier(BooleanSupplier booleanSupplier) {
        return booleanSupplier.getAsBoolean();
    }

    public static void main(String[] args) {

        //1 approach
        final BooleanSupplier booleanSupplier = new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return Boolean.TRUE;
            }
        };
        System.out.println("Data " + booleanSupplier(booleanSupplier));

        //2 approach
        System.out.println("Data " + booleanSupplier(new BooleanSupplier() {
            @Override
            public boolean getAsBoolean() {
                return Boolean.TRUE;
            }
        }));

        //3 approach
        System.out.println("Data " + booleanSupplier(() -> {
            return Boolean.TRUE;
        }));

        //4 approach
        System.out.println("Data " + booleanSupplier(() -> Boolean.FALSE));
        System.out.println("Data " + booleanSupplier(() -> Boolean.TRUE));
    }

}
