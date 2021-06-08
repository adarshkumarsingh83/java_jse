package com.adarsh.persistence.repository;


import com.adarsh.persistence.entity.Entity;
import com.adarsh.persistence.repository.impl.EntityRepositoryImpl;

import java.util.List;

public interface EntityRepository<E extends Entity> {

    void saveEntity(E entity);

    E getEntity(Long id);

    List<E> getEntities();

    static EntityRepository getInstance() {
        return new EntityRepositoryImpl();
    }
}
