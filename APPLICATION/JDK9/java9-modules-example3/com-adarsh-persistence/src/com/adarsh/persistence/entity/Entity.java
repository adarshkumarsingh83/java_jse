package com.adarsh.persistence.entity;

import java.io.Serializable;

public class Entity implements Serializable {

    Integer id;
    String data;

    public Entity() {
    }

    public Entity(Integer id, String data) {
        this.id = id;
        this.data = data;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "id=" + id +
                ", data='" + data + '\'' +
                '}';
    }
}
