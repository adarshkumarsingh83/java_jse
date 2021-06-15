package com.espark.adarsh.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class CollectorsExample {

    static class Person {

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

    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Adarsh", 33),
                new Person("Radha", 30),
                new Person("Amit", 30),
                new Person("Sonu", 12),
                new Person("Monu", 12)
        );

         /*   filter based on the name    */
        List<Person> filtered = persons.stream()
                .filter(person -> person.name.contains("a"))
                .collect(Collectors.toList());
        System.out.println("Name Based Filter "+filtered);


       /*  group by age for all person     */
        Map<Integer, List<Person>> personsByAge = persons.stream()
                .collect(Collectors.groupingBy(person -> person.age));
        personsByAge.forEach((age, personsObject) -> System.out.format("Age %s: %s\n", age, personsObject));


        /*    average of the age of all person */
        Double averageAge = persons
                .stream()
                .collect(Collectors.averagingInt(person -> person.age));
        System.out.println("Average Age "+averageAge);
    }
}
