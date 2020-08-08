package com.adarsh.collection;

import java.util.*;

import static java.lang.System.*;
/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/17/14
 * Time: 3:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class LinkedListExample {

    public static void main(String[] args) {

    }

    public static void linkedListBasicOperation() {
        LinkedList<String> ll = new LinkedList<String>() {
            {
                add("Orange");
                add("Apple");
                add("Grape");
                add("Banana");
            }
        };
        out.println(ll);
        out.println("Size of the linked list: " + ll.size());
        out.println("Is LinkedList empty? " + ll.isEmpty());
        out.println("Does LinkedList contains 'Grape'? " + ll.contains("Grape"));
    }

    /* How to read all elements in LinkedList by using iterator */
    public static void linkedListIteration() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };
        final Iterator<String> itr = arrl.iterator();
        while (itr.hasNext()) {
            out.println(itr.next());
        }
    }

    /* How to copy or clone a LinkedList */
    public static void linkedListClone() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };
        out.println("Actual LinkedList:" + arrl);
        LinkedList<String> copy = (LinkedList<String>) arrl.clone();
        out.println("Cloned LinkedList:" + copy);
    }

    /*How to add all elements of a list to LinkedList*/
    public static void linkedListaddList() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };

        out.println("Actual LinkedList:" + arrl);
        final List<String> list = new

                ArrayList<String>() {
                    {
                        add("one");
                        add("two");
                    }
                };

        arrl.addAll(list);
        out.println("After Copy: " + arrl);
    }

    /*How to delete all elements from my LinkedList*/
    public static void linkedListDeleteElements() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };
        out.println("Actual LinkedList:" + arrl);
        arrl.clear();
        out.println("After clear LinkedList:" + arrl);
    }

    /*How to find does LinkedList contains all list elements or not*/
    public static void linkedListSearchListElements() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };

        final List<String> list = new LinkedList<String>() {
            {
                add("Second");
                add("Random");
            }
        };
        out.println("Does LinkedList contains all list elements?: "
                + arrl.containsAll(list));
        list.add("one");
        out.println("Does LinkedList contains all list elements?: "
                + arrl.containsAll(list));
    }

    /*How to copy LinkedList to array*/
    public static void linkedListCopyToArray() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };

        out.println("Actual LinkedList:" + arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        out.println("Created Array content:");
        for (String str : strArr) {
            out.println(str);
        }
    }

    /*How to get sub list from LinkedList*/
    public static void linkedListSubList() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");
                add("Click");
            }
        };

        out.println("Actual LinkedList:" + arrl);
        List<String> list = arrl.subList(2, 4);
        out.println("Sub List: " + list);
    }

    /* How to sort LinkedList using Comparator */
    public static void linkedListCustomSorting() {

        final class Empl {

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

        final LinkedList<Empl> list = new LinkedList<Empl>() {
            {
                add(new Empl("Ram", 3000));
                add(new Empl("John", 6000));
                add(new Empl("Crish", 2000));
                add(new Empl("Tom", 2400));
            }
        };
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

    /* How to reverse LinkedList content */
    public static void linkedListReverse() {
        final LinkedList<String> list = new LinkedList<String>() {
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

    /*How to shuffle elements in LinkedList */
    public static void linkedListSuffel() {
        final LinkedList<String> list = new LinkedList<String>() {
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
        for (String str : list) {
            out.println(str);
        }

        Collections.shuffle(list);
        out.println("Results after shuffle operation:");
        for (String str : list) {
            out.println(str);
        }
    }

    /* How to swap two elements in a LinkedList */
    public static void linkedListSwapElement() {
        final LinkedList<String> list = new LinkedList<String>() {
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
        for (String str : list) {
            out.println(str);
        }
    }

    /*How to add element at first position in LinkedList*/
    public static void linkedListAddElementAtFirst() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };
        out.println(arrl);
        out.println("Adding element at first position...");
        arrl.addFirst("I am first");
        out.println(arrl);
        out.println("Adding element at first position...");
        arrl.offerFirst("I am first - 2");
        out.println(arrl);
    }

    /*How to add element at last position in LinkedList*/
    public static void linkedListAddElementAtEndl() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };
        out.println(arrl);
        out.println("Adding element at last position...");
        arrl.addLast("I am last");
        out.println(arrl);
        out.println("Adding element at last position...");
        arrl.offerLast("I am last - 1");
        out.println(arrl);
        out.println("Adding element at last position...");
        arrl.offer("I am last - 2");
        out.println(arrl);
    }

    /*How to read first element from LinkedList*/
    public static void linkedListReadFirstElement() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };

        out.println("First Element: " + arrl.element());
        out.println("First Element: " + arrl.getFirst());
        out.println("First Element: " + arrl.peek());
        out.println("First Element: " + arrl.peekFirst());
    }

    /*How to read last element from LinkedList*/
    public static void linkedListReadElementFromLast() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };
        out.println("Last Element: " + arrl.getLast());
        out.println("Last Element: " + arrl.peekLast());
    }

    /*How to iterate through LinkedList in reverse order*/
    public static void linkedListReverseIterate() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };
        final Iterator<String> itr = arrl.descendingIterator();
        while (itr.hasNext()) {
            out.println(itr.next());
        }
    }

    /*LinkedList push(), pop() operations examples.*/
    public static void linkedListPushPop() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
            }
        };
        out.println(arrl);
        arrl.push("push element");
        out.println("After push operation:");
        out.println(arrl);
        arrl.pop();
        out.println("After pop operation:");
        out.println(arrl);
    }

    /* How to remove elements from LinkedList */
    public static void linkedListRemoveElement() {
        final LinkedList<String> arrl = new LinkedList<String>() {
            {
                add("First");
                add("Second");
                add("Third");
                add("Random");
                add("four");
                add("five");
                add("six");
                add("seven");
                add("eight");
                add("nine");
            }
        };
        out.println(arrl);
        out.println("Remove() method:" + arrl.remove());
        out.println("After remove() method call:");
        out.println(arrl);
        out.println("remove(index) method:" + arrl.remove(2));
        out.println("After remove(index) method call:");
        out.println(arrl);
        out.println("Remov(object) method:" + arrl.remove("six"));
        out.println("After remove(object) method call:");
        out.println(arrl);
        out.println("removeFirst() method:" + arrl.removeFirst());
        out.println("After removeFirst() method call:");
        out.println(arrl);
        out.println("removeFirstOccurrence() method:"
                + arrl.removeFirstOccurrence("eight"));
        out.println("After removeFirstOccurrence() method call:");
        out.println(arrl);
        out.println("removeLast() method:" + arrl.removeLast());
        out.println("After removeLast() method call:");
        out.println(arrl);
        out.println("removeLastOccurrence() method:"
                + arrl.removeLastOccurrence("five"));
        out.println("After removeLastOccurrence() method call:");
        out.println(arrl);
    }



}
