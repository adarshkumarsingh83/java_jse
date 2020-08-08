package com.espark.adarsh.streams;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by akumar6 on 7/11/2016.
 */
public class FlatMapTypesExample {

    static class Details<T> {
        private List<T> list = new ArrayList<T>();

        public Details(T value) {
            this.list.add(value);
        }
    }

    public static void main(String[] args) {

        /*flat map to int */
        final List<Details<Integer>> detailsArrayListInteger = new ArrayList<Details<Integer>>();
        for (int i = 0; i < 5; i++) {
            detailsArrayListInteger.add(new Details<Integer>(i));
        }
        detailsArrayListInteger.stream()
                .flatMapToInt(details -> details.list.stream().mapToInt(Integer::intValue))
                .forEach(integer -> System.out.println(integer));


        /*flat map to long */
        final List<Details<Long>> detailsArrayListLong = new ArrayList<Details<Long>>();
        for (int i = 0; i < 5; i++) {
            detailsArrayListLong.add(new Details<Long>((long) i));
        }
        detailsArrayListLong.stream()
                .flatMapToLong(details -> details.list.stream().mapToLong(Long::longValue))
                .forEach(longValue -> System.out.println(longValue));


        /*flat map to double */
        final List<Details<Double>> detailsArrayListDouble = new ArrayList<Details<Double>>();
        for (int i = 0; i < 5; i++) {
            detailsArrayListDouble.add(new Details<Double>((double) i));
        }
        detailsArrayListDouble.stream()
                .flatMapToDouble(details -> details.list.stream().mapToDouble(Double::doubleValue))
                .forEach(doubleValue -> System.out.println(doubleValue));
    }

}
