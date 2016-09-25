package com.esprak.adarsh;

import java.util.function.BiPredicate;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class BiPredicateExample {

    public static String biPredicate(String value1, String value2, BiPredicate<String, String> biPredicate) {
        return (biPredicate.test(value1, value2) ? value1.toUpperCase() : value2.toLowerCase());
    }


    public static void main(String[] args) {

        //1 approach
        final BiPredicate<String ,String> biPredicate1=new BiPredicate<String, String>() {
            @Override
            public boolean test(String value1, String value2) {
                return value1.contains(value2);
            }
        };
        System.out.println(biPredicate(System.getProperty("user.name"), "kumar", biPredicate1));

        final BiPredicate<String ,String> biPredicate2=new BiPredicate<String, String>() {
            @Override
            public boolean test(String value1, String value2) {
                return value1.contains(value2);
            }
        };
        System.out.println(biPredicate(System.getProperty("user.name"), "adarsh", biPredicate2));


        //2 approach
        System.out.println(biPredicate(System.getProperty("user.name"), "kumar", new BiPredicate<String, String>() {
            @Override
            public boolean test(String value1, String value2) {
                return value1.contains(value2);
            }
        }));

        System.out.println(biPredicate(System.getProperty("user.name"), "adarsh", new BiPredicate<String, String>() {
            @Override
            public boolean test(String value1, String value2) {
                return value1.contains(value2);
            }
        }));

        //3 approach
        System.out.println(biPredicate(System.getProperty("user.name"), "kumar", (String value1,String value2) -> {
            return value1.contains(value2);
        }));
        System.out.println(biPredicate(System.getProperty("user.name"), "adarsh", (String value1,String value2) -> {
            return value1.contains(value2);
        }));


        //4 approach
        System.out.println(biPredicate(System.getProperty("user.name"), "kumar", (value1, value2) -> value1.contains(value2)));
        System.out.println(biPredicate(System.getProperty("user.name"), "adarsh", (value1, value2) -> value1.contains(value2)));
    }
}
