package com.espark.adarsh;

import com.espark.adarsh.persistance.entity.Entity;
import com.espark.adarsh.services.EntityService;

import java.util.List;

public class ApplicationMain {
    public static void main(String[] args) {
        List<Entity> entities = EntityService.getInstance().getEntities();
        entities.stream().forEach(entity -> System.out.println(entities));
    }
}
