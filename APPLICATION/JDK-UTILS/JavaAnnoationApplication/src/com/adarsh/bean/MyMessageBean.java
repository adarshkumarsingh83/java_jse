package com.adarsh.bean;

import com.adarsh.annoation.IdentifierClass;
import com.adarsh.annoation.IdentifierMethod;
import com.adarsh.annoation.IdentifierParam;
import com.adarsh.annoation.IdentifierProperty;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 9/11/12
 * Time: 4:20 PM
 * To change this template use File | Settings | File Templates.
 */
@IdentifierClass(name = "My custom Class ", value = "MyMessageBean")
public class MyMessageBean implements Bean {

    @IdentifierProperty(value = "myProperty1")
    public String myProperty1;

    @IdentifierProperty(value = "myProperty2")
    public String myProperty2;

    @IdentifierMethod(value = "MyMethod1")
    public void myMethod1(@IdentifierParam(value = "MethodParam1") String value1
            , @IdentifierParam(value = "MethodParam1") String value2) {
        System.out.println("MyMethod1");
    }

    @IdentifierMethod(value = "MyMethod2")
    public void myMethod2(@IdentifierParam(value = "MethodParam2") String value1
            , @IdentifierParam(value = "MethodParam2") String value2) {
        System.out.println("MyMethod2");
    }
}
