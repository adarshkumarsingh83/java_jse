package com.esprak.adarsh.bifunction;

import java.util.function.ToIntBiFunction;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class ToIntBiFunctionExample {

    public static Integer toIntBiFunction(Short value1, Short value2, ToIntBiFunction<Short, Short> toIntBiFunction) {
        return toIntBiFunction.applyAsInt(value1, value2);
    }


    public static void main(String[] args) {

        //1 approach
        final ToIntBiFunction toIntBiFunction = new ToIntBiFunction<Short, Short>() {
            @Override
            public int applyAsInt(Short value1, Short value2) {
                return (value1 + value2);
            }
        };
        System.out.println(toIntBiFunction((short) 10, (short) 20, toIntBiFunction));

        //2 approach
        System.out.println(toIntBiFunction((short) 10, (short) 20, new ToIntBiFunction<Short, Short>() {
            @Override
            public int applyAsInt(Short value1, Short value2) {
                return (value1 + value2);
            }
        }));

        //3 approach
        System.out.println(toIntBiFunction((short) 10, (short) 20, (Short value1, Short value2) -> {
            return (value1 + value2);
        }));

        //4 approach
        System.out.println(toIntBiFunction((short) 10, (short) 20, (value1, value2) -> (value1 + value2)));
    }
}
