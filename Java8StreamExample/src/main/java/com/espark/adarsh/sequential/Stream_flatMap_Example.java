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

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
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
public class Stream_flatMap_Example {


    @Test
    public void method1() {

        class Person {
            private String personName;

            public Person(String personName) {
                this.personName = personName;
            }
        }

        class PersonDetails {
            private List<Person> personList = new ArrayList<Person>();

            public PersonDetails(Person person) {
                this.personList.add(person);
            }
        }

        /**
         personList:[
                     PersonDetails:[Person.personName:adarsh kumar_0]
                     PersonDetails:[Person.personName:adarsh kumar_1]
                     PersonDetails:[Person.personName:adarsh kumar_2]
                     PersonDetails:[Person.personName:adarsh kumar_3]
                     PersonDetails:[Person.personName:adarsh kumar_4]
         ]

         { adarsh kumar_0,adarsh kumar_1,adarsh kumar_2,adarsh kumar_3,adarsh kumar_4 }
         */
        final List<PersonDetails> personList = new ArrayList<PersonDetails>();
        for (int i = 0; i < 5; i++) {
            personList.add(new PersonDetails(new Person(System.getProperty("user.name") + "_" + i)));
        }

        personList.stream()
                .flatMap(personDetails -> personDetails.personList.stream())
                .forEach(person -> System.out.println(person.personName));
    }


    @Test
    public void streamFlatMapExample() {
        final String[][] namesArray = new String[][]{
                {"adarsh", "radha"}
                , {"amit", "deepika"}
                , {"niranjan", "usha"}
        };

        Stream<String[]> namesArrayStream = Arrays.stream(namesArray);
        Stream<String> nameStringStream = namesArrayStream.flatMap(nameValue -> Arrays.stream(nameValue));
        Stream<String> stream = nameStringStream.filter(nameValue -> nameValue.contains("a"));
        stream.forEach(System.out::println);

        Arrays.stream(namesArray)
                .flatMap(nameValue -> Arrays.stream(nameValue))
                .filter(nameValue -> nameValue.contains("a"))
                .forEach((element)->System.out.print(element+" "));

    }


    @Test
    public void intStreamFlatMapExample() {

        final int[][] myNumbers = new int[][]{
                {1, 2, 3}
                , {4, 5, 6}
                , {7, 8, 9}
        };

        Arrays.stream(myNumbers)
                .flatMapToInt(myNumbersElementArray -> Arrays.stream(myNumbersElementArray))
                .forEach((element)->System.out.print(element+" "));
        System.out.println();

        Arrays.stream(myNumbers)
                .flatMapToInt(myNumbersElementArray -> IntStream.of(myNumbersElementArray))
                .forEach((element)->System.out.print(element+" "));
        System.out.println();

        Stream.of(myNumbers)
                .flatMapToInt(IntStream::of)
                .forEach((element)->System.out.print(element+" "));
        System.out.println();
    }


    @Test
    public void longStreamFlatMapExample() {

        final long[][] myNumbers = new long[][]{
                {1L, 2L, 3L}
                , {4L, 5L, 6L}
                , {7L, 8L, 9L}
        };

        Arrays.stream(myNumbers)
                .flatMapToLong(myNumbersElementArray -> Arrays.stream(myNumbersElementArray))
                .forEach((element)->System.out.print(element+" "));
        System.out.println();

        Arrays.stream(myNumbers)
                .flatMapToLong(myNumbersElementArray -> LongStream.of(myNumbersElementArray))
                .forEach((element)->System.out.print(element+" "));
        System.out.println();

        Stream.of(myNumbers)
                .flatMapToLong(LongStream::of)
                .forEach((element)->System.out.print(element+" "));
        System.out.println();
    }


    @Test
    public void doubleStreamFlatMapExample() {

        final double[][] myNumbers = new double[][]{
                {1.2, 2.1, 3.6}
                , {4.5, 5.7, 6.0}
                , {7.5, 8.0, 9.9}
        };

        Arrays.stream(myNumbers)
                .flatMapToDouble(myNumbersElementArray -> Arrays.stream(myNumbersElementArray))
                .forEach((element)->System.out.print(element+" "));
        System.out.println();

        Arrays.stream(myNumbers)
                .flatMapToDouble(myNumbersElementArray -> DoubleStream.of(myNumbersElementArray))
                .forEach((element)->System.out.print(element+" "));
        System.out.println();

        Stream.of(myNumbers)
                .flatMapToDouble(DoubleStream::of)
                .forEach((element)->System.out.print(element+" "));
        System.out.println();
    }
}
