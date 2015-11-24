package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

/**
 * Created by Adarsh on 8/19/15.
 */
public class CollectorsReducingExample {

    public static class Person {

        private String name;
        private Integer age;
        private String className;

        public Person(String name, Integer age, String className) {
            this.name = name;
            this.age = age;
            this.className = className;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public String getClassName() {
            return className;
        }
    }


    /**
     * Java 8 Collectors.reducing is used to reduce the stream element with the help of Comparator and BinaryOperator.
     * Collectors.reducing returns the Collector with Optional data
     * <p>
     * public static <T> Collector<T,?,Optional<T>> reducing(BinaryOperator<T> op)
     * Collectors.reducing returns a collector with Optional class. We need to pass binary operator as
     * BinaryOperator.maxBy and BinaryOperator.minBy. BinaryOperator takes a Comparator as an argument.
     * According to that Comparator and BinaryOperator, stream elements are reduced and finally can be collected as group.
     */
    @Test
    public void collectorsReducingExample() {
        Person person1 = new Person("Adarsh", 22, "A");
        Person person2 = new Person("Radha", 23, "A");
        Person person3 = new Person("Amit", 22, "B");
        Person person4 = new Person(null, 21, "B");
        List<Person> list = Arrays.asList(person1, person2, person3, person4);
        Comparator<Person> ageComparator = Comparator.comparing(Person::getAge);
        Map<String, Optional<Person>> eldestByClass = list.stream()
                .collect(Collectors.groupingBy(Person::getClassName, Collectors.reducing(BinaryOperator.maxBy(ageComparator))));
        eldestByClass.forEach((k, v) -> System.out.println("Class:" + k + " Age:" +
                ((Optional<Person>) v).get().getAge() + " Name:" + ((Optional<Person>) v).get().getName()));
    }
}
