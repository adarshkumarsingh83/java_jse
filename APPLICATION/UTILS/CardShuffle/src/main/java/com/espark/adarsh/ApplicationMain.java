package com.espark.adarsh;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class ApplicationMain {
    static Set<String> store = new HashSet<String>();

    public static void main(String[] args) {
        CardShuffelr cardShuffelr = new CardShuffelr();
        IntStream.rangeClosed(0, Integer.MAX_VALUE).forEach(e -> {
            ApplicationMain.shuffleCards(cardShuffelr);
        });
    }

    public static void shuffleCards(CardShuffelr cardShuffelr) {
        IntStream stream = IntStream.range(1, 53);
        int[] response = cardShuffelr.shuffle(stream.toArray());
        IntStream intStream = Arrays.stream(response);
        intStream.forEach(e -> System.out.print(" " + e));
        String data = "";
        for (int e : response) {
            data += e;
        }
        if (store.add(data)) {
            System.out.println(" Unique Shuffle " + data);
        } else {
            System.out.println(" Repeated Shuffle " + data);
        }
    }
}
