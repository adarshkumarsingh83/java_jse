package com.espark.adarsh.service;

import com.espark.adarsh.beans.DepartmentBean;
import com.espark.adarsh.beans.EmployeeBean;
import com.espark.adarsh.entity.Department;
import com.espark.adarsh.entity.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrganisationService {

    public static DepartmentBean getOrganisationTree(List<Employee> employees) {
        LinkedHashMap<Integer, List<EmployeeBean>> employeeGroup = employees.stream()
                .map(employee -> new EmployeeBean(employee))
                .collect(Collectors.groupingBy(EmployeeBean::getDeptId))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .filter(element -> element != null)
                .map(element -> {
                    OrganisationService.sortList(element.getValue());
                    return element;
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

        Map<Integer, DepartmentBean> department = getDepartment().stream()
                .map(department1 -> new DepartmentBean(department1))
                .map(departmentBean -> {
                    departmentBean.setEmployeeBean(employeeGroup.get(departmentBean.getDeptId()));
                    return departmentBean;
                })
                .collect(Collectors.toMap(DepartmentBean::getDeptId, Function.identity()));


        DepartmentBean orgTree = department.get(101);
        department.remove(orgTree.getDeptId());
        getDepartmentHierarchy(department, orgTree);
        return orgTree;
    }

    public static List<EmployeeBean> sortList(List<EmployeeBean> list) {
        list.sort(((o1, o2) -> o1.getId().compareTo(o2.getId())));
        return list;
    }

    public static void getDepartmentHierarchy(Map<Integer, DepartmentBean> department, DepartmentBean orgTree) {
        Iterator<Map.Entry<Integer, DepartmentBean>> iterator = department.entrySet().iterator();
        while (iterator.hasNext()) {
            DepartmentBean dept = iterator.next().getValue();
            if (dept.getParentDeptId().equals(orgTree.getDeptId())) {
                orgTree.setSubDepartments(dept);
                setHierarchy(dept, dept.getEmployeeBean());
                iterator.remove();
                getDepartmentHierarchy(department, dept);
            }
        }
    }

    public static void setHierarchy(DepartmentBean departmentBean, List<EmployeeBean> employeeBeans) {
        EmployeeBean manager = employeeBeans.get(0);
        employeeBeans.remove(0);
        LinkedHashMap group = employeeBeans.stream()
                .collect(Collectors.groupingBy(EmployeeBean::getManagerId))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        getEmployeeHierarchy(group, manager);
        departmentBean.getEmployeeBean().clear();
        departmentBean.getEmployeeBean().add(manager);
    }

    public static void getEmployeeHierarchy(LinkedHashMap<Integer, List<EmployeeBean>> employees, EmployeeBean empTree) {
        Integer topId = empTree.getId();
        if (employees.containsKey(topId)) {
            List<EmployeeBean> subordinates = employees.get(topId);
            empTree.setEmployees(subordinates);
            for (EmployeeBean emp : subordinates) {
                getEmployeeHierarchy(employees, emp);
            }
        }

    }

    public static List<Department> getDepartment() {
        List<Department> departments = new LinkedList<>();
        departments.add(new Department(101, "management", 0));
        departments.add(new Department(1111, "it", 101));
        departments.add(new Department(2222, "hr", 101));
        departments.add(new Department(3333, "finance", 101));
        departments.add(new Department(4444, "operations", 101));
        return departments;
    }
}
