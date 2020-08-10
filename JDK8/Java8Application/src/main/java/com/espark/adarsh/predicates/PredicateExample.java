package com.espark.adarsh.predicates;

import java.util.function.Predicate;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class PredicateExample {
    public static void main(String[] args) {
        System.out.println("Data "+predicate(System.getProperty("user.name"),(value) -> value.contains("adarsh")));
        System.out.println("Data "+predicate(System.getProperty("user.name"),(value) -> value.contains("kumar")));
    }

    public static String predicate(String input, Predicate<String> predicate) {
        return (predicate.test(input) ? input.toUpperCase() : input.toLowerCase());
    }
}
