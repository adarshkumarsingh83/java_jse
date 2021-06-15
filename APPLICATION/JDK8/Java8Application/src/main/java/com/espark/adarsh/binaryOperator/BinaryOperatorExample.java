package com.espark.adarsh.binaryOperator;

import java.util.function.BinaryOperator;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class BinaryOperatorExample {

    public static void main(String[] args) {
        System.out.println("Response " + binaryOperator("adarsh", "kumar", (value1, value2) -> value1.concat(" " + value2)));
    }

    public static String binaryOperator(String value1, String value2, BinaryOperator<String> binaryOperator) {
        return binaryOperator.apply(value1, value2);
    }
}
