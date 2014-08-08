package com.adarsh.collection.util;

import org.junit.Test;

import java.util.*;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class CollectionsExample {


    /*How to add all elements to the given collection object*/
    @Test
    public void addingAllElementToCollection() {
        final List<String> stringArrayList = new ArrayList<String>() {
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
        System.out.println("Initial list: \n" + stringArrayList);
        Collections.addAll(stringArrayList, "ExtraValue1", "ExtraValue2");
        System.out.println("After adding elements:\n" + stringArrayList);
        final String[] strArr = {"AdditionalExtraValue1", "AdditionalExtraValue2"};
        Collections.addAll(stringArrayList, strArr);
        System.out.println("After adding array:\n" + stringArrayList);
    }

    /*Write an example for Collections.asLifoQueue() method*/
    @Test
    public void collectionAsQueue() {
        final Deque<String> stringDeque = new ArrayDeque<String>(8) {
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
        Queue<String> stringQueue = Collections.asLifoQueue(stringDeque);
        System.out.println("returned queue is: " + stringQueue);
    }

    /*How to search user defined object from a List by using binary search using comparator*/
    @Test
    public void searchCustomObject() {
        final class Employee {

            private int empId;
            private String empName;
            private int empSal;

            public Employee(int id, String name, int sal) {
                this.empId = id;
                this.empName = name;
                this.empSal = sal;
            }

            public int getEmpId() {
                return empId;
            }

            public void setEmpId(int empId) {
                this.empId = empId;
            }

            public String getEmpName() {
                return empName;
            }

            public void setEmpName(String empName) {
                this.empName = empName;
            }

            public int getEmpSal() {
                return empSal;
            }

            public void setEmpSal(int empSal) {
                this.empSal = empSal;
            }

            public String toString() {
                return empId + " : " + empName + " : " + empSal;
            }
        }

        final List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(12, "Adarsh", 50000));
        employeeList.add(new Employee(146, "Radha", 20000));
        employeeList.add(new Employee(201, "Sonu", 40000));
        employeeList.add(new Employee(302, "Monu", 44500));
        employeeList.add(new Employee(543, "Ram", 10000));

        final Employee searchKey = new Employee(201, "Sonu", 40000);
        int index = Collections.binarySearch(employeeList, searchKey, new Comparator<Employee>() {

            public int compare(Employee e1, Employee e2) {
                if (e1.getEmpId() == e2.getEmpId()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        });
        System.out.println("Index of the searched key: " + index);
    }

    /*Write an example for Collections.checkedCollection() method*/
    @Test
    public void checkedCollection() {
        final List arrayList = new ArrayList() {
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
        Collection chkList = Collections.checkedCollection(arrayList, String.class);
        System.out.println("Checked list content: " + chkList);
        //you can add any type of elements to myList object
        arrayList.add(10);
        //you cannot add any type of elements to chkList object, doing so
        //throws ClassCastException
        chkList.add(10); //throws ClassCastException
    }

    /*Write an example for Collections.checkedList() method*/
    @Test
    public void checkedList() {
        final List arrayList = new ArrayList() {
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
        List chkList = Collections.checkedList(arrayList, String.class);
        System.out.println("Checked list content: " + chkList);
        //you can add any type of elements to myList object
        arrayList.add(10);
        //you cannot add any type of elements to chkList object, doing so
        //throws ClassCastException
        chkList.add(10); //throws ClassCastException
    }

    /*Write an example for Collections.checkedSet() method*/
    @Test
    public void checkSet() {
        final Set set = new HashSet(){
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
            }
        };
        Set chkSet = Collections.checkedSet(set, String.class);
        System.out.println("Checked set content: " + chkSet);
        //you can add any type of elements to mySet object
        set.add(10);
        //you cannot add any type of elements to chkSet object, doing so
        //throws ClassCastException
        chkSet.add(10); //throws ClassCastException
    }

    /*Write an example for Collections.checkedMap() method*/
    @Test
    public void checkMap() {
        final Map myMap = new HashMap(){
            {
                put("keyOne1",1);
                put("keyOne2",2);
                put("keyOne3",3);
                put("keyOne4",4);
                put("keyOne5",5);
            }
        };
        Map chkMap = Collections.checkedMap(myMap, String.class, Integer.class);
        System.out.println("Checked map content: " + chkMap);
        //you can add any type of elements to myMap object
        myMap.put(10, "ten");
        //you cannot add any type of elements to chkMap object, doing so
        //throws ClassCastException
        chkMap.put(10, "ten"); //throws ClassCastException
    }

    /*How to check there in no common element between two list objects by using Collections.disjoint() method*/
    @Test
    public void disJoint() {
        final List<String> stringList1 = new ArrayList<String>(){
            {
                add("Value01");
                add("Value02");
                add("Value03");
                add("Value04");
                add("Value05");
            }
        };
        final List<String> stringList2 = new ArrayList<String>(){
            {
                add("Value10");
                add("Value20");
                add("Value30");
                add("Value40");
                add("Value50");
            }
        };
        System.out.println("\n"+stringList1+"\n"+stringList2);
        boolean isCommon = Collections.disjoint(stringList1, stringList2);
        System.out.println("Does not found any common elements ? " + isCommon);
        stringList2.add("Value05");
        System.out.println("\n"+stringList1+"\n"+stringList2);
        isCommon = Collections.disjoint(stringList1, stringList2);
        System.out.println("Does not found any common elements ? " + isCommon);
    }

    /*How to create empty list using Collections class*/
    @Test
    public void emptyList() {
        final List<String> myEmptyList = Collections.<String>emptyList();
        System.out.println("Empty list: " + myEmptyList);
    }

    /*How to create empty set using Collections class*/
    @Test
    public void emptySet() {
        Set<String> myEmptySet = Collections.<String>emptySet();
        System.out.println("Empty set: " + myEmptySet);
    }

    /*How to create empty map using Collections class*/
    @Test
    public void emptyMap() {
        Map<String, String> myEmptyMap = Collections.<String, String>emptyMap();
        System.out.println("Empty map: " + myEmptyMap);
    }

    /*How to Enumeration for ArrayList object?*/
    @Test
    public void arrayListEnumeration() {
        final List<String> stringList = new ArrayList<String>(){
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
            }
        };
        final Enumeration<String> enm = Collections.enumeration(stringList);
        while (enm.hasMoreElements()) {
            System.out.print("\t"+enm.nextElement());
        }
    }

    /*How to fill or replace elements of a List or ArrayList*/
    @Test
    public void arrayListReplaceElement() {
        final List<String> stringList = new ArrayList<String>(){
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
            }
        };
        System.out.println("Original List: " + stringList);
        Collections.fill(stringList, "TEMP_STRING");
        System.out.println("After fill: " + stringList);
    }

    /*How to find repeated element cound (frequency) of a given collection*/
    @Test
    public void findRepeatedElement() {
        final List<String> stringList = new ArrayList<String>(){
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value1");
                add("Value3");
                add("Value5");
                add("Value5");

            }
        };
        System.out.println("Actual list: " + stringList);
        System.out.println("Frequency of 'Value1': " + Collections.frequency(stringList, "Value1"));
        System.out.println("Frequency of 'Value2': " + Collections.frequency(stringList, "Value2"));
        System.out.println("Frequency of 'Value5': " + Collections.frequency(stringList, "Value5"));
    }

    /*How to convert Enumeration to List object*/
    @Test
    public void convertEnumIntoList() {
       final  Vector<String> stringVector = new Vector<String>(){
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
        Enumeration<String> enm = stringVector.elements();
        List<String> ll = Collections.list(enm);
        System.out.println("List elements: " + ll);
    }

    /*How to get index of a sub list from another list*/
    @Test
    public void getIndexOfSubList() {
        final List<String> list = new ArrayList<String>(){
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
        final List<String> subList = new ArrayList<String>(){
            {
                add("Value4");
                add("Value5");
                add("Value6");
            }
        };
        System.out.println("Index of Sublist: " + Collections.indexOfSubList(list, subList));
    }

    /*How to get max element from the given list*/
    @Test
    public void getMaxElement() {
        final List<Integer> li = new ArrayList<Integer>(){
            {
                add(23);
                add(44);
                add(12);
                add(45);
                add(2);
                add(16);
            }
        };
        System.out.println("Maximum element from the list: " + Collections.max(li));
    }

    /*How to get min element from the given list*/
    @Test
    public void getMinElement() {
        final List<Integer> li = new ArrayList<Integer>(){
            {
                add(23);
                add(44);
                add(12);
                add(45);
                add(2);
                add(16);
            }
        };
        System.out.println("Minimum element from the list: " + Collections.min(li));
    }

    /*How to get max element of a list of user defined objects*/
    @Test
    public void getMaxElementCustomObject() {
        final class Employee implements Comparable<Employee> {

            private int id;
            private String name;
            private Integer salary;

            public Employee(int id, String name, Integer sal) {
                this.id = id;
                this.name = name;
                this.salary = sal;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getSalary() {
                return salary;
            }

            public void setSalary(Integer salary) {
                this.salary = salary;
            }

            @Override
            public int compareTo(Employee emp) {

                return this.salary.compareTo(emp.getSalary());
            }

            public String toString() {
                return id + "  " + name + "   " + salary;
            }
        }

        final List<Employee> employeeArrayList = new ArrayList<Employee>(){
            {
                add(new Employee(10, "Adarsh", 25000));
                add(new Employee(120, "Radha", 45000));
                add(new Employee(210, "Amit", 14000));
                add(new Employee(150, "Monu", 24000));
            }
        };
        Employee maxSal = Collections.max(employeeArrayList);
        System.out.println("Employee with max salary: " + maxSal);
    }

    /*How to get min element of a list of user defined objects*/
    @Test
    public void getMinElementalCustomObject() {

       final class Employee implements Comparable<Employee> {

            private int id;
            private String name;
            private Integer salary;

            public Employee(int id, String name, Integer sal) {
                this.id = id;
                this.name = name;
                this.salary = sal;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getSalary() {
                return salary;
            }

            public void setSalary(Integer salary) {
                this.salary = salary;
            }

            @Override
            public int compareTo(Employee emp) {

                return this.salary.compareTo(emp.getSalary());
            }

            public String toString() {
                return id + "  " + name + "   " + salary;
            }
        }

        final List<Employee> employeeArrayList = new ArrayList<Employee>(){
            {
                add(new Employee(10, "Adarsh", 25000));
                add(new Employee(120, "Radha", 45000));
                add(new Employee(210, "Amit", 14000));
                add(new Employee(150, "Monu", 24000));
            }
        };
        Employee minSal = Collections.min(employeeArrayList);
        System.out.println("Employee with min salary: " + minSal);
    }

    /*How to get max element of a list of user defined objects using Comparator*/
    @Test
    public void getMaxElementCusotmObject() {
        final class Employee {

            private int id;
            private String name;
            private Integer salary;

            public Employee(int id, String name, Integer sal) {
                this.id = id;
                this.name = name;
                this.salary = sal;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getSalary() {
                return salary;
            }

            public void setSalary(Integer salary) {
                this.salary = salary;
            }

            public String toString() {
                return id + "  " + name + "   " + salary;
            }
        }

        final List<Employee> employeeArrayList = new ArrayList<Employee>(){
            {
                add(new Employee(10, "Adarsh", 25000));
                add(new Employee(120, "Radha", 45000));
                add(new Employee(210, "Amit", 14000));
                add(new Employee(150, "Monu", 24000));
            }
        };
        Employee maxSal = Collections.max(employeeArrayList, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getSalary().compareTo(e2.getSalary());
            }
        });
        System.out.println("Employee with max salary: " + maxSal);
    }

    /*How to get max element of a list of user defined objects using Comparator*/
    @Test
    public void getMinElementCustomObject() {

        final class Employee {

            private int id;
            private String name;
            private Integer salary;

            public Employee(int id, String name, Integer sal) {
                this.id = id;
                this.name = name;
                this.salary = sal;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getSalary() {
                return salary;
            }

            public void setSalary(Integer salary) {
                this.salary = salary;
            }

            public String toString() {
                return id + "  " + name + "   " + salary;
            }
        }

        final List<Employee> employeeArrayList = new ArrayList<Employee>(){
            {
                add(new Employee(10, "Adarsh", 25000));
                add(new Employee(120, "Radha", 45000));
                add(new Employee(210, "Amit", 14000));
                add(new Employee(150, "Monu", 24000));
            }
        };
        Employee minSal = Collections.min(employeeArrayList, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getSalary().compareTo(e2.getSalary());
            }
        });
        System.out.println("Employee with min salary: " + minSal);
    }

    /*How to create multiple copies of a given object?*/
    @Test
    public void createMultipleCopies() {
        final class Employee {

            private int id;
            private String name;
            private Integer salary;

            public Employee(int id, String name, Integer sal) {
                this.id = id;
                this.name = name;
                this.salary = sal;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public Integer getSalary() {
                return salary;
            }

            public void setSalary(Integer salary) {
                this.salary = salary;
            }

            public String toString() {
                return id + "  " + name + "   " + salary;
            }
        }

        String temp = "Temp Employee";
        List<String> tempCopies = Collections.nCopies(5, temp);
        System.out.println(tempCopies);
        Employee emp = new Employee(10, "Adarsh kumar", 25000);
        List<Employee> empCopies = Collections.nCopies(5, emp);
        for (Employee e : empCopies) {
            System.out.println(e);
        }
    }

    /*How to replace all occurrences of a given object in the list*/
    @Test
    public void replaceAllOccurrence() {
        final List<String> list = new ArrayList<String>(){
            {
               add("Value1");
               add("Value2");
               add("Value3");
               add("Value1");
               add("Value4");
               add("Value5");
               add("Value6");
            }
        };
        System.out.println(list);
        //replace perl with dum_dum
        Collections.replaceAll(list, "Value1", "ReplacedValue1");
        System.out.println(list);
    }

    /*How to rotate elements in the list by specified distance*/
    @Test
    public void rotateElement() {
       final List<String> list = new ArrayList<String>(){
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

        System.out.println(list);
        Collections.rotate(list, 3);
        System.out.println("List after rotation:");
        System.out.println(list);
    }

    /*How to create synchronized list*/
    @Test
    public void synchronizeList() {
        List<String> stringList = new ArrayList<String>();
        List<String> list = Collections.synchronizedList(stringList);
        System.out.println("Synchronized list got created...");
    }

    /*How to create synchronized set*/
    @Test
    public void synchronizedSet() {
        Set<String> stringHashSet = new HashSet<String>();
        Set<String> stringSet = Collections.synchronizedSet(stringHashSet);
        System.out.println("Synchronized set got created...");
    }

    /*How to create synchronized map*/
    @Test
    public void synchronizedMap() {
        Map<String, String> stringStringHashMap = new HashMap<String, String>();
        Map<String, String> stringStringMap = Collections.synchronizedMap(stringStringHashMap);
        System.out.println("Synchronized map got created...");
    }
}
