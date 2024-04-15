package com.espark.adarsh.bean;

public record User(Integer id, String name) {
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
