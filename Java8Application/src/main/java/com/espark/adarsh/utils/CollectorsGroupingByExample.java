package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Adarsh on 8/19/15.
 */
public class CollectorsGroupingByExample {

    public static class Student {

        private String name;
        private int age;
        private String className;

        public Student(String name, String className, int age) {
            this.name = name;
            this.age = age;
            this.className = className;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getClassName() {
            return className;
        }
    }


    /**
     * groupingBy is a static method of java.util.stream.Collectors in java 8.
     * groupingBy does the grouping of elements on the basis of any given key and returns a Collector.
     * Find the method syntax.
     * <T,K> Collector<T,?,Map<K,List<T>>> groupingBy(Function<? super T,? extends K> classifier)
     */
    @Test
    public void groupingByExample() {
        Student s1 = new Student("Adarsh", "A", 20);
        Student s2 = new Student("Radha", "B", 22);
        Student s3 = new Student("Amit", "A", 22);
        Student s4 = new Student("Sonu", "C", 20);
        Student s5 = new Student("Monu", "B", 21);
        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);
        //Group Student on the basis of ClassName
        System.out.println("----Group Student on the basis of ClassName----");
        Map<String, List<Student>> stdByClass = list.stream()
                .collect(Collectors.groupingBy(Student::getClassName));

        stdByClass.forEach((k, v) -> System.out.println("Key:" + k + "  " +
                ((List<Student>) v).stream().map(m -> m.getName()).collect(Collectors.joining(","))));

        //Group Student on the basis of age
        System.out.println("----Group Student on the basis of age----");
        Map<Integer, List<Student>> stdByAge = list.stream()
                .collect(Collectors.groupingBy(Student::getAge));

        stdByAge.forEach((k, v) -> System.out.println("Key:" + k + "  " +
                ((List<Student>) v).stream().map(m -> m.getName()).collect(Collectors.joining(","))));
    }
}
