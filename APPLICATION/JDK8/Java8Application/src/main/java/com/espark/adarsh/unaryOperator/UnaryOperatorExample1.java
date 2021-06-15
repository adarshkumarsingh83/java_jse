package com.espark.adarsh.unaryOperator;

import java.util.function.UnaryOperator;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class UnaryOperatorExample1 {
    public static void main(String[] args) {
        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"), (value) -> value.toUpperCase()));
    }

    public static String unaryOperator(String value, UnaryOperator<String> unaryOperator) {
        return unaryOperator.apply(value);
    }
}
