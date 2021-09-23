package com.espark.adarsh.beans;


import com.espark.adarsh.entity.Employee;

import java.util.LinkedList;
import java.util.List;


public class EmployeeBean {
    private Integer id;
    private String name;
    private String designation;
    private Integer managerId;
    private Integer deptId;
    private List<EmployeeBean> employees;

    public EmployeeBean() {
    }

    public EmployeeBean(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.designation = employee.getDesignation();
        this.managerId = employee.getManagerId();
        this.deptId = employee.getDeptId();
    }

    public EmployeeBean(Integer id, String name, String designation
            , Integer managerId, Integer deptId) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.managerId = managerId;
        this.deptId = deptId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public List<EmployeeBean> getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeBean employee) {
        this.employees.add(employee);
    }

    public void setEmployees(List<EmployeeBean> employees) {
        this.employees = employees;
    }
}