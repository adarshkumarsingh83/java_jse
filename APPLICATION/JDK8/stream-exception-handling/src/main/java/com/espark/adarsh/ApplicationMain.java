package com.espark.adarsh;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ApplicationMain {

    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("1", "2", "not-integer");
        List<Integer> intList = Arrays.asList(1, 2, 3,0);

         /*
         stringList.stream()
                 .map(Integer::parseInt)
                 .collect(Collectors.toList())
                 .stream()
                 .forEach(System.out::println);
         */

        stringList.forEach(handleGenericException(s -> System.out.print(Integer.parseInt(s)+" "), NumberFormatException.class));
        System.out.println();
        intList.forEach(handleGenericException(s -> System.out.print((10 / s)+" "), ArithmeticException.class));
        System.out.println();
        intList.forEach(handleCheckedExceptionConsumer(i -> {
            Thread.sleep(i);
            System.out.print(i+"  ");
        }));


    }

    public static <Target, ExObj extends Exception> Consumer<Target> handleGenericException(Consumer<Target> targetConsumer,
                                                                                            Class<ExObj> exObjClass) {
        return obj -> {
            try {
                targetConsumer.accept(obj);
            } catch (Exception ex) {
                try {
                    ExObj exObj = exObjClass.cast(ex);
                    System.out.println("exception : " + exObj.getMessage());
                } catch (ClassCastException ecx) {
                    throw ex;
                }
            }
        };
    }

    static <Target> Consumer<Target> handleCheckedExceptionConsumer(CheckedExceptionHandlerConsumer<Target, Exception> handlerConsumer) {
        return obj -> {
            try {
                handlerConsumer.accept(obj);
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        };
    }
}
