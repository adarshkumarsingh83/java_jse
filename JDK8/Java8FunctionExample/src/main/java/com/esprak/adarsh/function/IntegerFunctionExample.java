package com.esprak.adarsh.function;

import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.IntToLongFunction;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class IntegerFunctionExample {


    public static Integer intFunction(Integer inputInteger, IntFunction<Integer> integerFunction) {
        final Integer output = integerFunction.apply(inputInteger);
        return output;
    }

    public static Long intToLongFunction(Integer inputInteger, IntToLongFunction intToLongFunction) {
        final Long output = intToLongFunction.applyAsLong(inputInteger);
        return output;
    }

    public static Double intToDoubleFunction(Integer inputInteger, IntToDoubleFunction intToDoubleFunction) {
        final Double output = intToDoubleFunction.applyAsDouble(inputInteger);
        return output;
    }


    public static void main(String[] args) {

        //1 approach
        final IntFunction<Integer> function = new IntFunction<Integer>() {
            @Override
            public Integer apply(int integer) {
                return new Integer(integer);
            }
        };
        System.out.println(intFunction(10, function));

        final IntToLongFunction intToLongFunction = new IntToLongFunction() {
            @Override
            public long applyAsLong(int value) {
                return new Long(value);
            }
        };
        System.out.println(intToLongFunction(10, intToLongFunction));

        final IntToDoubleFunction intToDoubleFunction = new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return new Double(value);
            }
        };
        System.out.println(intToDoubleFunction(10, intToDoubleFunction));


        //2 approach
        System.out.println(intFunction(10, new IntFunction<Integer>() {
            @Override
            public Integer apply(int integer) {
                return new Integer(integer);
            }
        }));

        System.out.println(intToLongFunction(10, new IntToLongFunction() {
            @Override
            public long applyAsLong(int value) {
                return new Long(value);
            }
        }));


        System.out.println(intToDoubleFunction(10,  new IntToDoubleFunction() {
            @Override
            public double applyAsDouble(int value) {
                return new Double(value);
            }
        }));


       //3 approach
        System.out.println(intFunction(10, (int value) -> {
            return new Integer(value);
        }));

        System.out.println(intToLongFunction(10, (int value) -> {
            return new Long(value);
        }));
        System.out.println(intToDoubleFunction(10, (int value) ->{
            return new Double(value);
        }));

        // 4 approach
        System.out.println(intFunction(10, (value) -> new Integer(value)));
        System.out.println(intToLongFunction(10, (value) -> new Long(value)));
        System.out.println(intToDoubleFunction(10, (value) -> new Double(value)));

        // 5 approach
        System.out.println(intFunction(10, value -> new Integer(value)));
        System.out.println(intToLongFunction(10, value -> new Long(value)));
        System.out.println(intToDoubleFunction(10, value -> new Double(value)));
    }
}
