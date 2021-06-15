package com.adarsh.service.impl;

import com.adarsh.persistence.entity.Entity;
import com.adarsh.persistence.repository.EntityRepository;
import com.adarsh.service.EntityService;

import java.util.List;

public class EntityServiceImpl implements EntityService {

    @Override
    public List<Entity> getEntities() {
        return EntityRepository.getInstance().getEntities();
    }
}