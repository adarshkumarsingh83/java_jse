package com.espark.adarsh.streams;

import java.util.stream.Stream;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class StreamMapExample {

    public static void main(String[] args) {

        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .forEach(System.out::println);

    }
}
