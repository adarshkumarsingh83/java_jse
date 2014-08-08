package com.adarsh.collection.map;

import org.junit.Test;

import java.util.Map;
import java.util.WeakHashMap;

/**
 * Created with IntelliJ IDEA.
 * User: adarsh_k
 * Date: 3/14/14
 * Time: 6:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class WeekHashMapExample {


    private Map map;
    @Test
    public void testBasic() {
        map = new WeakHashMap();
        map.put(new String("Adarsh"), "Radha");

        System.out.println("Map Entry Before Thread " + map);

        final Thread thread = new Thread(new Runnable() {
            public void run() {
                while (map.containsKey("Adarsh")) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException ignored) {
                    }
                    System.out.println("Thread waiting");
                    System.gc();
                }
            }
        });

        thread.start();
        System.out.println("Main waiting");
        try {
            thread.join();
        } catch (InterruptedException ignored) {
        }
        System.out.println("Map Entry " + map);
    }

}
