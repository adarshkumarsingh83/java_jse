package com.adarsh.entity;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 18/2/13
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class ExternalizableEntityOne implements Entity,Externalizable {

    private int count;
    private String data;

    public ExternalizableEntityOne() {
        System.out.println("ExternalizableEntityOne constructor()");
    }

    public ExternalizableEntityOne(int count,String data) {
        this.count=count;
        this.data = data;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("ExternalizableEntityOne writeExternal()");
        out.writeObject(count);
        out.writeObject(data);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        System.out.println("ExternalizableEntityOne readExternal()");
        this.count=(Integer)in.readObject();
        this.data=(String)in.readObject();
    }


    @Override
    public String toString() {
        return "ExternalizableEntityOne{" +
                "count=" + count +
                ", data='" + data + '\'' +
                '}';
    }
}
