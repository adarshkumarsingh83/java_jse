package com.espark.adarsh;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Department {

    private String departmentName;
    private List<Employee> employees = new ArrayList<Employee>();
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
                (managerOptional.isPresent() ?
                        ",\n manager=" + managerOptional.get().toString() : "\nmanager= Manager Not Present ") +
                '}';
    }
}
