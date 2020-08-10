package com.espark.adarsh.utils;

import org.junit.Test;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by Adarsh on 8/19/15.
 */
public class SecureRandomExample {

    private static final List<Integer> VALID_PWD_CHARS = new ArrayList<>();

    static {
        IntStream.rangeClosed('0', '9').forEach(VALID_PWD_CHARS::add);    // 0-9
        IntStream.rangeClosed('A', 'Z').forEach(VALID_PWD_CHARS::add);    // A-Z
        IntStream.rangeClosed('a', 'z').forEach(VALID_PWD_CHARS::add);    // a-z
        IntStream.rangeClosed('!', '*').forEach(VALID_PWD_CHARS::add);    // !-*
    }

    /**
     * java.security.SecureRandom
     * SecureRandom is cryptographically strong number generator (RNG).
     * SecureRandom extends Random class and is enriched by new methods added in java 8.
     */
    @Test
    public void secureRandomExample() {
        int passwordLength = 8;
        System.out.println("---Generated Password---");
        for (int i = 0; i < 5; i++) {
            new SecureRandom().ints(passwordLength, 0, VALID_PWD_CHARS.size())
                    .map(VALID_PWD_CHARS::get).forEach(s -> System.out.print((char) s));
            System.out.println();
        }
    }
}
