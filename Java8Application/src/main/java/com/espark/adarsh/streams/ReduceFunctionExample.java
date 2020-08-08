package com.espark.adarsh.streams;

import java.util.stream.Stream;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class ReduceFunctionExample {

    public static void main(String[] args) {
        final int intResult = Stream.of(1, 2, 3, 4, 5)
                .mapToInt(Integer::intValue)
                .reduce(0, (sum, intValue) -> sum += intValue);
        System.out.println("Result " + intResult);

        final long longResult = Stream.of(1L, 2L, 3L, 4L, 5L)
                .mapToLong(Long::longValue)
                .reduce(0, (sum, longValue) -> sum += longValue);
        System.out.println("Result " + longResult);


        final double doubleResult = Stream.of(1.0, 2.0, 3.0, 4.0, 5.0)
                .mapToDouble(Double::doubleValue)
                .reduce(0, (sum, doubleValue) -> sum += doubleValue);
        System.out.println("Result " + doubleResult);
    }
}
