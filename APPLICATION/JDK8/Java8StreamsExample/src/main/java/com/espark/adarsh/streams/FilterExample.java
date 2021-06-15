package com.espark.adarsh.streams;

import java.util.stream.IntStream;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class FilterExample {

    public static void main(String[] args) {
        IntStream.of(1, 2, 3, 4, 5)
                .filter((value) -> {
                    return (value % 2 == 0);
                })
                .map(value -> value);
    }
}
