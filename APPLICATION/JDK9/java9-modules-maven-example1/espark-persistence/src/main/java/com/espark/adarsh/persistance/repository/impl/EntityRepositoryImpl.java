package com.espark.adarsh.persistance.repository.impl;

import com.espark.adarsh.persistance.entity.Entity;
import com.espark.adarsh.persistance.repository.EntityRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EntityRepositoryImpl<E extends Entity> implements EntityRepository<E> {

    Map<Integer, E> store = new HashMap<>();

    {
        store.put(10, (E) new Entity(10, "aaaa"));
        store.put(20, (E) new Entity(20, "bbbb"));
    }

    public void saveEntity(E entity) {
        if (store.containsKey(entity.getId())) {
            store.put(entity.getId(), entity);
        }
    }

    public E getEntity(Long id) {
        if (store.containsKey(id)) {
            return store.get(id);
        }
        throw new RuntimeException("Entity Not Found ");
    }

    @Override
    public List<E> getEntities() {
        return store.values().stream().collect(Collectors.toList());
    }
}
