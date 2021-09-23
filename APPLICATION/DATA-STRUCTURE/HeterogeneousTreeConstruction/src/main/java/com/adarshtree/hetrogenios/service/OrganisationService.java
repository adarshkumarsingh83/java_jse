package com.adarshtree.hetrogenios.service;

import com.adarshtree.hetrogenios.beans.DepartmentBean;
import com.adarshtree.hetrogenios.beans.EmployeeBean;
import com.adarshtree.hetrogenios.entity.Department;
import com.adarshtree.hetrogenios.entity.Employee;
import com.adarshtree.hetrogenios.beans.Organization;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OrganisationService {


    public static Organization getEmpHierarchy(Integer mgrId, List<Employee> employeeList, Organization orgTree) {

        ListIterator<Employee> iterator = employeeList.listIterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (mgrId.intValue() == employee.getManagerId().intValue()) {
                orgTree = new EmployeeBean(employee);
                iterator.remove();
            }
        }
        getChildren((EmployeeBean) orgTree, employeeList, orgTree);
        return orgTree;
    }

    public static void getChildren(EmployeeBean employeeBean, List<Employee> employees, Organization empTree) {
        ListIterator<Employee> iterator = employees.listIterator();
        List<Organization> subOrdinate = new LinkedList<>();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            if (employeeBean.getId().equals(employee.getManagerId())) {
                if (employeeBean.getDeptId().equals(employee.getDeptId())) {
                    // when emp and mgr have same dept then add the emp to mgr directly
                    subOrdinate.add(new EmployeeBean(employee));
                    empTree.setMember(subOrdinate);
                    iterator.remove();
                } else {
                    // when emp and mgr have same dept then add the emp to dept and add dept to mgr
                    DepartmentBean departmentBean = getDeptByID(employee.getDeptId());
                    if (departmentBean != null) {
                        departmentBean.setMember(new EmployeeBean(employee));
                        subOrdinate.add(departmentBean);
                        empTree.setMember(subOrdinate);
                        iterator.remove();
                    }
                }
            }
        }

        for (Organization reportees : empTree.getMember()) {
            if (reportees.getTYPE() == Organization.Type.EMPLOYEE) {
                getChildren((EmployeeBean) reportees, employees, reportees);
            } else {
                List<Organization> organizationList = ((DepartmentBean) reportees).getMember();
                for (Organization organization : organizationList) {
                    getChildren((EmployeeBean) organization, employees, organization);
                }
            }
        }
    }

    public static DepartmentBean getDeptByID(Integer deptId) {
        List<Department> departmentList = getDepartment();
        for (Department department : departmentList) {
            if (department.getDeptId().intValue() == deptId.intValue()) {
                return new DepartmentBean(department);
            }
        }
        return null;
    }


    public static List<Department> getDepartment() {
        List<Department> departments = new LinkedList<>();
        departments.add(new Department(0, "management"));
        departments.add(new Department(1111, "it"));
        departments.add(new Department(2222, "hr"));
        departments.add(new Department(3333, "finance"));
        departments.add(new Department(4444, "operations"));
        return departments;
    }
}
