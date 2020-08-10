package com.espark.adarsh.functionalinterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Adarsh on 8/20/15.
 */
public class FunctionExample {

    public class Student {
        public String name;
        public int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String customShow(Function<Student, String> fun) {
            return fun.apply(this);
        }
    }

    /**
     * java.util.function.Function is an interface and has been introduced in java 8.
     * Function is a functional interface. So it can be used to accept lambda expression.
     * Function accepts one argument and returns the result. Function interface contains one
     * method that is apply(). This is the functional interface method.
     * R apply(T t) Where T is the function argument and R is the result.
     */
    @Test
    public void functionDemo() {
        List<Student> list = new ArrayList();
        list.add(new Student("Adarsh", 20));
        list.add(new Student("Radha", 22));
        list.add(new Student("Amit", 18));

        // Simple use of function
        for (Student st : list) {
            System.out.println(st.customShow(s -> s.name + ": " + s.name));
        }

        //Style one to declare function
        Function<Student, String> styleOne = s -> {
            String result = "Name:" + s.name + " and Age:" + s.age;
            return result;
        };

        //Style two to declare function
        Function<Student, String> styleTwo = s ->
                "Name:" + s.name + " and Age:" + s.age;

        System.out.println("--print value by style one--");
        //print the values of list using stle one function
        for (Student st : list) {
            System.out.println(st.customShow(styleOne));
        }

        System.out.println("--print value by style two--");
        //print the values of list using style two function
        for (Student st : list) {
            System.out.println(st.customShow(styleTwo));
        }

    }
}
