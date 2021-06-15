package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Adarsh on 8/20/15.
 */
public class PredicateExample {

    class Student {

        public int age;
        public String gender;

        public Student(int age, String gender) {
            this.age = age;
            this.gender = gender;
        }

        public String customShow(Function<Student, String> fun) {
            return fun.apply(this);
        }
    }


    /**
     * java.util.function.Predicate is a functional interface introduced in java 8.
     * Predicate is used for assigning a lambda expression.
     * The functional interface is test(T t) which returns Boolean value.
     * When we pass the object to this method, it evaluates the object over assigned lambda expression.

     * Predicate<Student> maleStudent = s-> s.age >= 20 && "male".equals(s.gender);
     * Predicate<Student> femaleStudent = s-> s.age > 15 && "female".equals(s.gender);
     */
    @Test
    public void predicateDemo() {
        Predicate<Student> maleStudent = s -> s.age >= 20 && "male".equals(s.gender);
        Predicate<Student> femaleStudent = s -> s.age > 15 && "female".equals(s.gender);

        Function<Student, String> maleStyle = s -> "Hi, You are male and age " + s.age;

        Function<Student, String> femaleStyle = s -> "Hi, You are female and age " + s.age;

        Student s1 = new Student(21, "male");
        if (maleStudent.test(s1)) {
            System.out.println(s1.customShow(maleStyle));
        } else if (femaleStudent.test(s1)) {
            System.out.println(s1.customShow(femaleStyle));
        }
    }

}
