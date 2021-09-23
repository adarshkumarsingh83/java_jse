package com.espark.adarsh.beans;


import com.espark.adarsh.entity.Department;

import java.util.LinkedList;
import java.util.List;

public class DepartmentBean {

    private Integer deptId;
    private String deptName;
    Integer parentDeptId;
    private List<EmployeeBean> employees;
    private List<DepartmentBean> subDepartments;

    public DepartmentBean() {
    }

    public DepartmentBean(Department department) {
        this.deptId = department.getDeptId();
        this.deptName = department.getDeptName();
        this.parentDeptId = department.getParentDeptId();
    }

    public DepartmentBean(Integer deptId, String deptName) {
        this.deptId = deptId;
        this.deptName = deptName;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<EmployeeBean> getEmployees() {
        return employees;
    }

    public void setEmployees(EmployeeBean employee) {
        if (this.employees == null) {
            this.employees = new LinkedList<>();
        }
        this.employees.add(employee);
    }

    public void setEmployeeBean(List<EmployeeBean> employeeBean) {
        this.employees = employeeBean;
    }

    public void setSubDepartments(List<DepartmentBean> subDepartments) {
        this.subDepartments = subDepartments;
    }

    public List<DepartmentBean> getSubDepartments() {
        return subDepartments;
    }

    public void setSubDepartments(DepartmentBean department) {
        if (this.subDepartments == null) {
            subDepartments = new LinkedList<>();
        }
        this.subDepartments.add(department);
    }

    public void setDepartments(List<DepartmentBean> departments) {
        this.subDepartments = departments;
    }

    public Integer getParentDeptId() {
        return parentDeptId;
    }

    public void setParentDeptId(Integer parentDeptId) {
        this.parentDeptId = parentDeptId;
    }
}