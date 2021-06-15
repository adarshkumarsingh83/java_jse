package com.espark.adarsh.binaryOperator;

import java.util.function.DoubleBinaryOperator;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class DoubleBinaryOperatorExample {

    public static void main(String[] args) {
        System.out.println("Response  " + doubleBinaryOperator(10D, 20D, (value1, value2) -> value1 * value2));
    }

    public static Double doubleBinaryOperator(Double value1, Double value2, DoubleBinaryOperator doubleBinaryOperator) {
        return doubleBinaryOperator.applyAsDouble(value1, value2);
    }
}
