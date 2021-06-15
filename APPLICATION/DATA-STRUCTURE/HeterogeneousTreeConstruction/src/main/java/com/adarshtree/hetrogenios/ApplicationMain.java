package com.adarshtree.hetrogenios;

import com.google.gson.Gson;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Radha Singh on 2/28/2018.
 */
public class ApplicationMain {

    public static void main(String[] args) {
        List<Employee> employees=getEmployeeList();
        List<Department> departments=getDepartment();
        Organization organization = new EmployeeBean();
        organization=getEmpHierarchy("0",employees,organization);
        System.out.println("\n\n\n\n ===>  "+new Gson().toJson(organization));
    }

    private static List<Employee> getEmployeeList() {
        List<Employee> employees = new LinkedList<>();

        employees.add(new Employee("10", "radha", "founder", "0","0"));

        employees.add(new Employee("100", "adarsh", "it-mgr", "10","1111"));
        employees.add(new Employee("130", "vishal", "developer", "100","1111"));
        employees.add(new Employee("120", "mulla", "it-admin", "100","1111"));
        employees.add(new Employee("131", "bbb", "sr-developer", "100","1111"));
        employees.add(new Employee("133", "ccc", "developer", "100","1111"));
        employees.add(new Employee("135", "ddd", "jr-developer", "100","1111"));
        employees.add(new Employee("138", "eee", "developer", "100","1111"));
        employees.add(new Employee("110", "ajit", "it-lead", "100","1111"));
        employees.add(new Employee("121", "aaa", "devloper", "110","1111"));


        employees.add(new Employee("200", "amit", "finance-mgr", "10","3333"));
        employees.add(new Employee("220", "111", "ca", "200","3333"));
        employees.add(new Employee("230", "222", "ca", "200","3333"));

        employees.add(new Employee("500", "hr-1", "hr", "10","2222"));
        employees.add(new Employee("5050", "hr-2", "hr", "500","2222"));
        employees.add(new Employee("6000", "hr-2", "hr", "500","2222"));

        employees.add(new Employee("1000", "op-1", "op", "10","4444"));
        employees.add(new Employee("1001", "op-2", "op", "1000","4444"));
        employees.add(new Employee("1002", "op-3", "op", "1000","4444"));
        return employees;
    }

    private static List<Department> getDepartment(){
        List<Department> departments = new LinkedList<>();
        departments.add(new Department("1111","it"));
        departments.add(new Department("2222","hr"));
        departments.add(new Department("3333","finance"));
        departments.add(new Department("4444","operations"));
        return departments;
    }

    private static Organization getEmpHierarchy(String mgrId, List<Employee> employeeList, Organization orgTree ){

        ListIterator<Employee> iterator = employeeList.listIterator();
        while(iterator.hasNext()){
            Employee employee=iterator.next();
            if(mgrId == employee.getManagerId()){
                orgTree=new EmployeeBean(employee);
                iterator.remove();
            }
        }
        getChildren((EmployeeBean)orgTree,employeeList,orgTree);
        return orgTree;
    }

    private static void getChildren(EmployeeBean employeeBean, List<Employee> employees, Organization empTree){
        ListIterator<Employee> iterator = employees.listIterator();
        List<Organization> subOrdinate = new LinkedList<>();
        while(iterator.hasNext()){
            Employee employee=iterator.next();
            if(employeeBean.getId().equals(employee.getManagerId())){
                if(employeeBean.getDeptId().equals(employee.getDeptId())) {
                    // when emp and mgr have same dept then add the emp to mgr directly
                    subOrdinate.add(new EmployeeBean(employee));
                    empTree.setMember(subOrdinate);
                    iterator.remove();
                }else {
                    // when emp and mgr have same dept then add the emp to dept and add dept to mgr
                    DepartmentBean departmentBean = getDeptByID(employee.getDeptId());
                    if(departmentBean != null){
                        departmentBean.setMember(new EmployeeBean(employee));
                        subOrdinate.add(departmentBean);
                        empTree.setMember(subOrdinate);
                        iterator.remove();
                    }
                }
            }
        }

        for(Organization reportees:empTree.getMember()){
            if(reportees.getTYPE() == Organization.Type.EMPLOYEE){
                getChildren((EmployeeBean)reportees,employees,reportees);
            }else {
                List<Organization> organizationList = ((DepartmentBean)reportees).getMember();
                for(Organization organization:organizationList){
                    getChildren((EmployeeBean)organization,employees,organization);
                }
            }
        }
    }

    private static DepartmentBean getDeptByID(String deptId){
        List<Department> departmentList = getDepartment();
        for(Department department:departmentList){
            if(department.getDeptId().equals(deptId)){
                return new DepartmentBean(department);
            }
        }
        return null;
    }

}