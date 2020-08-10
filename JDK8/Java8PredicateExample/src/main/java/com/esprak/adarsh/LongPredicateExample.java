package com.esprak.adarsh;

import java.util.function.LongPredicate;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class LongPredicateExample {

    public static String longPredicate(Long value, LongPredicate longPredicate) {
        return ((longPredicate.test(value) ? "Greater Value" : "Lower Value"));
    }


    public static void main(String[] args) {

        //1 approach
        final LongPredicate longPredicate1 = new LongPredicate() {
            @Override
            public boolean test(long value) {
                return value > 50;
            }
        };
        System.out.println(longPredicate(100L, longPredicate1));

        final LongPredicate longPredicate2 = new LongPredicate() {
            @Override
            public boolean test(long value) {
                return value < 50;
            }
        };
        System.out.println(longPredicate(100L, longPredicate2));

        //2 approach
        System.out.println(longPredicate(100L, new LongPredicate() {
            @Override
            public boolean test(long value) {
                return value > 50;
            }
        }));
        System.out.println(longPredicate(100L, new LongPredicate() {
            @Override
            public boolean test(long value) {
                return value < 50;
            }
        }));

        //3 approach
        System.out.println(longPredicate(100L, (long value) -> {
            return value > 50;
        }));
        System.out.println(longPredicate(100L, (long value) -> {
            return value < 50;
        }));

        //4 approach 
        System.out.println(longPredicate(100L, (value) -> value > 50));
        System.out.println(longPredicate(100L, (value) -> value < 50));


        //4 approach 
        System.out.println(longPredicate(100L, value -> value > 50));
        System.out.println(longPredicate(100L, value -> value < 50));
    }
}
