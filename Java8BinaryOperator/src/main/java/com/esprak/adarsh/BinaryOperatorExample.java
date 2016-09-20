package com.esprak.adarsh;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class BinaryOperatorExample {

    public static String binaryOperator(String value1, String value2, BinaryOperator<String> binaryOperator) {
        return binaryOperator.apply(value1, value2);
    }

    public static void main(String[] args) {

        // 1 approach
        final BinaryOperator<String> binaryOperator=new BinaryOperator<String>() {
            @Override
            public String apply(String value1, String value2) {
                return value1.concat(" " + value2);
            }
        };
        System.out.println("Response " + binaryOperator("adarsh", "kumar",binaryOperator));


        // 2 approach
        System.out.println("Response " + binaryOperator("adarsh", "kumar",new BinaryOperator<String>() {
            @Override
            public String apply(String value1, String value2) {
                return value1.concat(" " + value2);
            }
        }));

                // 3 approach
        System.out.println("Response " + binaryOperator("adarsh", "kumar", (String value1,String value2) -> {
            return value1.concat(" " + value2);
        }));

        // 4 approach
        System.out.println("Response " + binaryOperator("adarsh", "kumar", (value1, value2) -> value1.concat(" " + value2)));
    }
}
