package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Adarsh on 8/20/15.
 */
public class ConsumerInterfaceForEachLoop {

    class Student {
        public String name;
        public int age;

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void printData() {
            System.out.println("Name:" + name + " age:" + age);
        }
    }


    /**
     * forEach Loop with Consumer Interface
     * Collection can be iterated for Consumer argument. Consumer is assigned with a lambda expression.
     * Consumer<Student> style = (Student s) -> System.out.println("Name:"+s.name +" and Age:"+s.age);
     * list.forEach(style);
     * <p>
     * forEach Loop with Method Reference
     * If the containing class in the collection has a method to print data, we can use forEach as below.
     * list.forEach(Student::printData);
     * <p>
     * forEach Loop with Lambda Expression
     * Lambda expression can also be used for printing values while iterating over collection using forEach.
     * list.forEach(s -> s.printData());
     */
    @Test
    public void forEachLoop() {
        List<Student> list = new ArrayList();
        list.add(new Student("Adarsh", 20));
        list.add(new Student("Radha", 22));
        list.add(new Student("Amit", 18));
        //Creating instance of Consumer functional interface
        Consumer<Student> style = (Student s) -> System.out.println("Name:" + s.name + " and Age:" + s.age);
        //first way using Consumer
        list.forEach(style);
        //second way using method reference
        list.forEach(Student::printData);
        //third way using lambda expression
        list.forEach(s -> s.printData());
    }

}
