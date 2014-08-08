package com.adarsh.collection.list;

import org.junit.Test;

import java.util.*;

import static java.lang.System.*;
/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class LinkedListExample {   

    @Test
    public void linkedListBasicOperation() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println(linkedList);
        out.println("Size of the linked list: " + linkedList.size());
        out.println("Is LinkedList empty? " + linkedList.isEmpty());
        out.println("Does LinkedList contains Value6 ? " + linkedList.contains("Value6"));
    }

    /* How to read all elements in LinkedList by using iterator */
    @Test
    public void linkedListIteration() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        final Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            out.println(itr.next());
        }
    }

    /* How to copy or clone a LinkedList */
    @Test
    public void linkedListClone() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println("Actual LinkedList:" + linkedList);
        LinkedList<String> copy = (LinkedList<String>) linkedList.clone();
        out.println("Cloned LinkedList:" + copy);
    }

    /*How to add all elements of a list to LinkedList*/
    @Test
    public void linkedListAddList() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println("Actual LinkedList:" + linkedList);
        final List<String> arrayList = new ArrayList<String>() {
                    {
                        add("ArrayListValue1");
                        add("ArrayListValue2");
                        add("ArrayListValue3");
                        add("ArrayListValue4");
                    }
                };

        linkedList.addAll(arrayList);
        out.println("After Copy: " + linkedList);
    }

    /*How to delete all elements from my LinkedList*/
    @Test
    public void linkedListDeleteElements() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println("Actual LinkedList:" + linkedList);
        linkedList.clear();
        out.println("After clear LinkedList:" + linkedList);
    }

    /*How to find does LinkedList contains all list elements or not*/
    @Test
    public void linkedListSearchListElements() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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

        final List<String> list = new LinkedList<String>() {
            {
                add("Value2");
                add("Value6");
            }
        };
        out.println("Does LinkedList contains all list elements?: "
                + linkedList.containsAll(list));
        list.add("Value10");
        out.println("Does LinkedList contains all list elements?: "
                + linkedList.containsAll(list));
    }

    /*How to copy LinkedList to array*/
    @Test
    public void linkedListCopyToArray() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println("Actual LinkedList:" + linkedList);
        final String[] strArr = new String[linkedList.size()];
        linkedList.toArray(strArr);
        out.println("Created Array content:");
        for (String str : strArr) {
            out.print("\t"+str);
        }
    }

    /*How to get sub list from LinkedList*/
    @Test
    public void linkedListSubList() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println("Actual LinkedList:" + linkedList);
        List<String> list = linkedList.subList(2, 7);
        out.println("Sub List: " + list);
    }

    /* How to sort LinkedList using Comparator */
    @Test
    public void linkedListCustomSorting() {

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

        final LinkedList<Employee> list = new LinkedList<Employee>() {
            {
                add(new Employee("Adarsh", 3000));
                add(new Employee("Radha", 6000));
                add(new Employee("Amit", 2000));
                add(new Employee("Monu", 2400));
                add(new Employee("Sounu", 7400));
            }
        };
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
        for (Employee e : list) {
            out.println(e);
        }
    }

    /* How to reverse LinkedList content */
    @Test
    public void linkedListReverse() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        Collections.reverse(linkedList);
        out.println("Results after reverse operation:");
        for (String str : linkedList) {
            out.print("\t" + str);
        }
    }

    /*How to shuffle elements in LinkedList */
    @Test public void linkedListScuffle() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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

        Collections.shuffle(linkedList);
        out.println("Results after shuffle operation:");
        for (String str : linkedList) {
            out.print("\t"+str);
        }

        Collections.shuffle(linkedList);
        out.println("Results after shuffle operation:");
        for (String str : linkedList) {
            out.print("\t"+str);
        }
    }

    /* How to swap two elements in a LinkedList */
    @Test
    public void linkedListSwapElement() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        Collections.swap(linkedList, 2, 5);
        out.println("Results after swap operation:");
        for (String str : linkedList) {
            out.print("\t"+str);
        }
    }

    /*How to add element at first position in LinkedList*/
    @Test
    public void linkedListAddElementAtFirst() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println(linkedList);
        out.println("Adding element at first position...");
        linkedList.addFirst("AdditionValue0");
        out.println(linkedList);
        out.println("Adding element at first position...");
        linkedList.offerFirst("AdditionValue-1");
        out.println(linkedList);
    }

    /*How to add element at last position in LinkedList*/
    @Test
    public void linkedListAddElementAtEndl() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println(linkedList);
        out.println("Adding element at last position...");
        linkedList.addLast("AdditionValue9");
        out.println(linkedList);
        out.println("Adding element at last position...");
        linkedList.offerLast("AdditionValue10");
        out.println(linkedList);
        out.println("Adding element at last position...");
        linkedList.offer("AdditionValue11");
        out.println(linkedList);
    }

    /*How to read first element from LinkedList*/
    @Test
    public void linkedListReadFirstElement() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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

        out.println("First Element: " + linkedList.element());
        out.println("First Element: " + linkedList.getFirst());
        out.println("First Element: " + linkedList.peek());
        out.println("First Element: " + linkedList.peekFirst());
    }

    /*How to read last element from LinkedList*/
    @Test
    public void linkedListReadElementFromLast() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println("Last Element: " + linkedList.getLast());
        out.println("Last Element: " + linkedList.peekLast());
    }

    /*How to iterate through LinkedList in reverse order*/
    @Test
    public void linkedListReverseIterate() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        final Iterator<String> iterator = linkedList.descendingIterator();
        while (iterator.hasNext()) {
            out.print("\t"+iterator.next());
        }
    }

    /*LinkedList push(), pop() operations examples.*/
    @Test
    public void linkedListPushPop() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
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
        out.println(linkedList);
        linkedList.push("AdditionalPushValue");
        out.println("After push operation:");
        out.println(linkedList);
        linkedList.pop();
        out.println("After pop operation:");
        out.println(linkedList);
    }

    /* How to remove elements from LinkedList */
    @Test
    public void linkedListRemoveElement() {
        final LinkedList<String> linkedList = new LinkedList<String>() {
            {
                add("Value1");
                add("Value2");
                add("Value8");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
                add("Value5");
            }
        };
        out.println(linkedList);
        out.println("Remove() method:" + linkedList.remove());
        out.println("After remove() method call:");
        out.println(linkedList);
        out.println("remove(index) method:" + linkedList.remove(2));
        out.println("After remove(index) method call:");
        out.println(linkedList);
        out.println("Remove(object) method:" + linkedList.remove("Value6"));
        out.println("After remove(object) method call:");
        out.println(linkedList);
        out.println("removeFirst() method:" + linkedList.removeFirst());
        out.println("After removeFirst() method call:");
        out.println(linkedList);
        out.println("removeFirstOccurrence() method:"+ linkedList.removeFirstOccurrence("Value8"));
        out.println("After removeFirstOccurrence() method call:");
        out.println(linkedList);
        out.println("removeLast() method:" + linkedList.removeLast());
        out.println("After removeLast() method call:");
        out.println(linkedList);
        out.println("removeLastOccurrence() method:"+ linkedList.removeLastOccurrence("Value5"));
        out.println("After removeLastOccurrence() method call:");
        out.println(linkedList);
    }
}
