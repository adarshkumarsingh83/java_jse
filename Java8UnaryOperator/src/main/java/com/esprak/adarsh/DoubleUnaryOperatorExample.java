package com.esprak.adarsh;

import java.util.function.DoubleUnaryOperator;


/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class DoubleUnaryOperatorExample {

    public static Double doubleUnaryOperator(Double value, DoubleUnaryOperator doubleUnaryOperator) {
        return doubleUnaryOperator.applyAsDouble(value);
    }

    public static void main(String[] args) {

        // 1 approach
        final DoubleUnaryOperator doubleUnaryOperator=new DoubleUnaryOperator() {
            @Override
            public double applyAsDouble(double operand) {
                return operand/operand;
            }
        };
        System.out.println("Response " + doubleUnaryOperator(Double.MAX_VALUE,doubleUnaryOperator));


        // 2 approach
        System.out.println("Response " + doubleUnaryOperator(Double.MAX_VALUE,new DoubleUnaryOperator() {
            @Override
            public double applyAsDouble(double operand) {
                return operand/operand;
            }
        }));


        // 3 approach
        System.out.println("Response " + doubleUnaryOperator(Double.MAX_VALUE, (double value) -> {
            return value / value;
        }));

        // 4 approach
        System.out.println("Response " + doubleUnaryOperator(Double.MAX_VALUE, (value) -> value / value));

        // 5 approach
        System.out.println("Response " + doubleUnaryOperator(Double.MAX_VALUE, value -> value / value));
    }
}
