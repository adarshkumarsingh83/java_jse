package com.espark.adarsh.predicates;

import java.util.function.BiPredicate;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class BiPredicateExample {
    public static void main(String[] args) {
        System.out.println(biPredicate(System.getProperty("user.name"),"kumar",(value1,value2)-> value1.contains(value2)));;
        System.out.println(biPredicate(System.getProperty("user.name"),"adarsh",(value1,value2)-> value1.contains(value2)));;
    }
    public static String biPredicate(String value1,String value2,BiPredicate<String,String> biPredicate){
        return (biPredicate.test(value1,value2)?value1.toLowerCase():value2.toLowerCase());
    }
}
