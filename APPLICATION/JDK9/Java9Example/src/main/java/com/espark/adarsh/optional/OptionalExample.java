package com.espark.adarsh.optional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OptionalExample {

    public static void main(String[] args) {
        List<Integer> numbers=IntStream.range(1,10).boxed().collect(Collectors.toList());
        System.out.println("Java 8 we will get the optianl "+
                numbers.stream()
                        .filter(number -> number> 5)
                        .findFirst()
        );

        System.out.println("Java 8  if the element exist then get value other wise it throw exception get() "+
                numbers.stream()
                        .filter(number -> number> 5)
                        .findFirst()
                .get()
        );

        Optional<Integer> optinal = numbers.stream()
                .filter(number -> number> 5)
                .findFirst();
        System.out.println("Java 8  if the element exist then get value other wise it throw exception get() "
                +(optinal.isPresent() ? optinal.get():" Value is not present "));

        System.out.println("Java 8 if the element doesn't exist then orElse(0) we inject the 0 defualt value  "+
                numbers.stream()
                        .filter(number -> number < 0)
                        .findFirst()
                        .orElse(0)
        );


        Optional<Integer> optinal9_1 = numbers.stream()
                .filter(number -> number > 5)
                .findFirst();
        System.out.print("Java 9  if the element exist then get value other wise ifPresentOrElse() will inject msg ");
        optinal9_1.ifPresentOrElse(number -> System.out.println(number),()-> System.out.println("Value Not Present "));

        Optional<Integer> optinal9_2 = numbers.stream()
                .filter(number -> number < 0)
                .findFirst();
        System.out.print("Java 9  if the element exist then get value other wise ifPresentOrElse() will inject msg ");
        optinal9_2.ifPresentOrElse(number -> System.out.println(number),()-> System.out.println("Value Not Present "));

        Optional<Integer> optinal9_3 = numbers.stream()
                .filter(number -> number < 0)
                .findFirst()
                .or(()-> Optional.of(-1));
        System.out.print("Java 9  if the element exist then get value other wise or() with inject the optinal value ");
        optinal9_3.ifPresentOrElse(number -> System.out.println(number),()-> System.out.println("Value Not Present "));
    }
}
