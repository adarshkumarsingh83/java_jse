package com.adarsh.collection;


import java.util.*;
import static java.lang.System.out;
public class HashTableExample {

    public static void main(String[] args) {

    }

    public static void hashTableBasicOperation() {
        //Create hash table instance
        final Hashtable<String, String> ht = new Hashtable<String, String>() {
            {
                //add key-value pair to hashtable
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };

        out.println(ht);
        //getting value for the given key from hashtable
        out.println("Value of key 'second': " + ht.get("second"));
        out.println("Is Hashtable empty? " + ht.isEmpty());
        ht.remove("third");
        out.println(ht);
        out.println("Size of the Hashtable: " + ht.size());
    }

    /*How to iterate through Hashtable*/
    public static void hashTableIteration() {
        final Hashtable<String, String> hm = new Hashtable<String, String>() {
            {
                //add key-value pair to Hashtable
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };
        out.println(hm);
        final Set<String> keys = hm.keySet();
        for (String key : keys) {
            out.println("Value of " + key + " is: " + hm.get(key));
        }
    }

    /*How to copy Map content to another Hashtable*/
    public static void hashTableCopyMap() {
        final Hashtable<String, String> hm = new Hashtable<String, String>() {
            {
                //add key-value pair to Hashtable
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };
        out.println(hm);
        final HashMap<String, String> subMap = new

                HashMap<String, String>() {
                    {
                        put("s1", "S1 VALUE");
                        put("s2", "S2 VALUE");
                    }
                };
        hm.putAll(subMap);
        out.println(hm);
    }

    /*How to search a key in Hashtable*/
    public static void hashTableSearchKey() {
        final Hashtable<String, String> hm = new Hashtable<String, String>() {
            {
                //add key-value pair to Hashtable
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };
        out.println(hm);
        if (hm.containsKey("first")) {
            out.println("The Hashtable contains key first");
        } else {
            out.println("The Hashtable does not contains key first");
        }
        if (hm.containsKey("fifth")) {
            out.println("The Hashtable contains key fifth");
        } else {
            out.println("The Hashtable does not contains key fifth");
        }
    }

    /*How to search a value in Hashtable*/
    public static void hashTableSearchValue() {
        final Hashtable<String, String> hm = new Hashtable<String, String>() {
            {
                //add key-value pair to Hashtable
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };
        out.println(hm);
        if (hm.containsValue("SECOND INSERTED")) {
            out.println("The Hashtable contains value SECOND INSERTED");
        } else {
            out.println("The Hashtable does not contains value SECOND INSERTED");
        }
        if (hm.containsValue("first")) {
            out.println("The Hashtable contains value first");
        } else {
            out.println("The Hashtable does not contains value first");
        }
    }

    /*How to get all keys from Hashtable*/
    public static void hashTableGetAllKey() {
        final Hashtable<String, String> hm = new Hashtable<String, String>() {
            {
                //add key-value pair to Hashtable
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };
        out.println(hm);
        final Set<String> keys = hm.keySet();
        for (String key : keys) {
            out.println(key);
        }
    }

    /*How to get entry set from Hashtable*/
    public static void hashTableGetEntrySet() {
        final Hashtable<String, String> hm = new Hashtable<String, String>() {
            {
                //add key-value pair to Hashtable
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };
        out.println(hm);
        //getting value for the given key from Hashtable
        final Set<Map.Entry<String, String>> entires = hm.entrySet();
        for (Map.Entry<String, String> ent : entires) {
            out.println(ent.getKey() + " ==> " + ent.getValue());
        }
    }

    /*How to delete all elements from Hashtable*/
    public static void hashTableDeleteAllElement() {
        final Hashtable<String, String> hm = new Hashtable<String, String>() {
            {
                //add key-value pair to Hashtable
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };
        out.println("My Hashtable content:");
        out.println(hm);
        out.println("Clearing Hashtable:");
        hm.clear();
        out.println("Content After clear:");
        out.println(hm);
    }

    /*How to read elements using Enumeration in Hashtable*/
    public static void hashTableReadElementEnumeration() {
        final Hashtable<String, String> hm = new Hashtable<String, String>() {
            {
                //add key-value pair to Hashtable
                put("first", "FIRST INSERTED");
                put("second", "SECOND INSERTED");
                put("third", "THIRD INSERTED");
            }
        };
        final Enumeration<String> keys = hm.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            out.println("Value of " + key + " is: " + hm.get(key));
        }
    }

    /*Hashtable implementation with equals and hashcode example*/
    public static void hashTableEqualAndHashCode() {

        final class Emp {
            private String name;
            private int salary;
            private int id;

            public Emp(int id, String n, int s) {
                this.id = id;
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

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            @Override
            public int hashCode() {
                out.println("In hashcode");
                return this.getId();
            }

            @Override
            public boolean equals(Object obj) {
                Emp e = null;
                if (obj instanceof Emp) {
                    e = (Emp) obj;
                }
                out.println("In equals");
                if (this.getId() == e.getId()) {
                    return true;
                } else {
                    return false;
                }
            }

            public String toString() {
                return "Id: " + this.id + " -- Name: " + this.name + " -- Salary: " + this.salary;
            }
        }

        final Hashtable<Emp, String> tm = new Hashtable<Emp, String>() {
            {
                put(new Emp(134, "Ram", 3000), "RAM");
                put(new Emp(235, "John", 6000), "JOHN");
                put(new Emp(876, "Crish", 2000), "CRISH");
                put(new Emp(512, "Tom", 2400), "TOM");
            }
        };
        out.println("Fetching value by creating new key:");
        Emp e = new Emp(512, "Tom", 2400);
        out.println(e + " ==> " + tm.get(e));
    }

    /*How to fetch values with user define object as keys in Hashtable*/
    public static void hastTableFetchValue() {

        final class Emp {

            private String name;
            private int salary;
            private int id;

            public Emp(int id, String n, int s) {
                this.id = id;
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

            public void setId(int id) {
                this.id = id;
            }

            public int getId() {
                return id;
            }

            @Override
            public int hashCode() {
                out.println("In hashcode");
                return this.getId();
            }

            @Override
            public boolean equals(Object obj) {
                Emp e = null;
                if (obj instanceof Emp) {
                    e = (Emp) obj;
                }
                out.println("In equals");
                if (this.getId() == e.getId()) {
                    return true;
                } else {
                    return false;
                }
            }

            public String toString() {
                return "Id: " + this.id + " -- Name: " + this.name + " -- Salary: " + this.salary;
            }
        }

        final Hashtable<Emp, String> tm = new Hashtable<Emp, String>() {
            {
                put(new Emp(134, "Ram", 3000), "RAM");
                put(new Emp(235, "John", 6000), "JOHN");
                put(new Emp(876, "Crish", 2000), "CRISH");
                put(new Emp(512, "Tom", 2400), "TOM");
            }
        };
        out.println("Fetching value by creating new key:");
        Emp e = new Emp(512, "Tom", 2400);
        out.println(e + " ==> " + tm.get(e));
    }

    /*How to eliminate duplicate keys (user defined objects) with Hashtable*/
    public static void hashTableRemovingDuplicateKey() {

        final class Empl {
            private String name;
            private int salary;
            private int id;

            public Empl(int id, String n, int s) {
                this.id = id;
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

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            @Override
            public int hashCode() {
                out.println("In hashcode");
                return this.getId();
            }

            @Override
            public boolean equals(Object obj) {
                Empl e = null;
                if (obj instanceof Empl) {
                    e = (Empl) obj;
                }
                out.println("In equals");
                if (this.getId() == e.getId()) {
                    return true;
                } else {
                    return false;
                }
            }
            public String toString() {
                return "Id: " + this.id + " -- Name: " + this.name + " -- Salary: " + this.salary;
            }
        }

        final Hashtable<Empl,String> tm = new Hashtable<Empl, String>(){
            {
                put(new Empl(134,"Ram",3000), "RAM");
                put(new Empl(235,"John",6000), "JOHN");
                put(new Empl(876,"Crish",2000), "CRISH");
                put(new Empl(512,"Tom",2400), "TOM");
            }
        };
        out.println("Adding duplicate entry:");
        tm.put(new Empl(512,"Tom",2400), "TOM");
        out.println("Hashtable entries:");
        Set<Empl> keys = tm.keySet();
        for(Empl key:keys){
            out.println(key+" ==> "+tm.get(key));
        }
        out.println("Duplicate got eliminated!!!");
    }






}
