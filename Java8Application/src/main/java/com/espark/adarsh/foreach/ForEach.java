package com.espark.adarsh.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    }
}
