package com.espark.adarsh.claszz;


public final class  GreetClazz implements MessageClazz {

    String msg;

    public GreetClazz (String msg){
        this.msg = msg;
        System.out.println("Greet:Message:Class: default constructor of Greet Class ");

    }

    @Override
    public String getMessage() {
        return "Greet:Message:Class: "+msg.toUpperCase();
    }

    @Override
    public String toString() {
        return "Greet{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
