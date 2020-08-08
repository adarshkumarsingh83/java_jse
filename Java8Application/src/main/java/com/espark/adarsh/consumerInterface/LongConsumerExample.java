package com.espark.adarsh.consumerInterface;

import java.util.function.LongConsumer;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class LongConsumerExample {
    public static void main(String[] args) {
        longConsumer(Long.MAX_VALUE,(value)-> System.out.println("Data After Processing "+(value-Short.MAX_VALUE)));
    }

    public static void longConsumer(Long input,LongConsumer longConsumer){
        longConsumer.accept(input);
    }
}
