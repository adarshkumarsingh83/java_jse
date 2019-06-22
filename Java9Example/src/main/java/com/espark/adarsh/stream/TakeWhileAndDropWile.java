package com.espark.adarsh.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TakeWhileAndDropWile {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 4, 32, 46, 90, 3, 9, 10);
        //List<Integer> numbers = IntStream.range(1,20).boxed().collect(Collectors.toList());
        System.out.println("filter(predicate)");
        numbers.stream()
                .filter(number -> number > 30)
                .forEach(System.out::println);
        System.out.println("limit(count)");
        numbers.stream()
                .limit(2)
                .forEach(System.out::println);

        System.out.println("java 9 takeWhile(predicate) equals to break in loop ");
        numbers.stream()
                .takeWhile(number -> number < 15)
                .forEach(System.out::println);

        System.out.println("skip(count)");
        numbers.stream()
                .skip(2)
                .forEach(System.out::println);

        System.out.println("java 9 dropWhile(predicate) equal to continue in loop ");
        numbers.stream()
                .dropWhile(number -> number < 15)
                .forEach(System.out::println);
    }
}
