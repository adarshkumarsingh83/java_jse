package com.esprak.adarsh.function;

import java.util.function.ToLongFunction;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class ToLongFunctionExample {


    public static Long toLongFunction(Integer object, ToLongFunction<Integer> toLongFunction) {
        return toLongFunction.applyAsLong(object);
    }


    public static void main(String[] args) {

        //1 approach
        final ToLongFunction<Integer> function = new ToLongFunction<Integer>() {
            @Override
            public long applyAsLong(Integer value) {
                return Long.valueOf(value.toString());
            }
        };
        System.out.println(toLongFunction(10, function));

        //2 approach
        System.out.println(toLongFunction(10, new ToLongFunction<Integer>() {
            @Override
            public long applyAsLong(Integer value) {
                return Long.valueOf(value.toString());
            }
        }));

        //3 approach
        System.out.println(toLongFunction(10, (Integer value) -> {
            return Long.valueOf(value.toString());
        }));

        //4 approach
        System.out.println(toLongFunction(10, (Integer value) -> Long.valueOf(value.toString())));

        //5 approach
        System.out.println(toLongFunction(10, value -> Long.valueOf(value.toString())));
    }
}
