package com.espark.adarsh;

import com.espark.adarsh.exception.LambdaExceptionWrapper;

import java.util.Arrays;
import java.util.List;

public class ApplicationMain {

    public static void main(String[] args) {
        numberFormatException();
        System.out.println("\n");
        arithmeticException();
        System.out.println("\n");
        interruptedException();
    }

    public static void numberFormatException() {
        List<String> integers = Arrays.asList("44", "373", "xyz", "145");
        integers.forEach(
                LambdaExceptionWrapper.consumer(str -> System.out.println(Integer.parseInt(str)),
                        NumberFormatException.class));
    }

    public static void arithmeticException() {
        List<Integer> ints = Arrays.asList(5, 10, 0, 15, 20, 30, 0, 9);
        ints.forEach(
                LambdaExceptionWrapper.consumer(
                        i -> System.out.println(1000 / i),
                        ArithmeticException.class));
    }

    public static void interruptedException() {
        List<Integer> list = Arrays.asList(5, 4, 3, 2, 1);
        list.stream().map(e -> {
            System.out.println(e);
            return e;
        }).forEach(LambdaExceptionWrapper.throwingConsumer(i -> Thread.sleep(i)));
    }
}
