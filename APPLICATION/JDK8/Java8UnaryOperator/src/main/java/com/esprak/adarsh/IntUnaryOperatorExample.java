package com.esprak.adarsh;

import java.util.function.IntUnaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class IntUnaryOperatorExample {

    public static Integer intUnaryOperator(Integer value, IntUnaryOperator intUnaryOperator) {
        return intUnaryOperator.applyAsInt(value);
    }


    public static void main(String[] args) {


        // 1 approach
        final IntUnaryOperator intUnaryOperator = new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
            }
        };
        System.out.println("Data  " + intUnaryOperator(100, intUnaryOperator));


        // 2 approach
        System.out.println("Data  " + intUnaryOperator(100, new IntUnaryOperator() {
            @Override
            public int applyAsInt(int operand) {
                return operand * operand;
            }
        }));

        // 3 approach
        System.out.println("Data  " + intUnaryOperator(100, (int value) -> {
            return value * value;
        }));

        // 4 approach
        System.out.println("Data  " + intUnaryOperator(100, (value) -> value * value));

        // 5 approach
        System.out.println("Data  " + intUnaryOperator(100, value -> value * value));
    }
}
