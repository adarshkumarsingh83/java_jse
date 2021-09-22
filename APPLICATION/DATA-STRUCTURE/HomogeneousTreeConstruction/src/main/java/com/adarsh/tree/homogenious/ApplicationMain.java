package com.adarsh.tree.homogenious;

import com.adarsh.tree.homogenious.entity.Employee;
import com.adarsh.tree.homogenious.service.EmployeeService;
import com.google.gson.Gson;

import java.util.*;


/**
 * Created by Adarsh kumar Singh on 2/28/2018.
 */
public class ApplicationMain {


    public static void main(String[] args) {
        Employee employee = new Employee();
        employee = EmployeeService.getEmpHierarchy(0, getEmployeeList(), employee);
        System.out.println("\n\n\n\n ===>  " + new Gson().toJson(employee));

       employee = EmployeeService.getEmployeeTree(getEmployeeList());
       System.out.println("\n\n\n\n ===>  " + new Gson().toJson(employee));

    }


    private static List<Employee> getEmployeeList() {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee(100, "adarsh", "it-mgr", 10));
        employees.add(new Employee(200, "amit", "finance-mgr", 10));
        employees.add(new Employee(10, "radha", "founder", 0));
        employees.add(new Employee(110, "ajit", "it-lead", 100));
        employees.add(new Employee(130, "vishal", "developer", 100));
        employees.add(new Employee(120, "mulla", "it-admin", 100));
        employees.add(new Employee(121, "aaa", "devloper", 110));
        employees.add(new Employee(131, "bbb", "sr-developer", 100));
        employees.add(new Employee(133, "ccc", "developer", 100));
        employees.add(new Employee(135, "ddd", "jr-developer", 100));
        employees.add(new Employee(138, "eee", "developer", 100));
        employees.add(new Employee(220, "111", "ca", 200));
        employees.add(new Employee(230, "222", "ca", 200));
        return employees;
    }

}