package com.adarsh.collection.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class HashMapExample {


    @Test
    public void hashMapBasicOperation() {
        final HashMap<String, String> stringHashMap = new HashMap<String, String>() {
            {
                //add key-value pair to hashmap
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key5", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        System.out.println(stringHashMap);
        //getting value for the given key from hashmap
        System.out.println("Value of key2: " + stringHashMap.get("key2"));
        System.out.println("Is HashMap empty? " + stringHashMap.isEmpty());
        stringHashMap.remove("key3");
        System.out.println(stringHashMap);
        System.out.println("Size of the HashMap: " + stringHashMap.size());
    }

    /*How to iterate through HashMap*/
    @Test
    public void hashMapIteration() {
        final HashMap<String, String> stringHashMap = new HashMap<String, String>() {
            {
                //add key-value pair to hashmap
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key5", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        System.out.println(stringHashMap);
        final Set<String> keys = stringHashMap.keySet();
        for (String key : keys) {
            System.out.println("Value of " + key + " is: " + stringHashMap.get(key));
        }
    }

    /*How to copy Map content to another HashMap*/
    @Test
    public void hashMapCopy() {
        final HashMap<String, String> stringHashMap = new HashMap<String, String>() {
            {
                //add key-value pair to hashmap
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key5", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        System.out.println(stringHashMap);
        final HashMap<String, String> subMap = new HashMap<String, String>(){
            {
                put("Additionalkey1", "AdditionalValue1");
                put("Additionalkey2", "AdditionalValue2");
                put("Additionalkey3", "AdditionalValue3");
                put("Additionalkey4", "AdditionalValue4");
                put("Additionalkey5", "AdditionalValue5");
                put("Additionalkey6", "AdditionalValue6");
                put("Additionalkey7", "AdditionalValue7");
                put("Additionalkey8", "AdditionalValue8");

            }
        };
        stringHashMap.putAll(subMap);
        System.out.println(stringHashMap);
    }

    /*How to search a key in HashMap*/
    @Test
    public void hashMapSearchKey() {
        final HashMap<String, String> stringHashMap = new HashMap<String, String>() {
            {
                //add key-value pair to hashmap
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key5", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        System.out.println(stringHashMap);
        if (stringHashMap.containsKey("key1")) {
            System.out.println("The hashmap contains key first");
        } else {
            System.out.println("The hashmap does not contains key first");
        }
        if (stringHashMap.containsKey("key10")) {
            System.out.println("The hashmap contains key fifth");
        } else {
            System.out.println("The hashmap does not contains key fifth");
        }
    }

    /*How to get all keys from HashMap*/
    @Test
    public void hashMapGetAllKey() {
        final HashMap<String, String> stringHashMap = new HashMap<String, String>() {
            {
                //add key-value pair to hashmap
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key5", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };

        System.out.println(stringHashMap);
        Set<String> keys = stringHashMap.keySet();
        for (String key : keys) {
            System.out.print("\t"+key);
        }
    }

    /*How to get entry set from HashMap*/
    @Test
    public void hashMapGetEntrySet() {
        final HashMap<String, String> stringHashMap = new HashMap<String, String>() {
            {
                //add key-value pair to hashmap
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key5", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        System.out.println(stringHashMap);
        //getting value for the given key from hashmap
        Set<Map.Entry<String, String>> entrySet = stringHashMap.entrySet();
        for (Map.Entry<String, String> stringStringEntry : entrySet) {
            System.out.println(stringStringEntry.getKey() + " ==> " + stringStringEntry.getValue());
        }
    }

    /*How to delete all elements from HashMap*/
    @Test
    public void hashSetDeleteAllElement() {
        final HashMap<String, String> stringHashMap = new HashMap<String, String>() {
            {
                //add key-value pair to hashmap
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key5", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        System.out.println("My HashMap content:");
        System.out.println(stringHashMap);
        System.out.println("Clearing HashMap:");
        stringHashMap.clear();
        System.out.println("Content After clear:");
        System.out.println(stringHashMap);
    }

    /*How to eliminate duplicate user defined objects as a key from HashMap*/
    @Test
    public void hashSetEliminateDuplicate() {

        final class ShoppingCart {

            private String item;
            private int price;

            public ShoppingCart(String itm, int pr) {
                this.item = itm;
                this.price = pr;
            }

            public int hashCode() {
                int hashCode = 0;
                hashCode = price * 20;
                hashCode += item.hashCode();
                return hashCode;
            }

            public boolean equals(Object obj) {
                if (obj instanceof ShoppingCart) {
                    ShoppingCart pp = (ShoppingCart) obj;
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

            public String toString() {
                return "item: " + item + "  price: " + price;
            }
        }

        final HashMap<ShoppingCart, String> hashMap = new HashMap<ShoppingCart, String>(){
            {
                put(new ShoppingCart("Banana", 20), "Banana");
                put(new ShoppingCart("Apple", 40), "Apple");
                put(new ShoppingCart("Orange", 30), "Orange");
                put(new ShoppingCart("Milk", 30), "Milk");
                put(new ShoppingCart("Butter", 30), "Butter");
            }
        };

        final Set<ShoppingCart> keys = hashMap.keySet();
        for (ShoppingCart p : keys) {
            System.out.println(p + "==>" + hashMap.get(p));
        }
        ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("Adding duplicate key...");
        hashMap.put(key, "Grape");
        System.out.println("After adding duplicate key:");
        Set<ShoppingCart> keys1 = hashMap.keySet();
        for (ShoppingCart p : keys1) {
            System.out.println(p + "==>" + hashMap.get(p));
        }
    }

    /*How to find user defined objects as a key from HashMap*/
    @Test
    public void hashMapCustomObjectAsKey() {

        final class ShoppingCart {

            private String item;
            private int price;

            public ShoppingCart(String itm, int pr) {
                this.item = itm;
                this.price = pr;
            }

            public int hashCode() {
                System.out.println("In hashCode");
                int hashCode = 0;
                hashCode = price * 20;
                hashCode += item.hashCode();
                return hashCode;
            }

            public boolean equals(Object obj) {
                if (obj instanceof ShoppingCart) {
                    ShoppingCart pp = (ShoppingCart) obj;
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

            public String toString() {
                return "item: " + item + "  price: " + price;
            }
        }

        final HashMap<ShoppingCart, String> hashMap = new HashMap<ShoppingCart, String>(){
            {
                put(new ShoppingCart("Banana", 20), "Banana");
                put(new ShoppingCart("Apple", 40), "Apple");
                put(new ShoppingCart("Orange", 30), "Orange");
                put(new ShoppingCart("Milk", 30), "Milk");
                put(new ShoppingCart("Butter", 30), "Butter");
            }
        };
        Set<ShoppingCart> keys = hashMap.keySet();
        for (ShoppingCart p : keys) {
            System.out.println(p + "==>" + hashMap.get(p));
        }
        ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("Does key available? " + hashMap.containsKey(key));
    }

    /*How to delete user defined objects as a key from HashMap*/
    @Test
    public void hashMapCustomObjectDelete() {
        final class ShoppingCart {

            private String item;
            private int price;

            public ShoppingCart(String itm, int pr) {
                this.item = itm;
                this.price = pr;
            }

            public int hashCode() {
                int hashCode = 0;
                hashCode = price * 20;
                hashCode += item.hashCode();
                return hashCode;
            }

            public boolean equals(Object obj) {
                if (obj instanceof ShoppingCart) {
                    ShoppingCart pp = (ShoppingCart) obj;
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

            public String toString() {
                return "item: " + item + "  price: " + price;
            }
        }

        final HashMap<ShoppingCart, String> hashMap = new HashMap<ShoppingCart, String>(){
            {
                put(new ShoppingCart("Banana", 20), "Banana");
                put(new ShoppingCart("Apple", 40), "Apple");
                put(new ShoppingCart("Orange", 30), "Orange");
                put(new ShoppingCart("Milk", 30), "Milk");
                put(new ShoppingCart("Butter", 30), "Butter");
            }
        };
        Set<ShoppingCart> keys = hashMap.keySet();
        for (ShoppingCart p : keys) {
            System.out.println(p + "==>" + hashMap.get(p));
        }
        ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("Deleting key...");
        hashMap.remove(key);
        System.out.println("After deleting key:");
        Set<ShoppingCart> keys1 = hashMap.keySet();
        for (ShoppingCart p : keys1) {
            System.out.println(p + "==>" + hashMap.get(p));
        }
    }

}
