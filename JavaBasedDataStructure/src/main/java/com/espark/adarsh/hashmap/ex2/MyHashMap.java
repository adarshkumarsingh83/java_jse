package com.espark.adarsh.hashmap.ex2;

/**
 * Created by Adarsh on 9/4/15.
 */
public class MyHashMap<K, V> {

    private int DEFAULT_BUCKET_COUNT = 128;

    private static class MyEntry<K, V> {

        private final K key;
        private V value;
        private MyEntry<K, V> next;

        public MyEntry(K key, V value) {
            this.key = key;
            this.setValue(value);
        }

        public K getKey() {
            return key;
        }

        public void setValue(V value) {
            this.value = value;
        }

        public V getValue() {
            return value;
        }

        public void setNext(MyEntry<K, V> next) {
            this.next = next;
        }

        public MyEntry<K, V> getNext() {
            return next;
        }
    }

    private MyEntry<K, V>[] buckets;

    public MyHashMap() {
        this.buckets = new MyEntry[DEFAULT_BUCKET_COUNT];
    }

    public V get(K key) {
        this.throwIfKeyNull(key);

        MyEntry<K, V> entry = this.buckets[bucketIndexForKey(key)];
        while (entry != null && !key.equals(entry.getKey()))
            entry = entry.getNext();
        return entry != null ? entry.getValue() : null;
    }

    public void put(K key, V value) {
        this.throwIfKeyNull(key);
        int bucketIndex = this.bucketIndexForKey(key);
        MyEntry<K, V> entry = buckets[bucketIndex];

        if (null != entry) {
            boolean done = false;
            while (!done) {
                if (key.equals(entry.getKey())) {
                    entry.setValue(value);
                    done = true;
                } else if (entry.getNext() == null) {
                    entry.setNext(new MyEntry<K, V>(key, value));
                    done = true;
                }
                entry = entry.getNext();
            }
        } else {
            //nothing there at all; just shove the new entry in
            buckets[bucketIndex] = new MyEntry<K, V>(key, value);
        }
    }

    /**
     * THIS SHOULDN'T ACTUALLY BE PUBLIC; IT IS SO JUST FOR CLARIFICATION UNIT TEST PURPOSES
     */
    public int bucketIndexForKey(K key) {
        int bucketIndex = key.hashCode() % buckets.length;
        return bucketIndex;
    }

    private void throwIfKeyNull(K key) {
        if (key == null) {
            throw new IllegalArgumentException("key may not be null");
        }
    }
}

