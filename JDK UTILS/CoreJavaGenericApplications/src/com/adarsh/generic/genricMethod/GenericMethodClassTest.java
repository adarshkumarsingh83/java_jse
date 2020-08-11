package com.adarsh.generic.genricMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class GenericMethodClassTest {

    public GenericMethodClassTest() {
        super();
    }

    public static void main(String[] args) {
        GenericMethodClass genricMethodClass = new GenericMethodClass();
        genricMethodClass.method((List) new ArrayList<String>());
        genricMethodClass.method(new ArrayList<Object>());
        genricMethodClass.method(new TreeSet<Collections>());
    }

}
