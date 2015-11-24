package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Adarsh on 8/19/15.
 */
public class ComparatorExample {


    public static class Student implements Comparable {

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

        @Override
        public int compareTo(Object o) {
            return this.name.compareTo(((Student) o).name);
        }
    }


    public List<Student> getStudentList() {
        Student s1 = new Student("Adarsh", 18);
        Student s2 = new Student("Radha", 22);
        Student s3 = new Student("Amit", 19);
        Student s4 = new Student("Sailaja", 20);
        Student s5 = new Student("Aruna", 21);
        List<Student> list = Arrays.asList(s1, s2, s3, s4, s5);
        return list;
    }

    /**
     *
     */
    @Test
    public void comparatorComparing() {
        List<Student> list = getStudentList();
        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);
        Collections.sort(list, ageComparator);
        list.forEach(s -> System.out.println("Name:" + s.getName() + " Age:" + s.getAge()));
        //Using reversed order for sorting
        System.out.println("--Using reversed order for sorting--");
        Collections.sort(list, ageComparator.reversed());
        list.forEach(s -> System.out.println("Name:" + s.getName() + " Age:" + s.getAge()));
    }

    /**
     *
     */
    @Test
    public void thenComparing() {
        List<Student> list = getStudentList();
        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);
        Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
        Collections.sort(list, ageComparator.thenComparing(nameComparator));
        list.forEach(s -> System.out.println("Name:" + s.getName() + " Age:" + s.getAge()));
    }

    /**
     *
     */
    @Test
    public void comparatorNaturalOrder() {
        List<Student> list = getStudentList();
        Collections.sort(list, Comparator.naturalOrder());
        list.forEach(s -> System.out.println("Name:" + s.getName() + " Age:" + s.getAge()));
        //Using natural reversed order for sorting
        System.out.println("--Using natural reversed order for sorting--");
        Collections.sort(list, Comparator.reverseOrder());
        list.forEach(s -> System.out.println("Name:" + s.getName() + " Age:" + s.getAge()));
    }

}
