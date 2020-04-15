package com.adarsh.radha.tree.hetrogenios;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Radha Singh on 3/2/2018.
 */
public class EmployeeBean extends Organization{
    private String id;
    private String name;
    private String designation;
    private String managerId;
    private String deptId;

    public EmployeeBean() {
    }

    public EmployeeBean(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.designation = employee.getDesignation();
        this.managerId = employee.getManagerId();
        this.deptId = employee.getDeptId();
    }

    public EmployeeBean(String id, String name, String designation
            , String managerId, String deptId) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.managerId = managerId;
        this.deptId = deptId;
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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public Type getTYPE() {
        return Type.EMPLOYEE;
    }

    @Override
    public List<Organization> getMember() {
        return super.member;
    }

    @Override
    public void setMember(List<Organization> member) {
        super.member=member;
    }

    public void setMember(Organization employeeBean) {
        super.member.add(employeeBean);
    }
}