package com.espark.adarsh.optionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by Adarsh on 6/24/15.
 */
public class OptionalExample {
    public static void main(String[] args) {
        System.out.println("Company "+getCompany());
    }

    public static Company getCompany() {
        final Company company = new Company();
        final Department it = new Department(){
            {
                setDepartmentName("IT");
                setEmployees(
                        new ArrayList<Employee>() {
                            {
                                add(new Employee() {
                                    {
                                        setEmpId(101);
                                        setEmpName("emp1");
                                    }
                                });
                                add(new Employee() {
                                    {
                                        setEmpId(102);
                                        setEmpName("emp2");
                                    }
                                });
                            }
                        });
                setManagerOptional(Optional.of(new Manager(10,"Mgr")));
            }
        };

        final Department research = new Department(){
            {
                setDepartmentName("Research");
                setEmployees(
                        new ArrayList<Employee>() {
                            {
                                add(new Employee() {
                                    {
                                        setEmpId(101);
                                        setEmpName("emp1");
                                    }
                                });
                                add(new Employee() {
                                    {
                                        setEmpId(102);
                                        setEmpName("emp2");
                                    }
                                });
                            }
                        });
                setManagerOptional(Optional.<Manager>empty());
            }
        };
        company.setCompanyName("Espark");
         company.setDepartments(research);
         company.setDepartments(it);
        return company;
    }

}

class Company {

    private String companyName;
    private List<Department> departments = new ArrayList<>();

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(Department department) {
        this.departments.add(department);
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ",\n departments=" + departments +
                '}';
    }
}


class Department {

    private String departmentName;
    private List<Employee> employees = new ArrayList<>();
    private Optional<Manager> managerOptional = Optional.empty();

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public Optional<Manager> getManagerOptional() {
        return managerOptional;
    }

    public void setManagerOptional(Optional<Manager> managerOptional) {
        this.managerOptional = managerOptional;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "\n \n Department{" +
                "departmentName='" + departmentName + '\'' +
                ",\n employees=" + employees +
                (managerOptional.isPresent()?
                ",\n manager=" + managerOptional.get().toString() :"\nmanager= Manager Not Present ") +
                '}';
    }
}


class Employee {

    private Integer empId;
    private String empName;


    public Employee() {
    }


    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}

class Manager {

    private Integer empId;
    private String empName;

    public Manager(Integer empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                '}';
    }
}

