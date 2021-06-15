package com.espark.adarsh.functions;

import java.util.function.Function;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class LongFunctions {
    public static void main(String[] args) {
        System.out.println(longFunction(10L, (value) -> new Long(value)));
        System.out.println(longToIntFunction(10L, (value) -> java.lang.Math.toIntExact(value)));
        System.out.println(longToDoubleFunction(10L, (value) -> new Double(value)));
    }
    public static Long longFunction(Long inputLong, Function<Long,Long> longFunction) {
        final Long output=longFunction.apply(inputLong);
        return output;
    }
    public static Integer longToIntFunction(Long inputLong, LongToIntFunction longToIntFunction) {
        final Integer output=longToIntFunction.applyAsInt(inputLong);
        return output;
    }
    public static Double longToDoubleFunction(Long inputLong, LongToDoubleFunction longToDoubleFunction) {
        final Double output=longToDoubleFunction.applyAsDouble(inputLong);
        return output;
    }
}
