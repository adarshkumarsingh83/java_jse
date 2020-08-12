package com.espark.adash;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> nestedList = new ArrayList<List<Integer>>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            List<Integer> list = new ArrayList<Integer>();
            for (int j = 0; j < 10; j++) {
                list.add(random.nextInt(1000));
            }
            nestedList.add(list);
        }

        List<Integer> intList = nestedList.stream()
                .flatMap(Collection::stream)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(intList);
    }
}
