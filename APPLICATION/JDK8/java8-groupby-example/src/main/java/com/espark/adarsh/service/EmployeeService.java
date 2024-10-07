package com.espark.adarsh.service;

import com.espark.adarsh.bean.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class EmployeeService {

    final List<Employee> employeeList = new LinkedList<Employee>();

    {
        init();
    }

    public void init(){
        employeeList.add(new Employee(1,"adarsh",'M',"adarsh.kumar@gmail.com"));
        employeeList.add(new Employee(2,"amit",'M',"amit.kumar@gmail.com"));
        employeeList.add(new Employee(3,"radha",'F',"radha.singh@yahoo.com"));
        employeeList.add(new Employee(4,"geeta",'F',"geeta.singh@yahoo.com"));
        employeeList.add(new Employee(5,"shakti",'F',"shakti.singh@yahoo.com"));
        employeeList.add(new Employee(6,"usha",'F',"usha.singh@yahoo.com"));
        employeeList.add(new Employee(7,"niranjan",'M',"niranjan.singh@gmail.com"));
        employeeList.add(new Employee(8,"chunchun",'F',"chunchun.singh@gmail.com"));
        employeeList.add(new Employee(9,"sonu",'M',"sonu.singh@outlook.com"));
    }


    public Supplier<Map<String,List<Employee>>> getByEmailGroup=()->{
        return employeeList.stream()
                .filter(employee -> {
                    return (employee.email().contains("gmail")|| employee.email().contains("yahoo"));
                }).collect(Collectors.groupingBy(this.checkEmail));
    };

    public Function<Employee,String> checkEmail = (employee) -> {
        String email = employee.email();
        return email.substring(email.indexOf('@')+1);
    };
}
