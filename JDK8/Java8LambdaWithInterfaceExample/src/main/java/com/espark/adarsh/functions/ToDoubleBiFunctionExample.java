package com.espark.adarsh.functions;

import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;
import java.util.function.ToLongBiFunction;

/**
 * Created by akumar6 on 7/7/2016.
 */
public class ToDoubleBiFunctionExample {

    public static void main(String[] args) {
        System.out.println(toDoubleBiFunction((short) 10, (short) 20, (value1, value2) -> (value1 + value2)));
    }

    public static Double toDoubleBiFunction(Short value1,Short value2,ToDoubleBiFunction<Short,Short> shortToDoubleBiFunction){
        return shortToDoubleBiFunction.applyAsDouble(value1, value2);
    }
}
