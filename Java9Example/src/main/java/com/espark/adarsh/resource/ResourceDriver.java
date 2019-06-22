package com.espark.adarsh.resource;

public class ResourceDriver {
    public void doOperationOnResource(String resourceName){
        Resource resource=new Resource(resourceName);
        try(resource){
            resource.doOperation();
        }
        System.out.println("Resource Operation Completed "+resourceName);
    }
}
