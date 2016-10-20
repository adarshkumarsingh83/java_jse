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
package com.espark.adarsh.parallel;

import org.junit.Test;

import java.util.*;
import java.util.concurrent.ForkJoinPool;
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
public class ParallelStreamExample {

    @Test
    public void sequentialStreamTest() {
        Stream.of("adarsh", "radha", "amit", "sonu", "monu")
                .sequential()
                .map(element -> {
                    return Thread.currentThread().getName() + "=> " + element;
                }).forEach(System.out::println);
    }

    @Test
    public void parallelStreamTest() {
        Stream.of("adarsh", "radha", "amit", "sonu", "monu")
                .parallel()
                .map(element -> {
                    return Thread.currentThread().getName() + "=> " + element;
                }).forEach(System.out::println);
    }


    @Test
    public void sequentialTest() {

        IntStream.range(0, 10)
                .sequential()
                .mapToObj(element -> {
                    return "IntStream " + Thread.currentThread().getName() + "=> " + element;
                }).forEach(System.out::println);

        System.out.println("");
        LongStream.range(0, 10)
                .sequential()
                .mapToObj(element -> {
                    return "LongStream " + Thread.currentThread().getName() + "=> " + element;
                }).forEach(System.out::println);

        System.out.println("");
        DoubleStream.of(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
                .sequential()
                .mapToObj(element -> {
                    return "DoubleStream " + Thread.currentThread().getName() + "=> " + element;
                }).forEach(System.out::println);
    }


    @Test
    public void parallelTest() {
        IntStream.range(0, 10)
                .parallel()
                .mapToObj(element -> {
                    return "IntStream " + Thread.currentThread().getName() + "=> " + element;
                }).forEach(System.out::println);

        System.out.println("");
        LongStream.range(0, 10)
                .parallel()
                .mapToObj(element -> {
                    return "LongStream " + Thread.currentThread().getName() + "=> " + element;
                }).forEach(System.out::println);

        System.out.println("");
        DoubleStream.of(0.0, 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)
                .parallel()
                .mapToObj(element -> {
                    return "DoubleStream " + Thread.currentThread().getName() + "=> " + element;
                }).forEach(System.out::println);
    }


    @Test
    public void sequentialThreadCountTest() {

        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool.getParallelism());

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = Arrays.asList(intArray);
        listOfIntegers
                .stream()
                .map(e -> {
                    return Thread.currentThread().getName() + " ==> " + e;
                }).forEach(System.out::println);

    }


    //  -Djava.util.concurrent.ForkJoinPool.common.parallelism=5
    @Test
    public void parallelThreadCountTest() {

        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool.getParallelism());

        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        List<Integer> listOfIntegers = Arrays.asList(intArray);
        listOfIntegers
                .parallelStream()
                .map(e -> {
                    return Thread.currentThread().getName() + " ==> " + e;
                }).forEach(System.out::println);

    }


    //  -Djava.util.concurrent.ForkJoinPool.common.parallelism=5
    @Test
    public void main1() {

        ForkJoinPool commonPool = ForkJoinPool.commonPool();
        System.out.println(commonPool.getParallelism());
        String[] data = {"a1", "a2", "b1", "b2", "c1", "c2", "d1", "d2", "e1", "e2", "f1", "f2"};

        List<String> list = Arrays.asList(data);
        list.parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));


        System.out.println("\n");
        Set<String> set = new HashSet<String>(Arrays.asList(data));
        set.parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));
    }


    //  -Djava.util.concurrent.ForkJoinPool.common.parallelism=5
    @Test
    public void main2() {

        String[] data = {"a1", "e2", "f1", "b1", "c2", "d1", "f2", "a2", "d2", "b2", "c1", "e1"};

        List<String> list = Arrays.asList(data);

        list.stream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.format("sort: %s <> %s [%s]\n",
                            s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));

        list.parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.format("sort: %s <> %s [%s]\n",
                            s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));


        System.out.println("\n");
        Set<String> set = new HashSet<String>(Arrays.asList(data));
        set.parallelStream()
                .filter(s -> {
                    System.out.format("filter: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return true;
                })
                .map(s -> {
                    System.out.format("map: %s [%s]\n",
                            s, Thread.currentThread().getName());
                    return s.toUpperCase();
                })
                .sorted((s1, s2) -> {
                    System.out.format("sort: %s <> %s [%s]\n",
                            s1, s2, Thread.currentThread().getName());
                    return s1.compareTo(s2);
                })
                .forEach(s -> System.out.format("forEach: %s [%s]\n",
                        s, Thread.currentThread().getName()));

    }

    @Test
    public void performanceTest() {

        class Person {

            String name;
            int age;

            Person(String name, int age) {
                this.name = name;
                this.age = age;
            }

            @Override
            public String toString() {
                return name;
            }
        }

        List<Person> persons = Arrays.asList(
                new Person("Adarsh", 33),
                new Person("Radha", 30),
                new Person("Amit", 30),
                new Person("Sonu", 12),
                new Person("Monu", 12)
        );

        long startTimeSequentialStream = System.currentTimeMillis();
        int totalAgeSequentialStream = persons.stream()
                .reduce(0,
                        (sum, p) -> {
                            System.out.format("accumulator: sum=%s; person=%s [%s]\n",
                                    sum, p, Thread.currentThread().getName());
                            return sum += p.age;
                        },
                        (sum1, sum2) -> {
                            System.out.format("combiner: sum1=%s; sum2=%s [%s]\n",
                                    sum1, sum2, Thread.currentThread().getName());
                            return sum1 + sum2;
                        });
        long endTimeSequentialStream = System.currentTimeMillis();
        System.out.println("Total Age Sequential Stream " + totalAgeSequentialStream
                + " Time Taken " + (endTimeSequentialStream - startTimeSequentialStream));

        System.out.println("\n");
        long startTimeParallelStream = System.currentTimeMillis();
        int totalAgeParallelStream = persons.parallelStream()
                .reduce(0,
                        (sum, p) -> {
                            System.out.format("accumulator: sum=%s; person=%s [%s]\n",
                                    sum, p, Thread.currentThread().getName());
                            return sum += p.age;
                        },
                        (sum1, sum2) -> {
                            System.out.format("combiner: sum1=%s; sum2=%s [%s]\n",
                                    sum1, sum2, Thread.currentThread().getName());
                            return sum1 + sum2;
                        });
        long endTimeParallelStream = System.currentTimeMillis();
        System.out.println("Total Age Parallel Stream " + totalAgeParallelStream
                + " Time Taken " + (endTimeParallelStream - startTimeParallelStream));
    }


}
