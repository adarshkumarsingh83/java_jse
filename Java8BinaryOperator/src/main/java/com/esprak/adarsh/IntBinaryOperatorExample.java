package com.esprak.adarsh;

import java.util.function.IntBinaryOperator;


/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class IntBinaryOperatorExample {

    public static Integer intBinaryOperator(Integer value1, Integer value2, IntBinaryOperator intBinaryOperator) {
        return intBinaryOperator.applyAsInt(value1, value2);
    }

    public static void main(String[] args) {

        // 1 approach
        final IntBinaryOperator intBinaryOperator=new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left*right;
            }
        };
        System.out.println("Response "+intBinaryOperator(100, 20,intBinaryOperator));

        // 2 approach
        System.out.println("Response "+intBinaryOperator(100, 20,new IntBinaryOperator() {
            @Override
            public int applyAsInt(int left, int right) {
                return left*right;
            }
        }));


                // 3 approach
        System.out.println("Response "+intBinaryOperator(100, 20, (int value1,int  value2) -> {
            return value1 * value2;
        }));

        // 4 approach
        System.out.println("Response "+intBinaryOperator(100, 20, (value1, value2) -> value1 * value2));
    }
}
