package com.esprak.adarsh;

import java.util.function.DoubleBinaryOperator;
import java.util.function.UnaryOperator;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class DoubleBinaryOperatorExample {


    public static Double doubleBinaryOperator(Double value1, Double value2, DoubleBinaryOperator doubleBinaryOperator) {
        return doubleBinaryOperator.applyAsDouble(value1, value2);
    }

    public static void main(String[] args) {

        // 1 approach
        final DoubleBinaryOperator doubleBinaryOperator=new DoubleBinaryOperator() {
            @Override
            public double applyAsDouble(double left, double right) {
                return left*right;
            }
        };
        System.out.println("Response  " + doubleBinaryOperator(10D, 20D,doubleBinaryOperator));


        // 2 approach
        System.out.println("Response  " + doubleBinaryOperator(10D, 20D,new DoubleBinaryOperator() {
            @Override
            public double applyAsDouble(double left, double right) {
                return left*right;
            }
        }));

        // 3 approach
        System.out.println("Response  " + doubleBinaryOperator(10D, 20D, (double value1,double value2) -> {
            return value1 * value2;
        }));

        // 4 approach
        System.out.println("Response  " + doubleBinaryOperator(10D, 20D, (value1, value2) -> value1 * value2));
    }
}
