package com.espark.adarsh.streams;

import org.junit.Test;

import java.util.function.DoublePredicate;
import java.util.stream.DoubleStream;

/**
 * Created by Adarsh on 8/19/15.
 */
public class DoubleStreamExample {

    /**
     * DoubleStream
     * java.util.stream.DoubleStream is a sequence of primitive double values and aggregate
     * operations are performed using sequential and parallel operations.
     * average: Calculates the average.
     * max: Finds the max value.
     */
    @Test
    public void doubleStreamExample() {
        System.out.println("--Using DoubleStream.of--");
        DoubleStream.of(5.33, 2.34, 5.32, 2.31, 3.51).map(d -> d * 1.5).forEach(s -> System.out.print(s + " "));
        System.out.println("\n--Using DoubleStream.average--");
        double val = DoubleStream.of(12.1, 11.2, 13.3).average().getAsDouble();
        System.out.println(val);
        System.out.println("--Using DoubleStream.max--");
        val = DoubleStream.of(12.1, 11.2, 13.3).max().getAsDouble();
        System.out.println(val);
        System.out.println("--Using DoubleStream.filter--");
        DoublePredicate range = d -> d > 12.11 && d < 12.99;
        DoubleStream.of(12.1, 11.2, 12.3).filter(range).forEach(d -> System.out.print(d));
    }
}
