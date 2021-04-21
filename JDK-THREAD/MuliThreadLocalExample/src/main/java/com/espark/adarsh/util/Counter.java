package com.espark.adarsh.util;

public class Counter {

    private Long counter = 0L;

    public Counter(Long counter) {
        this.counter = counter;
    }


    public Long count() {
        for (int i = 0; i <= 10000000; i++) {
            counter++;
        }
        return counter;
    }
}
