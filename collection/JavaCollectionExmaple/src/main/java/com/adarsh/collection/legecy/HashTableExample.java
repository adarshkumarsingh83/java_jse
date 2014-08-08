package com.adarsh.collection.legecy;


import org.junit.Test;

import java.util.*;

import static java.lang.System.out;
/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class HashTableExample {


    @Test
    public void hashTableBasicOperation() {
        //Create hash table instance
        final Hashtable<String, String> hashTable = new Hashtable<String, String>() {
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

        out.println(hashTable);
        //getting value for the given key from hashtable
        out.println("Value of key 'key2': " + hashTable.get("key2"));
        out.println("Is HashTable empty? " + hashTable.isEmpty());
        hashTable.remove("third");
        out.println(hashTable);
        out.println("Size of the HashTable: " + hashTable.size());
    }

    /*How to iterate through Hashtable*/
    @Test
    public void hashTableIteration() {
        final Hashtable<String, String> hashTable = new Hashtable<String, String>() {
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
        out.println(hashTable);
        final Set<String> keys = hashTable.keySet();
        for (String key : keys) {
            out.println("Value of " + key + " is: " + hashTable.get(key));
        }
    }

    /*How to copy Map content to another Hashtable*/
    @Test
    public void hashTableCopyMap() {
        final Hashtable<String, String> hashTable = new Hashtable<String, String>() {
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
        out.println(hashTable);
        final HashMap<String, String> stringStringHashMap = new

                HashMap<String, String>() {
                    {
                        put("mapKey1", "MapValue1");
                        put("mapKey2", "MapValue2");
                        put("mapKey3", "MapValue3");
                        put("mapKey4", "MapValue4");
                    }
                };
        hashTable.putAll(stringStringHashMap);
        out.println(hashTable);
    }

    /*How to search a key in Hashtable*/
    @Test
    public void hashTableSearchKey() {
        final Hashtable<String, String> hashTable = new Hashtable<String, String>() {
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
        out.println(hashTable);
        if (hashTable.containsKey("key1")) {
            out.println("The Hashtable contains key key1");
        } else {
            out.println("The Hashtable does not contains key1");
        }
        if (hashTable.containsKey("key9")) {
            out.println("The Hashtable contains key9");
        } else {
            out.println("The Hashtable does not contains key9");
        }
    }

    /*How to search a value in Hashtable*/
    @Test
    public void hashTableSearchValue() {
        final Hashtable<String, String> hashTable = new Hashtable<String, String>() {
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
        out.println(hashTable);
        if (hashTable.containsValue("Value2")) {
            out.println("The Hashtable contains Value2");
        } else {
            out.println("The Hashtable does not contains Value2");
        }
        if (hashTable.containsValue("Value9")) {
            out.println("The Hashtable contains Value9");
        } else {
            out.println("The Hashtable does not contains Value9");
        }
    }

    /*How to get all keys from Hashtable*/
    @Test
    public void hashTableGetAllKey() {
        final Hashtable<String, String> hashTable = new Hashtable<String, String>() {
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
        out.println(hashTable);
        final Set<String> keys = hashTable.keySet();
        for (String key : keys) {
            out.print("\t" + key);
        }
    }

    /*How to get entry set from Hashtable*/
    @Test
    public void hashTableGetEntrySet() {
        final Hashtable<String, String> hashTable = new Hashtable<String, String>() {
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
        out.println(hashTable);
        //getting value for the given key from Hashtable
        final Set<Map.Entry<String, String>> entrySet = hashTable.entrySet();
        for (Map.Entry<String, String> mapEntry : entrySet) {
            out.println(mapEntry.getKey() + " ==> " + mapEntry.getValue());
        }
    }

    /*How to delete all elements from Hashtable*/
    @Test
    public void hashTableDeleteAllElement() {
        final Hashtable<String, String> hashTable = new Hashtable<String, String>() {
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
        out.println("My Hashtable content:");
        out.println(hashTable);
        out.println("Clearing Hashtable:");
        hashTable.clear();
        out.println("Content After clear:");
        out.println(hashTable);
    }

    /*How to read elements using Enumeration in Hashtable*/
    @Test
    public void hashTableReadElementEnumeration() {
        final Hashtable<String, String> hashTable = new Hashtable<String, String>() {
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
        final Enumeration<String> keys = hashTable.keys();
        while (keys.hasMoreElements()) {
            final String key = keys.nextElement();
            out.println("Value of " + key + " is: " + hashTable.get(key));
        }
    }

    /*Hashtable implementation with equals and hashcode example*/
    @Test
    public void hashTableEqualAndHashCode() {

        final class Employee {
            private String name;
            private int salary;
            private int id;

            public Employee(int id, String n, int s) {
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
                return this.getId();
            }

            @Override
            public boolean equals(Object obj) {
                Employee e = null;
                if (obj instanceof Employee) {
                    e = (Employee) obj;
                }
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

        final Hashtable<Employee, String> employeeStringHashtable = new Hashtable<Employee, String>() {
            {
                put(new Employee(134, "Adarsh", 3000), "Adarsh");
                put(new Employee(235, "Radha", 6000), "Radha");
                put(new Employee(876, "Sonu", 2000), "Sonu");
                put(new Employee(512, "Monu", 2400), "Monu");
            }
        };
        out.println("Fetching value by creating new key:");
        Employee employeeObject = new Employee(512, "Monu", 2400);
        out.println(employeeObject + " ==> " + employeeStringHashtable.get(employeeObject));
    }

    /*How to fetch values with user define object as keys in Hashtable*/
    @Test
    public void hastTableFetchValue() {

        final class Employee {

            private String name;
            private int salary;
            private int id;

            public Employee(int id, String n, int s) {
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
                return this.getId();
            }

            @Override
            public boolean equals(Object obj) {
                Employee e = null;
                if (obj instanceof Employee) {
                    e = (Employee) obj;
                }
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

        final Hashtable<Employee, String> employeeStringHashtable = new Hashtable<Employee, String>() {
            {
                put(new Employee(111, "Adarsh", 3000), "Adarsh");
                put(new Employee(222, "Radha", 6000), "Radha");
                put(new Employee(333, "Sonu", 2000), "Sonu");
                put(new Employee(444, "Monu", 2400), "Monu");
            }
        };
        out.println("Fetching value by creating new key:");
        Employee e = new Employee(444, "Monu", 2400);
        out.println(e + " ==> " + employeeStringHashtable.get(e));
    }

    /*How to eliminate duplicate keys (user defined objects) with Hashtable*/
    @Test
    public void hashTableRemovingDuplicateKey() {

        final class Employee {
            private String name;
            private int salary;
            private int id;

            public Employee(int id, String n, int s) {
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
                return this.getId();
            }

            @Override
            public boolean equals(Object obj) {
                Employee e = null;
                if (obj instanceof Employee) {
                    e = (Employee) obj;
                }
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

        final Hashtable<Employee, String> employeeStringHashtable = new Hashtable<Employee, String>() {
            {
                put(new Employee(111, "Adarsh", 3000), "Adarsh");
                put(new Employee(222, "Radha", 6000), "Radha");
                put(new Employee(333, "Sonu", 2000), "Sonu");
                put(new Employee(444, "Monu", 2400), "Monu");
            }
        };
        out.println("Adding duplicate entry:");
        employeeStringHashtable.put(new Employee(444, "Monu", 2400), "Monu");
        out.println("Hashtable entries:");
        final Set<Employee> keys = employeeStringHashtable.keySet();
        for (Employee key : keys) {
            out.println(key + " ==> " + employeeStringHashtable.get(key));
        }
        out.println("Duplicate got eliminated!!!");
    }
}
