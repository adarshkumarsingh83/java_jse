package com.espark.adarsh.defaultinterface;

import org.junit.Test;

/**
 * Why Static Method in Java Interface?
 * Stating from Java 8, an interface can have static methods. A static method
 * is associated with a class not with the object. Static method works as helper method.
 * So if we declare static methods in interface, it is easy for us to organize our helper methods.
 */
public class StaticMethodInterfaceExample {

    interface Village {
        void setNumOfPeople(int num);

        void setName(String name);

        static int getVillageId() {
            return 1;
        }

        default String getBusinessType() {
            return "Business type is Farming  and village id:" + getVillageId();
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

        public int getLocationId() {
            return Village.getVillageId();
        }
    }

    @Test
    public void staticMethodExample() {
        Location lo = new Location();
        System.out.println(lo.getBusinessType());
        System.out.println("Village id:" + Village.getVillageId());
        System.out.println("Location Id:" + lo.getLocationId());
    }
}
