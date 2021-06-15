package com.espark.adarsh.services.impl;

import com.espark.adarsh.persistance.entity.Entity;
import com.espark.adarsh.persistance.repository.EntityRepository;
import com.espark.adarsh.services.EntityService;

import java.util.List;

public class EntityServiceImpl implements EntityService {

    @Override
    public List<Entity> getEntities() {
        return EntityRepository.getInstance().getEntities();
    }
}
