package com.adarsh.tree.homogenious.service;

import com.adarsh.tree.homogenious.entity.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeService {

    public static Employee getEmployeeTree(List<Employee> employees) {
        LinkedHashMap<Integer, List<Employee>> result = employees.stream()
                .collect(Collectors.groupingBy(Employee::getManagerId))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        Employee top = result.get(0).get(0);
        EmployeeService.getEmployeeHierarchy(result, top);
        return top;
    }

    public static Employee getEmployeeHierarchy(LinkedHashMap<Integer, List<Employee>> employees, Employee empTree) {
        Integer topId = empTree.getId();
        if (employees.containsKey(topId)) {
            List<Employee> subordinates = employees.get(topId);
            empTree.setReporters(subordinates);
            for (Employee emp : subordinates) {
                getEmployeeHierarchy(employees, emp);
            }
        }
        return empTree;
    }

    public static Employee getEmpHierarchy(Integer mgrId, List<Employee> employees, Employee empTree) {
        ListIterator<Employee> iterator = employees.listIterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (mgrId.intValue() == employee.getManagerId().intValue()) {
                empTree = employee;
                iterator.remove();
            }
        }
        getChildren(empTree.getId(), employees, empTree);
        return empTree;
    }

    public static void getChildren(Integer managerId, List<Employee> employees, Employee empTree) {
        ListIterator<Employee> iterator = employees.listIterator();
        List<Employee> subOrdinate = new LinkedList<>();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employee.getManagerId().intValue() == managerId.intValue()) {
                subOrdinate.add(employee);
                iterator.remove();
            }
        }
        empTree.setReporters(subOrdinate);
        for (Employee reportees : subOrdinate) {
            getChildren(reportees.getId(), employees, reportees);
        }
    }


}
