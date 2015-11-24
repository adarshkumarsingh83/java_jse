package com.adarsh.collection.cursor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class IteratorExample {

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

        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            iterator.remove();
        }
    }
}
