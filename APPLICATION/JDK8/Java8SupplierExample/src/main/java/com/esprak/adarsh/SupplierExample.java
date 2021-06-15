package com.esprak.adarsh;

import java.util.function.BinaryOperator;
import java.util.function.Supplier;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class SupplierExample {

    public static String supplier(Supplier<String> supplier) {
        return supplier.get();
    }

    public static void main(String[] args) {

        //1 approach
        final Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return System.getProperty("user.name");
            }
        };
        System.out.println("Response " + supplier(supplier));


        //2 approach
        System.out.println("Response " + supplier(new Supplier<String>() {
            @Override
            public String get() {
                return System.getProperty("user.name");
            }
        }));

        //3 approach
        System.out.println("Response " + supplier(() -> {
            return System.getProperty("user.name");
        }));


        //4 approach
        System.out.println("Response " + supplier(() -> System.getProperty("user.name")));
    }

}
