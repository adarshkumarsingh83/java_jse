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

import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Stream_mapToObject_Example {

    @Test
    public void intToObjectStream() {

        IntStream.of(1, 2, 3)
                .mapToObj(new IntFunction<Object>() {
                    @Override
                    public Object apply(int value) {
                        return System.getProperty("user.name") + "_" + value;
                    }
                }).forEach(System.out::println);

        IntStream.of(1, 2, 3)
                .mapToObj((int value) -> {
                    return System.getProperty("user.name") + "_" + value;
                }).forEach(System.out::println);

        IntStream.of(1, 2, 3)
                .mapToObj(value -> System.getProperty("user.name") + "_" + value)
                .forEach(System.out::println);
    }

    @Test
    public void objectToIntStream() {

        Stream.of("1", "2", "3")
                .mapToInt(new ToIntFunction<String>() {
                    @Override
                    public int applyAsInt(String value) {
                        return Integer.parseInt(value);
                    }
                })
                .mapToObj(new IntFunction<Object>() {
                    @Override
                    public Object apply(int value) {
                        return System.getProperty("user.name") + "_" + value;
                    }
                }).forEach(System.out::println);

        Stream.of("1", "2", "3")
                .mapToInt((String value) -> {
                    return Integer.parseInt(value);
                })
                .mapToObj((int value) -> {
                    return System.getProperty("user.name") + "_" + value;
                }).forEach(System.out::println);

        Stream.of("1", "2", "3")
                .mapToInt(value -> Integer.parseInt(value))
                .mapToObj(value -> System.getProperty("user.name") + "_" + value)
                .forEach(System.out::println);
    }


    @Test
    public void longToObjectStream() {

        LongStream.of(1L, 2L, 3L)
                .mapToObj(new LongFunction<Object>() {
                    @Override
                    public Object apply(long value) {
                        return System.getProperty("user.name") + "_" + value;
                    }
                }).forEach(System.out::println);

        LongStream.of(1L, 2L, 3L)
                .mapToObj((long value) -> {
                    return System.getProperty("user.name") + "_" + value;
                }).forEach(System.out::println);

        LongStream.of(1L, 2L, 3L)
                .mapToObj(value -> System.getProperty("user.name") + "_" + value)
                .forEach(System.out::println);
    }

    @Test
    public void objectToLongStream() {

        Stream.of("1", "2", "3")
                .mapToLong(new ToLongFunction<String>() {
                    @Override
                    public long applyAsLong(String value) {
                        return Long.parseLong(value);
                    }
                })
                .mapToObj(new LongFunction<Object>() {
                    @Override
                    public Object apply(long value) {
                        return System.getProperty("user.name") + "_" + value;
                    }
                })
                .forEach(System.out::println);

        Stream.of("1", "2", "3")
                .mapToLong((String value) -> {
                    return Long.parseLong(value);
                })
                .mapToObj((long value) -> {
                    return System.getProperty("user.name") + "_" + value;
                }).forEach(System.out::println);

        Stream.of("1", "2", "3")
                .mapToLong(value -> Long.parseLong(value))
                .mapToObj(value -> System.getProperty("user.name") + "_" + value)
                .forEach(System.out::println);
    }


    @Test
    public void doubleToObjectStream() {

        DoubleStream.of(1.0, 2.0, 3.0)
                .mapToObj(new DoubleFunction<Object>() {
                    @Override
                    public Object apply(double value) {
                        return System.getProperty("user.name") + "_" + value;
                    }
                }).forEach(System.out::println);

        DoubleStream.of(1.0, 2.0, 3.0)
                .mapToObj((double value) -> {
                    return System.getProperty("user.name") + "_" + value;
                }).forEach(System.out::println);

        DoubleStream.of(1.0, 2.0, 3.0)
                .mapToObj(value -> System.getProperty("user.name") + "_" + value)
                .forEach(System.out::println);
    }

    @Test
    public void objectToDoubleStream() {

        Stream.of("1.0", "2.0", "3.0")
                .mapToDouble(new ToDoubleFunction<String>() {
                    @Override
                    public double applyAsDouble(String value) {
                        return Double.parseDouble(value);
                    }
                })
                .mapToObj(new DoubleFunction<Object>() {
                    @Override
                    public Object apply(double value) {
                        return System.getProperty("user.name") + "_" + value;
                    }
                }).forEach(System.out::println);


        Stream.of("1.0", "2.0", "3.0")
                .mapToDouble((String value) -> {
                    return Double.parseDouble(value);
                })
                .mapToObj((double value) -> {
                    return System.getProperty("user.name") + "_" + value;
                }).forEach(System.out::println);

        Stream.of("1.0", "2.0", "3.0")
                .mapToDouble(value -> Double.parseDouble(value))
                .mapToObj(value -> System.getProperty("user.name") + "_" + value)
                .forEach(System.out::println);
    }

}
