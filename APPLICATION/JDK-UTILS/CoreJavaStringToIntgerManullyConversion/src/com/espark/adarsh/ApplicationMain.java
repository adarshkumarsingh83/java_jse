package com.espark.adarsh;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Adarsh on 1/4/16.
 */
public class ApplicationMain {

    public static void main(String[] args) throws Exception {
        final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Value ");
        String convertingString = bufferedReader.readLine().trim();
        System.out.println("String Before Conversion :  " + convertingString);
        int output = ConversionUtil.stringToTnt(convertingString);
        System.out.println("");
        System.out.println("");
        System.out.println("int value as output " + output);
        System.out.println("");
    }
}
