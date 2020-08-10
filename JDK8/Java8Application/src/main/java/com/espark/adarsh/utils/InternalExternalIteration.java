package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adarsh on 8/20/15.
 */
public class InternalExternalIteration {


    static class Employee {

        public int id;
        public String name;
        private int sal;

        public Employee(int id, String name, int sal) {
            this.id = id;
            this.name = name;
            this.sal = sal;
        }

        public void setSal(int sal) {
            this.sal = sal;
        }

        public int getSal() {
            return sal;
        }

        public static List<Employee> getEmpList() {
            List<Employee> list = new ArrayList<>();
            list.add(new Employee(1, "A", 2000));
            list.add(new Employee(2, "B", 3000));
            list.add(new Employee(3, "C", 4000));
            list.add(new Employee(4, "D", 5000));
            return list;
        }
    }

    /**
     * External Iteration
     * Suppose we have a list of employee and we need to update the salary of each and every employee
     * multiplied by two. As old fashioned
     */
    @Test
    public void externalIterationDemo() {
        List<Employee> list = Employee.getEmpList();
        for (Employee e : list) {
            e.setSal(e.getSal() * 2);
        }
    }

    /**
     * Internal Iteration
     * Now the same task we will do in new fashion using forEach that will iterate collection internally.
     */
    @Test
    public void internalIterationDemo() {
        List<Employee> list = Employee.getEmpList();
        System.out.println("Salary before update");
        list.forEach(e -> System.out.print(e.getSal() + "  "));
        list.forEach(e -> e.setSal(e.getSal() * 2));
        System.out.println("\nSalary after update");
        list.forEach(e -> System.out.print(e.getSal() + "  "));
    }
}
