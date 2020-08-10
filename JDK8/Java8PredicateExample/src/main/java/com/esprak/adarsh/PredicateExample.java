package com.esprak.adarsh;

import java.util.function.Predicate;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class PredicateExample {

    public static String predicate(String input, Predicate<String> predicate) {
        return (predicate.test(input) ? input.toUpperCase() : input.toLowerCase());
    }


    public static void main(String[] args) {

        //1 approach
        final Predicate<String> predicate1=new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.contains("adarsh");
            }
        };
        System.out.println("Data "+predicate(System.getProperty("user.name"),predicate1));

        final Predicate<String> predicate2=new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.contains("kumar");
            }
        };
        System.out.println("Data "+predicate(System.getProperty("user.name"),predicate2));


        //2 approach
        System.out.println("Data "+predicate(System.getProperty("user.name"),new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.contains("adarsh");
            }
        }));

        System.out.println("Data "+predicate(System.getProperty("user.name"),new Predicate<String>() {
            @Override
            public boolean test(String value) {
                return value.contains("kumar");
            }
        }));


        //3 approach
        System.out.println("Data "+predicate(System.getProperty("user.name"),(String value) -> {
            return value.contains("adarsh");
        }));
        System.out.println("Data "+predicate(System.getProperty("user.name"),(String value) -> {
            return value.contains("kumar");
        }));

        //4 approach
        System.out.println("Data "+predicate(System.getProperty("user.name"),(value) -> value.contains("adarsh")));
        System.out.println("Data "+predicate(System.getProperty("user.name"),(value) -> value.contains("kumar")));


        //5 approach
        System.out.println("Data "+predicate(System.getProperty("user.name"),value -> value.contains("adarsh")));
        System.out.println("Data "+predicate(System.getProperty("user.name"),value -> value.contains("kumar")));
    }
}
