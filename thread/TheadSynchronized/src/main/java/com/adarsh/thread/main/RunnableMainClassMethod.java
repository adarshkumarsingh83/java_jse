package com.adarsh.thread.main;

import com.adarsh.thread.method.SynchronizedMethod;

/*
* @author Adarsh
* @author $LastChangedBy: adarsh $
* @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
*/
public class RunnableMainClassMethod implements Runnable {

    private static SynchronizedMethod object = new SynchronizedMethod();

    public static void main(String... args) {
        new Thread(new RunnableMainClassMethod()).start();
        new Thread(new RunnableMainClassMethod()).start();
        new Thread(new RunnableMainClassMethod()).start();
        new Thread(new RunnableMainClassMethod()).start();
        new Thread(new RunnableMainClassMethod()).start();

    }

    public void run() {
        /* Synchronized non static method	*/
        object.synchronizedMethod(" synchronised method ");

        /*Synchronized static block */
        SynchronizedMethod.staticSynchronizedMethod("static synchronized method");
    }

}
