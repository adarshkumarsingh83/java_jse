package com.espark.adarsh.functions;

import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class ToLongBiFunctionExample {

    public static void main(String[] args) {
        System.out.println(toLongBiFunction((short) 10, (short) 20, (value1, value2) -> (value1 + value2)));
    }

    public static Long toLongBiFunction(Short value1,Short value2,ToLongBiFunction<Short,Short> toLongBiFunction){
        return toLongBiFunction.applyAsLong(value1,value2);
    }
}
