package com.esprak.adarsh.function;

import java.util.function.DoubleFunction;
import java.util.function.DoubleToIntFunction;
import java.util.function.DoubleToLongFunction;
import java.util.function.Function;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class DoubleFunctionExample {

    public static Double doubleFunction(Double inputDouble, DoubleFunction<Double> doubleFunction) {
        final Double output = doubleFunction.apply(inputDouble);
        return output;
    }

    public static Integer doubleToIntFunction(Double inputDouble, DoubleToIntFunction doubleToIntFunction) {
        final Integer output = doubleToIntFunction.applyAsInt(inputDouble);
        return output;
    }

    public static Long doubleToLongFunction(Double inputDouble, DoubleToLongFunction doubleToLongFunction) {
        final Long output = doubleToLongFunction.applyAsLong(inputDouble);
        return output;
    }

    public static void main(String[] args) {


        //1 approach
        final DoubleFunction<Double> doubleDoubleFunction = new DoubleFunction< Double>() {
            @Override
            public Double apply(double aDouble) {
                return new Double(aDouble);
            }
        };
        System.out.println(doubleFunction(10D, doubleDoubleFunction));

        final DoubleToIntFunction doubleIntegerFunction = new DoubleToIntFunction() {
            @Override
            public int applyAsInt(double value) {
                return Integer.valueOf((int) value);
            }
        };
        System.out.println(doubleToIntFunction(10D, doubleIntegerFunction));

        final DoubleToLongFunction doubleToLongFunction = new DoubleToLongFunction() {
            @Override
            public long applyAsLong(double value) {
                return Long.valueOf((long) value);
            }
        };
        System.out.println(doubleToLongFunction(10D, doubleToLongFunction));


        //2 approach
        System.out.println(doubleFunction(10D, new DoubleFunction<Double>() {
            @Override
            public Double apply(double aDouble) {
                return new Double(aDouble);
            }
        }));

        System.out.println(doubleToIntFunction(10D,  new DoubleToIntFunction() {
            @Override
            public int applyAsInt(double value) {
                return Integer.valueOf((int) value);
            }
        }));

        System.out.println(doubleToLongFunction(10D,  new DoubleToLongFunction() {
            @Override
            public long applyAsLong(double value) {
                return Long.valueOf((long) value);
            }
        }));

        //3 approach
        System.out.println(doubleFunction(10D, (double value) -> {
            return new Double(value);
        }));
        System.out.println(doubleToIntFunction(10D, (double value) -> {
            return Integer.valueOf((int) value);
        }));
        System.out.println(doubleToLongFunction(10D, (double value) -> {
           return Long.valueOf((long) value);
        }));

        //4 approach
        System.out.println(doubleFunction(10D, (value) -> new Double(value)));
        System.out.println(doubleToIntFunction(10D, (value) -> Integer.valueOf((int) value)));
        System.out.println(doubleToLongFunction(10D, (value) -> Long.valueOf((long) value)));


        //5 approach
        System.out.println(doubleFunction(10D, value -> new Double(value)));
        System.out.println(doubleToIntFunction(10D, value -> Integer.valueOf((int) value)));
        System.out.println(doubleToLongFunction(10D, value -> Long.valueOf((long) value)));
    }

}
