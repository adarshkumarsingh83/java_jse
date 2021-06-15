package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.StringJoiner;

/**
 * Created by Adarsh on 8/19/15.
 */
public class StringJoinerExample {


    @Test
    public void example1() {
        StringJoiner sj = new StringJoiner("-");
        sj.add("Adarsh");
        System.out.println(sj);
        sj.add("Kumar").add("Singh");
        System.out.println(sj);
    }

    @Test
    public void example2() {
        StringJoiner sjObj = new StringJoiner(",", "{", "}");
        //Add Element
        sjObj.add("AA").add("BB").add("CC").add("DD").add("EE");
        String output = sjObj.toString();
        System.out.println(output);
        //Create another StringJoiner
        StringJoiner otherSj = new StringJoiner(":", "(", ")");
        otherSj.add("10").add("20").add("30");
        System.out.println(otherSj);
        //Use StringJoiner.merge(StringJoiner o)
        StringJoiner finalSj = sjObj.merge(otherSj);
        System.out.println(finalSj);
        //get length using StringJoiner.length()
        System.out.println("Length of Final String:" + finalSj.length());
    }

}
