package com.adarsh.thread.block;
/*
* @author Adarsh
* @author $LastChangedBy: adarsh $
* @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
*/
public class SynchronizedBlock {

    public void synchronizedMethod(String name) {
        System.out.println("OUTSIDE OF THE SYNCHRONIZED BOCK STARTING " + Thread.currentThread().getName());
        synchronized (this) {
            try {
                System.out.println("STARTING OF THE SYNCHRONIZED BLOCK " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("\nENDING OF THE SYNCHRONIZED BLOCK " + Thread.currentThread().getName());
            } catch (Exception exceptionObject) {
                exceptionObject.printStackTrace();
            }
        }
        System.out.println("OUTSIDE OF THE SYNCHRONIZED BOCK ENDING " + Thread.currentThread().getName());
    }

    public static void staticSynchronizedMethod(String name) {
        System.out.println("OUTSIDE OF THE STATIC SYNCHRONIZED BOCK STARTING " + Thread.currentThread().getName());
        synchronized (SynchronizedBlock.class) {
            try {
                System.out.println("STARTING OF THE STATIC SYNCHRONIZED BLOCK " + Thread.currentThread().getName());
                Thread.sleep(5000);
                System.out.println("ENDING OF THE STATIC SYNCHRONIZED BLOCK " + Thread.currentThread().getName());
            } catch (Exception exceptionObject) {
                exceptionObject.printStackTrace();
            }
            System.out.println("OUTSIDE OF THE STATIC SYNCHRONIZED BOCK ENDING " + Thread.currentThread().getName());
        }
    }
}
