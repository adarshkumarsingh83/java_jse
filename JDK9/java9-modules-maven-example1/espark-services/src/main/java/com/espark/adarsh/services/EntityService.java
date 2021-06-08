package com.espark.adarsh.services;


import com.espark.adarsh.persistance.entity.Entity;
import com.espark.adarsh.services.impl.EntityServiceImpl;

import java.util.List;

public interface EntityService {

    List<Entity> getEntities();

    static EntityService getInstance() {
        return new EntityServiceImpl();
    }
}
