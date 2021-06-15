package com.espark.adarsh.functions;

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class ToDoubleFunctionExample {

    public static void main(String[] args) {
        System.out.println(toDoubleFunction(10, (value) -> Integer.valueOf(value.toString())));
    }

    public static Double toDoubleFunction(Integer object,ToDoubleFunction<Integer> toDoubleFunction){
        return toDoubleFunction.applyAsDouble(object);
    }
}
