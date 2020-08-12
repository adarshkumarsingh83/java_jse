package com.espark.adarsh.unaryOperator;

import java.util.function.IntUnaryOperator;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class IntUnaryOperatorExample {
    public static void main(String[] args) {
        System.out.println("Data  " + intUnaryOperator(100, (value) -> value * value));
    }

    public static Integer intUnaryOperator(Integer value, IntUnaryOperator intUnaryOperator) {
        return intUnaryOperator.applyAsInt(value);
    }
}
