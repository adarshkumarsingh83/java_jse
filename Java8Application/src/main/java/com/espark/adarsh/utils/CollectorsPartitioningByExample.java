package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Adarsh on 8/19/15.
 */
public class CollectorsPartitioningByExample {

    public static class Student {
        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    /**
     * Collectors.partitioningBy accepts predicate that will be defined to return true or false.
     * This predicate is applied on all the elements of stream.
     * Collectors.partitioningBy returns the Collector that will be converted into a map by Stream.collect method.
     * The key of map will be true and false only.
     */
    @Test
    public void partitionByExample() {
        Student s1 = new Student("Adarsh", 18);
        Student s2 = new Student("Radha", 22);
        Student s3 = new Student("Amit", 19);
        Student s4 = new Student("Sailaja", 20);
        Student s5 = new Student("Aruna", 21);
        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);
        //partition of Student on the basis of age
        System.out.println("----Partition of Student on the basis of age >20 ----");

        Map<Boolean, List<Student>> stdByClass = list.stream()
                .collect(Collectors.partitioningBy(s -> s.getAge() > 20));

        stdByClass.forEach((k, v) -> System.out.println("Key:" + k + "  " +
                ((List<Student>) v).stream().map(s -> s.getName()).collect(Collectors.joining(","))));
    }
}
