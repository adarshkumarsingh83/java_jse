package com.espark.adarsh.streams;

import org.junit.Test;

import java.util.stream.IntStream;

/**
 * Created by Adarsh on 8/19/15.
 */
public class IntStreamExample {

    /**
     * IntStream
     * java.util.stream.IntStream is a sequence of primitive integer values.
     * The aggregate operations like max and average can be performed using sequential and parallel operations.
     * rangeClosed(a,b): The values from a to be are considered by incrementing 1.
     * range(a,b) : Values from a to b-1 are considered.
     * sum: Calculates the sum of values.
     * sorted: Values are sorted.
     */
    @Test
    public void intStreamExample() {
        System.out.println("--Using IntStream.rangeClosed--");
        IntStream.rangeClosed(10, 15).map(n -> n * n).forEach(s -> System.out.print(s + " "));
        System.out.println("\n--Using IntStream.range--");
        IntStream.range(10, 15).map(n -> n * n).forEach(s -> System.out.print(s + " "));
        System.out.println("\n--Sum of range 1 to 10--");
        System.out.print(IntStream.rangeClosed(1, 10).sum());
        System.out.println("\n--Sorted number--");
        IntStream.of(13, 4, 15, 2, 8).sorted().forEach(s -> System.out.print(s + " "));
    }

}
