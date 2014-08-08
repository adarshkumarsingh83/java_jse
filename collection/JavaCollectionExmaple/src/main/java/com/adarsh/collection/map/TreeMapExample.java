package com.adarsh.collection.map;

import org.junit.Test;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class TreeMapExample {

    @Test
    public void treeMapBasicOperation() {
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(){
            {
                put("key1","Value1");
                put("key2","Value2");
                put("key3","Value3");
                put("key4","Value4");
                put("key5","Value5");
                put("key6","Value6");
                put("key7","Value7");
                put("key8","Value8");
            }
        };
        System.out.println(treeMap);
        //getting value for the given key from TreeMap
        System.out.println("Value of second: " + treeMap.get("key2"));
        System.out.println("Is TreeMap empty? " + treeMap.isEmpty());
        treeMap.remove("key3");
        System.out.println(treeMap);
        System.out.println("Size of the TreeMap: " + treeMap.size());
    }

    /*How to iterate through TreeMap*/
    @Test
    public void treeMapIteration() {
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(){
            {
                put("key1","Value1");
                put("key2","Value2");
                put("key3","Value3");
                put("key4","Value4");
                put("key5","Value5");
                put("key6","Value6");
                put("key7","Value7");
                put("key8","Value8");
            }
        };
        System.out.println(treeMap);
        final Set<String> keys = treeMap.keySet();
        for (String key : keys) {
            System.out.println("Value of " + key + " is: " + treeMap.get(key));
        }
    }

    /*How to copy Map content to another TreeMap*/
    @Test
    public void treeMapCopyMap() {
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(){
            {
                put("key1","Value1");
                put("key2","Value2");
                put("key3","Value3");
                put("key4","Value4");
                put("key5","Value5");
                put("key6","Value6");
                put("key7","Value7");
                put("key8","Value8");
            }
        };
        System.out.println(treeMap);
        final TreeMap<String, String> subTreeMap = new TreeMap<String, String>(){
            {
                put("key11","Value11");
                put("key22","Value22");
                put("key33","Value33");
                put("key44","Value44");
                put("key55","Value55");
                put("key66","Value66");
                put("key77","Value77");
                put("key88","Value88");
            }
        };
        treeMap.putAll(subTreeMap);
        System.out.println(treeMap);
    }

    /*How to search a key in TreeMap*/
    @Test
    public void treeMapSearchKey() {
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(){
            {
                put("key1","Value1");
                put("key2","Value2");
                put("key3","Value3");
                put("key4","Value4");
                put("key5","Value5");
                put("key6","Value6");
                put("key7","Value7");
                put("key8","Value8");
            }
        };
        System.out.println(treeMap);
        if (treeMap.containsKey("key1")) {
            System.out.println("The TreeMap contains key1");
        } else {
            System.out.println("The TreeMap does not contains key1");
        }
        if (treeMap.containsKey("key5")) {
            System.out.println("The TreeMap contains key5");
        } else {
            System.out.println("The TreeMap does not contains key5");
        }
    }

    /*How to search a value in TreeMap*/
    @Test
    public void treeMapSearchValue() {
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(){
            {
                put("key1","Value1");
                put("key2","Value2");
                put("key3","Value3");
                put("key4","Value4");
                put("key5","Value5");
                put("key6","Value6");
                put("key7","Value7");
                put("key8","Value8");
            }
        };
        System.out.println(treeMap);
        if (treeMap.containsValue("Value2")) {
            System.out.println("The TreeMap contains Value2");
        } else {
            System.out.println("The TreeMap does not contains Value2");
        }
        if (treeMap.containsValue("Value1")) {
            System.out.println("The TreeMap contains Value1");
        } else {
            System.out.println("The TreeMap does not contains Value1");
        }
    }

    /*How to get all keys from TreeMap*/
    @Test
    public void treeMapGetAllKey() {
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(){
            {
                put("key1","Value1");
                put("key2","Value2");
                put("key3","Value3");
                put("key4","Value4");
                put("key5","Value5");
                put("key6","Value6");
                put("key7","Value7");
                put("key8","Value8");
            }
        };
        System.out.println(treeMap);
        final Set<String> keys = treeMap.keySet();
        for (String key : keys) {
            System.out.println(key);
        }
    }

    /*How to get entry set from TreeMap*/
    @Test
    public void treeMapGetEntrySet() {
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(){
            {
                put("key1","Value1");
                put("key2","Value2");
                put("key3","Value3");
                put("key4","Value4");
                put("key5","Value5");
                put("key6","Value6");
                put("key7","Value7");
                put("key8","Value8");
            }
        };
        System.out.println(treeMap);
        //getting value for the given key from TreeMap
        Set<Map.Entry<String, String>> entrySet = treeMap.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " ==> " + entry.getValue());
        }
    }

    /*How to delete all elements from TreeMap*/
    @Test
    public void treeMapDeleteAll() {
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(){
            {
                put("key1","Value1");
                put("key2","Value2");
                put("key3","Value3");
                put("key4","Value4");
                put("key5","Value5");
                put("key6","Value6");
                put("key7","Value7");
                put("key8","Value8");
            }
        };
        System.out.println("My TreeMap content:");
        System.out.println(treeMap);
        System.out.println("Clearing TreeMap:");
        treeMap.clear();
        System.out.println("Content After clear:");
        System.out.println(treeMap);
    }

    /*How to sort keys in TreeMap by using Comparator*/
    @Test
    public void treeMapSortKeyUsingComparator() {
        TreeMap<String, String> treeMap = new TreeMap<String, String>(new Comparator<String>() {

            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        }
        ){
            {
                put("key3","Value3");
                put("key2","Value2");
                put("key4","Value4");
                put("key8","Value8");
                put("key5","Value5");
                put("key7","Value7");
                put("key6","Value6");
                put("key1","Value1");
            }
        };
        System.out.println(treeMap);
    }

    /*How to sort keys in TreeMap by using Comparator with user define objects*/
    @Test
    public void treeMapSortKeysCustomObject() {

        final class Employee {

            private String name;
            private int salary;

            public Employee(String n, int s) {
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
        final TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>(new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });

        treeMap.put(new Employee("Radha", 3000), "Radha");
        treeMap.put(new Employee("Amit", 6000), "Amit");
        treeMap.put(new Employee("Sonu", 2000), "Sonu");
        treeMap.put(new Employee("Adarsh", 2400), "Adarsh");
        treeMap.put(new Employee("Monu", 2400), "Monu");
        final Set<Employee> employeeSet = treeMap.keySet();
        System.out.println("Sorting With Name ");
        for (Employee key : employeeSet) {
            System.out.println(key + " ==> " + treeMap.get(key));
        }

        System.out.println("===================================");

        //By using salary comparator (int comparison)
        final TreeMap<Employee, String> treeMap1 = new TreeMap<Employee, String>(new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() > e2.getSalary()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        treeMap1.put(new Employee("Radha", 3000), "Radha");
        treeMap1.put(new Employee("Amit", 6000), "Amit");
        treeMap1.put(new Employee("Sonu", 2000), "Sonu");
        treeMap1.put(new Employee("Adarsh", 2900), "Adarsh");
        treeMap1.put(new Employee("Monu", 2400), "Monu");
        final Set<Employee> employeeSet1 = treeMap1.keySet();
        System.out.println("Sorting With Salary ");
        for (Employee key : employeeSet1) {
            System.out.println(key + " ==> " + treeMap1.get(key));
        }
    }

    /*How to get sorted sub-map from TreeMap*/
    @Test
    public void treeMapSortedSubMap() {
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(new Comparator<String>() {

            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }

        });
        treeMap.put("key1","Value1");
        treeMap.put("key2","Value2");
        treeMap.put("key3","Value3");
        treeMap.put("key4","Value4");
        treeMap.put("key5","Value5");
        treeMap.put("key6","Value6");
        treeMap.put("key7","Value7");
        treeMap.put("key8","Value8");
        System.out.println("TreeMap Entries:");
        System.out.println(treeMap);
        Map<String, String> subMap1 = treeMap.subMap("key1", "key5");
        System.out.println("Sub-Map enties:");
        System.out.println(subMap1);
        //how to get lower boundary also part of sub-map
        Map<String, String> subMap2 = treeMap.subMap("key2", true, "key5", true);
        System.out.println("Sub-Map enties:");
        System.out.println(subMap2);
        //how to omit upper boundary in the sub-map
        Map<String, String> subMap3 = treeMap.subMap("key1", false, "key5", true);
        System.out.println("Sub-Map enties:");
        System.out.println(subMap3);
    }

    /*How to get first key element from TreeMap (Sorted Map)*/
    @Test
    public void treeMapFirstKeyElement() {

        final class Employee {

            private String name;
            private int salary;

            public Employee(String n, int s) {
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
        final TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>(new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() < e2.getSalary()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        treeMap.put(new Employee("Radha", 6000), "Radha");
        treeMap.put(new Employee("Adarsh", 3000), "Adarsh");
        treeMap.put(new Employee("Amit", 2000), "Amit");
        treeMap.put(new Employee("Sonu", 2400), "Sonu");
        Employee em = treeMap.firstKey();
        System.out.println("Highest salary emp: " + em);
        Map.Entry<Employee, String> entry = treeMap.firstEntry();
        System.out.println("Entry set values: ");
        System.out.println(entry.getKey() + " ==> " + entry.getValue());
    }

    /*How to get last key element from TreeMap (Sorted Map)*/
    @Test
    public void treeMapLstElement() {

        final class Employee {

            private String name;
            private int salary;

            public Employee(String n, int s) {
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
        final TreeMap<Employee, String> treeMap = new TreeMap<Employee, String>(new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() < e2.getSalary()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        treeMap.put(new Employee("Radha", 6000), "Radha");
        treeMap.put(new Employee("Adarsh", 3000), "Adarsh");
        treeMap.put(new Employee("Amit", 2000), "Amit");
        treeMap.put(new Employee("Sonu", 2400), "Sonu");
        Employee em = treeMap.lastKey();
        System.out.println("Least salary emp: " + em);
        Map.Entry<Employee, String> entry = treeMap.lastEntry();
        System.out.println("Entry set values: ");
        System.out.println(entry.getKey() + " ==> " + entry.getValue());
    }

    /*How to reverse sorted keys in a TreeMap*/
    @Test
    public void treeMapReverseSorting() {
        //the treemap sorts by key
        final TreeMap<String, String> treeMap = new TreeMap<String, String>(new Comparator<String>() {

            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }

        });
        //add key-value pair to TreeMap
        treeMap.put("key1", "Value1");
        treeMap.put("key2", "Value2");
        treeMap.put("key3", "Value3");
        treeMap.put("key4", "Value4");
        treeMap.put("key5", "Value5");
        treeMap.put("key6", "Value6");
        treeMap.put("key7", "Value7");
        treeMap.put("key8", "Value8");

        System.out.println("TreeMap Entries:");
        System.out.println(treeMap);
        Map<String, String> rm = treeMap.descendingMap();
        System.out.println("Reverse Map Content: ");
        System.out.println(rm);
    }
}
