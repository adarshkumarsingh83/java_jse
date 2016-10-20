/*
 * Copyright (c) 2015 Espark And ©Adarsh Development Services @copyright All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Espark nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.espark.adarsh.sequential;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;
import java.util.function.Predicate;
import java.util.stream.*;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Stream_filter_Example {

    @Test
    public void intStreamFilter() {

        IntStream.of(1, 2, 3, 4, 5)
                .filter(new IntPredicate() {
                    @Override
                    public boolean test(int value) {
                        return (value % 2 == 0);
                    }
                }).forEach(System.out::println);

        IntStream.of(1, 2, 3, 4, 5)
                .filter((int value) -> {
                    return (value % 2 == 0);
                }).forEach(System.out::println);

        IntStream.of(1, 2, 3, 4, 5)
                .filter(value -> (value % 2 == 0))
                .forEach(System.out::println);
    }


    @Test
    public void longStreamFilter() {

        LongStream.of(1L, 2L, 3L, 4L, 5L)
                .filter(new LongPredicate() {
                    @Override
                    public boolean test(long value) {
                        return (value % 2 == 0);
                    }
                }).forEach(System.out::println);

        LongStream.of(1L, 2L, 3L, 4L, 5L)
                .filter((long value) -> {
                    return (value % 2 == 0);
                }).forEach(System.out::println);

        LongStream.of(1L, 2L, 3L, 4L, 5L)
                .filter(value -> (value % 2 == 0))
                .forEach(System.out::println);
    }


    @Test
    public void doubleStreamFilter() {

        DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0)
                .filter(new DoublePredicate() {
                    @Override
                    public boolean test(double value) {
                        return (value % 2 == 0);
                    }
                }).forEach(System.out::println);

        DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0)
                .filter((double value) -> {
                    return (value % 2 == 0);
                }).forEach(System.out::println);

        DoubleStream.of(1.0, 2.0, 3.0, 4.0, 5.0)
                .filter(value -> (value % 2 == 0))
                .forEach(System.out::println);
    }

    @Test
    public void mapFilter() {
        final Map<Integer, String> names = new HashMap<Integer, String>() {
            {
                put(1, "adarsh");
                put(2, "amit");
                put(3, "radha");
                put(4, "sonu");
            }
        };


        names.entrySet()
                .stream()
                .filter(new Predicate<Map.Entry<Integer, String>>() {
                    @Override
                    public boolean test(Map.Entry<Integer, String> entry) {
                        return entry.getValue().contains("a");
                    }
                }).collect(
                Collectors.toMap(entry -> entry.getKey()
                        , entry -> entry.getValue().toUpperCase()
                )
        ).forEach((key, value) -> System.out.println(key + " " + value));

        names.entrySet()
                .stream()
                .filter((Map.Entry<Integer, String> entry) -> {
                    return entry.getValue().contains("a");
                }).collect(
                Collectors.toMap(entry -> entry.getKey()
                        , entry -> entry.getValue().toUpperCase()
                )
        ).forEach((key, value) -> System.out.println(key + " " + value));

        names.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains("a"))
                .collect(
                        Collectors.toMap(entry -> entry.getKey()
                                , entry -> entry.getValue().toUpperCase()
                        )
                ).forEach((key, value) -> System.out.println(key + " " + value));
    }

}
