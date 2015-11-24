package com.adarsh.concurrent;

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

    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }

    public static void m1() {
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

    public static void m2() {
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

    public static void m3() {
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
