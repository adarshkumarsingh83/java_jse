package com.espark.adarsh;

public class ApplicationMain {
    public static void main(String[] args) {
        int number = 1;
        while (number <= 100000) {
            int numberAfterDouble = number * 2;
            int numberAfterDoublePlus6 = numberAfterDouble + 6;
            int halfNumber = numberAfterDoublePlus6 / 2;
            int guessNumber = Math.abs(number - halfNumber);
            if (guessNumber == 3) {
                System.out.println("\n\nNumber  Matched");
                System.out.println("Actual Number =>  " + number);
                System.out.println("Guessed Number =>  " + guessNumber);
            } else {
                System.out.println("Number not Matched");
                System.out.println("Actual Number =>  " + number);
                System.out.println("Guessed Number =>  " + guessNumber);
            }
            number++;
        }
    }
}
