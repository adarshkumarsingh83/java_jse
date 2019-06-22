package com.espark.adarsh.resource;

public class Resource implements AutoCloseable {

    private String resourceName;

    public Resource(String resourceName) {
        this.resourceName = resourceName;
        System.out.println("Resource Created "+this.resourceName);
    }

    public void doOperation(){
        System.out.println("Resource is Operating "+this.resourceName);
    }

    @Override
    public void close(){
        System.out.println("Resource Closed "+this.resourceName);
    }
}
