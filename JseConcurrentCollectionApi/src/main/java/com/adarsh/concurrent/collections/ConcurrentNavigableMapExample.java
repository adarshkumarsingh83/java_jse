package com.adarsh.concurrent.collections;

import org.junit.Test;

import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/16/14
 * Time: 3:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class ConcurrentNavigableMapExample {


    @Test
    public void m1() {
        /* Returns a view of the portion of this map whose keys are
         strictly less than toKey */
        final ConcurrentNavigableMap map = new ConcurrentSkipListMap() {
            {
                put("1", "one");
                put("2", "two");
                put("3", "three");
            }
        };

        ConcurrentNavigableMap headMap = map.headMap("2");
        System.out.println(headMap);
    }

    @Test
    public void m2() {
        /* Returns a view of the portion of this map whose keys are
         greater than or equal to  fromKey */
        final ConcurrentNavigableMap map = new ConcurrentSkipListMap() {
            {
                put("1", "one");
                put("2", "two");
                put("3", "three");
            }
        };

        ConcurrentNavigableMap tailMap = map.tailMap("2");
        System.out.println(tailMap);
    }

    @Test
    public void m3() {
        /* Returns a view of the portion of this map whose keys range from
        fromKey, inclusive, to  toKey, exclusive.*/
        final ConcurrentNavigableMap map = new ConcurrentSkipListMap() {
            {
                put("1", "one");
                put("2", "two");
                put("3", "three");
            }
        };

        ConcurrentNavigableMap subMap = map.subMap("2", "3");
        System.out.println(subMap);
    }
}
