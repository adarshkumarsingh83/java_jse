package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Function;

/**
 * Created by Adarsh on 8/20/15.
 */
public class LambdaExpressions {

    @Test
    public void example1() {
        final ExecutorService exService = Executors.newSingleThreadExecutor();
        Runnable r = () -> System.out.println("Lambda Expression Test with Runnable");
        exService.execute(r);
    }


    public interface Calculator {
        public int add(int n1, int n2);
    }

    @Test
    public void functionalInterfaceWithLambdaExpression() {
        Calculator cal = (int a, int b) -> a + b;
        int res = cal.add(5, 6);
        System.out.println(res);
    }


    class Student {

        private String name;
        private int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String customShow(Function<Student, String> fun) {
            return fun.apply(this);
        }
    }

    @Test
    public void comparatorWithLambdaExpression() {
        List<Student> list = new ArrayList();
        list.add(new Student("Adarsh", 20));
        list.add(new Student("Radha", 22));
        list.add(new Student("Amit", 18));
        System.out.println("...befor sorting...");
        for (Student s : list) {
            System.out.println(s.getName());
        }
        //define comparator
        Comparator<Student> comp = (Student s1, Student s2) -> s1.getName().compareTo(s2.getName());
        Collections.sort(list, comp);
        System.out.println("...after sorting...");
        for (Student s : list) {
            System.out.println(s.getName());
        }
    }

    @Test
    public void usingFunctionInterfaceToIterateCollectionWithLambdaExpression() {

        List<Student> list = new ArrayList();
        list.add(new Student("Adarsh", 20));
        list.add(new Student("Radha", 22));
        list.add(new Student("Amit", 18));
        for (Student st : list) {
            System.out.println(st.customShow(s -> s.getName() + ": " + s.getAge()));
        }
    }
}
