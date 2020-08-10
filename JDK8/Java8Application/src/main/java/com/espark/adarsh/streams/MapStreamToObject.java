package com.espark.adarsh.streams;

import java.util.stream.Stream;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class MapStreamToObject {

    public static void main(String[] args) {


        Stream.of(1, 2, 3)
                .mapToInt(Number::intValue)
                .mapToObj(value -> System.getProperty("user.name") + "_" + value)
                .forEach(System.out::println);

        Stream.of(1, 2, 3)
                .mapToLong(Number::longValue)
                .mapToObj(value -> System.getProperty("user.name") + "_" + value)
                .forEach(System.out::println);

        Stream.of(1, 2, 3)
                .mapToDouble(Number::doubleValue)
                .mapToObj(value -> System.getProperty("user.name") + "_" + value)
                .forEach(System.out::println);

    }
}
