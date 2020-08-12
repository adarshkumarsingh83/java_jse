package com.espark.adarsh.unaryOperator;

import java.util.function.LongUnaryOperator;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class LongUnaryOperatorExample {
    public static void main(String[] args) {
        System.out.println("Data " + longUnaryOperator(Long.MAX_VALUE, (value) -> value - Integer.MAX_VALUE));
    }

    public static Long longUnaryOperator(Long value, LongUnaryOperator longUnaryOperator) {
        return longUnaryOperator.applyAsLong(value);
    }
}
