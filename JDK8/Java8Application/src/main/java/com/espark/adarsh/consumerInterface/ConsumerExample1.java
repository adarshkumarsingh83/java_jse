package com.espark.adarsh.consumerInterface;

import java.util.function.Consumer;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class ConsumerExample1 {
    public static void main(String[] args) {
        consumerFunction(System.getProperty("user.name"), (data) -> System.out.println("After Data Processing " + data.toUpperCase()));
    }

    public static void consumerFunction(String data, Consumer<String> consumer) {
        System.out.println("Before Data Processing " + data);
        consumer.accept(data);
    }
}
