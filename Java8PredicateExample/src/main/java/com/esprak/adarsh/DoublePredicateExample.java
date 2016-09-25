package com.esprak.adarsh;

import java.util.function.DoublePredicate;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class DoublePredicateExample {

    public static String doublePredicate(Double value, DoublePredicate doublePredicate) {
        return (doublePredicate.test(value) ? "Greater " : "Lower");
    }


    public static void main(String[] args) {

        //1 approach
        final DoublePredicate doublePredicate1=new DoublePredicate() {
            @Override
            public boolean test(double value) {
                return value > 50;
            }
        };
        System.out.println(doublePredicate(100D, doublePredicate1));

        final DoublePredicate doublePredicate2=new DoublePredicate() {
            @Override
            public boolean test(double value) {
                return value < 50;
            }
        };
        System.out.println(doublePredicate(100D, doublePredicate2));


        //2 approach
        System.out.println(doublePredicate(100D, new DoublePredicate() {
            @Override
            public boolean test(double value) {
                return value > 50;
            }
        }));

        System.out.println(doublePredicate(100D, new DoublePredicate() {
            @Override
            public boolean test(double value) {
                return value < 50;
            }
        }));

        //3 approach
        System.out.println(doublePredicate(100D, (double value) -> {
            return value > 50;
        }));
        System.out.println(doublePredicate(100D, (double value) -> {
            return value < 50;
        }));

        //4 approach
        System.out.println(doublePredicate(100D, (value) -> value > 50));
        System.out.println(doublePredicate(100D, (value) -> value < 50));


        //5 approach
        System.out.println(doublePredicate(100D, value -> value > 50));
        System.out.println(doublePredicate(100D, value -> value < 50));
    }
}
