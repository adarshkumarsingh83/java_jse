package com.espark.adarsh;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Jdk10Service {

    public void varForInitVar() {
        var list = List.of(1, 2, 3, 4, 5, 6);
        list.stream()
                .forEach(System.out::println);

        var numbers = List.of(1, 2, 3, 4, 5, 6);
        // Index of Enhanced For Loop
        for (var number : numbers) {
            System.out.println(number);
        }

        // Local variable declared in a loop
        for (var i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }

    public void copyOfStaticMethod() {

        var list = Arrays.asList(1, 2, 3, 4, 5, 6);
        var copyList = List.copyOf(list);
        System.out.println(list + " " + copyList);

        var set = new HashSet<>(list);
        var copySet = Set.copyOf(set);
        System.out.println(set + " " + copySet);


        var map = new HashMap<String, String>() {
            {
                put("1", "one");
                put("2", "two");
            }
        };
        var copyMap = Map.copyOf(map);
        System.out.println(map + " " + copyMap);
    }

    public void unModifiableCollectionMethod() {

        var list = Arrays.asList(1, 2, 3, 4, 5, 6);
        var unModifiableList = list.stream().collect(Collectors.toUnmodifiableList());
        // unModifiableList.add(1)
        System.out.println(list + " " + unModifiableList);


        var set = new HashSet<>(list);
        var unModifiableSet = set.stream().collect(Collectors.toUnmodifiableSet());
        // unModifiableSet.add(1)
        System.out.println(set + " " + unModifiableSet);


        var map = new HashMap<String, String>() {
            {
                put("1", "one");
                put("2", "two");
            }
        };
        var unModifiableMap = map.entrySet()
                .stream()
                .collect(Collectors.toUnmodifiableMap(entry -> entry.getKey(), entry -> entry.getValue()));
        // unModifiableMap.put("3","three");

        System.out.println(map + " " + unModifiableMap);
    }
}
