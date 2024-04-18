package com.espark.adarsh.claszz;


public final class WishClazz implements MessageClazz {

    String msg;

    public WishClazz(String msg) {
        this.msg = msg;
        System.out.println("Wish:Message: default constructor of Wish Class  ");
    }

    @Override
    public String getMessage() {
        return "Wish:Message:Class: "+msg.toUpperCase();
    }

    @Override
    public String toString() {
        return "Wish{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
