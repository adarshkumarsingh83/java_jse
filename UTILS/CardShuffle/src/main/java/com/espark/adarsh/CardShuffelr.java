package com.espark.adarsh;

import java.util.Random;

public class CardShuffelr {

    public int[] shuffle(int[] cards) {
        int length = cards.length;
        int start = getRandomValue(0, length - 1);
        int cursor = start;
        do {
            int shuffleIndex = getRandomValue(0, length - 1);
            int temp = cards[shuffleIndex];
            cards[shuffleIndex] = cards[cursor];
            cards[cursor] = temp;
            cursor = (cursor + 1) % length;
        } while (cursor != start);
        return cards;
    }


    public int getRandomValue(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
