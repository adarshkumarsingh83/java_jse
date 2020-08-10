package com.espark.adarsh.consumerInterface;

import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class BiConsumerExample {

    public static void main(String[] args) {
        biConsumer("name",System.getProperty("user.name"),(value1,value2) -> System.out.println("Data Processed " + value1.toUpperCase() + " == " + value2.toUpperCase()));
    }

    public static void biConsumer(String value1, String value2, BiConsumer<String, String> biConsumer) {
        System.out.println("Data "+value1+" "+value2);
        biConsumer.accept(value1, value2);
    }
}
