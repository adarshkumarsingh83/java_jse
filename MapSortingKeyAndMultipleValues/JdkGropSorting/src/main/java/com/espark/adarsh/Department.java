package com.espark.adarsh;

import java.util.LinkedList;
import java.util.List;

public class Department {

    String deptId;
    String deptName;
    List<Employee> employeeList=new LinkedList<Employee>();

    public Department(String deptId, String deptName, List<Employee> employeeList) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employeeList = employeeList;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        String employeeData="\n";
        for(Employee employee:employeeList){
            employeeData+=employee.toString()+"\n";
        }
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", employeeList=" + employeeData +
                '}';
    }
}
