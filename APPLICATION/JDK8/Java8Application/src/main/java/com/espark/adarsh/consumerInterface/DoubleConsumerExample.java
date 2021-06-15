package com.espark.adarsh.consumerInterface;

import java.util.function.DoubleConsumer;


public class DoubleConsumerExample {
    public static void main(String[] args) {
       doubleConsumer(Double.MAX_VALUE,(value)-> System.out.println("Data After Processing "+(value-Float.MAX_VALUE)));
    }

    public static void doubleConsumer(Double input,DoubleConsumer doubleConsumer){
       doubleConsumer.accept(input);
    }
}
