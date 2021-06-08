package com.espark.adarsh.persistance.repository;

import com.espark.adarsh.persistance.entity.Entity;
import com.espark.adarsh.persistance.repository.impl.EntityRepositoryImpl;

import java.util.List;


public interface EntityRepository<E extends Entity> {

    void saveEntity(E entity);

    E getEntity(Long id);

    List<E> getEntities();

    static EntityRepository getInstance() {
        return new EntityRepositoryImpl();
    }
}
