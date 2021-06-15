package com.espark.adarsh.foreach;

import java.util.*;
import java.util.function.Function;

/**
 * Created by Adarsh on 7/8/15.
 */
public class ForEach {

    public static void main(String[] args) {
        final List<Integer> integerList= Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original List "+integerList);
        final List<Double> doubleList=new ArrayList<>();
        final Function<Integer,Double> integerDoubleFunction = value -> value.doubleValue();
        integerList.forEach(integerValue -> doubleList.add(integerDoubleFunction.apply(integerValue)));
        System.out.println("Modified List of Double "+doubleList);


        final List<Integer> list=new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };

        list.forEach((value)->System.out.println(value));

        final Set<Integer>  hashSet= new HashSet<Integer>(){
            {
                add(1);
                add(2);
                add(3);
                add(4);
                add(5);
            }
        };
        hashSet.forEach((value)->System.out.println(value));

        final Map<String,String> map=new HashMap<String,String>(){
            {
                put("1key","1value");
                put("2key","2value");
                put("3key","3value");
                put("4key","4value");
                put("5key","5value");
            }
        };
        map.forEach((key,value)->System.out.println(key+" "+value));

    }
}
