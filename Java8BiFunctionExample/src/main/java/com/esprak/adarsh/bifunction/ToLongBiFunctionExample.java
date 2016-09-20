package com.esprak.adarsh.bifunction;

import java.util.function.ToLongBiFunction;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class ToLongBiFunctionExample {


    public static Long toLongBiFunction(Short value1, Short value2, ToLongBiFunction<Short, Short> toLongBiFunction) {
        return toLongBiFunction.applyAsLong(value1, value2);
    }


    public static void main(String[] args) {

        //1 approach
        final ToLongBiFunction<Short, Short> shortToLongBiFunction = new ToLongBiFunction<Short, Short>() {
            @Override
            public long applyAsLong(Short value1, Short value2) {
                return (value1 + value2);
            }
        };
        System.out.println(toLongBiFunction((short) 10, (short) 20, shortToLongBiFunction));

        //2 approach
        System.out.println(toLongBiFunction((short) 10, (short) 20, new ToLongBiFunction<Short, Short>() {
            @Override
            public long applyAsLong(Short value1, Short value2) {
                return (value1 + value2);
            }
        }));

        //3 approach
        System.out.println(toLongBiFunction((short) 10, (short) 20, (Short value1, Short value2) -> {
            return (value1 + value2);
        }));

        //4 approach
        System.out.println(toLongBiFunction((short) 10, (short) 20, (value1, value2) -> (value1 + value2)));
    }
}
