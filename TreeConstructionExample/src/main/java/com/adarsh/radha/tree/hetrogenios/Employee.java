package com.adarsh.radha.tree.hetrogenios;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Radha Singh on 2/28/2018.
 */
public class Employee {
    private String id;
    private String name;
    private String designation;
    private String managerId;
    private String deptId;
    private List<Employee> reporters =new LinkedList<>();

    public Employee() {
    }

    public Employee(String id, String name, String designation, String managerId,String deptId) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.managerId = managerId;
        this.deptId=deptId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public List<Employee> getReporters() {
        return reporters;
    }

    public void setReporters(List<Employee> reporters) {
        this.reporters = reporters;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
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