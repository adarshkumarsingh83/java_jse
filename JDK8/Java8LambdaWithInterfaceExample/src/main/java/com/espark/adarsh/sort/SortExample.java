package com.espark.adarsh.sort;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Adarsh on 7/8/15.
 */
public class SortExample {

    public static void main(String[] args) {
        final List<Integer> integerList= Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println("Original List "+integerList);
        integerList.sort((valueOne,valueTwo)-> valueTwo.intValue() - valueOne.intValue());
        System.out.println("Modified List " + integerList);
    }
}
