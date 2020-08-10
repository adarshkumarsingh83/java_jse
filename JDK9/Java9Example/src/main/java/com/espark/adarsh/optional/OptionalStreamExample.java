package com.espark.adarsh.optional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OptionalStreamExample {

    public static void main(String[] args) {
        List<Integer> numbers = IntStream.range(1, 10).boxed().collect(Collectors.toList());

        processStream(numbers.stream());

        System.out.println("JAVA 9 optinal Stream with value exist ");
        processStream(numbers.stream()
                .filter(number -> number > 5)
                .findFirst()
                .stream());

        System.out.println("JAVA 9 optinal Stream with value doesn't exist ");
        processStream(numbers.stream()
                .filter(number -> number < 0)
                .findFirst()
                .stream());


    }

    public static void processStream(Stream<Integer> data) {
        data.forEach(System.out::println);
    }
}
