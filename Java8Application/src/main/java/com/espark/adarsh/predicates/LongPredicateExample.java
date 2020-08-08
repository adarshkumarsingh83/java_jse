package com.espark.adarsh.predicates;

import java.util.function.LongPredicate;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class LongPredicateExample {
    public static void main(String[] args) {
        System.out.println(longPredicate(100L, (value) ->  value > 50 ));;
        System.out.println(longPredicate(100L, (value) ->  value  < 50 ));;
    }

    public static String longPredicate(Long value, LongPredicate longPredicate) {
        return ((longPredicate.test(value) ? "Grater Value" : "Lower Value"));
    }
}
