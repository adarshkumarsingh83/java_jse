package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

/**
 * Created by Adarsh on 8/19/15.
 */
public class OperatorExample {

    /**
     * UnaryOperator
     * java.util.function.UnaryOperator is a java 8 functional interface that extends
     * java.util.function.Function. UnaryOperator is used to work on a single operand.
     * It returns the same type as an operand. UnaryOperator can be used as lambda expression
     * to pass as an argument. While defining UnaryOperator, we need to define Function.apply(Object)
     * where Function will be the instance of UnaryOperator.
     */
    @Test
    public void unaryOperatorExample() {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        unaryOperatorFun(i -> i * i, list).forEach(x -> System.out.println(x));
    }

    private static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOpt, List<Integer> list) {
        List<Integer> uniList = new ArrayList<>();
        list.forEach(i -> uniList.add(unaryOpt.apply(i)));
        return uniList;
    }


    /**
     * BinaryOperator
     * java.util.function.BinaryOperator is a functional interface that can be assigned as lambda expression.
     * BinaryOperator extends java.util.function.BiFunction. It accepts two operands of the same type and
     * process it and then returns results of the same type as operands.
     */
    @Test
    public void binaryOperatorExample() {
        Map<String, String> map = new HashMap<>();
        map.put("X", "A");
        map.put("Y", "B");
        map.put("Z", "C");
        binaryOperatorFun((s1, s2) -> s1 + "-" + s2, map).forEach(x -> System.out.println(x));
    }

    private static List<String> binaryOperatorFun(BinaryOperator<String> binaryOpt, Map<String, String> map) {
        List<String> biList = new ArrayList<>();
        map.forEach((s1, s2) -> biList.add(binaryOpt.apply(s1, s2)));
        return biList;
    }


    public static void binaryOperatorMaxByMinBy() {

        class Student {

            private String name;
            private Integer age;
            private String className;

            public Student(String name, Integer age, String className) {
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

        Student s1 = new Student("Adarsh", 22, "A");
        Student s2 = new Student("Amit", 23, "A");
        Student s3 = new Student("Radha", 22, "B");
        Student s4 = new Student("Sailaja", 21, "B");
        List<Student> list = Arrays.asList(s1, s2, s3, s4);
        Comparator<Student> ageComparator = Comparator.comparing(Student::getAge);
        //Using BinaryOperator.maxBy
        System.out.println("---BinaryOperator.maxBy---");
        Map<String, Optional<Student>> eldestByClass = list.stream().collect(Collectors.groupingBy(Student::getClassName,
                Collectors.reducing(BinaryOperator.maxBy(ageComparator))));
        eldestByClass.forEach((k, v) -> System.out.println("Class:" + k + " Age:" +
                ((Optional<Student>) v).get().getAge() + " Name:" + ((Optional<Student>) v).get().getName()));

        //Using BinaryOperator.minBy
        System.out.println("---BinaryOperator.minBy---");
        Map<String, Optional<Student>> youngestByClass = list.stream().collect(Collectors.groupingBy(Student::getClassName,
                Collectors.reducing(BinaryOperator.minBy(ageComparator))));
        youngestByClass.forEach((k, v) -> System.out.println("Class:" + k + " Age:" +
                ((Optional<Student>) v).get().getAge() + " Name:" + ((Optional<Student>) v).get().getName()));
    }


}
