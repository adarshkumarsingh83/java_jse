package com.espark.adarsh.stream;

import java.util.stream.IntStream;

public class Java9Iterate {

    public static void main(String[] args) {

        System.out.println("imprative for loop without upper bound ");
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
        System.out.println("java 8 range() without upper bound include ");
        IntStream.range(0,5)
                .forEach(System.out::println);

        System.out.println("imprative for loop with upper bound ");
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("java 8 rangeClosed() with upper bound include ");
        IntStream.rangeClosed(0,5)
                .forEach(System.out::println);

        System.out.println("Before java 8 imprative for loop  ");
        for(int i=0;i<10;i=i+2){
            System.out.println(i);
        }

        System.out.println("Java 8 style iterate(initValue ,function) but limit is used for the conditions ");
        IntStream.iterate(0, element-> element+2)
                .limit(10) // takeWhile() , skip(), dropWhile(), limit()
                .forEach(System.out::println);

        System.out.println("Java 9 style iterate(initValue , predicate, function)");
        IntStream.iterate(0,element -> element < 20 ,element-> element+2)
                .forEach(System.out::println);
    }
}