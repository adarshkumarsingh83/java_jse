package com.adarsh.tree.homogenious;

import com.google.gson.Gson;

import java.util.*;

/**
 * Created by Radha Singh on 2/28/2018.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        List<Employee> employees=getEmployeeList();
        Employee employee = new Employee();
        employee=getEmpHierarchy(null,employees,employee);
        System.out.println("\n\n\n\n ===>  "+new Gson().toJson(employee));
    }

    private static List<Employee> getEmployeeList() {
        List<Employee> employees = new LinkedList<>();
        employees.add(new Employee("100", "adarsh", "it-mgr", "10"));
        employees.add(new Employee("200", "amit", "finance-mgr", "10"));
        employees.add(new Employee("10", "radha", "founder", null));
        employees.add(new Employee("110", "ajit", "it-lead", "100"));
        employees.add(new Employee("130", "vishal", "developer", "100"));
        employees.add(new Employee("120", "mulla", "it-admin", "100"));
        employees.add(new Employee("121", "aaa", "devloper", "110"));
        employees.add(new Employee("131", "bbb", "sr-developer", "100"));
        employees.add(new Employee("133", "ccc", "developer", "100"));
        employees.add(new Employee("135", "ddd", "jr-developer", "100"));
        employees.add(new Employee("138", "eee", "developer", "100"));
        employees.add(new Employee("220", "111", "ca", "200"));
        employees.add(new Employee("230", "222", "ca", "200"));
        return employees;
    }

    private static Employee getEmpHierarchy(String mgrId,List<Employee> employees,Employee empTree ){
        ListIterator<Employee> iterator = employees.listIterator();
        while(iterator.hasNext()){
            Employee employee=iterator.next();
            if(mgrId == employee.getManagerId()){
                empTree=employee;
                iterator.remove();
            }
        }
        getChildren(empTree.getId(),employees,empTree);
        return empTree;
    }

    private static void getChildren(String managerId,List<Employee> employees,Employee empTree){
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> subOrdinate = new LinkedList<>();
        while(iterator.hasNext()){
            Employee employee=iterator.next();
            if(managerId == employee.getManagerId()){
                subOrdinate.add(employee);
                iterator.remove();
            }
        }
        empTree.setReporters(subOrdinate);
        for(Employee reportees:subOrdinate){
            getChildren(reportees.getId(),employees,reportees);
        }
    }

}