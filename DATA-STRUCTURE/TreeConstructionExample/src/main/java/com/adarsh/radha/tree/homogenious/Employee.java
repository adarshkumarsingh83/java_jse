package com.adarsh.radha.tree.homogenious;

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
    private List<Employee> reporters =new LinkedList<>();

    public Employee() {
    }

    public Employee(String id, String name, String designation, String managerId) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.managerId = managerId;
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

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", managerId='" + managerId + '\'' +
                ", reporters=" + reporters +
                '}';
    }
}