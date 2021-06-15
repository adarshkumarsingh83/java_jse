package com.esprak.adarsh.function;

import java.util.function.ToDoubleFunction;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class ToDoubleFunctionExample {

    public static Double toDoubleFunction(Integer object, ToDoubleFunction<Integer> toDoubleFunction) {
        return toDoubleFunction.applyAsDouble(object);
    }

    public static void main(String[] args) {

        //1 approach
        final ToDoubleFunction toDoubleFunction = new ToDoubleFunction<Integer>() {
            @Override
            public double applyAsDouble(Integer value) {
                return Double.valueOf(value.toString());
            }
        };
        System.out.println(toDoubleFunction(10, toDoubleFunction));


        //2 approach
        System.out.println(toDoubleFunction(10, new ToDoubleFunction<Integer>() {
            @Override
            public double applyAsDouble(Integer value) {
                return Double.valueOf(value.toString());
            }
        }));

        //3 approach
        System.out.println(toDoubleFunction(10, (Integer value) -> {
            return Double.valueOf(value.toString());
        }));

        //4 approach
        System.out.println(toDoubleFunction(10, (value) -> Double.valueOf(value.toString())));

        //5 approach
        System.out.println(toDoubleFunction(10, value -> Double.valueOf(value.toString())));
    }
}
