package com.espark.adarsh.functions;

import java.util.function.ToLongFunction;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class ToLongFunctionExample {

    public static void main(String[] args) {
        System.out.println(toLongFunction(10,(value)->Long.valueOf(value.toString())));
    }

    public static Long toLongFunction(Integer object,ToLongFunction<Integer> toLongFunction){
        return toLongFunction.applyAsLong(object);
    }
}

