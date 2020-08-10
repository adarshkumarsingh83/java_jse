package com.espark.adarsh.defaultinterface;

import org.junit.Test;

/**
 * Why Default Method in Java Interface?
 * A question comes in mind why java has introduced default methods in interface.
 * Suppose a tractor manufacturer company has published standard interface to
 * operate the tractor like how to take gear or break etc. Developer has developed different
 * type of tractors implementing the standard tractor interface. What if company adds a new
 * functionality in its standard interface like how to jump the tractor? Developer needs to
 * do changes in their class to define new methods which is not a nice approach. Now we need here
 * default method to handle this situation to avoid rewriting all classes implementing standard
 * tractor interface. Define the default method in interface and it will be available in all classes
 * implementing tractor interface.
 */
public class DefaultMethodInterfaceExample {

    interface Village {

        void setNumOfPeople(int num);

        void setName(String name);

        default String getBusinessType() {
            return "Most of the Village people do Farming";
        }
    }

    class Location implements Village {
        public int noOfPeople;
        public String name;

        @Override
        public void setNumOfPeople(int n) {
            this.noOfPeople = n;
        }

        @Override
        public void setName(String name) {
            this.name = name;
        }
    }

    @Test
    public void defaultMethodTest() {
        Location lo = new Location();
        System.out.println(lo.getBusinessType());
    }
}
