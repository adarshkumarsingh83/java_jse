package com.espark.adarsh.collection;

import java.util.List;
import java.util.Map;

public class ImmutableCollectionMapN {
    public static void main(String[] args) {
        Map map= Map.of("1",2,"3",4,"5",6,"7",8,"9",10);
        System.out.println(map+" "+map.getClass());
        try {
            map.put("10",10.0);
        }finally {
            System.out.println("Inside finally "+map+" can't add to map its immutable  "+map.getClass());
        }
    }
}
