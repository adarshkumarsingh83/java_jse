package com.espark.adarsh.bean;

import java.io.Serializable;

public record Greet(String msg) implements Serializable {

    public Greet {
        System.out.println("default constructor of Greet record ");
    }

    public String getMessage() {
        return msg.toUpperCase();
    }
}
