package com.adarsh.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/18/14
 * Time: 11:20 AM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedHashSetExample {

    public static void main(String[] args) {
        final LinkedHashSet lhs = new LinkedHashSet() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };
        lhs. add(null);
        lhs. add(45);
        System.out.println(lhs);
    }

    public static void linkedHashSetBasic() {
        final LinkedHashSet<String> lhs = new LinkedHashSet<String>() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };
        System.out.println(lhs);
        System.out.println("LinkedHashSet size: " + lhs.size());
        System.out.println("Is LinkedHashSet empty? : " + lhs.isEmpty());
    }

    /*How to delete all elements from LinkedHashSet*/
    public static void linkedHashSetDeleteAllElement() {
        final LinkedHashSet<String> lhs = new LinkedHashSet<String>() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };
        System.out.println("My LinkedHashSet content:");
        System.out.println(lhs);
        System.out.println("Clearing LinkedHashSet:");
        lhs.clear();
        System.out.println("Content After clear:");
        System.out.println(lhs);
    }

    /*How to add another collection to LinkedHashSet*/
    public static void linkedHashSetAdding() {

        final LinkedHashSet<String> lhs = new LinkedHashSet<String>() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };
        System.out.println(lhs);
        final HashSet<String> subSet = new HashSet<String>() {
                    {
                        add("s1");
                        add("s2");
                    }
                };

        lhs.addAll(subSet);
        System.out.println("LinkedHashSet content after adding another collection:");
        System.out.println(lhs);
    }

    /*How to iterate through LinkedHashSet*/
    public static void linkedHashSetIteration(){
        final LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        //add elements to HashSet
        lhs.add("first");
        lhs.add("second");
        lhs.add("third");
        final Iterator<String> itr = lhs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    /*How to compare two LinkedHashSet and retain elements which are same on both LinkedHashSet*/
    public static void linkedHashSetCompare(){
        final LinkedHashSet<String> lhs = new LinkedHashSet<String>(){
            {
                //add elements to LinkedHashSet
                add("first");
                add("second");
                add("third");
                add("apple");
                add("rat");
            }
        };
        System.out.println(lhs);
        final LinkedHashSet<String> subSet = new LinkedHashSet<String>(){
            {
                add("rat");
                add("second");
                add("first");
            }
        };

        lhs.retainAll(subSet);
        System.out.println("LinkedHashSet content:");
        System.out.println(lhs);
    }

    /*How to copy content of LinkedHashSet to an array*/
    public static void linkedHashSetContentCoypToArray(){
        final LinkedHashSet<String> lhs = new LinkedHashSet<String>(){
            {
                //add elements to LinkedHashSet
                add("first");
                add("second");
                add("third");
            }
        };
        System.out.println("LinkedHashSet content: ");
        System.out.println(lhs);
        final String[] strArr = new String[lhs.size()];
        lhs.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }


    /*How to delete specific element from LinkedHashSet*/
    public static void linkedHashSetDeleteElement(){
        final LinkedHashSet<String> lhs = new LinkedHashSet<String>(){
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };

        System.out.println(lhs);
        lhs.remove("second");
        System.out.println("Elements after deleting an element:");
        System.out.println(lhs);
    }

    /*How to search an object from LinkedHashSet*/
    public static void linkedHashSetSearch(){
        final LinkedHashSet<String> lhs = new LinkedHashSet<String>(){
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };
        System.out.println(lhs);
        System.out.println("Does set contains 'first'? "+lhs.contains("first"));
    }


    /* How to eliminate duplicate user defined objects from LinkedHashSet */
    public static void linkedHashSetEleminateDuplicate(){
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


        final LinkedHashSet<Price> lhm = new LinkedHashSet<Price>(){
            {
                add(new Price("Banana", 20));
                add(new Price("Apple", 40));
                add(new Price("Orange", 30));
            }
        };
        for(Price pr:lhm){
            System.out.println(pr);
        }
        Price duplicate = new Price("Banana", 20);
        System.out.println("inserting duplicate object...");
        lhm.add(duplicate);
        System.out.println("After insertion:");
        for(Price pr:lhm){
            System.out.println(pr);
        }
    }

    /*How to find user defined objects from LinkedHashSet*/
    public static void linkedHashSetFindCustomObject(){
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

        final  LinkedHashSet<Price> lhs = new LinkedHashSet<Price>(){
            {
                add(new Price("Banana", 20));
                add(new Price("Apple", 40));
                add(new Price("Orange", 30));
            }
        };
        for(Price pr:lhs){
            System.out.println(pr);
        }
        Price key = new Price("Banana", 20);
        System.out.println("Does set contains key ? "+lhs.contains(key));
    }

    /*How to delete user defined objects from LinkedHashSet*/
    public static void linkedHashSetDeleteCustomObject(){
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


        final LinkedHashSet<Price> lhs = new LinkedHashSet<Price>(){
            {
                add(new Price("Banana", 20));
                add(new Price("Apple", 40));
                add(new Price("Orange", 30));
            }
        };
        for(Price pr:lhs){
            System.out.println(pr);
        }
        Price key = new Price("Banana", 20);
        System.out.println("deleting key from set...");
        lhs.remove(key);
        System.out.println("Elements after delete:");
        for(Price pr:lhs){
            System.out.println(pr);
        }
    }




}
