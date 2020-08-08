package com.adarsh.collection;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/18/14
 * Time: 10:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class HashSetExample {

    public static void main(String[] args) {

    }

    /* Basic HashSet Operations */
    public static void hashSetBasicOperation() {
        final HashSet<String> hs = new HashSet<String>() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };
        System.out.println(hs);
        System.out.println("Is HashSet empty? " + hs.isEmpty());
        hs.remove("third");
        System.out.println(hs);
        System.out.println("Size of the HashSet: " + hs.size());
        System.out.println("Does HashSet contains first element? " + hs.contains("first"));
    }

    /*How to iterate through HashSet*/
    public static void hashSetIteration() {
        final HashSet<String> hs = new HashSet<String>() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };
        final Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    /*How to copy Set content to another HashSet*/
    public static void hashSetCopyFromSet() {
        final HashSet<String> hs = new HashSet<String>() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");

            }
        };
        System.out.println(hs);
        final HashSet<String> subSet = new
                HashSet<String>() {
                    {
                        add("s1");
                        add("s2");
                    }
                };
        hs.addAll(subSet);
        System.out.println("HashSet content after adding another collection:");
        System.out.println(hs);
    }

    /*How to delete all elements from HashSet*/
    public static void hashSetDeleteAll() {
        final HashSet<String> hs = new HashSet<String>() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };
        System.out.println("My HashSet content:");
        System.out.println(hs);
        System.out.println("Clearing HashSet:");
        hs.clear();
        System.out.println("Content After clear:");
        System.out.println(hs);
    }

    /*How to copy all elements from HashSet to an array*/
    public static void hashSetCopyAllElement() {
        final HashSet<String> hs = new HashSet<String>() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
            }
        };
        System.out.println("HashSet content: ");
        System.out.println(hs);
        final String[] strArr = new String[hs.size()];
        hs.toArray(strArr);
        System.out.println("Copied array content:");
        for (String str : strArr) {
            System.out.println(str);
        }
    }

    /*How to compare two sets and retain elements which are same on both sets*/
    public static void hashSetCompaire() {
        final HashSet<String> hs = new HashSet<String>() {
            {
                //add elements to HashSet
                add("first");
                add("second");
                add("third");
                add("apple");
                add("rat");
            }
        };
        System.out.println(hs);
        final HashSet<String> subSet = new

                HashSet<String>() {
                    {
                        add("rat");
                        add("second");
                        add("first");
                    }
                };
        hs.retainAll(subSet);
        System.out.println("HashSet content:");
        System.out.println(hs);
    }

    /*How to eliminate duplicate user defined objects from HashSet*/
    public static void hashSetEliminateDuplicate() {
        final class Price {

            private String item;
            private int price;

            public Price(String itm, int pr) {
                this.item = itm;
                this.price = pr;
            }

            public int hashCode() {
                System.out.println("In hashcode");
                int hashcode = 0;
                hashcode = price * 20;
                hashcode += item.hashCode();
                return hashcode;
            }

            public boolean equals(Object obj) {
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

            public String toString() {
                return "item: " + item + "  price: " + price;
            }
        }

        final HashSet<Price> lhm = new HashSet<Price>() {
            {
                add(new Price("Banana", 20));
                add(new Price("Apple", 40));
                add(new Price("Orange", 30));
            }
        };
        for (Price pr : lhm) {
            System.out.println(pr);
        }
        Price duplicate = new Price("Banana", 20);
        System.out.println("inserting duplicate object...");
        lhm.add(duplicate);
        System.out.println("After insertion:");
        for (Price pr : lhm) {
            System.out.println(pr);
        }
    }

    /*How to find user defined objects from HashSet*/
    public static void hashSetFindObject() {
        final class Price {

            private String item;
            private int price;

            public Price(String itm, int pr) {
                this.item = itm;
                this.price = pr;
            }

            public int hashCode() {

                System.out.println("In hashcode");
                int hashcode = 0;
                hashcode = price * 20;
                hashcode += item.hashCode();
                return hashcode;
            }

            public boolean equals(Object obj) {
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

        final HashSet<Price> lhs = new HashSet<Price>() {
            {

                add(new Price("Banana", 20));
                add(new Price("Apple", 40));
                add(new Price("Orange", 30));
            }
        };
        for (Price pr : lhs) {
            System.out.println(pr);
        }
        Price key = new Price("Banana", 20);
        System.out.println("Does set contains key? " + lhs.contains(key));
    }

    /*How to delete user defined objects from HashSet*/
    public static void hashSetDeleteObject() {
        final class Price {

            private String item;
            private int price;

            public Price(String itm, int pr) {
                this.item = itm;
                this.price = pr;
            }

            public int hashCode() {
                System.out.println("In hashcode");
                int hashcode = 0;
                hashcode = price * 20;
                hashcode += item.hashCode();
                return hashcode;
            }

            public boolean equals(Object obj) {
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

            public String toString() {
                return "item: " + item + "  price: " + price;
            }
        }

        final HashSet<Price> lhs = new HashSet<Price>() {
            {
                add(new Price("Banana", 20));
                add(new Price("Apple", 40));
                add(new Price("Orange", 30));
            }
        };

        for (Price pr : lhs) {
            System.out.println(pr);
        }
        Price key = new Price("Banana", 20);
        System.out.println("deleting key from set...");
        lhs.remove(key);
        System.out.println("Elements after delete:");
        for (Price pr : lhs) {
            System.out.println(pr);
        }
    }



}
