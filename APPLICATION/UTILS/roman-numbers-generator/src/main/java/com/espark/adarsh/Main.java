package com.espark.adarsh;


import com.espark.adarsh.service.RomanNumberGenerator;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 3999; i++) {
            System.out.println("i=" + i + " -> " + RomanNumberGenerator.romanNumerals(i));
        }
    }
}
