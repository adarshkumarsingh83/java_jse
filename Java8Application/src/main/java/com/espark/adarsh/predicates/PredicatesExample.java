package com.espark.adarsh.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Adarsh on 6/22/15.
 */
public class PredicatesExample {

    public static void main(String[] args) {
        final PredicatesExample predicatesExample=new PredicatesExample();
        final List<Integer> integerList= Arrays.asList(0,1,2,3,4,5,6,7,8,9,10);
        System.out.println("Printing All the Values "+predicatesExample.predicatesEvaluation(inputValues -> true, integerList));
        System.out.println("Printing All Even Values "+predicatesExample.predicatesEvaluation(inputValues -> ((Integer) inputValues & 1) == 0, integerList));
        System.out.println("Printing All Odd Values "+predicatesExample.predicatesEvaluation(inputValues -> ((Integer) inputValues & 1) == 1, integerList));
    }

    public List<Integer> predicatesEvaluation(Predicate predicate, List<Integer> integerInputList){
        final List<Integer> integerOutputList=new ArrayList<>();
        for(Integer integerValue:integerInputList){
            if(predicate.test(integerValue)){
                integerOutputList.add(integerValue);
            }
        }
        return integerOutputList;
    }
}
