package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Adarsh on 8/19/15.
 */
public class CollectorsExamples {

    /**
     * Collectors.averagingDouble
     * Collectors.averagingDouble calculates the average of stream element as double data type.
     * It returns a Collector instance. The collect method of stream can accept the collector instance
     * and will return the average value calculated by Collectors.averagingDouble.
     */
    @Test
    public void averagingDouble() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Double result = list.stream().collect(Collectors.averagingDouble(d -> d * 2));
        System.out.println(result);
    }

    /**
     * Collectors.averagingInt
     * Collectors.averagingInt calculates average of stream element as integer data type.
     */
    @Test
    public void averagingInt() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Double result = list.stream().collect(Collectors.averagingInt(v -> v * 2));
        System.out.println(result);
    }

    /**
     * Collectors.averagingLong
     * Collectors.averagingLong calculates the average of stream element as long data type.
     */
    @Test
    public void averagingLong() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Double result = list.stream().collect(Collectors.averagingLong(v -> v * 2));
        System.out.println(result);
    }

    /**
     * Collectors.collectingAndThen
     * Collectors.collectingAndThen accepts a collection and a function.
     * In our example first we are calculating average by a calculator
     * and then multiplying to itself by a function.
     */
    @Test
    public void collectingAndThen() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        Double result = list.stream()
                .collect(Collectors.collectingAndThen((Collector<Integer,Object,Double>) Collectors.averagingLong((Integer v) -> v * 2),s-> s*s));
         System.out.println(result);
    }

    /**
     * Collectors.counting
     * Collectors.counting counts the element in the stream.
     */
    @Test
    public void counting() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        long result = list.stream().collect(Collectors.counting());
        System.out.println(result);
    }

    /**
     * Collectors.joining
     * Collectors.joining joins the stream elements for a given delimiter, prefix and suffix.
     */
    @Test
    public void joining() {
        List<String> list = Arrays.asList("A", "B", "C", "D");
        String result = list.stream().collect(Collectors.joining(",", "(", ")"));
        System.out.println(result);
    }

    /**
     * Collectors.maxBy and Collectors.minBy
     * Collectors.maxBy collects maximum element in stream for a given comparator.
     * Collectors.minBy collects minimum element of a stream for a given comparator.
     */
    @Test
    public void maxByMinBy() {

        class IntegerComp implements Comparator<Integer> {
            @Override
            public int compare(Integer i1, Integer i2) {
                if (i1 >= i2) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }

        List<Integer> list = Arrays.asList(30, 10, 20, 35);
        //Get Max
        list.stream().collect(Collectors.maxBy(new IntegerComp()))
                .ifPresent(i -> System.out.println(i));
        //Get Min
        list.stream().collect(Collectors.minBy(new IntegerComp()))
                .ifPresent(i -> System.out.println(i));
    }

    /**
     * Collectors.summingInt
     * Collectors.summingInt adds all element of stream for integer data type.
     */
    @Test
    public void summingInt() {
        List<Integer> list = Arrays.asList(30, 10, 20, 35);
        int result = list.stream().collect(Collectors.summingInt(i -> i));
        System.out.println(result);
    }

    /**
     * Collectors.summingLong
     * Collectors.summingLong adds all element of stream for long data type.
     */
    @Test
    public void summingLong() {
        List<Long> list = new ArrayList<>();
        list.add((long) 340);
        list.add((long) 240);
        list.add((long) 360);
        long result = list.stream().collect(Collectors.summingLong(l -> l));
        System.out.println(result);
    }

    /**
     * Collectors.summingDouble
     * Collectors.summingDouble adds all element of stream for double data type.
     */
    @Test
    public void summingDouble() {
        List<Double> list = Arrays.asList(340.5, 234.56, 672.76);
        Double result = list.stream().collect(Collectors.summingDouble(d -> d));
        System.out.println(result);
    }

    /**
     * Collectors.toList
     * Collectors.toList collects the stream data as List for the given data type.
     */
    @Test
    public void toList() {
        List<String> list = Stream.of("AA", "BB", "CC").collect(Collectors.toList());
        list.forEach(s -> System.out.println(s));
    }

    /**
     * Collectors.toSet
     * Collectors.toSet collects the element as set for the given data type.
     */
    @Test
    public void toSet() {
        Set<String> set = Stream.of("AA", "AA", "BB").collect(Collectors.toSet());
        set.forEach(s -> System.out.println(s));
    }

    /**
     * Collectors.toMap
     * Collectors.toMap collects the stream element as Map.
     * We need to define function to generate key and value for stream input value.
     */
    @Test
    public void toMap() {
        Map<String, String> map = Stream.of("Adarsh", "Radha", "Amit").collect(Collectors.toMap(k -> k, v -> v + v));
        map.forEach((k, v) -> System.out.println("key:" + k + "  value:" + v));
    }

}
