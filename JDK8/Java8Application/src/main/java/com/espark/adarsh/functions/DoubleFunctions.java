package com.espark.adarsh.functions;

import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class DoubleFunctions {

    public static void main(String[] args) {
        System.out.println(doubleFunction(10D, (value) -> new Double(value)));
        System.out.println(doubleToIntFunction(10D, (value) -> Integer.valueOf((int) value)));
        System.out.println(doubleToLongFunction(10D, (value) -> Long.valueOf((long) value)));
    }
    public static Double doubleFunction(Double inputDouble, Function<Double,Double> doubleFunction) {
        final Double output=doubleFunction.apply(inputDouble);
        return output;
    }
    public static Integer doubleToIntFunction(Double inputDouble,DoubleToIntFunction doubleToIntFunction) {
        final Integer output=doubleToIntFunction.applyAsInt(inputDouble);
        return output;
    }
    public static Long doubleToLongFunction(Double inputDouble, DoubleToLongFunction doubleToLongFunction) {
        final Long output=doubleToLongFunction.applyAsLong(inputDouble);
        return output;
    }
}
