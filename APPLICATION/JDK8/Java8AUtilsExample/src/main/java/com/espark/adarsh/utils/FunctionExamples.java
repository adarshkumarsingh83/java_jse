package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.function.*;

/**
 * Java 8 provides function API . These API are functional interface.
 * We can assign it as lambda expression.
 * Function accepts arguments, perform some processing and finally produces result.
 */
public class FunctionExamples {

    /**
     * Function<T,R>
     * Function produces result of given data type and accepts one argument as given data type.
     */
    @Test
    public void function() {
        Function<Integer, String> ob = f1 -> "Age:" + f1;
        System.out.println(ob.apply(20));
    }

    /**
     * DoubleFunction<R>
     * Accepts only double data type value and returns the result as given data type.
     */
    @Test
    public void doubleFunction() {
        DoubleFunction<String> df = d -> String.valueOf(d * 5.3);
        System.out.println(df.apply(43.7));
    }

    /**
     * DoubleToIntFunction
     * Accepts double data type value and returns integer value.
     */
    @Test
    public void doubleToIntFunction() {
        DoubleToIntFunction ob = f -> new Double(f * 4.8).intValue();
        System.out.println(ob.applyAsInt(43.7));
    }

    /**
     * DoubleToLongFunction
     * Accepts double data type value and returns long data type value.
     */
    @Test
    public void doubleToLongFunction() {
        DoubleToLongFunction ob = f -> new Double(f * 4.8).longValue();
        System.out.println(ob.applyAsLong(43.7));
    }

    /**
     * IntFunction<R>
     * Accepts only integer value and produces result of given data type.
     */
    @Test
    public void intFunction() {
        IntFunction ob = f -> f * f;
        System.out.println(ob.apply(43));
    }

    /**
     * IntToDoubleFunction
     * Accepts integer value and produces double data type value.
     */
    @Test
    public void intToDoubleFunction() {
        IntToDoubleFunction ob = f -> f * f;
        System.out.println(ob.applyAsDouble(43));
    }

    /**
     * IntToLongFunction
     * Accepts integer and produces long data type value.
     */
    @Test
    public void intToLongFunction() {
        IntToLongFunction ob = f -> f * f;
        System.out.println(ob.applyAsLong(43));
    }

    /**
     * LongFunction<R>
     * Accepts only long data type value and produces result of given data type.
     */
    @Test
    public void longFunction() {
        LongFunction<String> ob = f -> String.valueOf(f * f);
        System.out.println(ob.apply(43));
    }

    /**
     * LongToDoubleFunction
     * Accepts long data type value and produces double data type value.
     */
    @Test
    public void longToDoubleFunction() {
        LongToDoubleFunction ob = f -> f * f;
        System.out.println(ob.applyAsDouble(43));
    }

    /**
     * LongToIntFunction
     * Accepts long data type value and produces integer data type value.
     */
    @Test
    public void longToIntFunction() {
        LongToIntFunction ob = f -> (int) (f * f);
        System.out.println(ob.applyAsInt(43));
    }

    /**
     * ToDoubleBiFunction<T,U>
     * Accepts two arguments of the given data type and produces result of double data type.
     */
    @Test
    public void toDoubleBiFunction() {
        ToDoubleBiFunction<Integer, Integer> ob = (f1, f2) -> f1 + f2;
        System.out.println(ob.applyAsDouble(102, 305));
    }

    /**
     * ToDoubleFunction<T>
     * Accepts the value of given data type and produces double value.
     */
    @Test
    public void toDoubleFunction() {
        ToDoubleFunction<Integer> ob = f1 -> f1 * 301;
        System.out.println(ob.applyAsDouble(102));
    }

    /**
     * ToIntBiFunction<T,U>
     * Accepts two arguments of given data type and produces result of integer data type.
     */
    @Test
    public void toIntBiFunction() {
        ToIntBiFunction<Integer, Integer> ob = (f1, f2) -> f1 + f2;
        System.out.println(ob.applyAsInt(102, 306));
    }

    /**
     * ToIntFunction<T>
     * Accepts an argument of given data type and produces integer value.
     */
    @Test
    public void toIntFunction() {
        ToIntFunction<Integer> ob = f -> f * 123;
        System.out.println(ob.applyAsInt(306));
    }

    /**
     * ToLongBiFunction<T,U>
     * Accepts two arguments of given data type and produces long data type value.
     */
    @Test
    public void toLongBiFunction() {
        ToLongBiFunction<Integer, Integer> ob = (f1, f2) -> f1 - f2;
        System.out.println(ob.applyAsLong(306, 405));
    }

    /**
     * ToLongFunction<T>
     * Accepts an argument of given data type and produces result of long data type.
     */
    @Test
    public void toLongFunction() {
        ToLongFunction<Integer> ob = f1 -> f1 + 50;
        System.out.println(ob.applyAsLong(306));
    }
}
