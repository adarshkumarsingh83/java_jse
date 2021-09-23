package com.adarshtree.hetrogenios.beans;

import com.adarshtree.hetrogenios.entity.Department;

import java.util.List;

/**
 * Created by Radha Singh on 3/2/2018.
 */
public class DepartmentBean extends Organization {

    private Integer deptId;
    private String deptName;

    public DepartmentBean() {
    }

    public DepartmentBean(Department department) {
        this.deptId = department.getDeptId();
        this.deptName = department.getDeptName();
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

    public Type getTYPE() {
        return Type.DEPARTMENT;
    }

    @Override
    public List<Organization> getMember() {
        return super.member;
    }

    @Override
    public void setMember(List<Organization> member) {
        super.member=member;
    }

    public void setMember(Organization departmentBean) {
        super.member.add(departmentBean);
    }
}