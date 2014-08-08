package com.adarsh.collection.set;

import org.junit.Test;

import java.util.*;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class TreeSetExample {


    @Test
    public void treeSetBasicOperation() {
        final TreeSet<String> treeSet = new TreeSet<String>() {
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
        System.out.println("Elements: " + treeSet);
        //check is set empty?
        System.out.println("Is set empty: " + treeSet.isEmpty());
        //delete all elements from set
        treeSet.clear();
        System.out.println("Is set empty: " + treeSet.isEmpty());
        treeSet.add("Value1");
        treeSet.add("Value2");
        treeSet.add("Value3");
        System.out.println("Size of the set: " + treeSet.size());
        //remove one string
        treeSet.remove("Value2");
        System.out.println("Elements: " + treeSet);
    }

    /*How to create a TreeSet with a List*/
    @Test
    public void treeSetCreationWithList() {
        final List<String> list = new ArrayList<String>() {
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
        System.out.println("List: " + list);
        //create a treeset with the list
        final TreeSet<String> set = new TreeSet<String>(list);
        System.out.println("Set: " + set);
    }

    /*How to read objects from TreeSet using using Iterator*/
    @Test
    public void treeSetReadObjectUsingIterator() {
        final TreeSet<String> ts = new TreeSet<String>() {
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
        final Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.print("\t" + itr.next());
        }
    }

    /*Write a program to remove duplicate entries from an array*/
    @Test
    public void treeSetRemoveDuplicate() {
        final String[] strArr = {"one", "two", "three", "four", "four", "five"};
        //convert string array to list
        final List<String> tmpList = Arrays.asList(strArr);
        //create a treeset with the list, which eliminates duplicates
        final TreeSet<String> unique = new TreeSet<String>(tmpList);
        System.out.println(unique);
    }

    /*Write a program to find duplicate value from an array*/
    @Test
    public void treeSetFindDuplicate() {
        final String[] strArr = {"one", "two", "three", "four", "four", "five"};
        final TreeSet<String> unique = new TreeSet<String>();
        for (String str : strArr) {
            if (!unique.add(str)) {
                System.out.println("Duplicate Entry is: " + str);
            }
        }
    }

    /*How to create a TreeSet with comparator*/
    @Test
    public void treeSetComparator() {

        final TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        }
        ){
            {
                add("Value5");
                add("Value7");
                add("Value2");
                add("Value8");;
                add("Value3");
                add("Value6");
                add("Value4");
                add("Value1");
            }
        };
        System.out.println(ts);
    }


    /*Create TreeSet with comparator by user define objects */
    @Test
    public void treeSetCustomObject(){

        final class Employee {

              private String name;
              private int salary;

              public Employee(String n, int s){
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
        TreeSet<Employee> nameComparator = new TreeSet<Employee>(new Comparator<Employee>(){

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        } );
        nameComparator.add(new Employee("Adarsh", 3000));
        nameComparator.add(new Employee("Radha", 6000));
        nameComparator.add(new Employee("Amit", 2000));
        nameComparator.add(new Employee("Sonu", 2400));
        nameComparator.add(new Employee("Monu", 2900));

        for(Employee e:nameComparator){
            System.out.println(e);
        }


        System.out.println("===========================");
        //By using salary comparator (int comparison)
        final TreeSet<Employee> salComparator = new TreeSet<Employee>(new  Comparator<Employee>(){

            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getSalary() > e2.getSalary()){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        salComparator.add(new Employee("Adarsh", 3000));
        salComparator.add(new Employee("Radha", 6000));
        salComparator.add(new Employee("Amit", 2000));
        salComparator.add(new Employee("Monu", 2400));
        salComparator.add(new Employee("Sonu", 2900));
        for(Employee e:salComparator){
            System.out.println(e);
        }

    }


    /*How to sort a TreeSet with user defined objects*/
    @Test
    public void treeSetSortCustomObject(){

        final class Employee {

            private String name;
            private int salary;

            public Employee(String n, int s){
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

        final TreeSet<Employee> nameComparator = new TreeSet<Employee>(new Comparator<Employee>(){

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        });
        nameComparator.add(new Employee("Adarsh", 3000));
        nameComparator.add(new Employee("Radha", 6000));
        nameComparator.add(new Employee("Amit", 2000));
        nameComparator.add(new Employee("Sonu", 2400));
        nameComparator.add(new Employee("Monu", 2900));
        for(Employee e:nameComparator){
            System.out.println(e);
        }

        System.out.println("===========================");
        //By using salary comparator (int comparison)
        final TreeSet<Employee> salComparator = new TreeSet<Employee>(new  Comparator<Employee>(){

            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        }   );
        salComparator.add(new Employee("Adarsh", 3000));
        salComparator.add(new Employee("Radha", 6000));
        salComparator.add(new Employee("Amit", 2000));
        salComparator.add(new Employee("Monu", 2400));
        salComparator.add(new Employee("Sonu", 2900));
        for(Employee e:salComparator){
            System.out.println(e);
        }
    }


    /*How to get subset from sorted set*/
    @Test
    public void treeSetSubSet(){
        final TreeSet<String> ts = new TreeSet<String>(new  Comparator<String>(){

            @Override
            public int compare(String str1, String str2) {
                return str1.compareTo(str2);
            }
        });
        ts.add("Value1");
        ts.add("Value2");
        ts.add("Value3");
        ts.add("Value4");
        ts.add("Value5");
        ts.add("Value6");
        ts.add("Value7");
        ts.add("Value8");
        System.out.println(ts);
        Set<String> subSet = ts.subSet("Value4", "Value5");
        System.out.println("sub set: "+subSet);
        subSet = ts.subSet("Value4", true, "Value5", true);
        System.out.println("sub set: "+subSet);
        subSet = ts.subSet("Value4", false, "Value5", true);
        System.out.println("sub set: "+subSet);
    }


    /*How to get least value element from a set*/
    @Test
    public void treeSetLestValueElement(){

        final class Employee {

            private String name;
            private int salary;

            public Employee(String n, int s){
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

       final TreeSet<Employee> salComparator = new TreeSet<Employee>(new  Comparator<Employee>(){

           @Override
           public int compare(Employee e1, Employee e2) {
               if(e1.getSalary() > e2.getSalary()){
                   return 1;
               } else {
                   return -1;
               }
           }
       });
        salComparator.add(new Employee("Adarsh", 3000));
        salComparator.add(new Employee("Amit", 6000));
        salComparator.add(new Employee("Radha", 2000));
        salComparator.add(new Employee("Sonu", 2400));
        System.out.println("Least salary emp: " + salComparator.first());
    }

    /*How to get highest value element from a set*/
     @Test
     public void treeSetHighestElement(){

         final class Employee {

             private String name;
             private int salary;

             public Employee(String n, int s){
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

         final TreeSet<Employee> salComparator = new TreeSet<Employee>(new Comparator<Employee>(){

             @Override
             public int compare(Employee e1, Employee e2) {
                 if(e1.getSalary() > e2.getSalary()){
                     return 1;
                 } else {
                     return -1;
                 }
             }
         });
         salComparator.add(new Employee("Adarsh", 3000));
         salComparator.add(new Employee("Amit", 6000));
         salComparator.add(new Employee("Radha", 2000));
         salComparator.add(new Employee("Sonu", 2400));
         System.out.println("Highest salary emp: "+salComparator.last());
     }

    /*How to avoid duplicate user defined objects in TreeSet*/
    @Test
    public void treeSetAvoidDuplicateCustomObject(){

        final class Employee {

            private int empId;
            private String empName;
            private int empSal;

            public Employee(int id, String name, int sal){
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

        final Set<Employee> treeSett = new TreeSet<Employee>(new  Comparator<Employee>(){

            @Override
            public int compare(Employee e1, Employee e2) {
                if(e1.getEmpId() == e2.getEmpId()){
                    return 0;
                } if(e1.getEmpId() < e2.getEmpId()){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        treeSett.add(new Employee(201, "Adarsh", 40000));
        treeSett.add(new Employee(302, "Radha", 44500));
        treeSett.add(new Employee(146, "Amit", 20000));
        treeSett.add(new Employee(543, "Sonu", 10000));
        treeSett.add(new Employee(12, "Monu", 50000));
        //adding duplicate entry
        treeSett.add(new Employee(146, "Amit", 20000));
        //check duplicate entry is there or not
        for(Employee e:treeSett){
            System.out.println(e);
        }
    }

}