package com.espark.adarsh.streams;

import org.junit.Test;

import java.util.stream.LongStream;

/**
 * Created by Adarsh on 8/19/15.
 */
public class LongStreamExample {

    /**
     * LongStream
     * java.util.stream.LongStream is a sequence of primitive long values and aggregate operations
     * are performed using sequential and parallel operations. Methods are same like IntStream.
     */
    @Test
    public void longStreamExample() {
        System.out.println("--Using LongStream.rangeClosed--");
        LongStream.rangeClosed(10, 15).map(n -> n * n).forEach(s -> System.out.print(s + " "));
        System.out.println("\n--Using LongStream.range--");
        LongStream.range(10, 15).map(n -> n * n).forEach(s -> System.out.print(s + " "));
        System.out.println("\n--Sum of range 1 to 10--");
        System.out.print(LongStream.rangeClosed(1, 10).sum());
        System.out.println("\n--Sorted number--");
        LongStream.of(13, 4, 15, 2, 8).sorted().forEach(s -> System.out.print(s + " "));
    }
}