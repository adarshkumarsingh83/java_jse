package com.esprak.adarsh.function;

import java.util.function.ToIntFunction;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class ToIntegerFunctionExample {

    public static Integer toIntFunction(Short object, ToIntFunction<Short> toIntFunction) {
        return toIntFunction.applyAsInt(object);
    }


    public static void main(String[] args) {

        //1 approach
        final ToIntFunction toIntFunction= new ToIntFunction<Short>() {
            @Override
            public int applyAsInt(Short value) {
                return Integer.valueOf(value.toString());
            }
        };
        System.out.println(toIntFunction((short) 10,toIntFunction));

        //2 approach
        System.out.println(toIntFunction((short) 10, new ToIntFunction<Short>() {
            @Override
            public int applyAsInt(Short value) {
                return Integer.valueOf(value.toString());
            }
        }));

        //3 approach
        System.out.println(toIntFunction((short) 10, (Short value) -> {
            return Integer.valueOf(value.toString());
        }));

        //4 approach
        System.out.println(toIntFunction((short) 10, (value) -> Integer.valueOf(value.toString())));


        //5 approach
        System.out.println(toIntFunction((short) 10, value -> Integer.valueOf(value.toString())));
    }

}
