package com.adarsh.collection;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh_K
 * Date: 2/17/14
 * Time: 10:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class VectorExample {

    public static void main(String[] args) {
        //basicOperation();
        //vectorIterator();
        //vectorEnumeration();
        //vectorClone();
        //vectorAddListElements();
        vectorClearElements();
    }

    public static void basicOperation() {
        final Vector<String> vct = new Vector<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
            }
        };
        System.out.println(vct);

        //adding element at specified index
        vct.add(2, "Random");
        System.out.println(vct);
        //getting elements by index
        System.out.println("Element at index 3 is: " + vct.get(3));
        //getting first element
        System.out.println("The first element of this vector is: " + vct.firstElement());
        //getting last element
        System.out.println("The last element of this vector is: " + vct.lastElement());
        //how to check vector is empty or not
        System.out.println("Is this vector empty? " + vct.isEmpty());
    }

    public static void vectorIterator() {
        final Vector<String> vct = new Vector<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");

            }
        };
        final Iterator<String> itr = vct.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    public static void vectorEnumeration() {
        final Vector<String> vct = new Vector<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");

            }
        };
        final Enumeration<String> enm = vct.elements();
        while (enm.hasMoreElements()) {
            System.out.println(enm.nextElement());
        }
    }

    public static void vectorClone() {
        final Vector<String> vct = new Vector<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");

            }
        };
        System.out.println("Actual vector:" + vct.hashCode());
        final Vector<String> copy = (Vector<String>) vct.clone();
        System.out.println("Cloned vector:" + copy.hashCode());
    }

    public static void vectorAddListElements() {
        final Vector<String> vct = new Vector<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");

            }
        };
        System.out.println("Actual vector:" + vct.hashCode());
        final List<String> list = new

                ArrayList<String>() {
                    {
                        add("one");
                        add("two");
                    }
                };
        vct.addAll(list);
        System.out.println("After Copy: " + vct);
    }

    public static void vectorClearElements() {
        final Vector<String> vct = new Vector<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");

            }
        };
        System.out.println("Actual vector:" + vct);
        vct.clear();
        System.out.println("After clear vector:" + vct);
    }

    public static void vectorSearchingElements() {
        final Vector<String> vct = new Vector<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");

            }
        };
        final List<String> list = new ArrayList<String>(){
            {
                add("Second");
                add("Random");
            }
        };
        System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
        list.add("one");
        System.out.println("Does vector contains all list elements?: "+vct.containsAll(list));
    }


    public static void vectorToArray() {
        final Vector<String> vct = new Vector<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");

            }
        };
        System.out.println("Actual vector:"+vct);
        String[] copyArr = new String[vct.size()];
        vct.copyInto(copyArr);
        System.out.println("Copied Array content:");
        for(String str:copyArr){
            System.out.println(str);
        }
    }

    public static void vectorToSubList() {
        final Vector<String> vct = new Vector<String>() {
            {
                //adding elements to the end
                add("First");
                add("Second");
                add("Third");
                add("Random");
                add("Random2");

            }
        };
        System.out.println("Actual vector:"+vct);
        final List<String> list = vct.subList(2, 4);
        System.out.println("Sub List: "+list);
    }



}
