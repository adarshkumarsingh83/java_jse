package com.espark.adarsh.consumerInterface;

import java.util.function.ObjDoubleConsumer;

/**
 * Created by akumar6 on 7/8/2016.
 */
public class ObjDoubleConsumerExample {
    public static void main(String[] args) {
        objDoubleConsumer("10",20D,(value1,value2)-> System.out.println("Data After Processing "+(Double.parseDouble(value1)+value2)));
    }

    public static void objDoubleConsumer(String value1,Double value2,ObjDoubleConsumer<String> objDoubleConsumer){
        objDoubleConsumer.accept(value1,value2);
    }
}
