package com.espark.adarsh;


import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class Main {

    public static void main(String[] args) {
        sequencedList();
        sequencedSet();
        sequencedMap();
    }

    public static void sequencedList(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1); // [1]
        arrayList.addFirst(0); // [0, 1]
        arrayList.addLast(2); // [0, 1, 2]
        arrayList.getFirst(); // 0
        arrayList.getLast(); // 2
        arrayList.reversed(); // [2, 1, 0]
        arrayList.add(3);
        System.out.println(arrayList); // [0, 1, 2, 3]
        System.out.println(arrayList.reversed()); // [3, 2, 1, 0]
    }

    public static void sequencedSet(){
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1); // [1]
        linkedHashSet.addFirst(0); // [0, 1]
        linkedHashSet.addLast(2); // [0, 1, 2]
        linkedHashSet.getFirst(); // 0
        linkedHashSet.getLast(); // 2
        System.out.println(linkedHashSet);
        linkedHashSet.reversed(); // [2, 1, 0]
        System.out.println(linkedHashSet);
    }


    public static void sequencedMap(){
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1,"one"); // [(1,"one")]
        linkedHashMap.putFirst(0,"zero"); // [(0,"zero"), (1,"one")]
        linkedHashMap.putLast(2,"two"); // [(0,"zero"), (1,"one"), (2,"two")]
        System.out.println(linkedHashMap);

        System.out.println(linkedHashMap.reversed()); // [(2,"two"), (1,"one"), (0,"zero")]

        System.out.println(linkedHashMap);

        linkedHashMap.pollFirstEntry(); // (0,"zero")
        linkedHashMap.pollLastEntry(); // (2,"two")
        System.out.println(linkedHashMap);
    }
}
