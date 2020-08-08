package com.espark.adarsh;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class WorldCountService {


    public static void main(String[] args) {
        final String data = "hi this is adarsh radha is wife and her husband is adarsh";

        List<Map.Entry<String, Long>> list = wordCountSortingJdk8(data);
        list.forEach((entry) -> System.out.println(entry.getKey() + " " + entry.getValue()));

        List<Map.Entry<String, Long>> entryList = wordCountSortingJdk7(data);
        for (Map.Entry<String, Long> entry : entryList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static List<Map.Entry<String, Long>> wordCountSortingJdk8(String inputData) {
        Map<String, Long> wordCount = Arrays.stream(inputData.split("\\s"))
                .collect(Collectors.groupingBy(data -> data.toString(), Collectors.counting()));
        System.out.println("Before Sorting " + wordCount);
        List<Map.Entry<String, Long>> list = wordCount.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue())
                .collect(Collectors.toList());
        return list;
    }

    public static List<Map.Entry<String, Long>> wordCountSortingJdk7(String inputData) {
        String[] dataArray = inputData.split("\\s");
        final Map<String, Long> dataMap = new HashMap<String, Long>();
        for (String word : dataArray) {
            if (dataMap.containsKey(word)) {
                Long temp = dataMap.get(word);
                dataMap.put(word, temp + 1);
            } else {
                dataMap.put(word, 1L);
            }
        }
        System.out.println("Before Sorting " + dataMap);
        List<Map.Entry<String, Long>> entryList = new ArrayList<>(dataMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<String, Long>>() {
            @Override
            public int compare(Map.Entry<String, Long> o1, Map.Entry<String, Long> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        return entryList;
    }
}
