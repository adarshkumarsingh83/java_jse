package com.espark.adarsh.bean;

import java.util.List;

public class Employee {

    String id;
    String name;
    List<String> project;

    public Employee(String id, String name, List<String> project) {
        this.id = id;
        this.name = name;
        this.project = project;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getProject() {
        return project;
    }

    public void setProject(List<String> project) {
        this.project = project;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", project=" + project +
                '}';
    }
}
