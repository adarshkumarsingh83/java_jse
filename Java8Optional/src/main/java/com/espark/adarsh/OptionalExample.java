package com.espark.adarsh;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Optional;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class OptionalExample {

    @Test
    public void testOptional() {
        System.out.println("Company " + getCompany());
    }

    public static Company getCompany() {
        final Company company = new Company();
        final Department it = new Department() {
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
                setManagerOptional(Optional.of(new Manager(10, "Mgr")));
            }
        };

        final Department research = new Department() {
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


