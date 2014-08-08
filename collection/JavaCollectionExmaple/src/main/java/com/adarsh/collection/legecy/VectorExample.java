package com.adarsh.collection.legecy;

import org.junit.Test;

import java.util.*;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class VectorExample {


    @Test
    public void basicOperation() {
        final Vector<String> vector = new Vector<String>() {
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
        System.out.println(vector);

        //adding element at specified index
        vector.add(2, "NewValue");
        System.out.println(vector);
        //getting elements by index
        System.out.println("Element at index 3 is: " + vector.get(3));
        //getting first element
        System.out.println("The first element of this vector is: " + vector.firstElement());
        //getting last element
        System.out.println("The last element of this vector is: " + vector.lastElement());
        //how to check vector is empty or not
        System.out.println("Is this vector empty? " + vector.isEmpty());
    }

    @Test
    public void vectorIterator() {
        final Vector<String> vct = new Vector<String>() {
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
        final Iterator<String> itr = vct.iterator();
        while (itr.hasNext()) {
            System.out.print("\t"+itr.next());
        }
    }

    @Test
    public void vectorEnumeration() {
        final Vector<String> vct = new Vector<String>() {
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
        final Enumeration<String> enm = vct.elements();
        while (enm.hasMoreElements()) {
            System.out.print("\t"+enm.nextElement());
        }
    }

    @Test
    public void vectorClone() {
        final Vector<String> vct = new Vector<String>() {
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
        System.out.println("Actual vector:" + vct.hashCode());
        final Vector<String> copy = (Vector<String>) vct.clone();
        System.out.println("Cloned vector:" + copy.hashCode());
    }

    @Test
    public void vectorAddListElements() {
        final Vector<String> vector = new Vector<String>() {
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
        System.out.println("Actual vector:" + vector.hashCode());
        final List<String> list = new  ArrayList<String>() {
                    {
                        add("Value11");
                        add("Value22");
                        add("Value33");
                        add("Value44");
                        add("Value55");
                        add("Value66");
                        add("Value77");
                        add("Value88");
                    }
                };
        vector.addAll(list);
        System.out.println("After Copy: " + vector);
    }

    @Test
    public void vectorClearElements() {
        final Vector<String> vector = new Vector<String>() {
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
        System.out.println("Actual vector:" + vector);
        vector.clear();
        System.out.println("After clear vector:" + vector);
    }

    @Test
    public void vectorSearchingElements() {
        final Vector<String> vector = new Vector<String>() {
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
        final List<String> list = new  ArrayList<String>() {
                    {
                        add("Value5");
                        add("Value6");
                    }
                };
        System.out.println("Does vector contains all list elements?: " + vector.containsAll(list));
        list.add("Value10");
        System.out.println("Does vector contains all list elements?: " + vector.containsAll(list));
    }

    @Test
    public void vectorToArray() {
        final Vector<String> vector = new Vector<String>() {
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
        System.out.println("Actual vector:" + vector);
        String[] copyArr = new String[vector.size()];
        vector.copyInto(copyArr);
        System.out.println("Copied Array content:");
        for (String str : copyArr) {
            System.out.print("\t"+str);
        }
    }

    @Test
    public void vectorToSubList() {
        final Vector<String> vector = new Vector<String>() {
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
        System.out.println("Actual vector:" + vector);
        final List<String> list = vector.subList(2, 4);
        System.out.println("Sub List: " + list);
    }


}
