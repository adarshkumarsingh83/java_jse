package com.adarsh.collection.cursor;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Adarsh
 * @author $LastChangedBy: Adarsh $
 * @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
 */
public class EnumerationExample {

    public static void main(String[] args) {
        final Vector<String> stringVector = new Vector<String>() {
            {
                add("JAVA");
                add("JSP");
                add("SERVLET");
                add("EJB");
                add("PHP");
                add("PERL");
            }
        };
        final Enumeration<String> stringEnumeration = stringVector.elements();
        while (stringEnumeration.hasMoreElements()) {
            System.out.println(stringEnumeration.nextElement());
        }
    }
}
