package com.adarsh.collection;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/19/14
 * Time: 11:39 AM
 * To change this template use File | Settings | File Templates.
 */
public class CollectionsExample {
    public static void main(String[] args) {

    }

    /*How to add all elements to the given collection object*/
    public static void addingAllElementToCollection() {
        List<String> myList = new ArrayList<String>();
        myList.add("java");
        myList.add("c");
        myList.add("c++");
        System.out.println("Initial list:" + myList);
        Collections.addAll(myList, "perl", "php");
        System.out.println("After adding elements:" + myList);
        String[] strArr = {".Net", "unix"};
        Collections.addAll(myList, strArr);
        System.out.println("After adding array:" + myList);
    }

    /*Write an example for Collections.asLifoQueue() method*/
    public static void collectionAsQueue() {
        Deque<String> dq = new ArrayDeque<String>(5);
        dq.add("java");
        dq.add("c");
        dq.add("c++");
        dq.add("unix");
        dq.add("perl");
        Queue<String> q = Collections.asLifoQueue(dq);
        System.out.println("returned queue is: " + q);
    }

    /*How to search user defined object from a List by using binary search using comparator*/
    public static void searchCustomObject() {
        final class Emp {

            private int empId;
            private String empName;
            private int empSal;

            public Emp(int id, String name, int sal) {
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

        List<Emp> empList = new ArrayList<Emp>();
        empList.add(new Emp(12, "Dinesh", 50000));
        empList.add(new Emp(146, "Tom", 20000));
        empList.add(new Emp(201, "John", 40000));
        empList.add(new Emp(302, "Krish", 44500));
        empList.add(new Emp(543, "Abdul", 10000));

        Emp searchKey = new Emp(201, "John", 40000);
        int index = Collections.binarySearch(empList, searchKey, new Comparator<Emp>() {

            public int compare(Emp e1, Emp e2) {
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
    public static void checkedCollection() {
        List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        Collection chkList = Collections.checkedCollection(myList, String.class);
        System.out.println("Checked list content: " + chkList);
        //you can add any type of elements to myList object
        myList.add(10);
        //you cannot add any type of elements to chkList object, doing so
        //throws ClassCastException
        chkList.add(10); //throws ClassCastException
    }

    /*Write an example for Collections.checkedList() method*/
    public static void checkedList() {
        List myList = new ArrayList();
        myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("four");
        List chkList = Collections.checkedList(myList, String.class);
        System.out.println("Checked list content: " + chkList);
        //you can add any type of elements to myList object
        myList.add(10);
        //you cannot add any type of elements to chkList object, doing so
        //throws ClassCastException
        chkList.add(10); //throws ClassCastException
    }

    /*Write an example for Collections.checkedSet() method*/
    public static void checkSet() {
        Set mySet = new HashSet();
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");
        mySet.add("four");
        Set chkSet = Collections.checkedSet(mySet, String.class);
        System.out.println("Checked set content: " + chkSet);
        //you can add any type of elements to mySet object
        mySet.add(10);
        //you cannot add any type of elements to chkSet object, doing so
        //throws ClassCastException
        chkSet.add(10); //throws ClassCastException
    }

    /*Write an example for Collections.checkedMap() method*/
    public static void checkMap() {
        Map myMap = new HashMap();
        myMap.put("one", 1);
        myMap.put("two", 2);
        myMap.put("three", 3);
        myMap.put("four", 4);
        Map chkMap = Collections.checkedMap(myMap, String.class, Integer.class);
        System.out.println("Checked map content: " + chkMap);
        //you can add any type of elements to myMap object
        myMap.put(10, "ten");
        //you cannot add any type of elements to chkMap object, doing so
        //throws ClassCastException
        chkMap.put(10, "ten"); //throws ClassCastException
    }

    /*How to check there in no common element between two list objects by using Collections.disjoint() method*/
    public static void disJoint() {
        List<String> sl = new ArrayList<String>();
        sl.add("apple");
        sl.add("java");
        sl.add("c++");
        sl.add("unix");
        sl.add("orange");
        sl.add("airtel");
        List<String> tl = new ArrayList<String>();
        tl.add("job");
        tl.add("oracle");
        tl.add("jungle");
        tl.add("cricket");
        boolean isCommon = Collections.disjoint(sl, tl);
        System.out.println("Does not found any common elements? " + isCommon);
        tl.add("java");
        isCommon = Collections.disjoint(sl, tl);
        System.out.println("Does not found any common elements? " + isCommon);
    }

    /*How to create empty list using Collections class*/
    public static void emptyList() {
        List<String> myEmptyList = Collections.<String>emptyList();
        System.out.println("Empty list: " + myEmptyList);
    }

    /*How to create empty set using Collections class*/
    public static void emptySet() {
        Set<String> myEmptySet = Collections.<String>emptySet();
        System.out.println("Empty set: " + myEmptySet);
    }

    /*How to create empty map using Collections class*/
    public static void emptyMap() {
        Map<String, String> myEmptyMap = Collections.<String, String>emptyMap();
        System.out.println("Empty map: " + myEmptyMap);
    }

    /*How to Enumeration for ArrayList object?*/
    public static void arraryListEnumeration() {
        List<String> ls = new ArrayList<String>();
        ls.add("one");
        ls.add("two");
        ls.add("three");
        ls.add("four");
        Enumeration<String> enm = Collections.enumeration(ls);
        while (enm.hasMoreElements()) {
            System.out.println(enm.nextElement());
        }
    }

    /*How to fill or replace elements of a List or ArrayList*/
    public static void arrayListReplaceElement() {
        final List<String> ll = new ArrayList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        System.out.println("Original List: " + ll);
        Collections.fill(ll, "TEMP_STRING");
        System.out.println("After fill: " + ll);
    }

    /*How to find repeated element cound (frequency) of a given collection*/
    public static void findRepeatedElement() {
        List<String> ll = new ArrayList<String>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        ll.add("two");
        ll.add("three");
        ll.add("two");
        ll.add("one");
        System.out.println("Actual list: " + ll);
        System.out.println("Frequency of 'one': " + Collections.frequency(ll, "one"));
        System.out.println("Frequency of 'three': " + Collections.frequency(ll, "three"));
        System.out.println("Frequency of 'two': " + Collections.frequency(ll, "two"));
    }

    /*How to convert Enumeration to List object*/
    public static void convertEnumIntoList() {
        Vector<String> vct = new Vector<String>();
        vct.add("one");
        vct.add("two");
        vct.add("three");
        vct.add("four");
        vct.add("five");
        Enumeration<String> enm = vct.elements();
        List<String> ll = Collections.list(enm);
        System.out.println("List elements: " + ll);
    }

    /*How to get index of a sub list from another list*/
    public static void getIndexOfSubList(){
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("unix");
        list.add("perl");
        list.add("php");
        list.add("javascript");
        list.add("ruby");
        list.add(".net");
        list.add("jdbc");
        list.add("servlets");
        List<String> subList = new ArrayList<String>();
        subList.add("php");
        subList.add("javascript");
        subList.add("ruby");
        System.out.println("Index of sublist: "+Collections.indexOfSubList(list, subList));
    }

    /*How to get max element from the given list*/
    public static void getMaxElement(){
        List<Integer> li = new ArrayList<Integer>();
        li.add(23);
        li.add(44);
        li.add(12);
        li.add(45);
        li.add(2);
        li.add(16);
        System.out.println("Maximum element from the list: "+Collections.max(li));
    }

    /*How to get min element from the given list*/
    public static void getMinElement(){
        List<Integer> li = new ArrayList<Integer>();
        li.add(23);
        li.add(44);
        li.add(12);
        li.add(45);
        li.add(2);
        li.add(16);
        System.out.println("Minimum element from the list: "+Collections.min(li));
    }

    /*How to get max element of a list of user defined objects*/
    public static void getMaxElementCustomObject(){
       final  class Empl implements Comparable<Empl>{

            private int id;
            private String name;
            private Integer salary;

            public Empl(int id, String name, Integer sal){
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
            public int compareTo(Empl emp) {

                return this.salary.compareTo(emp.getSalary());
            }
            public String toString(){
                return id+"  "+name+"   "+salary;
            }
        }

        List<Empl> emps = new ArrayList<Empl>();
        emps.add(new Empl(10, "Raghu", 25000));
        emps.add(new Empl(120, "Krish", 45000));
        emps.add(new Empl(210, "John", 14000));
        emps.add(new Empl(150, "Kishore", 24000));
        Empl maxSal = Collections.max(emps);
        System.out.println("Employee with max salary: "+maxSal);
    }


    /*How to get min element of a list of user defined objects*/
    public static void getMinElemenetCustomObject(){
        final class Empl implements Comparable<Empl>{

            private int id;
            private String name;
            private Integer salary;

            public Empl(int id, String name, Integer sal){
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
            public int compareTo(Empl emp) {

                return this.salary.compareTo(emp.getSalary());
            }
            public String toString(){
                return id+"  "+name+"   "+salary;
            }
        }

        List<Empl> emps = new ArrayList<Empl>();
        emps.add(new Empl(10, "Raghu", 25000));
        emps.add(new Empl(120, "Krish", 45000));
        emps.add(new Empl(210, "John", 14000));
        emps.add(new Empl(150, "Kishore", 24000));
        Empl minSal = Collections.min(emps);
        System.out.println("Employee with min salary: "+minSal);
    }


    /*How to get max element of a list of user defined objects using Comparator*/
    public static void getMaxElementCusotmObject(){
        final class Empy{

            private int id;
            private String name;
            private Integer salary;

            public Empy(int id, String name, Integer sal){
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
            public String toString(){
                return id+"  "+name+"   "+salary;
            }
        }

        List<Empy> emps = new ArrayList<Empy>();
        emps.add(new Empy(10, "Raghu", 25000));
        emps.add(new Empy(120, "Krish", 45000));
        emps.add(new Empy(210, "John", 14000));
        emps.add(new Empy(150, "Kishore", 24000));
        Empy maxSal = Collections.max(emps, new Comparator<Empy>(){

            @Override
            public int compare(Empy e1, Empy e2) {
                return e1.getSalary().compareTo(e2.getSalary());
            }
        });
        System.out.println("Employee with max salary: "+maxSal);
    }

    /*How to get max element of a list of user defined objects using Comparator*/
    public static void getMinElementCustomObject(){
       final class Empy{

           private int id;
           private String name;
           private Integer salary;

           public Empy(int id, String name, Integer sal){
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
           public String toString(){
               return id+"  "+name+"   "+salary;
           }
       }

        List<Empy> emps = new ArrayList<Empy>();
        emps.add(new Empy(10, "Raghu", 25000));
        emps.add(new Empy(120, "Krish", 45000));
        emps.add(new Empy(210, "John", 14000));
        emps.add(new Empy(150, "Kishore", 24000));
        Empy minSal = Collections.min(emps, new Comparator<Empy>(){

            @Override
            public int compare(Empy e1, Empy e2) {
                return e1.getSalary().compareTo(e2.getSalary());
            }
        });
        System.out.println("Employee with min salary: "+minSal);
    }

    /*How to create multiple copies of a given object?*/
    public static void createMultipleCopies(){
        final class Empy{

            private int id;
            private String name;
            private Integer salary;

            public Empy(int id, String name, Integer sal){
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
            public String toString(){
                return id+"  "+name+"   "+salary;
            }
        }

        String temp = "JAVA2NOVICE";
        List<String> tempCopies = Collections.nCopies(5, temp);
        System.out.println(tempCopies);
        Empy emp = new Empy(10, "Raghu", 25000);
        List<Empy> empCopies = Collections.nCopies(5, emp);
        for(Empy e:empCopies){
            System.out.println(e);
        }
    }


    /*How to replace all occurances of a given object in the list*/
    public static void replaceAllOccurance(){
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("unix");
        list.add("perl");
        list.add("php");
        list.add("javascript");
        list.add("ruby");
        list.add(".net");
        list.add("perl");
        list.add("c++");
        System.out.println(list);
        //replace perl with dum_dum
        Collections.replaceAll(list, "perl", "dum_dum");
        System.out.println(list);
    }

    /*How to rotate elements in the list by specified distance*/
    public static void rotateElement(){
        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("c");
        list.add("c++");
        list.add("unix");
        list.add("perl");
        list.add("php");
        list.add("javascript");
        list.add("ruby");
        list.add(".net");
        System.out.println(list);
        Collections.rotate(list, 3);
        System.out.println("List after rotation:");
        System.out.println(list);
    }

    /*How to create synchronized list*/
    public static void sysnchronizedList(){
        List<String> li = new ArrayList<String>();
        List<String> sysLi = Collections.synchronizedList(li);
        System.out.println("Synchronized list got created...");
    }

    /*How to create synchronized set*/
    public static void synchroniesSet(){
        Set<String> ss = new HashSet<String>();
        Set<String> sysSet = Collections.synchronizedSet(ss);
        System.out.println("Synchronized set got created...");
    }

    /*How to create synchronized map*/
    public static void synchronesMap(){
        Map<String,String> mp = new HashMap<String,String>();
        Map<String,String> sysMapt = Collections.synchronizedMap(mp);
        System.out.println("Synchronized map got created...");
    }

}
