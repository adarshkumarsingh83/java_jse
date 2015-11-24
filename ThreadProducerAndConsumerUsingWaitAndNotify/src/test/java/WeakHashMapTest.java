/**
 * Created by Adarsh on 9/3/15.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapTest {

    public static void main(String[] args) {

        Map hashMap = new HashMap();
        Map weakHashMap = new WeakHashMap();

        String keyHashMap = new String("keyHashMap");
        String keyWeakHashMap = new String("keyWeakHashMap");

        hashMap.put(keyHashMap, "Adarsh");
        weakHashMap.put(keyWeakHashMap, "Amit");

        System.gc();
        System.out.println("Before: hash map value:" + hashMap.get("keyHashMap")
                + " and weak hash map value:" + weakHashMap.get("keyWeakHashMap"));

        keyHashMap = null;
        keyWeakHashMap = null;

        System.gc();

        System.out.println("After: hash map value:" + hashMap.get("keyHashMap")
                + " and weak hash map value:" + weakHashMap.get("keyWeakHashMap"));
    }
}