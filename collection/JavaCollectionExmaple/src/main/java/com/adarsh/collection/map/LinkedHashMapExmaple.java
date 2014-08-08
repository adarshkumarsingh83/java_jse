package com.adarsh.collection.map;

import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Set;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class LinkedHashMapExmaple {

    @Test
    public void linkedHashMapBasicOperation() {
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>() {
            {
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key6", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        System.out.println(linkedHashMap);
        System.out.println("Getting value for key1: " + linkedHashMap.get("key1"));
        System.out.println("Size of the map: " + linkedHashMap.size());
        System.out.println("Is map empty? " + linkedHashMap.isEmpty());
        System.out.println("Contains key2 ? " + linkedHashMap.containsKey("key2"));
        System.out.println("Contains Value1" + linkedHashMap.containsValue("Value1"));
        System.out.println("delete element key1: " + linkedHashMap.remove("key1"));
        System.out.println(linkedHashMap);
    }

    /*How to iterate through LinkedHashMap*/
    @Test
    public void linkedHashMapIteration() {
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>() {
            {
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key6", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        final Set<String> keys = linkedHashMap.keySet();
        for (String k : keys) {
            System.out.println(k + " -- " + linkedHashMap.get(k));
        }
    }

    /*How to check whether the value exists or not in a LinkedHashMap*/
    @Test
    public void linkedHashMapValueSearch() {
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>() {
            {
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key6", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        System.out.println("Map contains Value1 ? " + linkedHashMap.containsValue("Value1"));
        System.out.println("Map contains Value10 ? " + linkedHashMap.containsValue("Value10"));
    }

    /*How to delete all entries from LinkedHashMap object*/
    @Test
    public void linkedHashMapDeleteAllEntries() {
        final LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>() {
            {
                put("key1", "Value1");
                put("key2", "Value2");
                put("key3", "Value3");
                put("key4", "Value4");
                put("key5", "Value5");
                put("key6", "Value6");
                put("key7", "Value7");
                put("key8", "Value8");
            }
        };
        System.out.println(linkedHashMap);
        linkedHashMap.clear();
        System.out.println(linkedHashMap);
    }

    /*How to eliminate duplicate user defined objects as a key from LinkedHashMap*/
    @Test
    public void linkedHashMapDuplicationCustomObject() {

        final class ShoppingCart {

            private String item;
            private int price;

            public ShoppingCart(String itm, int pr) {
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

            public String toString() {
                return "item: " + item + "  price: " + price;
            }
        }

        final LinkedHashMap<ShoppingCart, String> linkedHashMap = new LinkedHashMap<ShoppingCart, String>() {
            {
                put(new ShoppingCart("Banana", 20), "Banana");
                put(new ShoppingCart("Apple", 40), "Apple");
                put(new ShoppingCart("Orange", 30), "Orange");
                put(new ShoppingCart("Milk", 30), "Milk");
                put(new ShoppingCart("Butter", 30), "Butter");
            }
        };

        final Set<ShoppingCart> keys = linkedHashMap.keySet();
        for (ShoppingCart shoppingCart : keys) {
            System.out.println(shoppingCart + "==>" + linkedHashMap.get(shoppingCart));
        }
        final ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("Adding duplicate key...");
        linkedHashMap.put(key, "Cheese");
        System.out.println("After adding duplicates key:");
        final Set<ShoppingCart> keys1 = linkedHashMap.keySet();
        for (ShoppingCart shoppingCart : keys1) {
            System.out.println(shoppingCart + "==>" + linkedHashMap.get(shoppingCart));
        }
    }

    /*How to find user defined objects as a key from LinkedHashMap*/
    @Test
    public void linkedHashMapCustomObjectAsKey() {
        final class ShoppingCart {

            private String item;
            private int price;

            public ShoppingCart(String itm, int pr) {
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

            public String toString() {
                return "item: " + item + "  price: " + price;
            }
        }

        final LinkedHashMap<ShoppingCart, String> linkedHashMap = new LinkedHashMap<ShoppingCart, String>() {
            {
                put(new ShoppingCart("Banana", 20), "Banana");
                put(new ShoppingCart("Apple", 40), "Apple");
                put(new ShoppingCart("Orange", 30), "Orange");
                put(new ShoppingCart("Milk", 30), "Milk");
                put(new ShoppingCart("Butter", 30), "Butter");
            }
        };
        Set<ShoppingCart> keys = linkedHashMap.keySet();
        for (ShoppingCart p : keys) {
            System.out.println(p + "==>" + linkedHashMap.get(p));
        }
        ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("Does key available? " + linkedHashMap.containsKey(key));
    }

    /*How to delete user defined objects as a key from LinkedHashMap*/
    @Test
    public void linkedHashMapDeleteCustomObject() {

        final class ShoppingCart {

            private String item;
            private int price;

            public ShoppingCart(String itm, int pr) {
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

            public String toString() {
                return "item: " + item + "  price: " + price;
            }
        }

        final LinkedHashMap<ShoppingCart, String> linkedHashMap = new LinkedHashMap<ShoppingCart, String>() {
            {
                put(new ShoppingCart("Banana", 20), "Banana");
                put(new ShoppingCart("Apple", 40), "Apple");
                put(new ShoppingCart("Orange", 30), "Orange");
                put(new ShoppingCart("Milk", 30), "Milk");
                put(new ShoppingCart("Butter", 30), "Butter");
            }
        };
        final Set<ShoppingCart> keys = linkedHashMap.keySet();
        for (ShoppingCart p : keys) {
            System.out.println(p + "==>" + linkedHashMap.get(p));
        }
        final ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("Deleting key...");
        linkedHashMap.remove(key);
        System.out.println("After deleting key:");
        final Set<ShoppingCart> keys1 = linkedHashMap.keySet();
        for (ShoppingCart p : keys1) {
            System.out.println(p + "==>" + linkedHashMap.get(p));
        }
    }
}
