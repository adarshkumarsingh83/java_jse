package com.adarsh.collection.cursor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class IteratorExample {

    @Test
    public  void test() {
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
