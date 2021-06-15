package com.espark.adarsh;

import java.util.HashMap;
import java.util.Map;

public class LruCache<K, V> {

    int size = 10;
    Map<K, Value<V>> store = null;

    public LruCache(int size) {
        this.size = size;
        store = new HashMap<K, Value<V>>(size);
    }

    public void setCacheValue(K key, V val) {
        try {
            Thread.currentThread().sleep(10);
        } catch (Exception e) {
            e.getLocalizedMessage();
        }
        Value<V> value = new Value<V>(val);
        if (store.size() < this.size) {
            store.put(key, value);
        } else {
            long lruTime = Long.MAX_VALUE;
            K lruKey = null;
            for (Map.Entry<K, Value<V>> entry : store.entrySet()) {
                if (lruTime > entry.getValue().getTimeStamp()) {
                    lruTime = entry.getValue().getTimeStamp();
                    lruKey = entry.getKey();
                }
            }
            store.remove(lruKey);
            store.put(key, value);
        }
    }

    public V getCacheValue(K key) {
        if (store.containsKey(key)) {
            return store.get(key).getValue();
        } else {
            System.out.println("Key Not Found ");
            return null;
        }
    }


    void displayCache() {
        System.out.println();
        for (Map.Entry<K, Value<V>> entry : store.entrySet()) {
            System.out.println(" Key " + entry.getKey() + " Value " + entry.getValue().getValue() + " Time " + entry.getValue().getTimeStamp());
        }
    }

    static class Value<V> {
        V value;
        Long timeStamp;

        Value(V value) {
            this.value = value;
            this.timeStamp = System.currentTimeMillis();
        }

        public V getValue() {
            this.timeStamp = System.currentTimeMillis();
            return value;
        }

        public void setValue(V value) {
            this.value = value;
            this.timeStamp = System.currentTimeMillis();
        }

        public Long getTimeStamp() {
            return timeStamp;
        }

    }

}
