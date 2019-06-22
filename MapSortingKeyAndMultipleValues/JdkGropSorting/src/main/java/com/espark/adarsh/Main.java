package com.espark.adarsh;

import com.sun.xml.internal.bind.v2.runtime.AssociationMap;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new LinkedList<>();
        List<Employee> employeeIt = getEmployee(101, "It", "IT");
        employees.addAll(employeeIt);
        List<Employee> employeeSales = getEmployee(201, "Sales", "Sales");
        employees.addAll(employeeSales);
        List<Employee> employeeFinance = getEmployee(301, "Finance", "Finance");
        employees.addAll(employeeFinance);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        System.out.println("\n\n");
        Map<String, List<Employee>> response = sortDeaprtment(employees);
        for (Map.Entry<String,List<Employee>> data : response.entrySet()) {
           String deptName=data.getKey();
            System.out.println("\n\n"+deptName);
            List<Employee> employeesList=data.getValue();
            for(Employee employee:employeesList){
                System.out.println(employee);
            }
        }

    }

    public static Map<String, List<Employee>> sortDeaprtment(List<Employee> list) {
        Map<String, List<Employee>> departmentGrouped =
                list.stream().collect(Collectors.groupingBy((Employee employee) -> employee.getDeptName()));

        for (Map.Entry<String, List<Employee>> employee : departmentGrouped.entrySet()) {
            List<Employee> employeeList = employee.getValue();

            /* or employeeList.sort(new Comparator<Employee>() {
                @Override
                public int compare(Employee employee1, Employee employee2) {
                    return employee1.getEmpName().compareTo(employee2.getEmpName());
                }
            });*/

           // or employeeList.sort((Employee employee1,Employee employee2)->{ return employee1.getEmpName().compareTo(employee2.getEmpName()); });
            employeeList.sort((employee1,employee2)-> employee1.getEmpName().compareTo(employee2.getEmpName()));
        }

        return departmentGrouped
                .entrySet().stream()
                .sorted((dept1,dept2) -> dept1.getKey().compareTo(dept2.getKey()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
    }

    public static List<Employee> getEmployee(int id, String name, String deptName) {
        Random rand = new Random();
        List<Employee> employees = new LinkedList<Employee>();
        for (int i = id; i < (id + 5); i++) {
            employees.add(new Employee(i + "", UUID.randomUUID().toString(), deptName));
        }
        return employees;
    }
}
