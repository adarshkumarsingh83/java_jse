package com.adarsh.service;


import com.adarsh.persistence.entity.Entity;
import com.adarsh.service.impl.EntityServiceImpl;

import java.util.List;

public interface EntityService {

    List<Entity> getEntities();

    static EntityService getInstance() {
        return new EntityServiceImpl();
    }
}