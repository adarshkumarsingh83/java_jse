package com.adarsh.generic.genricArrayList;

import java.util.ArrayList;

public class GenericArrayListTest {

    public GenericArrayListTest() {
        super();
    }

    public static void main(String[] args) {
        String[] stringArray = {"adarsh", "radha", "amit", "sonu", "monu"};
        ArrayList<String> arrayListString = new ArrayList<String>();
        for (String s : stringArray) {
            arrayListString.add(s);
        }
        System.out.println(arrayListString);
    }
}
