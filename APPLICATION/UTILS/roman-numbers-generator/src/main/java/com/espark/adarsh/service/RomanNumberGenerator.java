package com.espark.adarsh.service;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumberGenerator {

    public static String romanNumerals(int inputValue) {
        LinkedHashMap<String, Integer> romanNumbersStore = new LinkedHashMap<String, Integer>();
        romanNumbersStore.put("M", 1000);
        romanNumbersStore.put("CM", 900);
        romanNumbersStore.put("D", 500);
        romanNumbersStore.put("CD", 400);
        romanNumbersStore.put("C", 100);
        romanNumbersStore.put("XC", 90);
        romanNumbersStore.put("L", 50);
        romanNumbersStore.put("XL", 40);
        romanNumbersStore.put("X", 10);
        romanNumbersStore.put("IX", 9);
        romanNumbersStore.put("V", 5);
        romanNumbersStore.put("IV", 4);
        romanNumbersStore.put("I", 1);
        String res = "";
        for (Map.Entry<String, Integer> entry : romanNumbersStore.entrySet()) {
            int matches = inputValue / entry.getValue();
            res += repeat(entry.getKey(), matches);
            inputValue = inputValue % entry.getValue();
        }
        return res;
    }

    public static String repeat(String romanNumbersStoreValue, int matches) {
        if (romanNumbersStoreValue == null) {
            return null;
        }
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < matches; i++) {
            stringBuilder.append(romanNumbersStoreValue);
        }
        return stringBuilder.toString();
    }

}
