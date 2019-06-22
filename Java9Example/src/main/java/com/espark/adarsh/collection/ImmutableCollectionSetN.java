package com.espark.adarsh.collection;

import java.util.List;
import java.util.Set;

public class ImmutableCollectionSetN {
    public static void main(String[] args) {
        Set<Integer> set= Set.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(set+" "+set.getClass());

        try {
            set.add(10);
        }finally {
            System.out.println("Inside finally "+set+" can't add to set its immutable  "+set.getClass());
        }
    }
}
