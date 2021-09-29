package com.espark.adarsh.service;

import java.util.HashMap;
import java.util.Map;

public class DecimalToRoman {

    private static final Map<Character, Integer> romanStore = new HashMap<Character, Integer>() {
        {
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    public static int romanToInteger(String romanInputVar) {
        int resultVar = 0;

        for (int index = 0; index < romanInputVar.length(); index++) {

            char character = romanInputVar.charAt(index);      // Current Roman Character

            //Case 1
            if (index > 0 && romanStore.get(character) > romanStore.get(romanInputVar.charAt(index - 1))) {
                resultVar += romanStore.get(character) - 2 * romanStore.get(romanInputVar.charAt(index - 1));
            }

            // Case 2: just add the corresponding number to resultVar.
            else
                resultVar += romanStore.get(character);
        }
        return resultVar;
    }

}
