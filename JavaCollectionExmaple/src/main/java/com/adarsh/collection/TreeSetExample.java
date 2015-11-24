package com.adarsh.collection;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/18/14
 * Time: 1:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class TreeSetExample {
    public static void main(String[] args) {

    }

    public static void treeSetBasicOperation() {
        final TreeSet<String> ts = new TreeSet<String>() {
            {
                add("one");
                add("two");
                add("three");
            }
        };
        System.out.println("Elements: " + ts);
        //check is set empty?
        System.out.println("Is set empty: " + ts.isEmpty());
        //delete all elements from set
        ts.clear();
        System.out.println("Is set empty: " + ts.isEmpty());
        ts.add("one");
        ts.add("two");
        ts.add("three");
        System.out.println("Size of the set: " + ts.size());
        //remove one string
        ts.remove("two");
        System.out.println("Elements: " + ts);
    }

    /*How to create a TreeSet with a List*/
    public static void treeSetCreationWithList() {
        final List<String> li = new ArrayList<String>() {
            {
                add("one");
                add("two");
                add("three");
                add("four");
            }
        };
        System.out.println("List: " + li);
        //create a treeset with the list
        final TreeSet<String> myset = new TreeSet<String>(li);
        System.out.println("Set: " + myset);
    }

    /*How to read objects from TreeSet using using Iterator*/
    public static void treeSetReadObjectUsingIterator() {
        final TreeSet<String> ts = new TreeSet<String>() {
            {
                add("one");
                add("two");
                add("three");
            }
        };
        final Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    /*Write a program to remove duplicate entries from an array*/
    public static void treeSetRemoveDuplicate() {
        final String[] strArr = {"one", "two", "three", "four", "four", "five"};
        //convert string array to list
        final List<String> tmpList = Arrays.asList(strArr);
        //create a treeset with the list, which eliminates duplicates
        final TreeSet<String> unique = new TreeSet<String>(tmpList);
        System.out.println(unique);
    }

    /*Write a program to find duplicate value from an array*/
    public static void treeSetFindDupicate() {
        final String[] strArr = {"one", "two", "three", "four", "four", "five"};
        final TreeSet<String> unique = new TreeSet<String>();
        for (String str : strArr) {
            if (!unique.add(str)) {
                System.out.println("Duplicate Entry is: " + str);
            }
        }
    }

    /*How to create a TreeSet with comparator*/
    public static void treeSetComparator() {

        final TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        }
        ){
            {
                add("RED");
                add("ORANGE");
                add("BLUE");
                add("GREEN");
            }
        };
        System.out.println(ts);
    }


    /*Create TreeSet with comparator by user define objects */
    public static void treeSetCustomeObject(){

        final class Empl{

              private String name;
              private int salary;

              public Empl(String n, int s){
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
              public String toString(){
                  return "Name: "+this.name+"-- Salary: "+this.salary;
              }
        }

        //By using name comparator (String comparison)
        TreeSet<Empl> nameComp = new TreeSet<Empl>(new Comparator<Empl>(){

            @Override
            public int compare(Empl e1, Empl e2) {
                return e1.getName().compareTo(e2.getName());
            }
        } );
        nameComp.add(new Empl("Ram",3000));
        nameComp.add(new Empl("John",6000));
        nameComp.add(new Empl("Crish",2000));
        nameComp.add(new Empl("Tom",2400));

        for(Empl e:nameComp){
            System.out.println(e);
        }


        System.out.println("===========================");
        //By using salary comparator (int comparison)
        final TreeSet<Empl> salComp = new TreeSet<Empl>(new  Comparator<Empl>(){

            @Override
            public int compare(Empl e1, Empl e2) {
                if(e1.getSalary() > e2.getSalary()){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        salComp.add(new Empl("Ram",3000));
        salComp.add(new Empl("John",6000));
        salComp.add(new Empl("Crish",2000));
        salComp.add(new Empl("Tom",2400));
        for(Empl e:salComp){
            System.out.println(e);
        }

    }


    /*How to sort a TreeSet with user defined objects*/
    public static void treeSetSortCustomObject(){

        final class Empl{

            private String name;
            private int salary;

            public Empl(String n, int s){
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
            public String toString(){
                return "Name: "+this.name+"-- Salary: "+this.salary;
            }
        }

        final TreeSet<Empl> nameComp = new TreeSet<Empl>(new Comparator<Empl>(){

            @Override
            public int compare(Empl e1, Empl e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        nameComp.add(new Empl("Ram",3000));
        nameComp.add(new Empl("John",6000));
        nameComp.add(new Empl("Crish",2000));
        nameComp.add(new Empl("Tom",2400));
        for(Empl e:nameComp){
            System.out.println(e);
        }

        System.out.println("===========================");
        //By using salary comparator (int comparison)
        final TreeSet<Empl> salComp = new TreeSet<Empl>(new  Comparator<Empl>(){

            @Override
            public int compare(Empl e1, Empl e2) {
                return e1.getName().compareTo(e2.getName());
            }
        }   );
        salComp.add(new Empl("Ram",3000));
        salComp.add(new Empl("John",6000));
        salComp.add(new Empl("Crish",2000));
        salComp.add(new Empl("Tom",2400));
        for(Empl e:salComp){
            System.out.println(e);
        }
    }


    /*How to get subset from sorted set*/
    public static void treeSetSubSet(){
        final TreeSet<String> ts = new TreeSet<String>(new  Comparator<String>(){

            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });
        ts.add("RED");
        ts.add("ORANGE");
        ts.add("BLUE");
        ts.add("GREEN");
        ts.add("WHITE");
        ts.add("BROWN");
        ts.add("YELLOW");
        ts.add("BLACK");
        System.out.println(ts);
        Set<String> subSet = ts.subSet("GREEN", "WHITE");
        System.out.println("sub set: "+subSet);
        subSet = ts.subSet("GREEN", true, "WHITE", true);
        System.out.println("sub set: "+subSet);
        subSet = ts.subSet("GREEN", false, "WHITE", true);
        System.out.println("sub set: "+subSet);
    }


    /*How to get least value element from a set*/
    public static void treeSetLestValueElement(){
        final class Empl1{

            private String name;
            private int salary;

            public Empl1(String n, int s){
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
            public String toString(){
                return "Name: "+this.name+"-- Salary: "+this.salary;
            }
        }

       final TreeSet<Empl1> salComp = new TreeSet<Empl1>(new  Comparator<Empl1>(){

           @Override
           public int compare(Empl1 e1, Empl1 e2) {
               if(e1.getSalary() > e2.getSalary()){
                   return 1;
               } else {
                   return -1;
               }
           }
       });
        salComp.add(new Empl1("Ram",3000));
        salComp.add(new Empl1("John",6000));
        salComp.add(new Empl1("Crish",2000));
        salComp.add(new Empl1("Tom",2400));
        System.out.println("Least salary emp: "+salComp.first());
    }

    /*How to get highest value element from a set*/
     public static void treeSetHightElement(){
         final class Empl2{

             private String name;
             private int salary;

             public Empl2(String n, int s){
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
             public String toString(){
                 return "Name: "+this.name+"-- Salary: "+this.salary;
             }
         }

         final TreeSet<Empl2> salComp = new TreeSet<Empl2>(new Comparator<Empl2>(){

             @Override
             public int compare(Empl2 e1, Empl2 e2) {
                 if(e1.getSalary() > e2.getSalary()){
                     return 1;
                 } else {
                     return -1;
                 }
             }
         });
         salComp.add(new Empl2("Ram",3000));
         salComp.add(new Empl2("John",6000));
         salComp.add(new Empl2("Crish",2000));
         salComp.add(new Empl2("Tom",2400));
         System.out.println("Highest salary emp: "+salComp.last());
     }

    /*How to avoid duplicate user defined objects in TreeSet*/
    public static void treeSetAvoideDuplicateCustomeObject(){

        final class Emp {

            private int empId;
            private String empName;
            private int empSal;

            public Emp(int id, String name, int sal){
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

            public String toString(){
                return empId+" : "+empName+" : "+empSal;
            }
        }

        final Set<Emp> ts = new TreeSet<Emp>(new  Comparator<Emp>(){

            @Override
            public int compare(Emp e1, Emp e2) {
                if(e1.getEmpId() == e2.getEmpId()){
                    return 0;
                } if(e1.getEmpId() < e2.getEmpId()){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        ts.add(new Emp(201,"John",40000));
        ts.add(new Emp(302,"Krish",44500));
        ts.add(new Emp(146,"Tom",20000));
        ts.add(new Emp(543,"Abdul",10000));
        ts.add(new Emp(12,"Dinesh",50000));
        //adding duplicate entry
        ts.add(new Emp(146,"Tom",20000));
        //check duplicate entry is there or not
        for(Emp e:ts){
            System.out.println(e);
        }
    }



}