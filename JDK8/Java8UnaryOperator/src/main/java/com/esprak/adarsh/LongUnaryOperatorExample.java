package com.esprak.adarsh;

import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class LongUnaryOperatorExample {

    public static Long longUnaryOperator(Long value, LongUnaryOperator longUnaryOperator) {
        return longUnaryOperator.applyAsLong(value);
    }


    public static void main(String[] args) {

        // 1 approach
        final LongUnaryOperator longUnaryOperator=new LongUnaryOperator() {
            @Override
            public long applyAsLong(long operand) {
                return operand - Integer.MAX_VALUE;
            }
        };
        System.out.println("Data " + longUnaryOperator(Long.MAX_VALUE,longUnaryOperator));

        // 2 approach
        System.out.println("Data " + longUnaryOperator(Long.MAX_VALUE,new LongUnaryOperator() {
            @Override
            public long applyAsLong(long operand) {
                return operand - Integer.MAX_VALUE;
            }
        }));

                // 3 approach
        System.out.println("Data " + longUnaryOperator(Long.MAX_VALUE, (long value) -> {
            return value - Integer.MAX_VALUE;
        }));

        // 4 approach
        System.out.println("Data " + longUnaryOperator(Long.MAX_VALUE, (value) -> value - Integer.MAX_VALUE));

        // 5 approach
        System.out.println("Data " + longUnaryOperator(Long.MAX_VALUE, value -> value - Integer.MAX_VALUE));

    }
}
