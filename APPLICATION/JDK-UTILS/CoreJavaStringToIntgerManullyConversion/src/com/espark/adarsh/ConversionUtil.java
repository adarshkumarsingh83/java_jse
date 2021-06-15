package com.espark.adarsh;

/**
 * Created by Adarsh on 1/4/16.
 */
public class ConversionUtil {

    public static int stringToTnt(String inputDataString) {
        int i = 0, number = 0;
        boolean isNegative = false;
        int len = inputDataString.length();
        if (inputDataString.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }
        if (inputDataString.charAt(0) == '+') {
            isNegative = false;
            i = 1;
        }
        while (i < len) {
           // System.out.println("1 "+number);
            number *= 10;
           // System.out.println("2 "+number);
            number += (inputDataString.charAt(i++) - '0');
           // System.out.println("3 "+number);
        }
        if (isNegative)
            number = -number;
        return number;
    }
}
