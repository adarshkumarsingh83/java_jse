package com.adarsh.collection;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/18/14
 * Time: 9:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeMapExample {
    public static void main(String[] args) {

    }

    public static void treeMapBasicOperation() {
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from TreeMap
        System.out.println("Value of second: " + hm.get("second"));
        System.out.println("Is TreeMap empty? " + hm.isEmpty());
        hm.remove("third");
        System.out.println(hm);
        System.out.println("Size of the TreeMap: " + hm.size());
    }

    /*How to iterate through TreeMap*/
    public static void treeMapIteration() {
        final TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        final Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println("Value of " + key + " is: " + hm.get(key));
        }
    }

    /*How to copy Map content to another TreeMap*/
    public static void treeMapCopyMap() {
        final TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        final TreeMap<String, String> subMap = new TreeMap<String, String>();
        subMap.put("s1", "S1 VALUE");
        subMap.put("s2", "S2 VALUE");
        hm.putAll(subMap);
        System.out.println(hm);
    }

    /*How to search a key in TreeMap*/
    public static void treeMapSearchKey() {
        final TreeMap<String, String> hm = new TreeMap<String, String>();

        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        if (hm.containsKey("first")) {
            System.out.println("The TreeMap contains key first");
        } else {
            System.out.println("The TreeMap does not contains key first");
        }
        if (hm.containsKey("fifth")) {
            System.out.println("The TreeMap contains key fifth");
        } else {
            System.out.println("The TreeMap does not contains key fifth");
        }
    }

    /*How to search a value in TreeMap*/
    public static void treeMapSearchValue() {
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        if (hm.containsValue("SECOND INSERTED")) {
            System.out.println("The TreeMap contains value SECOND INSERTED");
        } else {
            System.out.println("The TreeMap does not contains value SECOND INSERTED");
        }
        if (hm.containsValue("first")) {
            System.out.println("The TreeMap contains value first");
        } else {
            System.out.println("The TreeMap does not contains value first");
        }
    }

    /*How to get all keys from TreeMap*/
    public static void treeMapGetAllKey() {
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        Set<String> keys = hm.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }

    /*How to get entry set from TreeMap*/
    public static void treeMapGetEntrySet() {
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println(hm);
        //getting value for the given key from TreeMap
        Set<Map.Entry<String, String>> entires = hm.entrySet();
        for (Map.Entry<String, String> ent : entires) {
            System.out.println(ent.getKey() + " ==> " + ent.getValue());
        }
    }

    /*How to delete all elements from TreeMap*/
    public static void treeMapDeleteAll() {
        TreeMap<String, String> hm = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        hm.put("first", "FIRST INSERTED");
        hm.put("second", "SECOND INSERTED");
        hm.put("third", "THIRD INSERTED");
        System.out.println("My TreeMap content:");
        System.out.println(hm);
        System.out.println("Clearing TreeMap:");
        hm.clear();
        System.out.println("Content After clear:");
        System.out.println(hm);
    }

    /*How to sort keys in TreeMap by using Comparator*/
    public static void treeMapSortKeyUsingComparator() {
        TreeMap<String, String> hm = new TreeMap<String, String>(new Comparator<String>() {

            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        }
        );
        //add key-value pair to TreeMap
        hm.put("java", "language");
        hm.put("computer", "machine");
        hm.put("india", "country");
        hm.put("mango", "fruit");
        System.out.println(hm);
    }

    /*How to sort keys in TreeMap by using Comparator with user define objects*/
    public static void treeMapSortKeysCustomObject() {
        final class Empl {

            private String name;
            private int salary;

            public Empl(String n, int s) {
                this.name = n;
                this.salary = s;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            public String toString() {
                return "Name: " + this.name + "-- Salary: " + this.salary;
            }
        }

        //By using name comparator (String comparison)
        TreeMap<Empl, String> tm = new TreeMap<Empl, String>(new Comparator<Empl>() {

            @Override
            public int compare(Empl e1, Empl e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        tm.put(new Empl("Ram", 3000), "RAM");
        tm.put(new Empl("John", 6000), "JOHN");
        tm.put(new Empl("Crish", 2000), "CRISH");
        tm.put(new Empl("Tom", 2400), "TOM");
        Set<Empl> keys = tm.keySet();
        for (Empl key : keys) {
            System.out.println(key + " ==> " + tm.get(key));
        }


        System.out.println("===================================");
        //By using salary comparator (int comparison)
        TreeMap<Empl, String> trmap = new TreeMap<Empl, String>(new Comparator<Empl>() {

            @Override
            public int compare(Empl e1, Empl e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        trmap.put(new Empl("Ram", 3000), "RAM");
        trmap.put(new Empl("John", 6000), "JOHN");
        trmap.put(new Empl("Crish", 2000), "CRISH");
        trmap.put(new Empl("Tom", 2400), "TOM");
        Set<Empl> ks = trmap.keySet();
        for (Empl key : ks) {
            System.out.println(key + " ==> " + trmap.get(key));
        }
    }

    /*How to get sorted sub-map from TreeMap*/
    public static void treeMapSortedSubMap() {
        final TreeMap<String, String> hm = new TreeMap<String, String>(new Comparator<String>() {

            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }

        });
        //add key-value pair to TreeMap
        hm.put("java", "language");
        hm.put("computer", "machine");
        hm.put("india", "country");
        hm.put("mango", "fruit");
        hm.put("game", "cricket");
        System.out.println("TreeMap Entries:");
        System.out.println(hm);
        Map<String, String> subMap1 = hm.subMap("game", "java");
        System.out.println("Sub-Map enties:");
        System.out.println(subMap1);
        //how to get lower boundary also part of sub-map
        Map<String, String> subMap2 = hm.subMap("game", true, "java", true);
        System.out.println("Sub-Map enties:");
        System.out.println(subMap2);
        //how to omit upper boundary in the sub-map
        Map<String, String> subMap3 = hm.subMap("game", false, "java", true);
        System.out.println("Sub-Map enties:");
        System.out.println(subMap3);
    }

    /*How to get first key element from TreeMap (Sorted Map)*/
    public static void treeMapFirstKeyElement() {
        final class Emp {

            private String name;
            private int salary;

            public Emp(String n, int s) {
                this.name = n;
                this.salary = s;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            public String toString() {
                return "Name: " + this.name + "-- Salary: " + this.salary;
            }
        }

        //By using salary comparator (int comparison)
        final TreeMap<Emp, String> trmap = new TreeMap<Emp, String>(new Comparator<Emp>() {

            @Override
            public int compare(Emp e1, Emp e2) {
                if (e1.getSalary() < e2.getSalary()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        trmap.put(new Emp("Ram", 3000), "RAM");
        trmap.put(new Emp("John", 6000), "JOHN");
        trmap.put(new Emp("Crish", 2000), "CRISH");
        trmap.put(new Emp("Tom", 2400), "TOM");
        Emp em = trmap.firstKey();
        System.out.println("Highest salary emp: " + em);
        Map.Entry<Emp, String> ent = trmap.firstEntry();
        System.out.println("Entry set values: ");
        System.out.println(ent.getKey() + " ==> " + ent.getValue());
    }

    /*How to get last key element from TreeMap (Sorted Map)*/
    public static void treeMapLstElement() {
        final class Emp {

            private String name;
            private int salary;

            public Emp(String n, int s) {
                this.name = n;
                this.salary = s;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }

            public String toString() {
                return "Name: " + this.name + "-- Salary: " + this.salary;
            }
        }

        //By using salary comparator (int comparison)
        final TreeMap<Emp, String> trmap = new TreeMap<Emp, String>(new Comparator<Emp>() {

            @Override
            public int compare(Emp e1, Emp e2) {
                if (e1.getSalary() < e2.getSalary()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        trmap.put(new Emp("Ram", 3000), "RAM");
        trmap.put(new Emp("John", 6000), "JOHN");
        trmap.put(new Emp("Crish", 2000), "CRISH");
        trmap.put(new Emp("Tom", 2400), "TOM");
        Emp em = trmap.lastKey();
        System.out.println("Least salary emp: " + em);
        Map.Entry<Emp, String> ent = trmap.lastEntry();
        System.out.println("Entry set values: ");
        System.out.println(ent.getKey() + " ==> " + ent.getValue());
    }

    /*How to reverse sorted keys in a TreeMap*/
    public static void treeMapReverseSorting() {
        //the treemap sorts by key
        final TreeMap<String, String> hm = new TreeMap<String, String>(new Comparator<String>() {

            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }

        });
        //add key-value pair to TreeMap
        hm.put("java", "language");
        hm.put("computer", "machine");
        hm.put("india", "country");
        hm.put("mango", "fruit");
        hm.put("game", "cricket");
        System.out.println("TreeMap Entries:");
        System.out.println(hm);
        Map<String, String> rm = hm.descendingMap();
        System.out.println("Reverse Map Content: ");
        System.out.println(rm);
    }




}
