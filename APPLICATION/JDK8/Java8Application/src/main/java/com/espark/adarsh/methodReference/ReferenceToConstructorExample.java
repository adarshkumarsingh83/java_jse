package com.espark.adarsh.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Adarsh on 7/4/15.
 */
public class ReferenceToConstructorExample {

    public static void main(String[] args) {
        final List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 10);

        final List<Double> doubleList1 = ReferenceToConstructorExample
                .applyFunction(integerList, new Function<Integer, Double>() {
                    @Override
                    public Double apply(Integer integer) {
                        return new Double(integer);
                    }
                });
        System.out.println(doubleList1);

        final List<Double> doubleList2 = ReferenceToConstructorExample
                .applyFunction(integerList, (value) -> {
                    return new Double(value);
                });
        System.out.println(doubleList2);

        final List<Double> doubleList3 = ReferenceToConstructorExample
                .applyFunction(integerList, (value) -> new Double(value));
        System.out.println(doubleList3);

        final List<Double> doubleList4 = ReferenceToConstructorExample
                .applyFunction(integerList, value -> new Double(value));
        System.out.println(doubleList4);

        final List<Double> doubleList5 = ReferenceToConstructorExample
                .applyFunction(integerList, Double::new);
        System.out.println(doubleList5);

    }

    public static List<Double> applyFunction(List<Integer> inputIntegerList, Function<Integer, Double> integerDoubleFunction) {
        final List<Double> outputList = new ArrayList<Double>();
        inputIntegerList.forEach(value -> outputList.add(integerDoubleFunction.apply(value)));
        return outputList;
    }
}
