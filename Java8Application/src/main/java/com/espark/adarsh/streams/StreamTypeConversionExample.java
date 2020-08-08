package com.espark.adarsh.streams;

import java.util.stream.Stream;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class StreamTypeConversionExample {
    public static void main(String[] args) {

        /* double to int */
        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);
          /* double to long */
        Stream.of(1.0, 2.0, 3.0)
                .mapToLong(Double::longValue)
                .forEach(System.out::println);

        /* int to double */
        Stream.of(1, 2, 3)
                .mapToDouble(Integer::doubleValue)
                .forEach(System.out::println);
         /* int to long */
        Stream.of(1, 2, 3)
                .mapToLong(Integer::longValue)
                .forEach(System.out::println);

        /* long to int */
        Stream.of(1L, 2L, 3L)
                .mapToInt(Long::intValue)
                .forEach(System.out::println);

        /* long to double */
        Stream.of(1L, 2L, 3L)
                .mapToDouble(Long::doubleValue)
                .forEach(System.out::println);
    }
}
