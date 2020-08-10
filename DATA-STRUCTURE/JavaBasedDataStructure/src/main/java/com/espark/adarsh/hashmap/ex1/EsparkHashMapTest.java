package com.espark.adarsh.hashmap.ex1;

/**
 * Created by Adarsh on 9/4/15.
 */
public class EsparkHashMapTest {

    // for testing our own map
    public static void main(String[] args) {

        EsparkHashMap<String, String> esparkHashMap = new EsparkHashMap<String, String>();

        esparkHashMap.put("Adarsh", "SMTS");
        esparkHashMap.put("Radha", "SSE");
        esparkHashMap.put("Niranjan", "SMTS1");
        esparkHashMap.put("Adarsh", "SSE");

        EsparkHashMap.EsparkEntry e = esparkHashMap.get("Niranjan");
        System.out.println("" + e.getValue());
        System.out.println("=> " + esparkHashMap);
    }
}
