package com.adarsh.collection.set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class HashSetExample {


    /* Basic HashSet Operations */
    @Test
    public void hashSetBasicOperation() {
        final HashSet<String> hashSet = new HashSet<String>() {
            {
                //add elements to HashSet
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
        System.out.println(hashSet);
        System.out.println("Is HashSet empty? " + hashSet.isEmpty());
        hashSet.remove("Value3");
        System.out.println(hashSet);
        System.out.println("Size of the HashSet: " + hashSet.size());
        System.out.println("Does HashSet contains first element? " + hashSet.contains("Value1"));
    }

    /*How to iterate through HashSet*/
    @Test
    public void hashSetIteration() {
        final HashSet<String> hashSet = new HashSet<String>() {
            {
                //add elements to HashSet
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
        final Iterator<String> itr = hashSet.iterator();
        while (itr.hasNext()) {
            System.out.print("\t" + itr.next());
        }
    }

    /*How to copy Set content to another HashSet*/
    @Test
    public void hashSetCopyFromSet() {
        final HashSet<String> hashSet = new HashSet<String>() {
            {
                //add elements to HashSet
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
        System.out.println(hashSet);
        final HashSet<String> subSet = new

                HashSet<String>() {
                    {
                        add("AdditionalValue1");
                        add("AdditionalValue2");
                        add("AdditionalValue3");
                        add("AdditionalValue4");
                        add("Value5");
                    }
                };
        hashSet.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hashSet);
    }

    /*How to delete all elements from HashSet*/
    @Test
    public void hashSetDeleteAll() {
        final HashSet<String> hashSet = new HashSet<String>() {
            {
                //add elements to HashSet
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
        System.out.println("My HashSet content:");
        System.out.println(hashSet);
        System.out.println("Clearing HashSet:");
        hashSet.clear();
        System.out.println("Content After clear:");
        System.out.println(hashSet);
    }

    /*How to copy all elements from HashSet to an array*/
    @Test
    public void hashSetCopyAllElement() {
        final HashSet<String> hashSet = new HashSet<String>() {
            {
                //add elements to HashSet
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
        System.out.println("HashSet content: ");
        System.out.println(hashSet);
        final String[] strArr = new String[hashSet.size()];
        hashSet.toArray(strArr);
        System.out.println("Copied array content:");
        for (String str : strArr) {
            System.out.print("\t" + str);
        }
    }

    /*How to compare two sets and retain elements which are same on both sets*/
    @Test
    public void hashSetCompare() {
        final HashSet<String> hashSet = new HashSet<String>() {
            {
                //add elements to HashSet
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
        System.out.println(hashSet);
        final HashSet<String> subSet = new

                HashSet<String>() {
                    {
                        add("Value2");
                        add("Value4");
                        add("Value7");
                    }
                };

        hashSet.retainAll(subSet);
        System.out.println("HashSet content:");
        System.out.println(hashSet);
    }

    /*How to eliminate duplicate user defined objects from HashSet*/
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

        final HashSet<ShoppingCart> shoppingCartHashSet = new HashSet<ShoppingCart>() {
            {
                add(new ShoppingCart("Banana", 20));
                add(new ShoppingCart("Apple", 40));
                add(new ShoppingCart("Orange", 30));
                add(new ShoppingCart("Milk", 30));
                add(new ShoppingCart("Butter", 30));
            }
        };
        for (ShoppingCart pr : shoppingCartHashSet) {
            System.out.println(pr);
        }
        final ShoppingCart duplicate = new ShoppingCart("Banana", 20);
        System.out.println("inserting duplicate object...");
        shoppingCartHashSet.add(duplicate);
        System.out.println("After insertion:");
        for (ShoppingCart shoppingCart : shoppingCartHashSet) {
            System.out.println(shoppingCart);
        }
    }

    /*How to find user defined objects from HashSet*/
    @Test
    public void hashSetFindObject() {

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

            public void setItem(String
                                        item) {
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

        final HashSet<ShoppingCart> lhs = new HashSet<ShoppingCart>() {
            {
                add(new ShoppingCart("Banana", 20));
                add(new ShoppingCart("Apple", 40));
                add(new ShoppingCart("Orange", 30));
                add(new ShoppingCart("Milk", 30));
                add(new ShoppingCart("Butter", 30));
            }
        };
        for (ShoppingCart pr : lhs) {
            System.out.println(pr);
        }
        ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("Does set contains key? " + lhs.contains(key));
    }

    /*How to delete user defined objects from HashSet*/
    @Test
    public void hashSetDeleteObject() {
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

        final HashSet<ShoppingCart> lhs = new HashSet<ShoppingCart>() {
            {
                add(new ShoppingCart("Banana", 20));
                add(new ShoppingCart("Apple", 40));
                add(new ShoppingCart("Orange", 30));
                add(new ShoppingCart("Milk", 30));
                add(new ShoppingCart("Butter", 30));
            }
        };

        for (ShoppingCart pr : lhs) {
            System.out.println(pr);
        }
        ShoppingCart key = new ShoppingCart("Banana", 20);
        System.out.println("deleting key from set...");
        lhs.remove(key);
        System.out.println("Elements after delete:");
        for (ShoppingCart pr : lhs) {
            System.out.println(pr);
        }
    }
}
