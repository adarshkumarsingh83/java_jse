package com.espark.adarsh.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Adarsh on 6/22/15.
 */
public class PredicateGenericExample<T> {

    public static void main(String[] args) {
        final List<Integer> integerList = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final PredicateGenericExample<Integer> integerPredicateGenericExample = new PredicateGenericExample();
        System.out.println("Printing All the Values " + integerPredicateGenericExample.predicateTest(inputValues -> true, integerList));
        System.out.println("Printing All Even Values " + integerPredicateGenericExample.predicateTest(inputValues -> ((Integer) inputValues & 1) == 0, integerList));
        System.out.println("Printing All Odd Values " + integerPredicateGenericExample.predicateTest(inputValues -> ((Integer) inputValues & 1) == 1, integerList));

        final List<String> stringList = Arrays.asList("adarsh", "sonu", "radha", "amit", "monu");
        final PredicateGenericExample<String> stringPredicatesExample = new PredicateGenericExample();
        System.out.println("All String " + stringPredicatesExample.predicateTest(stringValues -> true, stringList));
        System.out.println("String Contains 'a' char " + stringPredicatesExample.predicateTest(stringValues -> ((String) stringValues).contains("a"), stringList));
        System.out.println("String Doesn't Contains 'a' char" + stringPredicatesExample.predicateTest(stringValues -> !((String) stringValues).contains("a"), stringList));

        final List<Object> objectList = Arrays.asList(new Integer(10), "adarsh", new Long(10l), "radha");
        final PredicateGenericExample<Object> objectPredicateGenericExample = new PredicateGenericExample();
        System.out.println("All Object " + objectPredicateGenericExample.predicateTest(objectValues -> true, objectList));
        System.out.println("Object instance of Strings " + objectPredicateGenericExample.predicateTest(objectValues -> (objectValues instanceof String), objectList));


        final List<Integer> integerList1 = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final PredicateGenericExample<Integer> integerPredicateGenericExample1 = new PredicateGenericExample();
        System.out.println("Negate Printing All the Values " + integerPredicateGenericExample1.predicateNegate(inputValues -> true, integerList1));
        System.out.println("Negate Printing All Even Values " + integerPredicateGenericExample1.predicateNegate(inputValues -> ((Integer) inputValues & 1) == 0, integerList1));
        System.out.println("Negate Printing All Odd Values " + integerPredicateGenericExample1.predicateNegate(inputValues -> ((Integer) inputValues & 1) == 1, integerList1));



        final List<Integer> integerList2 = Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        final PredicateGenericExample<Integer> integerPredicateGenericExample2 = new PredicateGenericExample();
        System.out.println("Or Printing All the Values " + integerPredicateGenericExample2.predicateOr(inputValue -> ( inputValue % 2) == 0,inputValue -> ( inputValue % 2) == 1, integerList2));


        final List<String> stringList3 = Arrays.asList("adarsh", "sonu", "radha", "amit", "monu");
        final PredicateGenericExample<String> stringPredicatesExample3 = new PredicateGenericExample();
        System.out.println("String Contains 'a' and 'd' char " + stringPredicatesExample3.predicateAnd(stringValues -> ((String) stringValues).contains("a"),stringValues -> ((String) stringValues).contains("d"), stringList3));
    }

    public List<T> predicateTest(Predicate predicate, List<T> inputList) {
        final List<T> outputList = new ArrayList<T>();
        for (T value : inputList) {
            if (predicate.test(value)) {
                outputList.add(value);
            }
        }
        return outputList;
    }

    public List<T> predicateNegate(Predicate predicate, List<T> inputList) {
        final List<T> outputList = new ArrayList<T>();
        for (T value : inputList) {
            if (predicate.negate().test(value)) {
                outputList.add(value);
            }
        }
        return outputList;
    }

    public List<T> predicateOr(Predicate<T> predicate1, Predicate<T> predicate2, List<T> inputList) {
        final List<T> outputList = new ArrayList<T>();
        for (T value : inputList) {
            if ((predicate1.or(predicate2)).test(value)) {
                outputList.add(value);
            }
        }
        return outputList;
    }

    public List<T> predicateAnd(Predicate<T> predicate1, Predicate<T> predicate2, List<T> inputList) {
        final List<T> outputList = new ArrayList<T>();
        for (T value : inputList) {
            if ((predicate1.and(predicate2)).test(value)) {
                outputList.add(value);
            }
        }
        return outputList;
    }
}
