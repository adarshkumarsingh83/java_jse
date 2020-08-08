package com.espark.adarsh.utils;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Stream;

/**
 * Created by Adarsh on 8/19/15.
 */
public class SupplierExample {

    public static class Item {

        private Boolean status;
        private Integer val;

        public Item(Boolean status, Integer val) {
            this.status = status;
            this.val = val;
        }

        public Boolean isStatus() {
            return status;
        }

        public Integer getVal() {
            return val;
        }
    }

    /**
     * BooleanSupplier
     * java.util.function.BooleanSupplier is a functional interface that can be used as a Supplier for Boolean values.
     * Boolean Supplier always returns boolean value by the method getAsBoolean().
     */
    @Test
    public void booleanSupplier() {
        Item item = new Item(true, 123);
        BooleanSupplier bs = item::isStatus;
        System.out.println("Status:" + bs.getAsBoolean());
    }

    /**
     * IntSupplier
     * java.util.function.IntSupplier is a functional interface that can be used as a Supplier for integer values.
     * IntSupplier always returns integer value by the method getAsInt().
     */
    @Test
    public void intSupplier() {
        Item item = new Item(true, 123);
        IntSupplier is = item::getVal;
        System.out.println("Int Value:" + is.getAsInt());
    }

    /**
     * LongSupplier
     * java.util.function.LongSupplier is a functional interface that can be used as a Supplier for long values.
     * LongSupplier always returns long data type value by the method getAsLong().
     */
    @Test
    public void longSupplier() {
        Item item = new Item(true, 123);
        LongSupplier ls = item::getVal;
        System.out.println("Long Value:" + ls.getAsLong());
    }

    /**
     * DoubleSupplier
     * java.util.function.DoubleSupplier is a functional interface that can be used as a Supplier for double values.
     * DoubleSupplier always returns double data type value by the method getAsDouble().
     */
    @Test
    public void doubleSupplier() {
        Item item = new Item(true, 123);
        DoubleSupplier ds = item::getVal;
        System.out.println("Double Value:" + ds.getAsDouble());
    }

    static class MyItem {

        private String name;

        public MyItem() {
        }

        public MyItem(String name) {
            this.name = name;
        }

        public static String getStaticVal() {
            return "Static Val";
        }

        public String getMsg() {
            return System.getProperty("user.name").toUpperCase();
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    /**
     * Supplier to return Object of a Class
     * Supplier can create the object of a class. Pass class name and new keyword while
     * creating supplier. Call Supplier.get() and we will get object of that class.
     */
    @Test
    public void supplierReturnObject() {
        Supplier<MyItem> supplier = MyItem::new;
        MyItem item = supplier.get();
        System.out.println(item.getMsg());
    }

    /**
     * Supplier to Fetch Method of an Object
     * Supplier can fetch a method of a class. Create a supplier that will take class name and its static method.
     * Call Supplier.get() method and we will get the result of method.
     */
    @Test
    public void supplierFetchMethod() {
        Supplier<String> supplier = MyItem::getStaticVal;
        String val = supplier.get();
        System.out.println("Calling  Method:" + val);
    }

    /**
     * Supplier as an Argument with Stream API
     * While using with Stream in java 8, we can pass Supplier as an augment to some of Stream methods.
     * In the example we are calling Stream.map() in which we are passing Supplier instance.
     */
    @Test
    public void supplierWithStream() {
        List<MyItem> list = new ArrayList<MyItem>() {
            {
                add(new MyItem("ADARSH"));
                add(new MyItem("RADHA"));
                add(new MyItem("AMIT"));
            }
        };
        Stream<String> names = list.stream().map(MyItem::getName);
        names.forEach(n -> System.out.println(n));
    }

}

