package com.adarsh.generic.genricToNonGenricInteraction;

import java.util.ArrayList;

public class NonGenericClass {

    public NonGenericClass() {
        super();
    }

    public void addValue(ArrayList arrayList) {
        arrayList.add("usharrayLista");
        arrayList.add(new ArrayList());
        arrayList.add(new Boolean("arrayList"));
        arrayList.add(new Float(100.5f));
        System.out.println("NonGenericClass addValue()-> " + arrayList);
    }
}
