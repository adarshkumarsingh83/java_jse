package com.esprak.adarsh;

import java.util.function.LongBinaryOperator;
import java.util.function.LongUnaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class LongBinaryOperatorExample {

    public static Long longBinaryOperator(Long value1, Long value2, LongBinaryOperator longBinaryOperator) {
        return longBinaryOperator.applyAsLong(value1, value2);
    }

    public static void main(String[] args) {

        // 1 approach
        final LongBinaryOperator longBinaryOperator= new LongBinaryOperator() {
            @Override
            public long applyAsLong(long left, long right) {
                return left*right;
            }
        };
        System.out.println("Response " + longBinaryOperator(100L, 100L,longBinaryOperator));


        // 2 approach
        System.out.println("Response " + longBinaryOperator(100L, 100L,new LongBinaryOperator() {
            @Override
            public long applyAsLong(long left, long right) {
                return left*right;
            }
        }));


        // 3 approach
        System.out.println("Response " + longBinaryOperator(100L, 100L, (long value1,long  value2) -> {
            return value1 * value2;
        }));

        // 4 approach
        System.out.println("Response " + longBinaryOperator(100L, 100L, (value1, value2) -> value1 * value2));
    }
}
