package com.adarsh;


import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Adarsh
 * Date: 6/8/12
 * Time: 2:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        System.out.println( java.lang.management.ManagementFactory.getThreadMXBean().getThreadCpuTime(Thread.currentThread().getId()));
    }
}
