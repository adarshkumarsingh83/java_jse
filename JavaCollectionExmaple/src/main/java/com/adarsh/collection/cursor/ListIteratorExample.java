package com.adarsh.collection.cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class ListIteratorExample {

    public static void main(String[] args) {
        final List<String> list = new ArrayList<String>() {
            {
                add("1");
                add("2");
                add("3");
                add("4");
                add("5");
            }
        };

        final ListIterator<String> stringListIterator = list.listIterator();
        System.out.println("Elements in forward direction");
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

        System.out.println("Elements in backward direction");
        while(stringListIterator.hasPrevious()){
            System.out.println(stringListIterator.previous());
        }

    }
}
