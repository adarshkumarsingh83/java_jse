package com.adarsh.jdk8;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adarsh on 12/2/15.
 */
public class Test {

    public static void main(String[] args) {
        List f=new ArrayList();
        f.add("apple");
        f.add("banana");
        f.add("orange");
        f.add("mango");
        f.add("kiwi");
        Object fn="mango";
        f.remove(f.indexOf(fn));

        System.out.println(f);

    }
}
