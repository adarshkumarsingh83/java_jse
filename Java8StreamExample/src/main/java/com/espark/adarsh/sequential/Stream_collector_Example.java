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

import com.sun.java_cup.internal.runtime.virtual_parse_stack;
import org.junit.Test;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.*;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Stream_collector_Example {

   /*======================= toCollection() toList() toSet() toMap()===========================*/

    @Test
    public void streamCollect_toCollection() {
        Collection collection =
                Stream.of(1, 2, 3, 4, 5)
                        .filter(value -> true)
                        .collect(Collectors.toCollection(ArrayList::new));
        collection.forEach(System.out::println);
    }

    @Test
    public void streamCollect_toArray() {
        String[] names = new String[]{"adarsh", "amit", "radha", "sonu", "monu","joe"};
        Stream<String> namesStream = Arrays.stream(names);
        namesStream.forEach(System.out::println);

        String[] nameNewArray = Arrays.stream(names)
                .filter(name -> name.length() > 4)
                .toArray(String[]::new);

        System.out.println("");
        Arrays.stream(nameNewArray).forEach(System.out::println);
    }

    @Test
    public void streamCollect_toList() {
        List list = Stream.of(1, 2, 3, 4, 5)
                .filter(value -> true)
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }


    @Test
    public void streamCollect_toSet() {
        Set set = Stream.of(1, 2, 3, 4, 5)
                .filter(value -> true)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
    }


    @Test
    public void mapStreamFilterCollector_toMap() {
        Map<Integer, String> names = new HashMap<Integer, String>() {
            {
                put(1, "adarsh");
                put(2, "amit");
                put(3, "radha");
                put(4, "sonu");
            }
        };
        names.entrySet()
                .stream()
                .filter(value -> true)
                .collect(
                        Collectors.toMap(entry -> entry.getKey()
                                , entry -> entry.getValue().toUpperCase()
                        )
                ).forEach((key, value) -> System.out.println(key + " " + value));
    }

  /*====================joining()=========================================================*/

    @Test
    public void listJoiningCollect_joining() {
        List<String> list = new ArrayList<String>() {
            {
                add("1");
                add("2");
                add("3");
                add("4");
                add("5");
            }
        };
        String result = list.stream()
                .collect(Collectors.joining(" | ", "{ ", " }"));
        System.out.println("Response Data " + result);
    }

    @Test
    public void setJoiningCollect_joining() {
        Set<String> set = new HashSet<String>() {
            {
                add("1");
                add("2");
                add("3");
                add("4");
                add("5");
            }
        };
        String result = set.stream()
                .collect(Collectors.joining(" | ", "{ ", " }"));
        System.out.println("Response Data " + result);
    }

    @Test
    public void mapJoiningCollector_joining() {
        Map<Integer, String> names = new HashMap<Integer, String>() {
            {
                put(1, "adarsh");
                put(2, "amit");
                put(3, "radha");
                put(4, "sonu");
            }
        };
        String newName = names.entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .collect(Collectors.joining(" | ", "{ ", " }"));
        System.out.println(("Response Date " + newName));
    }

    @Test
    public void streamJoin() {

        class Person {

            String personId;
            String personName;

            public Person(String personId, String personName) {
                this.personId = personId;
                this.personName = personName;
            }

            public String getPersonId() {
                return personId;
            }

            public void setPersonId(String personId) {
                this.personId = personId;
            }

            public String getPersonName() {
                return personName;
            }

            public void setPersonName(String personName) {
                this.personName = personName;
            }
        }

        final List<Person> personList = new ArrayList<Person>() {
            {
                add(new Person("100", "adarsh"));
                add(new Person("102", "amit"));
                add(new Person("103", "radha"));
            }
        };
        String result = personList.stream()
                .map(person -> person.getPersonName())
                .collect(Collectors.joining(", ", "{", "}"));
        System.out.println("Response Data " + result);

    }
    
  /*=========================map toList() map toSet() map toCollection()===============================*/

    @Test
    public void mapStreamCollector_toList() {
        Map<Integer, String> names = new HashMap<Integer, String>() {
            {
                put(1, "adarsh");
                put(2, "amit");
                put(3, "radha");
                put(4, "sonu");
            }
        };
        List list = names.entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    @Test
    public void mapStreamCollector_toSet() {
        Map<Integer, String> names = new HashMap<Integer, String>() {
            {
                put(1, "adarsh");
                put(2, "amit");
                put(3, "radha");
                put(4, "sonu");
            }
        };
        Set set = names.entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
    }

    @Test
    public void mapStreamCollector_toCollection() {
        Map<Integer, String> names = new HashMap<Integer, String>() {
            {
                put(1, "adarsh");
                put(2, "amit");
                put(3, "radha");
                put(4, "sonu");
            }
        };
        Collection collection = names.entrySet()
                .stream()
                .map(entry -> entry.getValue())
                .collect(Collectors.toCollection(ArrayList::new));
        collection.forEach(System.out::println);
    }


    @Test
    public void mapStreamCollector_toMap() {
        Map<Integer, String> names = new HashMap<Integer, String>() {
            {
                put(1, "adarsh");
                put(2, "amit");
                put(3, "radha");
                put(4, "sonu");
            }
        };
        Map<Integer, String> newNames = names.entrySet()
                .stream()
                .map(entry -> entry)
                .collect(
                        Collectors.toMap(entry -> entry.getKey()
                                , entry -> entry.getValue().toUpperCase()
                        )
                );
        newNames.forEach((key, value) -> System.out.println(key + " " + value));
    }

 /*==========================  Conversion List toMap() Set toMap() ===================================================*/

    @Test
    public void listToMapConversion() {

        class Person {

            String personId;
            String personName;

            public Person(String personId, String personName) {
                this.personId = personId;
                this.personName = personName;
            }

            public String getPersonId() {
                return personId;
            }

            public void setPersonId(String personId) {
                this.personId = personId;
            }

            public String getPersonName() {
                return personName;
            }

            public void setPersonName(String personName) {
                this.personName = personName;
            }
        }

        final List<Person> personList = new ArrayList<Person>() {
            {
                add(new Person("100", "adarsh"));
                add(new Person("102", "amit"));
                add(new Person("103", "radha"));
            }
        };

        //approach 1
        Map<String, String> personMap1 = personList
                .stream()
                .collect(
                        Collectors.toMap(Person::getPersonId, Person::getPersonName)
                );
        personMap1.forEach((key, value) -> System.out.println(key + " " + value));

        //approach 2
        Map<String, String> personMap2 = personList
                .stream()
                .collect(
                        Collectors.toMap(person -> person.getPersonId(), person -> person.getPersonName())
                );
        personMap2.forEach((key, value) -> System.out.println(key + " " + value));
    }


    @Test
    public void setToMapConversion() {

        class Person {

            String personId;
            String personName;

            public Person(String personId, String personName) {
                this.personId = personId;
                this.personName = personName;
            }

            public String getPersonId() {
                return personId;
            }

            public void setPersonId(String personId) {
                this.personId = personId;
            }

            public String getPersonName() {
                return personName;
            }

            public void setPersonName(String personName) {
                this.personName = personName;
            }
        }

        final Set<Person> personSet = new HashSet<Person>() {
            {
                add(new Person("100", "adarsh"));
                add(new Person("102", "amit"));
                add(new Person("103", "radha"));
            }
        };

        //approach 1
        Map<String, String> personMap1 = personSet
                .stream()
                .collect(
                        Collectors.toMap(Person::getPersonId, Person::getPersonName)
                );
        personMap1.forEach((key, value) -> System.out.println(key + " " + value));

        //approach 2
        Map<String, String> personMap2 = personSet
                .stream()
                .collect(
                        Collectors.toMap(person -> person.getPersonId(), person -> person.getPersonName())
                );
        personMap2.forEach((key, value) -> System.out.println(key + " " + value));
    }

}
