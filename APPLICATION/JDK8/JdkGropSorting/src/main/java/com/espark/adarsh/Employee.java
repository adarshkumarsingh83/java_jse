package com.espark.adarsh;

public class Employee {

    String empId;
    String empName;
    String deptName;

    public Employee(String empId, String empName,String deptName) {
        this.empId = empId;
        this.empName = empName;
        this.deptName=deptName;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId='" + empId + '\'' +
                ", empName='" + empName + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
