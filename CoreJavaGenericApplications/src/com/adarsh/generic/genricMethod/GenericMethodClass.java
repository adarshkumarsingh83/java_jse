package com.adarsh.generic.genricMethod;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethodClass {

    public GenericMethodClass() {
        super();
    }

    public void method(List<String> list) {
        System.out.println(list.getClass().getName() + "String Method");
    }

    public void method(ArrayList<? extends Object> arrayList) {
        System.out.println(arrayList.getClass().getName() + " Object Method ");
    }

    public void method(Collection<?> object) {
        System.out.println(object.getClass().getName() + " Collection Method ");
    }
}

