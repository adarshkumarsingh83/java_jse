package com.espark.adarsh.unaryOperator;

import com.sun.org.apache.regexp.internal.recompile;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

/**
 * Created by Adarsh on 6/23/15.
 */
public class UnaryOperatorExample {

    public static void main(String[] args) {
        final List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final UnaryOperatorProcessor unaryOperatorProcessor=new UnaryOperatorProcessor();
        System.out.println(unaryOperatorProcessor.applyOperator(values -> values ,integerList));
        System.out.println(unaryOperatorProcessor.applyOperator(values -> values * values, integerList));

        final UnaryOperatorGenericProcessor<Integer> unaryOperatorGenericProcessorInteger=new UnaryOperatorGenericProcessor<Integer>();
        System.out.println(unaryOperatorGenericProcessorInteger.applyOperator(values -> values, integerList));
        System.out.println(unaryOperatorGenericProcessorInteger.applyOperator(values -> values * values, integerList));

        final List<Float> floatList = Arrays.asList(0.0F, 1.1F, 2.2F, 3.3F, 4.4F, 5.5F, 6.6F, 7.7F, 8.8F, 9.9F, 10.10F);
        final UnaryOperatorGenericProcessor<Float> unaryOperatorGenericProcessorFloat=new UnaryOperatorGenericProcessor<Float>();
        System.out.println(unaryOperatorGenericProcessorFloat.applyOperator(values -> values, floatList));
        System.out.println(unaryOperatorGenericProcessorFloat.applyOperator(values -> values * values, floatList));

        System.out.println(unaryOperatorGenericProcessorFloat.applyAndThen(values -> values,values -> values, floatList));
        System.out.println(unaryOperatorGenericProcessorFloat.applyAndThen(values -> values + values, values -> values * values,floatList));

        System.out.println(unaryOperatorGenericProcessorFloat.applyCompose(values -> values,values -> values, floatList));
        System.out.println(unaryOperatorGenericProcessorFloat.applyCompose(values -> values + values, values -> values * values,floatList));
    }
}

class UnaryOperatorProcessor{

    public List<Integer> applyOperator(UnaryOperator<Integer> unaryOperator,List<Integer> integerList){
        final List<Integer> returnList=new ArrayList<>();
        integerList.forEach(values -> returnList.add(unaryOperator.apply(values)));
      return returnList;
    }
}

class UnaryOperatorGenericProcessor<T>{

    public List<T> applyOperator(UnaryOperator<T> unaryOperator,List<T> list){
        final List<T> returnList=new ArrayList<T>();
        list.forEach(values -> returnList.add(unaryOperator.apply(values)));
        return returnList;
    }

    public List<T> applyAndThen(UnaryOperator<T> unaryOperator1,UnaryOperator<T> unaryOperator2,List<T> list){
        final List<T> returnList=new ArrayList<T>();
        list.forEach(values -> returnList.add(unaryOperator1.andThen(unaryOperator2).apply(values)));
        return returnList;
    }

    public List<T> applyCompose(UnaryOperator<T> unaryOperator1,UnaryOperator<T> unaryOperator2,List<T> list){
        final List<T> returnList=new ArrayList<T>();
        list.forEach(values -> returnList.add(unaryOperator1.compose(unaryOperator2).apply(values)));
        return returnList;
    }
}