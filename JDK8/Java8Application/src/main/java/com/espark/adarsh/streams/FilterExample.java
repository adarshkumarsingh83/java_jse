package com.espark.adarsh.streams;

import com.espark.adarsh.utils.CollectorsReducingExample;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
