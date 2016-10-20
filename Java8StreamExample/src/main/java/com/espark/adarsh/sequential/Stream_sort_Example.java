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

import java.util.*;
import java.util.concurrent.SynchronousQueue;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.*;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Stream_sort_Example {


        /* ========sorting element in the streams ======== */

    @Test
    public void sortingOnString() {
        Stream.of("radha", "amit", "sonu", "adarsh", "monu")
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    public void sortingOnInteger() {
        IntStream.of(4, 2, 5, 10, 0, 2)
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    public void sortingOnLong() {
        LongStream.of(4L, 2L, 5L, 10L, 0L, 2L)
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    public void sortingOnDouble() {
        DoubleStream.of(4.2, 2.4, 5.0, 10, 0.1, 2.0)
                .sorted()
                .forEach(System.out::println);
    }


    /* ========sorting object in list set map ======== */

    @Test
    public void testSetSorting() {
        Set<Integer> integerSet = new HashSet<Integer>() {
            {
                add(5);
                add(1);
                add(3);
                add(2);
                add(4);
            }
        };

        integerSet.stream()
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer value1, Integer value2) {
                        return value1 - value2;
                    }
                }).forEachOrdered(value -> System.out.println(value));
        System.out.println("");

        integerSet.stream()
                .sorted((Integer value1, Integer value2) -> {
                    return value1 - value2;
                }).forEachOrdered(value -> System.out.println(value));
        System.out.println("");

        integerSet.stream()
                .sorted((value1, value2) -> value1 - value2)
                .forEachOrdered(value -> System.out.println(value));
        System.out.println("");

        integerSet.stream()
                .sorted((value1, value2) -> value1.compareTo(value2))
                .forEachOrdered(value -> System.out.println(value));
    }

    @Test
    public void testListSorting() {
        List<Integer> integerList = new ArrayList<Integer>() {
            {
                add(5);
                add(1);
                add(3);
                add(2);
                add(4);
            }
        };

        integerList.stream()
                .sorted(new Comparator<Integer>() {
                    @Override
                    public int compare(Integer value1, Integer value2) {
                        return value1 - value2;
                    }
                }).forEachOrdered(value -> System.out.println(value));
        System.out.println("");

        integerList.stream()
                .sorted((Integer value1, Integer value2) -> {
                    return value1 - value2;
                }).forEachOrdered(value -> System.out.println(value));
        System.out.println("");

        integerList.stream()
                .sorted((value1, value2) -> value1 - value2)
                .forEachOrdered(value -> System.out.println(value));
        System.out.println("");

        integerList.stream()
                .sorted((value1, value2) -> value1.compareTo(value2))
                .forEachOrdered(value -> System.out.println(value));
    }

    @Test
    public void testMapSorting() {
        final Map<Integer, String> data = new HashMap<Integer, String>() {
            {
                put(1, "f");
                put(4, "c");
                put(6, "a");
                put(2, "e");
                put(5, "b");
                put(3, "d");
            }
        };

        //approach 1
        data.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey())
                .forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        System.out.println("");

        //approach 2
        data.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        System.out.println("");

        //approach 3
        data.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByValue())
                .forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
        System.out.println("");

        //approach 4
        data.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, String>comparingByValue().reversed())
                .forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //approach 5
        data.entrySet()
                .stream()
                .sorted(new Comparator<Map.Entry<Integer, String>>() {
                    @Override
                    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }).forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //approach 6
        data.entrySet()
                .stream()
                .sorted((Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) -> {
                    return o1.getValue().compareTo(o2.getValue());
                }).forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //approach 7
        data.entrySet()
                .stream()
                .sorted((o1, o2) -> {
                    return o1.getValue().compareTo(o2.getValue());
                }).forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //approach 8
        data.entrySet()
                .stream()
                .sorted(new Comparator<Map.Entry<Integer, String>>() {
                    @Override
                    public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                }).forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //approach 9
        data.entrySet()
                .stream()
                .sorted((Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) -> {
                    return o1.getKey().compareTo(o2.getKey());
                }).forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        //approach 10
        data.entrySet()
                .stream()
                .sorted((o1, o2) -> {
                    return o1.getKey().compareTo(o2.getKey());
                }).forEachOrdered(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }



    /* ========sorting custom object in list set map ======== */

    @Test
    public void sortingOnCustomObjectInList() {

        class Person {

            Integer personId;
            String personName;

            public Person(Integer personId, String personName) {
                this.personId = personId;
                this.personName = personName;
            }

            public Integer getPersonId() {
                return personId;
            }

            public void setPersonId(Integer personId) {
                this.personId = personId;
            }

            public String getPersonName() {
                return personName;
            }

            public void setPersonName(String personName) {
                this.personName = personName;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "personId=" + personId +
                        ", personName='" + personName + '\'' +
                        '}';
            }
        }

        final List<Person> personList = new ArrayList<Person>() {
            {
                add(new Person(105, "monu"));
                add(new Person(100, "adarsh"));
                add(new Person(102, "amit"));
                add(new Person(104, "sonu"));
                add(new Person(103, "radha"));
            }
        };

        //approach 1
        personList
                .stream()
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person person1, Person person2) {
                        return person1.getPersonId() - person2.getPersonId();
                    }
                })
                .forEach(person -> System.out.println(person));
        System.out.println("");

        //approach 2
        personList
                .stream()
                .sorted((Person person1, Person person2) -> {
                    return person1.getPersonId() - person2.getPersonId();
                })
                .forEach(person -> System.out.println(person));
        System.out.println("");


        //approach 3
        personList
                .stream()
                .sorted((Person person1, Person person2) -> person1.getPersonId() - person2.getPersonId())
                .forEach(person -> System.out.println(person));
        System.out.println("");

        //approach 4
        personList
                .stream()
                .sorted((Person person1, Person person2) -> person1.getPersonName().compareTo(person2.getPersonName()))
                .forEach(person -> System.out.println(person));
    }


    @Test
    public void sortingOnCustomObjectInSet() {

        class Person implements Comparable {

            Integer personId;
            String personName;

            public Person(Integer personId, String personName) {
                this.personId = personId;
                this.personName = personName;
            }

            public Integer getPersonId() {
                return personId;
            }

            public void setPersonId(Integer personId) {
                this.personId = personId;
            }

            public String getPersonName() {
                return personName;
            }

            public void setPersonName(String personName) {
                this.personName = personName;
            }


            @Override
            public int compareTo(Object o) {
                return this.personId - ((Person) o).personId;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "personId=" + personId +
                        ", personName='" + personName + '\'' +
                        '}';
            }
        }

        final LinkedHashSet<Person> personSet = new LinkedHashSet<Person>() {
            {
                add(new Person(105, "monu"));
                add(new Person(100, "adarsh"));
                add(new Person(102, "amit"));
                add(new Person(104, "sonu"));
                add(new Person(103, "radha"));
            }
        };

        //approach 1
        personSet
                .stream()
                .sorted(new Comparator<Person>() {
                    @Override
                    public int compare(Person person1, Person person2) {
                        return person1.getPersonId() - person2.getPersonId();
                    }
                }).forEach(person -> System.out.println(person));
        System.out.println("");

        //approach 2
        personSet
                .stream()
                .sorted((Person person1, Person person2) -> {
                    return person1.getPersonId() - person2.getPersonId();
                })
                .forEach(person -> System.out.println(person));
        System.out.println("");

        //approach 3
        personSet
                .stream()
                .sorted((Person person1, Person person2) -> person1.getPersonId() - person2.getPersonId())
                .forEach(person -> System.out.println(person));
        System.out.println("");

        //approach 4
        personSet
                .stream()
                .sorted((Person person1, Person person2) -> person1.getPersonName().compareTo(person2.getPersonName()))
                .forEach(person -> System.out.println(person));
    }


    @Test
    public void sortingOnCustomObjectInMap() {

        class Person implements Comparable {

            Integer personId;
            String personName;

            public Person(Integer personId, String personName) {
                this.personId = personId;
                this.personName = personName;
            }

            public Integer getPersonId() {
                return personId;
            }

            public void setPersonId(Integer personId) {
                this.personId = personId;
            }

            public String getPersonName() {
                return personName;
            }

            public void setPersonName(String personName) {
                this.personName = personName;
            }


            @Override
            public int compareTo(Object o) {
                return this.personId - ((Person) o).personId;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "personId=" + personId +
                        ", personName='" + personName + '\'' +
                        '}';
            }
        }
        //approach 1
        final Map<Integer, Person> personMap = new LinkedHashMap<Integer, Person>() {
            {
                put(1, new Person(105, "monu"));
                put(2, new Person(100, "adarsh"));
                put(3, new Person(102, "amit"));
                put(4, new Person(104, "sonu"));
                put(5, new Person(103, "radha"));
            }
        };
        Map<Integer, Person> collect = (Map<Integer, Person>) personMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Person>comparingByValue())
                .collect(
                        Collectors.toMap((Map.Entry<Integer, Person> entry) -> entry.getKey()
                                , (Map.Entry<Integer, Person> entry) -> entry.getValue()
                        )
                );
        collect.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();


        //approach 2
        personMap.entrySet()
                .stream()
                .sorted(new Comparator<Map.Entry<Integer, Person>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) {
                        return o1.getKey().compareTo(o2.getKey());
                    }
                }).forEach(System.out::println);
        System.out.println();

        //approach 3
        personMap.entrySet().stream()
                .sorted((Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) -> {
                    return o1.getKey().compareTo(o2.getKey());
                }).forEach(System.out::println);
        System.out.println();

        //approach 4
        personMap.entrySet()
                .stream()
                .sorted((o1, o2) -> o1.getKey().compareTo(o2.getKey())
                ).forEach(System.out::println);
        System.out.println();

        //approach 5
        personMap.entrySet()
                .stream()
                .sorted(new Comparator<Map.Entry<Integer, Person>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) {
                        return o1.getValue().compareTo(o2.getValue());
                    }
                }).forEach(System.out::println);
        System.out.println();

        //approach 6
        personMap.entrySet().stream()
                .sorted((Map.Entry<Integer, Person> o1, Map.Entry<Integer, Person> o2) -> {
                    return o1.getValue().compareTo(o2.getValue());
                }).forEach(System.out::println);
        System.out.println();

        //approach 7
        personMap.entrySet().stream()
                .sorted((o1, o2) -> o1.getValue().compareTo(o2.getValue())
                ).forEach(System.out::println);
        System.out.println();

        //approach 8
        personMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Integer, Person>comparingByKey().reversed())
                .forEach(System.out::println);
    }
}
