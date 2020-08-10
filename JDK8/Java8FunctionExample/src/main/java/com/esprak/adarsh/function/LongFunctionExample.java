package com.esprak.adarsh.function;

import java.util.function.Function;
import java.util.function.LongFunction;
import java.util.function.LongToDoubleFunction;
import java.util.function.LongToIntFunction;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class LongFunctionExample {


    public static Long longFunction(Long inputLong, LongFunction<Long> longFunction) {
        final Long output = longFunction.apply(inputLong);
        return output;
    }

    public static Integer longToIntFunction(Long inputLong, LongToIntFunction longToIntFunction) {
        final Integer output = longToIntFunction.applyAsInt(inputLong);
        return output;
    }

    public static Double longToDoubleFunction(Long inputLong, LongToDoubleFunction longToDoubleFunction) {
        final Double output = longToDoubleFunction.applyAsDouble(inputLong);
        return output;
    }


    public static void main(String[] args) {

        //1 approach
        final LongFunction<Long> function = new LongFunction< Long>() {
            @Override
            public Long apply(long aLong) {
                return new Long(aLong);
            }
        };
        System.out.println(longFunction(10L, function));

        final LongToIntFunction longToIntFunction = new LongToIntFunction() {
            @Override
            public int applyAsInt(long value) {
                return java.lang.Math.toIntExact(value);
            }
        };
        System.out.println(longToIntFunction(10L, longToIntFunction));

        final LongToDoubleFunction longToDoubleFunction = new LongToDoubleFunction() {
            @Override
            public double applyAsDouble(long value) {
                return new Double(value);
            }
        };
        System.out.println(longToDoubleFunction(10L, longToDoubleFunction));



        //2 approach

        System.out.println(longFunction(10L,  new LongFunction< Long>() {
            @Override
            public Long apply(long aLong) {
                return new Long(aLong);
            }
        }));


        System.out.println(longToIntFunction(10L, new LongToIntFunction() {
            @Override
            public int applyAsInt(long value) {
                return java.lang.Math.toIntExact(value);
            }
        }));


        System.out.println(longToDoubleFunction(10L, new LongToDoubleFunction() {
            @Override
            public double applyAsDouble(long value) {
                return new Double(value);
            }
        }));


        //3 approach
        System.out.println(longFunction(10L, (long value) -> {
            return new Long(value);
        }));
        System.out.println(longToIntFunction(10L, (long value) -> {
            return java.lang.Math.toIntExact(value);
        }));
        System.out.println(longToDoubleFunction(10L, (long value) -> {
            return new Double(value);
        }));

        //4 approach
        System.out.println(longFunction(10L, (value) -> new Long(value)));
        System.out.println(longToIntFunction(10L, (value) -> java.lang.Math.toIntExact(value)));
        System.out.println(longToDoubleFunction(10L, (value) -> new Double(value)));

        //5 approach
        System.out.println(longFunction(10L, value -> new Long(value)));
        System.out.println(longToIntFunction(10L, value -> java.lang.Math.toIntExact(value)));
        System.out.println(longToDoubleFunction(10L, value -> new Double(value)));
    }
}
