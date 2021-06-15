package com.espark.adarsh.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class StreamFromCollections {

    public static void main(String[] args) {


        Arrays.stream(new int[]{1, 2, 3}).forEach(System.out::println);

        /*stream from list implementation */
        final Collection<Integer> integerList = new ArrayList<Integer>(){
            {
                add(1);
                add(2);
                add(3);
            }
        };
        integerList.stream().forEach(System.out::println);

        /*stream from set implementation */
        final Collection<Integer> integerSet=new HashSet<Integer>(){
            {
                add(1);
                add(2);
                add(3);
            }
        };
        integerSet.stream().forEach(System.out::println);

    }
}
