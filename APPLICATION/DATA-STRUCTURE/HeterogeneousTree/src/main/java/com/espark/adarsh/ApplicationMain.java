package com.espark.adarsh;

import com.espark.adarsh.beans.DepartmentBean;
import com.espark.adarsh.entity.Employee;
import com.espark.adarsh.service.OrganisationService;
import com.google.gson.Gson;

import java.util.LinkedList;
import java.util.List;

public class ApplicationMain {

    public static void main(String[] args) {
        List<Employee> employees = getEmployeeList();
        DepartmentBean organization = OrganisationService.getOrganisationTree(employees);
        System.out.println("\n\n\n\n ===>  " + new Gson().toJson(organization));
    }


    private static List<Employee> getEmployeeList() {
        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee(10, "radha", "founder", 0, 101));
        employees.add(new Employee(100, "adarsh", "it-mgr", 10, 1111));
        employees.add(new Employee(130, "vishal", "developer", 100, 1111));
        employees.add(new Employee(120, "mulla", "it-admin", 100, 1111));
        employees.add(new Employee(131, "bbb", "sr-developer", 100, 1111));
        employees.add(new Employee(133, "ccc", "developer", 100, 1111));
        employees.add(new Employee(135, "ddd", "jr-developer", 100, 1111));
        employees.add(new Employee(138, "eee", "developer", 100, 1111));
        employees.add(new Employee(110, "ajit", "it-lead", 100, 1111));
        employees.add(new Employee(121, "aaa", "devloper", 110, 1111));


        employees.add(new Employee(200, "amit", "finance-mgr", 10, 3333));
        employees.add(new Employee(220, "111", "ca", 200, 3333));
        employees.add(new Employee(230, "222", "ca", 200, 3333));

        employees.add(new Employee(500, "hr-1", "hr", 10, 2222));
        employees.add(new Employee(5050, "hr-2", "hr", 500, 2222));
        employees.add(new Employee(6000, "hr-2", "hr", 500, 2222));

        employees.add(new Employee(1000, "op-1", "op", 10, 4444));
        employees.add(new Employee(1001, "op-2", "op", 1000, 4444));
        employees.add(new Employee(1002, "op-3", "op", 1000, 4444));
        return employees;
    }
}
