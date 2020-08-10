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

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Stream_groupBy_Example {


    @Test
    public void groupByExample() {

        class Person {

            String personId;
            String personName;
            String personDept;
            String personCounty;

            public Person(String personId, String personName, String personDept, String personCounty) {
                this.personId = personId;
                this.personName = personName;
                this.personDept=personDept;
                this.personCounty = personCounty;
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

            public String getPersonCounty() {
                return personCounty;
            }

            public void setPersonCounty(String personCounty) {
                this.personCounty = personCounty;
            }

            public String getPersonDept() {
                return personDept;
            }

            public void setPersonDept(String personDept) {
                this.personDept = personDept;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "personId='" + personId + '\'' +
                        ", personName='" + personName + '\'' +
                        ", personDept='" + personDept + '\'' +
                        ", personCounty='" + personCounty + '\'' +
                        '}';
            }
        }

        final List<Person> personList = new ArrayList<Person>() {
            {
                add(new Person("100", "adarsh","it", "india"));
                add(new Person("102", "amit","ac", "uk"));
                add(new Person("103", "radha","it", "india"));
                add(new Person("104", "sonu","it", "us"));
                add(new Person("105", "monu", "ac","us"));
            }
        };


        final Map<String, List<Person>> personGroupBy = personList
                .stream()
                .collect(Collectors.groupingBy(Person::getPersonCounty));
        personGroupBy.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("");


        final Map<String, Set<String>> personGroupBySet = personList
                .stream()
                .collect(Collectors.groupingBy(Person::getPersonCounty, Collectors.mapping(Person::getPersonName, Collectors.toSet())));
        personGroupBySet.forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println("");

        final Map<String, List<String>> personGroupByList = personList
                .stream()
                .collect(Collectors.groupingBy(Person::getPersonDept, Collectors.mapping(Person::getPersonName, Collectors.toList())));
        personGroupByList.forEach((key, value) -> System.out.println(key + " " + value));

    }

}
