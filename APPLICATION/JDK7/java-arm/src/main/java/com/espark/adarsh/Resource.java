package com.espark.adarsh;

public class Resource implements AutoCloseable{

    private String name;

    public Resource(String name) {
        this.name = name;
        System.out.println("Resource  created "+this.name);
    }

    public void doWork(){
        System.out.println("Doing work using "+this.name);
    }

    @Override
    public void close(){
        System.out.println("Resource closing "+this.name);
    }
}
