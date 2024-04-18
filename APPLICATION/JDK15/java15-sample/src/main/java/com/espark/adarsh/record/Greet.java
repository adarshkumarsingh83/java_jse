package com.espark.adarsh.record;



public record Greet(String msg) implements Message {

    public Greet {
        System.out.println("Greet:Message: default constructor of Greet record ");
    }

    @Override
    public String getMessage() {
        return "Greet:Message: "+msg.toUpperCase();
    }

    @Override
    public String toString() {
        return "Greet{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
