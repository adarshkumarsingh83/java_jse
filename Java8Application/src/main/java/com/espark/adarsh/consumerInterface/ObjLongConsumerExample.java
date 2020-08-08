package com.espark.adarsh.consumerInterface;

import java.util.function.ObjLongConsumer;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class ObjLongConsumerExample {
    public static void main(String[] args) {
         objLongConsumer("10",20L,(value1,value2)-> System.out.println("Data After Processing "+(Long.parseLong(value1)+value2)));
    }

    public static void objLongConsumer(String value1,Long value2 ,ObjLongConsumer<String> objLongConsumer){
        objLongConsumer.accept(value1,value2);
    }
}
