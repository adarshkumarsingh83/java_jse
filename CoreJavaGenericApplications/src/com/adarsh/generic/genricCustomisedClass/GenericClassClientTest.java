package com.adarsh.generic.genricCustomisedClass;

public class GenericClassClientTest {

    public GenericClassClientTest() {
        super();
    }

    public static void main(String[] args) {

        GenericClass<String> genricClassString = new GenericClass<String>("Adarsh Radha ");
        genricClassString.getClassType();
        System.out.println(genricClassString.toString());
        System.out.println(genricClassString.getObject());

        GenericClass<Integer> genricClassInteger = new GenericClass<Integer>(1234567890);
        genricClassInteger.getClassType();
        System.out.println(genricClassInteger.toString());
        System.out.println(genricClassInteger.getObject());
    }

}
