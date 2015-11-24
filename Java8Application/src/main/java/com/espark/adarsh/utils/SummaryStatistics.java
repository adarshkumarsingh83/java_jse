package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;

/**
 * Java 8 has introduced util classes to get statistical data.
 * These classes are java.util.DoubleSummaryStatistics and java.util.IntSummaryStatistics.
 * These classes provides different methods using which we can calculate statistical data.
 * We can also combine two instances of DoubleSummaryStatistics and in the same way
 * we can combine IntSummaryStatistics too
 */
public class SummaryStatistics {

    /**
     * accept()
     * accept() method adds the element and is available in both DoubleSummaryStatistics
     * and IntSummaryStatistics class.
     * <p>
     * getAverage()
     * getAverage() method returns average of all accepted value as a double.
     * This method is available in both the class DoubleSummaryStatistics and IntSummaryStatistics.
     * <p>
     * getCount()
     * getCount() method calculates the count of all element and is available in both
     * the class the class DoubleSummaryStatistics and IntSummaryStatistics.
     * <p>
     * getMax()
     * Using getMax() method we can get the maximum value which has been added.
     * This method is present in both the class DoubleSummaryStatistics and IntSummaryStatistics.
     * <p>
     * getMin()
     * Using getMin() method we can get the minimum value which has been added and is available in both
     * the class DoubleSummaryStatistics and IntSummaryStatistics.
     * <p>
     * getSum()
     * getSum() method provides the sum of all elements added. We can get this method in both the
     * class DoubleSummaryStatistics and IntSummaryStatistics.
     * <p>
     * combine()
     * We can combine two instances of DoubleSummaryStatistics and then can get all statistics.
     * And in the same way IntSummaryStatistics provides combine() method.
     */



    @Test
    public void doubleSummaryStatistics1() {
        DoubleSummaryStatistics dblSumStat = new DoubleSummaryStatistics();
        dblSumStat.accept(123.34);
        dblSumStat.accept(100.25);
        dblSumStat.accept(20.55);
        dblSumStat.accept(323.84);
        dblSumStat.accept(67.14);
        //Find the average
        System.out.println("Average:" + dblSumStat.getAverage());
        //Find maximum
        System.out.println("Maximum:" + dblSumStat.getMax());
        //Find minimum
        System.out.println("Minimum:" + dblSumStat.getMin());
        //Find Sum
        System.out.println("Sum:" + dblSumStat.getSum());
        //Find count
        System.out.println("Count:" + dblSumStat.getCount());
    }


    @Test
    public void doubleSummaryStatistics2() {
        DoubleSummaryStatistics dblSumStatOne = new DoubleSummaryStatistics();
        dblSumStatOne.accept(123.34);
        dblSumStatOne.accept(100.25);
        dblSumStatOne.accept(20.55);
        //Find the average
        System.out.println("Average:" + dblSumStatOne.getAverage());
        //Find count
        System.out.println("Count:" + dblSumStatOne.getCount());
        DoubleSummaryStatistics dblSumStatTwo = new DoubleSummaryStatistics();
        dblSumStatTwo.accept(323.84);
        dblSumStatTwo.accept(67.14);
        // Combine another DoubleSummaryStatistics
        dblSumStatOne.combine(dblSumStatTwo);
        System.out.println("Average and Count after combining second DoubleSummaryStatistics");
        //Average after combining second DoubleSummaryStatistics
        System.out.println("Average:" + dblSumStatOne.getAverage());
        //Count after combining second DoubleSummaryStatistics
        System.out.println("Count:" + dblSumStatOne.getCount());
    }

    @Test
    public void intSummaryStatistics() {
        IntSummaryStatistics intSumStatOne = new IntSummaryStatistics();
        intSumStatOne.accept(123);
        intSumStatOne.accept(100);
        intSumStatOne.accept(20);
        //Find the average
        System.out.println("Average:" + intSumStatOne.getAverage());
        //Find count
        System.out.println("Count:" + intSumStatOne.getCount());
        IntSummaryStatistics intSumStatTwo = new IntSummaryStatistics();
        intSumStatTwo.accept(323);
        intSumStatTwo.accept(67);
        // Combine another IntSummaryStatistics
        intSumStatTwo.combine(intSumStatTwo);
        System.out.println("Average and Count after combining second IntSummaryStatistics");
        //Average after combining second IntSummaryStatistics
        System.out.println("Average:" + intSumStatTwo.getAverage());
        //Count after combining second IntSummaryStatistics
        System.out.println("Count:" + intSumStatTwo.getCount());
    }

}
