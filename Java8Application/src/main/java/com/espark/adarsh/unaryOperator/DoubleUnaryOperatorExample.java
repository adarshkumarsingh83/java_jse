package com.espark.adarsh.unaryOperator;

import java.util.function.DoubleUnaryOperator;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class DoubleUnaryOperatorExample {
    public static void main(String[] args) {
        System.out.println("Response " + doubleUnaryOperator(Double.MAX_VALUE, (value) -> value / value));
    }

    public static Double doubleUnaryOperator(Double value, DoubleUnaryOperator doubleUnaryOperator) {
        return doubleUnaryOperator.applyAsDouble(value);
    }
}
