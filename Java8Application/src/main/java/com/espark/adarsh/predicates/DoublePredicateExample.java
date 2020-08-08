package com.espark.adarsh.predicates;

import java.util.function.DoublePredicate;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class DoublePredicateExample {
    public static void main(String[] args) {
        System.out.println(doublePredicate(100D, (value) -> value > 50));
        System.out.println(doublePredicate(100D, (value) -> value < 50));
    }

    public static String doublePredicate(Double value, DoublePredicate doublePredicate) {
        return (doublePredicate.test(value) ? "Greater " : "Lower");
    }
}
