package com.espark.adarsh.functions;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class IntegerFunctions {

    public static void main(String[] args) {
        System.out.println(intFunction(10,(value) -> new Integer(value)));
        System.out.println(intToLongFunction(10, (value) -> new Long(value)));
        System.out.println(intToDoubleFunction(10, (value) -> new Double(value)));
    }
    public static Integer intFunction(Integer inputInteger, Function<Integer,Integer> integerFunction) {
        final Integer output=integerFunction.apply(inputInteger);
        return output;
    }
    public static Long intToLongFunction(Integer inputInteger, IntToLongFunction intToLongFunction) {
        final Long output=intToLongFunction.applyAsLong(inputInteger);
        return output;
    }
    public static Double intToDoubleFunction(Integer inputInteger, IntToDoubleFunction intToDoubleFunction) {
        final Double output=intToDoubleFunction.applyAsDouble(inputInteger);
        return output;
    }
}
