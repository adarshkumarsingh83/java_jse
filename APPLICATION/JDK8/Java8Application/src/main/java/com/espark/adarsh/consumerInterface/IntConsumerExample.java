package com.espark.adarsh.consumerInterface;

import java.util.function.IntConsumer;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class IntConsumerExample {
    public static void main(String[] args) {
       intConsumer(Integer.MAX_VALUE,(value)-> System.out.println("Data After processing "+(Long.MAX_VALUE-value)));
    }
    public static void intConsumer(Integer data,IntConsumer intConsumer){
        intConsumer.accept(data);
    }
}
