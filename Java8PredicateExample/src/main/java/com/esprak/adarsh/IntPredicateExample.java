package com.esprak.adarsh;

import java.util.function.IntPredicate;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class IntPredicateExample {

    public static String predicate(Integer value, IntPredicate intPredicate) {
        return (intPredicate.test(value) ? "Greater" : "Lower");
    }

    public static void main(String[] args) {


        //1 approach
        final IntPredicate intPredicate = new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value < 100;
            }
        };
        System.out.println(predicate(100, intPredicate));

        //2 approach
        System.out.println(predicate(100, new IntPredicate() {
            @Override
            public boolean test(int value) {
                return value < 100;
            }
        }));

        //3 approach
        System.out.println(predicate(100, (int value) -> {
            return value < 100;
        }));

        //4 approach
        System.out.println(predicate(100, (value) -> value < 100));


        //5 approach
        System.out.println(predicate(100, value -> value < 100));
    }
}
