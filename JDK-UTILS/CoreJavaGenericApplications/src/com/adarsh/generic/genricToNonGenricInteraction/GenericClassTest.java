package com.adarsh.generic.genricToNonGenricInteraction;

import java.util.ArrayList;

public class GenericClassTest {

    public GenericClassTest() {
        super();
    }

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("adarsh");
        arrayList.add("radha");
        System.out.println(arrayList);
        NonGenericClass nonGenericClass = new NonGenericClass();
        nonGenericClass.addValue(arrayList);
        System.out.println("genericClass main()-> " + arrayList);
    }

}
