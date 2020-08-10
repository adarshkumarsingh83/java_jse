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

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Stream_map_reduce_Example {

    @Test
    public void mapStreamString() {

        Stream.of("adarsh1", "amit2", "radja3")
                .map(new Function<String, Object>() {
                    @Override
                    public Object apply(String s) {
                        return s.substring(0, s.length() - 1).toUpperCase();
                    }
                }).forEach(System.out::println);
        System.out.println();

        Stream.of("adarsh1", "amit2", "radja3")
                .map((String s) -> {
                    return s.substring(0, s.length() - 1).toUpperCase();
                }).forEach(System.out::println);
        System.out.println();

        Stream.of("adarsh1", "amit2", "radja3")
                .map(s -> s.substring(0, s.length() - 1).toUpperCase())
                .forEach(System.out::println);
    }

    @Test
    public void mapStreamInteger() {
        Stream.of(1, 2, 3, 4, 5)
                .map(new Function<Integer, Object>() {
                    @Override
                    public Object apply(Integer integer) {
                        return integer * integer;
                    }
                }).forEach(System.out::println);
        System.out.println();

        Stream.of(1, 2, 3, 4, 5)
                .map((Integer integer) -> {
                    return integer * integer;
                }).forEach(System.out::println);
        System.out.println();

        Stream.of(1, 2, 3, 4, 5)
                .map(s -> (s * s))
                .forEach(System.out::println);
    }

    @Test
    public void reduceStreamStringOperation() {
        String[] myArray = {"adarsh", "kumar", "singh", "radha", "singh"};
        String result1 = Arrays.stream(myArray)
                .reduce("", new BinaryOperator<String>() {
                    @Override
                    public String apply(String s1, String s2) {
                        return s1 + s2;
                    }
                });
        System.out.println(result1);


        String result2 = Arrays.stream(myArray)
                .reduce("", (String s1, String s2)-> {
                        return s1 + s2;
               });
        System.out.println(result2);


        String result3 = Arrays.stream(myArray)
                .reduce("", (a, b) -> a + b);
        System.out.println(result3);
    }

    @Test
    public void reduceStreamIntegerOperation() {
        Integer[] myArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer result1 = Arrays.stream(myArray)
                .reduce(0,new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer1, Integer integer2) {
                        return integer1+integer2;
                    }
                });
        System.out.println(result1);


        Integer result2 = Arrays.stream(myArray)
                .reduce(0,(Integer integer1, Integer integer2)-> {
                        return integer1+integer2;
                });
        System.out.println(result2);

        Integer result3 = Arrays.stream(myArray)
                .reduce(0, (a, b) -> a + b);
        System.out.println(result3);
    }


    @Test
    public void streamSumExample(){
       int sumResult= IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .sum();
        System.out.println("sum "+sumResult);
    }

    @Test
    public void streamMinExample(){
        OptionalInt minResult= IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,0)
                .min();
        System.out.println("min "+minResult.getAsInt());
    }

    @Test
    public void streamCountExample(){
        long countResult= IntStream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .count();
        System.out.println("count "+countResult);
    }

}
