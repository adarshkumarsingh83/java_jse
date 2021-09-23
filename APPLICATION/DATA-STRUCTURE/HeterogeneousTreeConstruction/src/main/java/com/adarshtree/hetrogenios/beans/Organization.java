package com.adarshtree.hetrogenios.beans;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Radha Singh on 3/2/2018.
 */
public abstract class Organization {

    public enum Type{
        EMPLOYEE,DEPARTMENT;
    };

    protected List<Organization> member= new LinkedList<>();

    public abstract Type getTYPE();

    public abstract List<Organization> getMember();

    public abstract void setMember(List<Organization> member);
}
