package com.adarsh.collection;

import java.util.*;
import static java.lang.System.*;

public class ArrayListExample {

    public static void main(String[] a) {

    }

    public static void arrayListBasicOperation() {
        final ArrayList<String> al = new ArrayList<String>() {
            {
                //add elements to the ArrayList
                add("JAVA");
                add("C++");
                add("PERL");
                add("PHP");
            }
        };
        out.println(al);
        //get elements by index
        out.println("Element at index 1: " + al.get(1));
        out.println("Does list contains JAVA? " + al.contains("JAVA"));
        //add elements at a specific index
        al.add(2, "PLAY");
        out.println(al);
        out.println("Is array list empty ? " + al.isEmpty());
        out.println("Index of PERL is " + al.indexOf("PERL"));
        out.println("Size of the arraylist is: " + al.size());
    }

    public static void arrayListIterator() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //add elements to the ArrayList
                add("JAVA");
                add("C++");
                add("PERL");
                add("PHP");
            }
        };
        final Iterator<String> itr = stringArrayList.iterator();
        while (itr.hasNext()) {
            out.println(itr.next());
        }
    }

    public static void arrayClone() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //add elements to the ArrayList
                add("JAVA");
                add("C++");
                add("PERL");
                add("PHP");
            }
        };
        out.println("Actual ArrayList:" + stringArrayList);
        ArrayList<String> copy = (ArrayList<String>) stringArrayList.clone();
        out.println("Cloned ArrayList:" + copy);
    }

    public static void arrayListAddingList() {
        final ArrayList<String> stringArrayList1 = new ArrayList<String>() {
            {
                //add elements to the ArrayList
                add("JAVA");
                add("C++");
                add("PERL");
                add("PHP");
            }
        };
        out.println("Actual ArrayList:" + stringArrayList1);
        final List<String> list = new

                ArrayList<String>() {
                    {
                        add("one");
                        add("two");
                    }
                };

        stringArrayList1.addAll(list);
        out.println("After Copy: " + stringArrayList1);
    }

    public static void arrayListDeletingElement() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //add elements to the ArrayList
                add("JAVA");
                add("C++");
                add("PERL");
                add("PHP");
            }
        };
        out.println("Actual ArrayList:" + stringArrayList);
        stringArrayList.clear();
        out.println("After clear ArrayList:" + stringArrayList);
    }

    /*
    Program: How to find does ArrayList contains all list elements or not
    */
    public static void arrayListSearchListElement() {
        final ArrayList<String> stringArrayList = new ArrayList<String>() {
            {
                //add elements to the ArrayList
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };
        final List<String> list = new ArrayList<String>() {
                    {
                        add("Second");
                        add("Random");
                    }
                };
        out.println("Does ArrayList contains all list elements?: "
                + stringArrayList.containsAll(list));
        list.add("one");
        out.println("Does ArrayList contains all list elements?: "
                + stringArrayList.containsAll(list));
    }

    /* How to copy ArrayList to array */
    public static void arrayListCopy() {
        final ArrayList<String> arrl = new ArrayList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };

        out.println("Actual ArrayList:" + arrl);
        final String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        out.println("Created Array content:");
        for (String str : strArr) {
            out.println(str);
        }
    }

    /* How to get sub list from ArrayList */
    public static void arrayListSubList() {
        final ArrayList<String> arrl = new ArrayList<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");
                add("Click");
            }
        };
        out.println("Actual ArrayList:" + arrl);
        List<String> list = arrl.subList(2, 4);
        out.println("Sub List: " + list);
    }

    /* How to sort ArrayList using Comparator */
    public static void arrayListCustomeSorting() {

        class Empl {

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

       final List<Empl> list= new ArrayList<Empl>() {
            {
                add(new Empl("Ram", 3000));
                add(new Empl("John", 6000));
                add(new Empl("Crish", 2000));
                add(new Empl("Tom", 2400));
            }
        }
        ;

        Collections.sort(list, new Comparator<Empl>() {

            @Override
            public int compare(Empl e1, Empl e2) {
                if (e1.getSalary() < e2.getSalary()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        });
        out.println("Sorted list entries: ");
        for (Empl e : list) {
            out.println(e);
        }
    }

    /* How to reverse ArrayList content */
    public static void arrrayListReverse() {
        final ArrayList<String> list = new ArrayList<String>() {
            {
                add("Java");
                add("Cric");
                add("Play");
                add("Watch");
                add("Glass");
            }
        };

        Collections.reverse(list);
        out.println("Results after reverse operation:");
        for (String str : list) {
            out.println(str);
        }
    }

    /* How to shuffle elements in ArrayList */
    public static void arrayListElementSuffele(){
        final ArrayList<String> list = new ArrayList<String>(){
            {
                add("Java");
                add("Cric");
                add("Play");
                add("Watch");
                add("Glass");
                add("Movie");
                add("Girl");
            }
        };

        Collections.shuffle(list);
        out.println("Results after shuffle operation:");
        for(String str: list){
            out.println(str);
        }

        Collections.shuffle(list);
        out.println("Results after shuffle operation:");
        for(String str: list){
            out.println(str);
        }
    }

    /* How to swap two elements in a ArrayList */
    public static void arrayListElementSwaping(){
       final  ArrayList<String> list = new ArrayList<String>(){
           {
               add("Java");
               add("Cric");
               add("Play");
               add("Watch");
               add("Glass");
               add("Movie");
               add("Girl");
           }
       };
        Collections.swap(list, 2, 5);
        out.println("Results after swap operation:");
        for(String str: list){
            out.println(str);
        }
    }
}
