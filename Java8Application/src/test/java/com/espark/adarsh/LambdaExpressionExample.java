package com.espark.adarsh;


import java.util.Arrays;
import java.util.List;

import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Adarsh on 9/28/15.
 */
public class LambdaExpressionExample {

    /*
       Performs a on the elements of this stream, using the provided identity value
       and an associative accumulation function, and returns the reduced value.
     */
    public static void main(String[] args) {

        final List<Integer> myList = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99, 100);

    /*  Using Stream Api */
        final Integer integerValue = myList.stream().filter( integer -> integer % 7 == 0)
                .findFirst()
                .orElse(0);
        System.out.println(integerValue);



        Arrays.asList("a1", "a2", "b1", "c2", "c1")
                .parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }
}