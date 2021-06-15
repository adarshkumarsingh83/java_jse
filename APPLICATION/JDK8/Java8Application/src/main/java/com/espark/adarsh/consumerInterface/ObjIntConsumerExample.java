package com.espark.adarsh.consumerInterface;

import java.util.function.ObjIntConsumer;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class ObjIntConsumerExample {
    public static void main(String[] args) {
        objIntConsumer("10",20,(value1,value2)-> System.out.println("After Processing "+(Integer.parseInt(value1)+value2)));
    }

    public static void objIntConsumer(String value1,Integer value2,ObjIntConsumer<String> objIntConsumer){
        objIntConsumer.accept(value1,value2);
    }
}
