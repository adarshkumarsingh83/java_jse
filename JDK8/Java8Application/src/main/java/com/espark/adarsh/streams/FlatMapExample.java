package com.espark.adarsh.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class FlatMapExample {

    static class Person {
        private String personName;

        public Person(String personName) {
            this.personName = personName;
        }
    }

    static class PersonDetails {
        private List<Person> personList = new ArrayList<Person>();

        public PersonDetails(Person person) {
            this.personList.add(person);
        }
    }

    public static void main(String[] args) {
        final List<PersonDetails> personList = new ArrayList<PersonDetails>();
        for (int i = 0; i < 5; i++) {
            personList.add(new PersonDetails(new Person(System.getProperty("user.name") + "_" + i)));
        }

        personList.stream()
                .flatMap(personDetails -> personDetails.personList.stream())
                .forEach(person -> System.out.println(person.personName));
    }
}
