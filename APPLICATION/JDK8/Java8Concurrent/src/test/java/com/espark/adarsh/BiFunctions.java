package com.espark.adarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class BiFunctions {

    public static void main(String[] args) {
        System.out.println(biFunction(10,20,(value1,value2)->"Result"+(value1+value2)));
    }

    public static  String  biFunction(final Integer value1,Integer value2,final BiFunction<Integer, Integer, String> biFunction) {
        final String output=biFunction.apply(value1,value2);
        return output;
    }

}
