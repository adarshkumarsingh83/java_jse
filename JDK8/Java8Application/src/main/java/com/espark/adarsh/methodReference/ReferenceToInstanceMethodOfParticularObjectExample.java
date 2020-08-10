package com.espark.adarsh.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by Adarsh on 7/4/15.
 */
public class ReferenceToInstanceMethodOfParticularObjectExample {

    public static void main(String[] args) {
        final List<Integer> integerList= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10);
        ReferenceToInstanceMethodOfParticularObjectExample.acceptConsumer(integerList,integerValue -> System.out.println(integerValue));
        ReferenceToInstanceMethodOfParticularObjectExample.acceptConsumer(integerList,System.out::println);
    }

    public static void acceptConsumer(final List<Integer> inputIntegerList,final Consumer<Integer> integerConsumer){
        inputIntegerList.forEach(integerValue -> integerConsumer.accept(integerValue));
    }
}
