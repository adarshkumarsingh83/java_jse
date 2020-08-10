package com.espark.adarsh.collection;

import java.util.List;

public class ImmutableCollectionListN {
    public static void main(String[] args) {
        List<Integer> list= List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(list+" "+list.getClass());
        try {
            list.add(10);
        }finally {
            System.out.println("Inside finally "+list+" can't add to list its immutable  "+list.getClass());
        }
    }
}
