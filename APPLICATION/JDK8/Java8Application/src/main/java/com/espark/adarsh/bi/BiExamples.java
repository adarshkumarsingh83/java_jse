package com.espark.adarsh.bi;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * Created by Adarsh on 8/20/15.
 */
public class BiExamples {

    /**
     * BiConsumer
     * java.util.function.BiConsumer is a java 8 functional interface.
     * BiConsumer does not return value. It accepts two parameter as an argument.
     * BiConsumer functional method is accept(Object, Object). This methods performs
     * the operation defined by BiConsumer.
     */
    @Test
    public void biConsumerExample() {
        final Map<Integer, String> map = new HashMap<Integer, String>() {
            {
                put(1, "A");
                put(2, "B");
                put(3, "C");
            }
        };

        final BiConsumer<Integer, String> biConsumer
                = (key, value) -> System.out.println("Key:" + key + " Value:" + value);
        map.forEach(biConsumer);
    }

    /**
     * BiFunction
     * java.util.function.BiFunction is a functional interface. BiFunction accepts two
     * arguments and returns a value. While declaring BiFunction we need to tell what
     * type of argument will be passed and what will be return type. We can apply our
     * business logic with those two values and return the result. BiFunction has function
     * method as apply(T t, U u) which accepts two argument.
     */
    @Test
    public void biFunction() {
        final BiFunction<Integer, Integer, String> biFunction = (num1, num2) -> "Result:" + (num1 + num2);
        System.out.println(biFunction.apply(20, 25));
    }

    /**
     * BiPredicate
     * java.util.function.BiPredicate is a functional interface which accepts two
     * argument and returns Boolean value. Apply business logic for the values passed
     * as an argument and return the boolean value. BiPredicate functional method is
     * test(Object, Object). Find the simple example for how to use BiPredicate.
     */
    @Test
    public void biPredicate() {
        final BiPredicate<Integer, String> condition = (i, s) -> i > 20 && s.startsWith("A");
        System.out.println(condition.test(10, "Adarsh"));
        System.out.println(condition.test(30, "Radha"));
        System.out.println(condition.test(30, "Amit"));
    }
}
