package com.adarsh.collection.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: adarsh_k
 * Date: 3/14/14
 * Time: 6:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class IdentityHashMapExample {


    @Test
    public void testBasic() {
        //string class hashCode is based on content
        IdentityHashMap map = new IdentityHashMap();
        map.put("A", "A");
        map.put("A", "A");
        map.put("B", "B");
        map.put("G", "G");
        map.put("N", "N");
        System.out.println(map.toString());

    }

    @Test
    public void testBasicCustomObject() {

        final class Person {

            public String name;

            public Person(String name) {
                this.name = name;
            }

            @Override
            public boolean equals(Object o) {
                return this.name.equals(((Person) o).name);
            }

            @Override
            public int hashCode() {
                int hash = 13;
                hash = (31 * hash) + (null == name ? 0 : name.hashCode());
                return hash;
            }

            @Override
            public String toString() {
                return "Person{" +
                        "name='" + name + '\'' +
                        '}';
            }
        }


        Person personOne = new Person("Person1");
        Person personTwo = new Person("Person2");
        Person personThree = new Person("Person3");
        Person personFour = new Person("Person3");

        System.out.println("\nIt Uses equals() method for Object Comparison ");
        Map<Person, String> hmap = new HashMap<Person, String>();
        hmap.put(personOne, "City1");
        hmap.put(personTwo, "City1");
        hmap.put(personThree, "City2");
        System.out.println("HashMap Without Duplicate Key " + hmap.size()+" "+hmap);
        hmap.put(personFour, "City3");
        System.out.println("HashMap With Duplicate Key " + hmap.size()+" "+hmap);

        System.out.println("\nIt Uses == Operator for Object Comparison ");
        Map<Person, String> imap = new IdentityHashMap<Person, String>();
        imap.put(personOne, "City1");
        imap.put(personTwo, "City1");
        imap.put(personThree, "City2");
        System.out.println("IdentityHashMap Without Duplicate Key " + imap.size()+" "+imap);
        imap.put(personFour, "City3");
        System.out.println("IdentityHashMap With Duplicate Key " + imap.size()+" "+imap);

    }
}
