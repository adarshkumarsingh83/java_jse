package com.adarsh.thread.method;

/*
* @author Adarsh
* @author $LastChangedBy: adarsh $
* @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
*/
public class SynchronizedMethod {

    public synchronized void synchronizedMethod(String name) {
        try {
            System.out.println("\nSTARTING OF THE SYNCHRONIZED METHOD " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("ENDING OF THE SYNCHRONIZED METHOD " + Thread.currentThread().getName());
        } catch (Exception exceptionObject) {
            exceptionObject.printStackTrace();
        }
    }

    public static synchronized void staticSynchronizedMethod(String name) {
        try {
            System.out.println("\nSTARTING OF THE STATIC SYNCHRONIZED METHOD " + Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("ENDING OF THE STATIC SYNCHRONIZED METHOD " + Thread.currentThread().getName());
        } catch (Exception exceptionObject) {
            exceptionObject.printStackTrace();
        }
    }

}
