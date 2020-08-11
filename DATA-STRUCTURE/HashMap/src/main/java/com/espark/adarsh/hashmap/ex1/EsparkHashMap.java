package com.espark.adarsh.hashmap.ex1;

import java.util.Arrays;

/**
 * Created by Adarsh on 9/4/15.
 */
public class EsparkHashMap<K, V> {
    // for simplicity size is taken as 2^4
    private static final int SIZE = 16;
    private EsparkEntry table[] = new EsparkEntry[SIZE];

    /**
     * User defined simple Map data structure
     * with key and value.
     * This is also used as linked list in case multiple
     * key-value pairs lead to the same bucket with same
     * hashCodes and different keys (collisions) using
     * pointer 'next'.
     *
     * @author adarsh
     */
    static class EsparkEntry<K, V> {

        private final K key;
        private V value;
        private EsparkEntry<K, V> next;

        public EsparkEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        @Override
        public String toString() {
            return "EsparkEntry{" +
                    "key=" + key +
                    ", value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    /**
     * Returns the entry associated with the specified key in the
     * HashMap.  Returns null if the HashMap contains no mapping
     * for the key.
     */
    public EsparkEntry<K, V> get(K key) {
        int hash = key.hashCode() % SIZE;
        EsparkEntry entry = table[hash];

        // if bucket is found then traverse through the linked list and
        // see if element is present
        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry;
            }
            entry = entry.next;
        }
        return null;
    }

    /**
     * Associates the specified value with the specified key in this map.
     * If the map previously contained a mapping for the key, the old
     * value is replaced.
     */
    public void put(K key, V value) {
        int hash = key.hashCode() % SIZE;
        EsparkEntry entry = table[hash];
        if (entry != null) {
            // it means we are trying to insert duplicate
            // key-value pair, hence overwrite the current
            // pair with the old pair
            if (entry.key.equals(key)) {
                entry.value = value;
            } else {
                // traverse to the end of the list and insert new element 
                // in the same bucket
                while (entry.next != null) {
                    entry = entry.next;
                }
                EsparkEntry esparkEntryInOldBucket = new EsparkEntry(key, value);
                entry.next = esparkEntryInOldBucket;
            }
        } else {
            // new element in the map, hence creating new bucket
            EsparkEntry esparkEntryInNewBucket = new EsparkEntry(key, value);
            table[hash] = esparkEntryInNewBucket;
        }
    }

    @Override
    public String toString() {
        return "EsparkHashMap{" +
                "table=" + Arrays.toString(table) +
                '}';
    }


}