package com.espark.adarsh;

import java.util.Random;

public class ApplicationMain {
    public static void main(String[] args) {
        final LruCache<String, String> lruCache = new LruCache<String, String>(5);
        lruCache.setCacheValue("A","A");
        lruCache.setCacheValue("B","B");
        lruCache.setCacheValue("C","C");
        lruCache.setCacheValue("D","D");
        lruCache.setCacheValue("E","E");
        lruCache.getCacheValue("C");
        lruCache.getCacheValue("C");
        lruCache.displayCache();
        lruCache.setCacheValue("A1","A1");
        lruCache.setCacheValue("B1","B1");
        lruCache.getCacheValue("E");
        lruCache.getCacheValue("E");
        lruCache.displayCache();
        lruCache.setCacheValue("C1","C1");
        lruCache.setCacheValue("D1","D1");
        lruCache.getCacheValue("A1");
        lruCache.getCacheValue("E");
        lruCache.displayCache();
        lruCache.setCacheValue("E1","E1");
        lruCache.displayCache();
    }


    public static int getRandomValue(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
