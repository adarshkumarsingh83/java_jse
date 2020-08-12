package com.espark.adarsh.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class ReduceFunctionStreamExample {

    static class Employee {
        private String name;
        private Integer salary;

        public Employee(String name, Integer salary) {
            this.name = name;
            this.salary = salary;
        }

    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>() {
            {
                add(new Employee("adarsh", 1000));
                add(new Employee("amit", 1000));
                add(new Employee("radha", 1000));
            }
        };

        final int result = employees.stream().reduce(0
                , (sum, employee) -> {
                    return sum += employee.salary;
                }
                , (sum1, sum2) -> {
                    return sum1 + sum2;
                });

        System.out.println("Result " + result);
    }
}
