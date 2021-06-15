package com.esprak.adarsh;

import java.util.function.UnaryOperator;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class UnaryOperatorExample {

    public static String unaryOperator(String value, UnaryOperator<String> unaryOperator) {
        return unaryOperator.apply(value);
    }

    public static void main(String[] args) {


        //1 approach
         final UnaryOperator<String> unaryOperator1=new UnaryOperator<String>() {
             @Override
             public String apply(String value) {
                 return value.toLowerCase();
             }
         };
        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"),unaryOperator1));

        final UnaryOperator<String> unaryOperator2=new UnaryOperator<String>() {
            @Override
            public String apply(String value) {
                return value.toUpperCase();
            }
        };
        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"),unaryOperator2));

        //2 approach
        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"),new UnaryOperator<String>() {
            @Override
            public String apply(String value) {
                return value.toLowerCase();
            }
        }));

        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"),new UnaryOperator<String>() {
            @Override
            public String apply(String value) {
                return value.toUpperCase();
            }
        }));


        //3 approach
        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"), (String value) -> {
            return value.toLowerCase();
        }));

        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"), (String value) -> {
            return value.toUpperCase();
        }));


        //4 approach
        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"), (value) -> value.toLowerCase()));
        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"), (value) -> value.toUpperCase()));


        //5 approach
        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"), value -> value.toLowerCase()));
        System.out.println("Data  " + unaryOperator(System.getProperty("user.name"), value -> value.toUpperCase()));

    }

}
