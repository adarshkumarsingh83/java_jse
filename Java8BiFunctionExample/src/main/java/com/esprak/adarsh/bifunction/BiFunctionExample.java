package com.esprak.adarsh.bifunction;

import java.util.function.BiFunction;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class BiFunctionExample {

    public static String biFunction(final Integer value1, Integer value2, final BiFunction<Integer, Integer, String> biFunction) {
        final String output = biFunction.apply(value1, value2);
        return output;
    }

    public static void main(String[] args) {

        //1 approach
        final BiFunction<Integer, Integer, String> biFunction = new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer value1, Integer value2) {
                return "Result " + (value1 + value2);
            }
        };
        System.out.println(biFunction(10, 20, biFunction));


        //2 approach
        System.out.println(biFunction(10, 20, new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(Integer value1, Integer value2) {
                return "Result " + (value1 + value2);
            }
        }));

        //3 approach
        System.out.println(biFunction(10, 20, (Integer value1, Integer value2) -> {
            return "Result " + (value1 + value2);
        }));

        //4 approach
        System.out.println(biFunction(10, 20, (value1, value2) -> "Result " + (value1 + value2)));
    }


}
