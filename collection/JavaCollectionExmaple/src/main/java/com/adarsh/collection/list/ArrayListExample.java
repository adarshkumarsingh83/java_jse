package com.adarsh.collection.list;

import org.junit.Test;

import java.util.*;
import static java.lang.System.*;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class ArrayListExample {  

    @Test
    public void  arrayListBasicOperation() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //add elements to the ArrayList
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
        out.println(stringArrayList);
        //get elements by index
        out.println("Element at index 1: " + stringArrayList.get(1));
        out.println("Does list contains Value4 ? " + stringArrayList.contains("Value4"));

        //add elements at a specific index
        stringArrayList.add(2, "Value2.1");
        out.println(stringArrayList);
        out.println("Is array list empty ? " + stringArrayList.isEmpty());
        out.println("Index of Value3 is " + stringArrayList.indexOf("Value3"));
        out.println("Size of the Array list is: " + stringArrayList.size());
    }

    @Test
    public void  arrayListIterator() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //add elements to the ArrayList
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
        final Iterator<String> itr = stringArrayList.iterator();
        while (itr.hasNext()) {
            out.println(itr.next());
        }
    }

    @Test
    public void  arrayClone() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //add elements to the ArrayList
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
        out.println("Actual ArrayList:" + stringArrayList);
        ArrayList<String> copy = (ArrayList<String>) stringArrayList.clone();
        out.println("Cloned ArrayList:" + copy);
    }

    @Test
    public void  arrayListAddingList() {
        final ArrayList<String> stringArrayList1 = new ArrayList<String>() {
            {
                //add elements to the ArrayList
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
        out.println("Actual ArrayList:" + stringArrayList1);
        final List<String> stringList = new ArrayList<String>() {
                    {
                        add("ExtraValue1");
                        add("ExtraValue2");
                    }
              };
        stringArrayList1.addAll(stringList);
        out.println("After Copy: " + stringArrayList1);
    }

    @Test
    public void  arrayListDeletingElement() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //add elements to the ArrayList
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
        out.println("Actual ArrayList:" + stringArrayList);
        stringArrayList.clear();
        out.println("After clear ArrayList:" + stringArrayList);
    }

    /*
    Program: How to find does ArrayList contains all list elements or not
    */
    @Test
    public void  arrayListSearchListElement() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //add elements to the ArrayList
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
        final List<String> stringList = new ArrayList<String>() {
                    {
                        add("Value4");
                        add("Value7");
                    }
                };
        out.println("Does ArrayList contains all list elements?: "
                + stringArrayList.containsAll(stringList)+" "+stringList);
        stringList.add("ExtraValue");
        out.println("Does ArrayList contains all list elements?: "
                + stringArrayList.containsAll(stringList)+" "+stringList);
    }

    /* How to copy ArrayList to array */
    @Test
    public void  arrayListCopy() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
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

        out.println("Actual ArrayList:" + stringArrayList);
        final String[] stringArray = new String[stringArrayList.size()];
        stringArrayList.toArray(stringArray);
        out.println("Created Array content:");
        for (String str : stringArray) {
            out.println(str);
        }
    }

    /* How to get sub list from ArrayList */
    @Test
    public void  arrayListSubList() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //adding elements to the end
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
        out.println("Actual ArrayList:" + stringArrayList);
        List<String> list = stringArrayList.subList(2, 4);
        out.println("Sub List: " + list);
    }

    /* How to sort ArrayList using Comparator */
    @Test
    public void  arrayListCustomSorting() {

        class Employee {

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

       final List<Employee> list= new ArrayList<Employee>() {
            {
                add(new Employee("Adarsh", 3000));
                add(new Employee("Radha", 6000));
                add(new Employee("Sonu", 2000));
                add(new Employee("Monu", 2400));
            }
        }
        ;

        Collections.sort(list, new Comparator<Employee>() {

            @Override
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() < e2.getSalary()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        out.println("Sorted list entries: ");
        for (Employee employee : list) {
            out.println(employee);
        }
    }

    /* How to reverse ArrayList content */
    @Test
    public void  arrayListReverse() {
        final ArrayList<String> list = new ArrayList<String>() {
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

        Collections.reverse(list);
        out.println("Results after reverse operation:");
        for (String str : list) {
            out.print("\t" + str);
        }
    }

    /* How to shuffle elements in ArrayList */
    @Test
    public void arrayListElementShuffle(){
        final ArrayList<String> list = new ArrayList<String>(){
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

        Collections.shuffle(list);
        out.println("\nResults after shuffle operation:");
        for(String str: list){
            out.print("\t" + str);
        }

        Collections.shuffle(list);
        out.println("\nResults after shuffle operation:");
        for(String str: list){
            out.print("\t" + str);
        }
    }

    /* How to swap two elements in a ArrayList */
    @Test
    public void arrayListElementSwapping(){
       final  ArrayList<String> list = new ArrayList<String>(){
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

        out.println("\nResults before swap operation:");
        for(String str: list){
            out.print("\t"+str);
        }

        Collections.swap(list, 2, 5);
        out.println("\nResults after swap operation:");
        for(String str: list){
            out.print("\t" + str);
        }
    }
}
