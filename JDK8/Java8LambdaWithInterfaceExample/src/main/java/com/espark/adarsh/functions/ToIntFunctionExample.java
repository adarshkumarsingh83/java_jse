package com.espark.adarsh.functions;

import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class ToIntFunctionExample {

    public static void main(String[] args) {
        System.out.println(toIntFunction((short) 10, (value) -> Integer.valueOf(value.toString())));
    }

    public static Integer toIntFunction(Short object,ToIntFunction<Short> toIntFunction){
        return toIntFunction.applyAsInt(object);
    }
}
