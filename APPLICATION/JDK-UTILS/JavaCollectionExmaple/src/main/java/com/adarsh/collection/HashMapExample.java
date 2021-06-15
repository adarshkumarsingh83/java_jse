package com.adarsh.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/18/14
 * Time: 8:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class HashMapExample {

    public static void main(String[] args) {

    }

    public static void hashMapBasicOperattion() {
        HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from hashmap
        System.out.println("Value of second: " + hm.get("second"));
        System.out.println("Is HashMap empty? " + hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the HashMap: " + hm.size());
    }

    /*How to iterate through HashMap*/
    public static void hashMapIteration() {
        final HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        final Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println("Value of " + key + " is: " + hm.get(key));
        }
    }

    /*How to copy Map content to another HashMap*/
    public static void hashMapCopy() {
        final HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        HashMap<String, String> subMap = new HashMap<String, String>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        hm.putAll(subMap);
        System.out.println(hm);
    }

    /*How to search a key in HashMap*/
    public static void hashMapSearchKey() {
        final HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        if (hm.containsKey("first")) {
            System.out.println("The hashmap contains key first");
        } else {
            System.out.println("The hashmap does not contains key first");
        }
        if (hm.containsKey("fifth")) {
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key fifth");
        }
    }

    /*How to get all keys from HashMap*/
    public static void hashMapGetAllKey() {
        final HashMap<String, String> hm = new HashMap<String, String>() {
            {
                //add key-value pair to hashmap
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };

        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }

    /*How to get entry set from HashMap*/
    public static void hashMapGetEntrySet() {
        final HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from hashmap
        Set<Map.Entry<String, String>> entires = hm.entrySet();
        for (Map.Entry<String, String> ent : entires) {
            System.out.println(ent.getKey() + " ==> " + ent.getValue());
        }
    }

    /*How to delete all elements from HashMap*/
    public static void hashSetDeleteAllElement() {
        final HashMap<String, String> hm = new HashMap<String, String>();
        //add key-value pair to hashmap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println("My HashMap content:");
        System.out.println(hm);
        System.out.println("Clearing HashMap:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
    }

    /*How to eliminate duplicate user defined objects as a key from HashMap*/
    public static void hashSetEliminateDuplicate() {
        final class Price{

            private String item;
            private int price;

            public Price(String itm, int pr){
                this.item = itm;
                this.price = pr;
            }

            public int hashCode(){
                int hashcode = 0;
                hashcode = price*20;
                hashcode += item.hashCode();
                return hashcode;
            }

            public boolean equals(Object obj){
                if (obj instanceof Price) {
                    Price pp = (Price) obj;
                    return (pp.item.equals(this.item) && pp.price == this.price);
                } else {
                    return false;
                }
            }

            public String getItem() {
                return item;
            }
            public void setItem(String item) {
                this.item = item;
            }
            public int getPrice() {
                return price;
            }
            public void setPrice(int price) {
                this.price = price;
            }

            public String toString(){
                return "item: "+item+"  price: "+price;
            }
        }

        final HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        Set<Price> keys = hm.keySet();
        for(Price p:keys){
            System.out.println(p+"==>"+hm.get(p));
        }
        Price key = new Price("Banana", 20);
        System.out.println("Adding duplicate key...");
        hm.put(key, "Grape");
        System.out.println("After adding dulicate key:");
        Set<Price> keys1 = hm.keySet();
        for(Price p:keys1){
            System.out.println(p+"==>"+hm.get(p));
        }
    }

    /*How to find user defined objects as a key from HashMap*/
    public static void hashMapCustomObjectAsKey(){
        final class Price{

            private String item;
            private int price;

            public Price(String itm, int pr){
                this.item = itm;
                this.price = pr;
            }

            public int hashCode(){
                System.out.println("In hashcode");
                int hashcode = 0;
                hashcode = price*20;
                hashcode += item.hashCode();
                return hashcode;
            }

            public boolean equals(Object obj){
                System.out.println("In equals");
                if (obj instanceof Price) {
                    Price pp = (Price) obj;
                    return (pp.item.equals(this.item) && pp.price == this.price);
                } else {
                    return false;
                }
            }

            public String getItem() {
                return item;
            }
            public void setItem(String item) {
                this.item = item;
            }
            public int getPrice() {
                return price;
            }
            public void setPrice(int price) {
                this.price = price;
            }

            public String toString(){
                return "item: "+item+"  price: "+price;
            }
        }

        final HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        Set<Price> keys = hm.keySet();
        for(Price p:keys){
            System.out.println(p+"==>"+hm.get(p));
        }
        Price key = new Price("Banana", 20);
        System.out.println("Does key available? "+hm.containsKey(key));
    }


    /*How to delete user defined objects as a key from HashMap*/
    public static void hashMapCustomObjectDelete(){
        final class Price{

            private String item;
            private int price;

            public Price(String itm, int pr){
                this.item = itm;
                this.price = pr;
            }

            public int hashCode(){
                System.out.println("In hashcode");
                int hashcode = 0;
                hashcode = price*20;
                hashcode += item.hashCode();
                return hashcode;
            }

            public boolean equals(Object obj){
                System.out.println("In equals");
                if (obj instanceof Price) {
                    Price pp = (Price) obj;
                    return (pp.item.equals(this.item) && pp.price == this.price);
                } else {
                    return false;
                }
            }

            public String getItem() {
                return item;
            }
            public void setItem(String item) {
                this.item = item;
            }
            public int getPrice() {
                return price;
            }
            public void setPrice(int price) {
                this.price = price;
            }

            public String toString(){
                return "item: "+item+"  price: "+price;
            }
        }

        final HashMap<Price, String> hm = new HashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        Set<Price> keys = hm.keySet();
        for(Price p:keys){
            System.out.println(p+"==>"+hm .get(p));
        }
        Price key = new Price("Banana", 20);
        System.out.println("Deleting key...");
        hm.remove(key);
        System.out.println("After deleting key:");
        Set<Price> keys1 = hm.keySet();
        for(Price p:keys1){
            System.out.println(p+"==>"+hm.get(p));
        }
    }

}
