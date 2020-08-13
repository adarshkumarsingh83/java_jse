package com.espark.adarsh;

import java.util.Arrays;
import java.util.OptionalInt;

public class ApplicationMain {
    public static void main(String[] args) {
        int vals[] = {2, 4, 16, 18, 10, 12, 14, 16};

        OptionalInt x = Arrays.stream(vals)
                .reduce((v1, v2) ->
                        v1 > v2 ? v1 : v2
                );
        System.out.println(x.isPresent() ? x.getAsInt() : -1);
    }
}
