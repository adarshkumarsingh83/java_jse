package com.espark.adarsh;

import java.util.*;
import java.util.stream.Collectors;


public class CharacterCountService {


    public static void main(String[] args) {
        final String data = "hi my name is adarsh and wife is radha her husband is adarsh";
        List<Map.Entry<Character, Long>> output = characterCountJdk7(data);
        System.out.println(output);

        List<Map.Entry<Character, Long>> output1 = characterCountJdk8(data);
        System.out.println(output1);
    }


    public static List<Map.Entry<Character, Long>> characterCountJdk8(String inputData) {
        Map<Character, Long> charMap = inputData.chars()
                .mapToObj(charElement -> (char) charElement)
                .collect(Collectors.groupingBy(charElement -> charElement.charValue(), Collectors.counting()));
        System.out.println("Before sorting " + charMap);
        List<Map.Entry<Character, Long>> entryList = charMap.entrySet()
                .stream()
                .sorted(Map.Entry.<Character, Long>comparingByValue())
                .collect(Collectors.toList());
        return entryList;
    }


    public static List<Map.Entry<Character, Long>> characterCountJdk7(String inputData) {
        Map<Character, Long> characterMap = new HashMap<>();
        for (int i = 0; i < inputData.length(); i++) {
            char c = inputData.charAt(i);
            if (characterMap.containsKey(c)) {
                Long temp = characterMap.get(c);
                characterMap.put(c, temp + 1);
            } else {
                characterMap.put(c, 1L);
            }
        }
        System.out.println("Before Sorting " + characterMap);
        List<Map.Entry<Character, Long>> entryList = new ArrayList<Map.Entry<Character, Long>>(characterMap.entrySet());
        Collections.sort(entryList, new Comparator<Map.Entry<Character, Long>>() {
            @Override
            public int compare(Map.Entry<Character, Long> o1, Map.Entry<Character, Long> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        return entryList;
    }
}
