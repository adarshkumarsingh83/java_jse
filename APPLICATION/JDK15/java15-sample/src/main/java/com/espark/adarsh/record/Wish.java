package com.espark.adarsh.record;



public record Wish(String msg) implements Message {

    public Wish {
        System.out.println("Wish:Message: default constructor of Wish record ");
    }

    @Override
    public String getMessage() {
        return "Wish:Message: "+msg.toUpperCase();
    }

    @Override
    public String toString() {
        return "Wish{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
