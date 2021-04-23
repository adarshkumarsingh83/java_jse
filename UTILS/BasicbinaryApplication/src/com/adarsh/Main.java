package com.adarsh;

import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the number");
        String input = scanner.next();
        System.out.println("input value " + input);

        if (input.length() != 8) {
            throw new RuntimeException("invalid input");
        } else {
            int sum = 0;
            if (input.charAt(0) == '1') {
                sum +=128;
            }  if (input.charAt(1) == '1') {
                sum +=64;
            }  if (input.charAt(2) == '1') {
                sum +=32;
            }  if (input.charAt(3) == '1') {
                sum +=16;
            }  if (input.charAt(4) == '1') {
                sum +=8;
            }  if (input.charAt(5) == '1') {
                sum +=4;
            }  if (input.charAt(6) == '1') {
                sum +=2;
            }  if (input.charAt(7) == '1') {
                sum +=1;
            }
            System.out.println("input value is " + input);
            System.out.println("integer value is "+sum);
            System.out.println("binary number is "+Integer.toBinaryString(sum));
        }
    }
}
