package com.espark.adarsh.defaultinterface;

import org.junit.Test;

/**
 * Created by Adarsh on 8/20/15.
 */
public class DefaultMethodInTwoInterfaceExample{

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

    interface City {
        void setName(String name);

        void setArea(int area);

        default String getBusinessType() {
            return "Service";
        }
    }

    class Location implements Village, City {
        public int noOfPeople;
        public String name;
        public int area;

        @Override
        public void setNumOfPeople(int n) {
            this.noOfPeople = n;
        }

        @Override
        public void setName(String name) {
            this.name = name;
        }

        @Override
        public void setArea(int area) {
            this.area = area;
        }

        @Override
        public String getBusinessType() {
            return "People do business like Farming and Service.";
        }

        public int getLocationId() {
            return Village.getVillageId();
        }
    }


    @Test
    public void main() {
        Location lo = new Location();
        System.out.println(lo.getBusinessType());
        System.out.println("Village id:" + Village.getVillageId());
        System.out.println("Location Id:" + lo.getLocationId());
    }
}
