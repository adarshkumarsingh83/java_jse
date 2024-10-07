package com.espark.adarsh;

import com.espark.adarsh.service.EmployeeService;

public class ApplicationMain {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();
        employeeService.getByEmailGroup.get()
                .entrySet()
                .stream()
                .forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));


    }
}
