package com.espark.adarsh;

import com.espark.adarsh.bean.Employee;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ApplicationMain {

    static Supplier<List<Employee>> employeesData =()->{
    return List.of( new Employee("1","adarsh",List.of("nasa","isro","spacex")),
      new Employee("2","amit",List.of("nasa","isro","spacex")),
      new Employee("3","radha",List.of("nasa","isro")),
      new Employee("4","geeta",List.of("isro","spacex")),
      new Employee("5","sonu",List.of("spacex")),
      new Employee("6","shakti",List.of()),
      new Employee("7","monu",List.of("isro")));
    };

    static Function<List<Employee>, Map<String,List<Employee>>> projectGroup = (employees -> {
       return employees.stream()
               .flatMap(employee -> {
                   List<String> employeeProjects = employee.getProject();
                   return employeeProjects.stream()
                           .map(projectId -> {
                               employee.setProject(ApplicationMain.orderProject.apply(projectId,employeeProjects));
                               return  employee;
                           });
               }).collect(Collectors.groupingBy(employee -> employee.getProject().get(0)));
    });

    static BiFunction<String,List<String>,List<String>> orderProject = (id , projects) ->{
       List<String> newProjectList = new LinkedList<>();
       newProjectList.add(id);
         projects.forEach(e ->{
             if(e!=id) newProjectList.add(e);
         });
         return newProjectList;
    };

    public static void main(String[] args) {
        ApplicationMain.employeesData.get().forEach(employee -> {
            System.out.println("Employee "+employee);
        });
       ApplicationMain.projectGroup.apply(ApplicationMain.employeesData.get())
               .forEach((projectGroup, employeesData)->{
                   System.out.println("Group "+projectGroup +" Employees "+employeesData);
               });
    }
}
