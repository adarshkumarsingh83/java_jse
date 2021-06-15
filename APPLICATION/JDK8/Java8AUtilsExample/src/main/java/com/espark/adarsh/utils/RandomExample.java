package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Created by Adarsh on 8/19/15.
 */
public class RandomExample {

    private static final List<Integer> VALID_PWD_CHARS = new ArrayList<>();

    static {
        IntStream.rangeClosed('0', '9').forEach(VALID_PWD_CHARS::add);    // 0-9
        IntStream.rangeClosed('a', 'z').forEach(VALID_PWD_CHARS::add);    // a-z
    }

    /**
     * java.util.Random
     * Random class generates pseudorandom numbers. For each call of the instance,
     * a pseudorandom number is returned. Random class is thread safe. Random class
     * has some new methods to support java 8.
     * ints: returns integer values as IntStream.
     * longs: returns long values as LongStream
     * doubles : returns double values as DoubleStream
     */
    @Test
    public void randomExample() {
        int passwordLength = 8;
        System.out.println("---Generated Password---");
        for (int i = 0; i < 5; i++) {
            new Random().ints(passwordLength, 0, VALID_PWD_CHARS.size())
                    .map(VALID_PWD_CHARS::get).forEach(s -> System.out.print((char) s));
            System.out.println();
        }
    }

}
