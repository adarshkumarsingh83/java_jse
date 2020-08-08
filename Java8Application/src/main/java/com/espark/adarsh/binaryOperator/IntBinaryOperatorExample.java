package com.espark.adarsh.binaryOperator;

import java.util.function.IntBinaryOperator;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class IntBinaryOperatorExample {

    public static void main(String[] args) {
        System.out.println("Response "+intBinaryOperator(100,20,(value1,value2)-> value1*value2));
    }

    public static Integer intBinaryOperator(Integer value1, Integer value2, IntBinaryOperator intBinaryOperator) {
        return intBinaryOperator.applyAsInt(value1, value2);
    }
}
