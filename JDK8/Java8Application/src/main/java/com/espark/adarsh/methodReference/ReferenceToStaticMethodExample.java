package com.espark.adarsh.methodReference;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Adarsh on 7/4/15.
 */
public class ReferenceToStaticMethodExample {

    public static void main(String[] args) {
       final List<Integer> integerList= Arrays.asList(1,2,3,4,5,6,7,8,10);

        // Traditional Way of calling method
        final List<Integer> evenNumberList1=ReferenceToStaticMethodExample
                .testPredicate(integerList,value -> ReferenceToStaticMethodExample.isEvenNumber(value));
        System.out.println(evenNumberList1);

        // New Way of Calling method
        final List<Integer> evenNumberList2=ReferenceToStaticMethodExample
                .testPredicate(integerList,ReferenceToStaticMethodExample::isEvenNumber);
        System.out.println(evenNumberList2);

        // Traditional Way of calling method
        final List<Integer> oddNumberList1=ReferenceToStaticMethodExample
                .testPredicate(integerList,value -> ReferenceToStaticMethodExample.isOddNumber(value));
        System.out.println(oddNumberList1);

        // New Way of Calling method
        final List<Integer> oddNumberList2=ReferenceToStaticMethodExample
                .testPredicate(integerList, ReferenceToStaticMethodExample::isOddNumber);
        System.out.println(oddNumberList2);


    }

    public static boolean isEvenNumber(Integer value){
        return (value & 1) == 0;
    }

    public static boolean isOddNumber(Integer value){
        return (value & 1) != 0;
    }

    public static List<Integer> testPredicate(List<Integer> inputIntegerList,final Predicate<Integer> integerPredicate){
          final List<Integer> returnIntegerList=new ArrayList<Integer>();
          for(Integer value:inputIntegerList){
              if(integerPredicate.test(value)){
                  returnIntegerList.add(value);
              }
          }
        return returnIntegerList;
    }
}
