package com.espark.adarsh.predicates;

import java.util.function.IntPredicate;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class IntPredicateExample {
    public static void main(String[] args) {
        System.out.println(predicate(100,(value)-> value < 100  ));
    }

    public static String  predicate(Integer value,IntPredicate intPredicate){
        return (intPredicate.test(value)? "Greater" : "Lower");
    }
}
