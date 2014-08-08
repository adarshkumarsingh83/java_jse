package com.adarsh.collection.cursor;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 0001 $, $Date:: 1/1/1 0:00 AM#$
 */
public class EnumerationExample {

    @Test
    public  void test() {
        final Vector<String> stringVector = new Vector<String>() {
            {
                add("Value1");
                add("Value2");
                add("Value3");
                add("Value4");
                add("Value5");
                add("Value6");
                add("Value7");
                add("Value8");
                add("Value9");
                add("Value10");
            }
        };
        final Enumeration<String> stringEnumeration = stringVector.elements();
        while (stringEnumeration.hasMoreElements()) {
            System.out.print("\t"+stringEnumeration.nextElement());
        }
    }
}
