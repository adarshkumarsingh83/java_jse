package com.esprak.adarsh.bifunction;

import java.util.function.ToDoubleBiFunction;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class ToDoubleBiFunctionExample {


    public static Double toDoubleBiFunction(Short value1, Short value2, ToDoubleBiFunction<Short, Short> toDoubleBiFunction) {
        return toDoubleBiFunction.applyAsDouble(value1, value2);
    }


    public static void main(String[] args) {

        //1 approach
        final ToDoubleBiFunction toDoubleBiFunction = new ToDoubleBiFunction<Short, Short>() {
            @Override
            public double applyAsDouble(Short value1, Short value2) {
                return (value1 + value2);
            }
        };
        System.out.println(toDoubleBiFunction((short) 10, (short) 20, toDoubleBiFunction));

        //2 approach
        System.out.println(toDoubleBiFunction((short) 10, (short) 20, new ToDoubleBiFunction<Short, Short>() {
            @Override
            public double applyAsDouble(Short value1, Short value2) {
                return (value1 + value2);
            }
        }));

        //3 approach
        System.out.println(toDoubleBiFunction((short) 10, (short) 20, (Short value1, Short value2) -> {
            return (value1 + value2);
        }));

        //4 approach
        System.out.println(toDoubleBiFunction((short) 10, (short) 20, (value1, value2) -> (value1 + value2)));
    }
}
