package com.adarsh.collection;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/18/14
 * Time: 10:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedHashMapExmaple {
    public static void main(String[] args) {

    }

    public static void linkedHashMapBasicOperation(){
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "this element inserted at 3rd position");
        System.out.println(lhm);
        System.out.println("Getting value for key 'one': "+lhm.get("one"));
        System.out.println("Size of the map: "+lhm.size());
        System.out.println("Is map empty? "+lhm.isEmpty());
        System.out.println("Contains key 'two'? "+lhm.containsKey("two"));
        System.out.println("Contains value 'This is first element'? "
                +lhm.containsValue("This is first element"));
        System.out.println("delete element 'one': "+lhm.remove("one"));
        System.out.println(lhm);
    }


    /*How to iterate through LinkedHashMap*/
    public static void linkedHashMapIteration(){
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "Element inserted at 3rd position");
        Set<String> keys = lhm.keySet();
        for(String k:keys){
            System.out.println(k+" -- "+lhm.get(k));
        }
    }

    /*How to check whether the value exists or not in a LinkedHashMap*/
    public static void linkedHashMapValueSearch(){
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "Element inserted at 3rd position");
        System.out.println("Map contains value 'This is first element'? "
                +lhm.containsValue("This is first element"));
    }

    /*How to delete all entries from LinkedHashMap object*/
    public static void linkedHashMapDeleteAllEntries(){
        LinkedHashMap<String, String> lhm = new LinkedHashMap<String, String>();
        lhm.put("one", "This is first element");
        lhm.put("two", "This is second element");
        lhm.put("four", "Element inserted at 3rd position");
        System.out.println(lhm);
        lhm.clear();
        System.out.println(lhm);
    }


    /*How to eliminate duplicate user defined objects as a key from LinkedHashMap*/
    public static void linkedHashMapDuplicationCustomObject(){
        final class Price{

            private String item;
            private int price;

            public Price(String itm, int pr){
                this.item = itm;
                this.price = pr;
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

            public String toString(){
                return "item: "+item+"  price: "+price;
            }
        }

        LinkedHashMap<Price, String> hm = new LinkedHashMap<Price, String>();
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

    /*How to find user defined objects as a key from LinkedHashMap*/
    public static void linkedHashMapCustomObjectAsKey(){
        final class Price{

            private String item;
            private int price;

            public Price(String itm, int pr){
                this.item = itm;
                this.price = pr;
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

            public String toString(){
                return "item: "+item+"  price: "+price;
            }
        }

        LinkedHashMap<Price, String> hm = new LinkedHashMap<Price, String>();
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

    /*How to delete user defined objects as a key from LinkedHashMap*/
    public static void linkedHashMapDeleteCustomObject(){
        final class Price{

            private String item;
            private int price;

            public Price(String itm, int pr){
                this.item = itm;
                this.price = pr;
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

            public String toString(){
                return "item: "+item+"  price: "+price;
            }
        }

        LinkedHashMap<Price, String> hm = new LinkedHashMap<Price, String>();
        hm.put(new Price("Banana", 20), "Banana");
        hm.put(new Price("Apple", 40), "Apple");
        hm.put(new Price("Orange", 30), "Orange");
        Set<Price> keys = hm.keySet();
        for(Price p:keys){
            System.out.println(p+"==>"+hm.get(p));
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
