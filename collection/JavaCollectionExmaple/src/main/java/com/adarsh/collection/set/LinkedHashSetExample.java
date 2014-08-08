package com.adarsh.collection.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class LinkedHashSetExample {

    @Test
    public void basicOperation() {
        final LinkedHashSet linkedHashSet = new LinkedHashSet() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
            }
        };
        linkedHashSet.add(null);
        linkedHashSet.add(45);
        System.out.println(linkedHashSet);
    }

    @Test
    public void linkedHashSetBasic() {
        final LinkedHashSet linkedHashSet = new LinkedHashSet() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
            }
        };
        System.out.println(linkedHashSet);
        System.out.println("LinkedHashSet size: " + linkedHashSet.size());
        System.out.println("Is LinkedHashSet empty? : " + linkedHashSet.isEmpty());
    }

    /*How to delete all elements from LinkedHashSet*/
    @Test
    public void linkedHashSetDeleteAllElement() {
        final LinkedHashSet linkedHashSet = new LinkedHashSet() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
            }
        };
        System.out.println("My LinkedHashSet content:");
        System.out.println(linkedHashSet);
        System.out.println("Clearing LinkedHashSet:");
        linkedHashSet.clear();
        System.out.println("Content After clear:");
        System.out.println(linkedHashSet);
    }

    /*How to add another collection to LinkedHashSet*/
    @Test
    public void linkedHashSetAdding() {

        final LinkedHashSet linkedHashSet = new LinkedHashSet() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
            }
        };
        System.out.println(linkedHashSet);
        final HashSet<String> subSet = new HashSet<String>() {
                    {
                        add("AdditionSetValue1");
                        add("AdditionSetValue2");
                        add("AdditionSetValue3");
                        add("AdditionSetValue4");
                    }
                };

        linkedHashSet.addAll(subSet);
        System.out.println("LinkedHashSet content after adding another collection:");
        System.out.println(linkedHashSet);
    }

    /*How to iterate through LinkedHashSet*/
    @Test
    public void linkedHashSetIteration(){
        final LinkedHashSet linkedHashSet = new LinkedHashSet() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
            }
        };
        final Iterator<String> iterator = linkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.print("\t" + iterator.next());
        }
    }

    /*How to compare two LinkedHashSet and retain elements which are same on both LinkedHashSet*/
    @Test
    public void linkedHashSetCompare(){
        final LinkedHashSet linkedHashSet = new LinkedHashSet() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
            }
        };
        System.out.println(linkedHashSet);
        final LinkedHashSet<String> subSet = new LinkedHashSet<String>(){
            {
                add("Value1");
                add("Value4");
                add("Value8");
            }
        };

        linkedHashSet.retainAll(subSet);
        System.out.println("LinkedHashSet content:");
        System.out.println(linkedHashSet);
    }

    /*How to copy content of LinkedHashSet to an array*/
    @Test
    public void linkedHashSetContentCopyToArray(){
        final LinkedHashSet linkedHashSet = new LinkedHashSet() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
            }
        };
        System.out.println("LinkedHashSet content: ");
        System.out.println(linkedHashSet);
        final String[] strArr = new String[linkedHashSet.size()];
        linkedHashSet.toArray(strArr);
        System.out.println("Copied array content:");
        for(String str:strArr){
            System.out.print("\t" + str);
        }
    }


    /*How to delete specific element from LinkedHashSet*/
    @Test
    public void linkedHashSetDeleteElement(){
        final LinkedHashSet linkedHashSet = new LinkedHashSet() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
            }
        };

        System.out.println(linkedHashSet);
        linkedHashSet.remove("Value2");
        System.out.println("Elements after deleting an element:");
        System.out.println(linkedHashSet);
    }

    /*How to search an object from LinkedHashSet*/
    @Test
    public void linkedHashSetSearch(){
        final LinkedHashSet linkedHashSet = new LinkedHashSet() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
            }
        };
        System.out.println(linkedHashSet);
        System.out.println("Does set contains Value1 ? "+linkedHashSet.contains("Value1"));
        System.out.println("Does set contains Value10 ? "+linkedHashSet.contains("Value10"));
    }


    /* How to eliminate duplicate user defined objects from LinkedHashSet */
    @Test
    public void linkedHashSetEliminateDuplicate(){

        final class ShoppingCart {

             private String item;
             private int price;

             public ShoppingCart(String itm, int pr){
                 this.item = itm;
                 this.price = pr;
             }

             public int hashCode(){                ;
                 int hashCode = 0;
                 hashCode = price*20;
                 hashCode += item.hashCode();
                 return hashCode;
             }

             public boolean equals(Object obj){
                 if (obj instanceof ShoppingCart) {
                     ShoppingCart shoppingCart = (ShoppingCart) obj;
                     return (shoppingCart.item.equals(this.item) && shoppingCart.price == this.price);
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


        final LinkedHashSet<ShoppingCart> lhm = new LinkedHashSet<ShoppingCart>(){
            {
                add(new ShoppingCart("Banana", 20));
                add(new ShoppingCart("Apple", 40));
                add(new ShoppingCart("Orange", 30));
            }
        };
        for(ShoppingCart shoppingCart:lhm){
            System.out.println(shoppingCart);
        }
        ShoppingCart duplicate = new ShoppingCart("Banana", 20);
        System.out.println("inserting duplicate object...");
        lhm.add(duplicate);
        System.out.println("After insertion:");
        for(ShoppingCart shoppingCart:lhm){
            System.out.println(shoppingCart);
        }
    }

    /*How to find user defined objects from LinkedHashSet*/
    @Test
    public void linkedHashSetFindCustomObject(){
        final class ShoppingCart {

            private String item;
            private int price;

            public ShoppingCart(String itm, int pr){
                this.item = itm;
                this.price = pr;
            }

            public int hashCode(){
                int hashCode = 0;
                hashCode = price*20;
                hashCode += item.hashCode();
                return hashCode;
            }

            public boolean equals(Object obj){
                if (obj instanceof ShoppingCart) {
                    ShoppingCart shoppingCart = (ShoppingCart) obj;
                    return (shoppingCart.item.equals(this.item) && shoppingCart.price == this.price);
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

        final  LinkedHashSet<ShoppingCart> linkedHashSet = new LinkedHashSet<ShoppingCart>(){
            {
                add(new ShoppingCart("Milk", 10));
                add(new ShoppingCart("Apple", 40));
                add(new ShoppingCart("Butter", 15));
                add(new ShoppingCart("Banana", 20));
                add(new ShoppingCart("Orange", 30));
            }
        };
        for(ShoppingCart pr:linkedHashSet){
            System.out.println(pr);
        }
        ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("Does set contains key ? "+linkedHashSet.contains(key));
    }

    /*How to delete user defined objects from LinkedHashSet*/
    @Test
    public void linkedHashSetDeleteCustomObject(){
        final class ShoppingCart {

            private String item;
            private int price;

            public ShoppingCart(String itm, int pr){
                this.item = itm;
                this.price = pr;
            }

            public int hashCode(){
                int hashCode = 0;
                hashCode = price*20;
                hashCode += item.hashCode();
                return hashCode;
            }

            public boolean equals(Object obj){
                if (obj instanceof ShoppingCart) {
                    ShoppingCart shoppingCart = (ShoppingCart) obj;
                    return (shoppingCart.item.equals(this.item) && shoppingCart.price == this.price);
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


        final LinkedHashSet<ShoppingCart> linkedHashSet = new LinkedHashSet<ShoppingCart>(){
            {
                add(new ShoppingCart("Milk", 10));
                add(new ShoppingCart("Banana", 20));
                add(new ShoppingCart("Butter", 15));
                add(new ShoppingCart("Apple", 40));
                add(new ShoppingCart("Orange", 30));
            }
        };
        for(ShoppingCart shoppingCart:linkedHashSet){
            System.out.println(shoppingCart);
        }
        ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("deleting key from set...");
        linkedHashSet.remove(key);
        System.out.println("Elements after delete:");
        for(ShoppingCart shoppingCart:linkedHashSet){
            System.out.println(shoppingCart);
        }
    }
}
