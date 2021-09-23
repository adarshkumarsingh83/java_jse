package com.espark.adarsh.entity;

import java.util.LinkedList;
import java.util.List;


public class Employee {
    private Integer id;
    private String name;
    private String designation;
    private Integer managerId;
    private Integer deptId;
    private List<Employee> reporters =new LinkedList<>();

    public Employee() {
    }

    public Employee(Integer id, String name, String designation, Integer managerId,Integer deptId) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.managerId = managerId;
        this.deptId=deptId;
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

    public List<Employee> getReporters() {
        return reporters;
    }

    public void setReporters(List<Employee> reporters) {
        this.reporters = reporters;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", managerId='" + managerId + '\'' +
                ", deptId='" + deptId + '\'' +
                ", reporters=" + reporters +
                '}';
    }
}