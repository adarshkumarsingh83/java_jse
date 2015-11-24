package com.espark.adarsh.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Created by Adarsh on 6/22/15.
 */
public class FunctionExample<T1, T2> {

    public static void main(String[] args) {

        final FunctionExample<Integer, Double> functionExample = new FunctionExample<Integer, Double>();
        final List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(functionExample.convertDataFunction(new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return new Double(integer);
            }
        }, integerList));
        System.out.println(functionExample.convertDataFunction((Integer value) -> {
            return new Double(value);
        }, integerList));
        System.out.println(functionExample.convertDataFunction((value) -> {
            return new Double(value);
        }, integerList));
        System.out.println(functionExample.convertDataFunction(value -> new Double(value), integerList));
        System.out.println(functionExample.convertDataFunction(Double::new, integerList));
        //[1.0, 2.0, 3.0, 4.0, 5.0]
        System.out.println("==========================================");

        final FunctionExample<Integer, Double> functionExample1 = new FunctionExample<Integer, Double>();
        final List<Integer> integerList1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(functionExample1.convertGenericDataFunction(new Function<Integer, Double>() {
            @Override
            public Double apply(Integer integer) {
                return new Double(integer);
            }
        }, integerList1));
        System.out.println(functionExample1.convertGenericDataFunction((Integer value) -> {
            return new Double(value);
        }, integerList1));
        System.out.println(functionExample1.convertGenericDataFunction((value) -> new Double(value), integerList1));
        System.out.println(functionExample1.convertGenericDataFunction(value -> new Double(value), integerList1));
        System.out.println(functionExample1.convertGenericDataFunction(Double::new, integerList1));
        //[1.0, 2.0, 3.0, 4.0, 5.0]

        System.out.println("==========================================");

        final FunctionExample<Integer, Double> functionExample2 = new FunctionExample<Integer, Double>();
        final List<Integer> integerList2 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(functionExample2.convertGenericDataFunctionAndThen(
                new Function<Integer, Double>() {
                    @Override
                    public Double apply(Integer integer) {
                        return new Double(integer) + new Double(integer);
                    }
                }, new Function<Double, Double>() {
                    @Override
                    public Double apply(Double aDouble) {
                        return aDouble * aDouble;
                    }
                }, integerList2
        ));

        System.out.println(functionExample2.convertGenericDataFunctionAndThen(
                (Integer integer) -> {
                    return new Double(integer) + new Double(integer);
                }
                , (Double aDouble) -> {
            return aDouble * aDouble;
        }
                , integerList2
        ));

        System.out.println(functionExample2.convertGenericDataFunctionAndThen(
                (integer) -> new Double(integer) + new Double(integer)
                , (aDouble) -> aDouble * aDouble
                , integerList2
        ));

        System.out.println(functionExample2.convertGenericDataFunctionAndThen(
                value -> new Double(value) + new Double(value)
                , value -> new Double(value) * new Double(value)
                , integerList2));

        //[4.0, 16.0, 36.0, 64.0, 100.0]

        System.out.println("==========================================");

        final FunctionExample<Integer, Double> functionExample3 = new FunctionExample<Integer, Double>();
        final List<Integer> integerList3 = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println(functionExample3.convertGenericDataFunctionCompose(
                new Function<Integer, Double>() {
                    @Override
                    public Double apply(Integer integer) {
                        return new Double(integer) * new Double(integer);
                    }
                }, new Function<Double, Double>() {
                    @Override
                    public Double apply(Double aDouble) {
                        return new Double(aDouble) + new Double(aDouble);
                    }
                }
                , integerList3
        ));

        System.out.println(functionExample3.convertGenericDataFunctionCompose(
                (Integer integer) -> {
                    return new Double(integer) * new Double(integer);
                }, (Double aDouble) -> {
            return new Double(aDouble) + new Double(aDouble);
        }, integerList3));

        System.out.println(functionExample3.convertGenericDataFunctionCompose(
                (integer) -> {
                    return new Double(integer) * new Double(integer);
                }, (aDouble) -> {
            return new Double(aDouble) + new Double(aDouble);
        }, integerList3));

        System.out.println(functionExample3.convertGenericDataFunctionCompose(
                value -> new Double(value) * new Double(value)
                , value -> new Double(value) + new Double(value)
                , integerList3));
        //[2.0, 8.0, 18.0, 32.0, 50.0]
        System.out.println("==========================================");
    }

    public List<Double> convertDataFunction(Function<Integer, Double> function, List<Integer> inputList) {
        final List<Double> outputList = new ArrayList<>();
        inputList.forEach(value -> outputList.add(function.apply(value)));
        return outputList;
    }


    public List<T2> convertGenericDataFunction(Function<T1, T2> function, List<T1> inputList) {
        final List<T2> outputList = new ArrayList<T2>();
        inputList.forEach(value -> outputList.add(function.apply(value)));
        return outputList;
    }

    public List<T2> convertGenericDataFunctionAndThen(Function<T1, T2> function1, Function<T2, T2> function2, List<T1> inputList) {
        final List<T2> outputList = new ArrayList<T2>();
        inputList.forEach(value -> outputList.add(function1.andThen(function2).apply(value)));
        return outputList;
    }

    public List<T2> convertGenericDataFunctionCompose(Function<T1, T2> function1, Function<T2, T2> function2, List<T1> inputList) {
        final List<T2> outputList = new ArrayList<T2>();
        inputList.forEach(value -> outputList.add(function2.compose(function1).apply(value)));
        return outputList;
    }
}
