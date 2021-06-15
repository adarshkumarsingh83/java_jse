package com.espark.adarsh.util;

public enum Role {

    ADMIN(1), USER(2), GROUP(2), VISITOR(3), ANNONIMUS(4);
    int value;

    Role(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}