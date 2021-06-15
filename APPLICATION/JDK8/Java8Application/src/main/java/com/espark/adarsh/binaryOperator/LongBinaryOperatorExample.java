package com.espark.adarsh.binaryOperator;

import java.util.function.LongBinaryOperator;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class LongBinaryOperatorExample {

    public static void main(String[] args) {
        System.out.println("Response " + longBinaryOperator(100L, 100L, (value1, value2) -> value1 + value2));
    }

    public static Long longBinaryOperator(Long value1, Long value2, LongBinaryOperator longBinaryOperator) {
        return longBinaryOperator.applyAsLong(value1, value2);
    }
}

