package com.espark.adarsh.functions;

import java.util.function.ToIntBiFunction;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class ToIntBiFunctionExample {

    public static void main(String[] args) {
        System.out.println(toIntBiFunction((short)10,(short)20,(value1,value2)-> (value1+value2)));
    }

    public static Integer toIntBiFunction(Short value1,Short value2,ToIntBiFunction<Short,Short> toIntBiFunction){
       return toIntBiFunction.applyAsInt(value1,value2);
    }
}
