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

import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Stream;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Stream_mapToXxx_Example {

    @Test
    public void intToLongStream() {
        /* int to long */
        Stream.of(1, 2, 3)
                .mapToLong(new ToLongFunction<Integer>() {
                    @Override
                    public long applyAsLong(Integer value) {
                        return value.longValue();
                    }
                }).forEach(System.out::println);

        Stream.of(1, 2, 3)
                .mapToLong((Integer value) -> {
                    return value.longValue();
                }).forEach(System.out::println);

        Stream.of(1, 2, 3)
                .mapToLong(value -> value.longValue()
                ).forEach(System.out::println);

        Stream.of(1, 2, 3)
                .mapToLong(Integer::longValue)
                .forEach(System.out::println);
    }

    @Test
    public void intToDoubleStream() {
         /* int to double */
        Stream.of(1, 2, 3)
                .mapToDouble(new ToDoubleFunction<Integer>() {
                    @Override
                    public double applyAsDouble(Integer value) {
                        return value.doubleValue();
                    }
                }).forEach(System.out::println);

        Stream.of(1, 2, 3)
                .mapToDouble((Integer value) -> {
                    return value.doubleValue();
                }).forEach(System.out::println);

        Stream.of(1, 2, 3)
                .mapToDouble(value -> value.doubleValue()
                ).forEach(System.out::println);

        Stream.of(1, 2, 3)
                .mapToDouble(Integer::doubleValue)
                .forEach(System.out::println);
    }


    @Test
    public void longToIntStream() {
         /* long to int */
        Stream.of(1L, 2L, 3L)
                .mapToInt(new ToIntFunction<Long>() {
                    @Override
                    public int applyAsInt(Long value) {
                        return value.intValue();
                    }
                }).forEach(System.out::println);

        Stream.of(1L, 2L, 3L)
                .mapToInt((Long value) -> {
                    return value.intValue();
                }).forEach(System.out::println);

        Stream.of(1L, 2L, 3L)
                .mapToInt(value -> value.intValue()
                ).forEach(System.out::println);

        Stream.of(1L, 2L, 3L)
                .mapToInt(Long::intValue)
                .forEach(System.out::println);
    }

    @Test
    public void longToDoubleStream() {
        /* long to double */
        Stream.of(1L, 2L, 3L)
                .mapToDouble(new ToDoubleFunction<Long>() {
                    @Override
                    public double applyAsDouble(Long value) {
                        return value.doubleValue();
                    }
                }).forEach(System.out::println);

        Stream.of(1L, 2L, 3L)
                .mapToDouble((Long value) -> {
                    return value.doubleValue();
                }).forEach(System.out::println);

        Stream.of(1L, 2L, 3L)
                .mapToDouble(value -> value.doubleValue())
                .forEach(System.out::println);

        Stream.of(1L, 2L, 3L)
                .mapToDouble(Long::doubleValue)
                .forEach(System.out::println);
    }


    @Test
    public void doubleToIntStream() {
          /* double to int */

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(new ToIntFunction<Double>() {
                    @Override
                    public int applyAsInt(Double value) {
                        return value.intValue();
                    }
                }).forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt((Double value) -> {
                    return value.intValue();
                }).forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(value -> value.intValue())
                .forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToInt(Double::intValue)
                .forEach(System.out::println);
    }

    @Test
    public void doubleToLongStream() {
          /* double to long */

        Stream.of(1.0, 2.0, 3.0)
                .mapToLong(new ToLongFunction<Double>() {
                    @Override
                    public long applyAsLong(Double value) {
                        return value.longValue();
                    }
                }).forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToLong((Double value) -> {
                    return value.longValue();
                }).forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToLong(value -> value.longValue())
                .forEach(System.out::println);

        Stream.of(1.0, 2.0, 3.0)
                .mapToLong(Double::longValue)
                .forEach(System.out::println);
    }
}
