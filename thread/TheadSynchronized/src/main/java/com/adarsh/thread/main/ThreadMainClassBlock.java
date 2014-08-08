package com.adarsh.thread.main;

import com.adarsh.thread.block.SynchronizedBlock;

/*
* @author Adarsh
* @author $LastChangedBy: adarsh $
* @version $Revision: 1595 $, $Date:: 5/4/12 6:12 PM#$
*/
public class ThreadMainClassBlock extends Thread {

    private static SynchronizedBlock object = new SynchronizedBlock();

    public ThreadMainClassBlock(String threadName) {
        super(threadName);
    }

    public static void main(String[] args) {

        new ThreadMainClassBlock("adarsh ").start();
        new ThreadMainClassBlock("amit").start();
        new ThreadMainClassBlock("radha").start();
        new ThreadMainClassBlock("monu").start();
        new ThreadMainClassBlock("sonu").start();
    }

    public void run() {
        /* Synchronized non static block	*/
        object.synchronizedMethod(" synchronized block ");

        /*Synchronized static block */
        SynchronizedBlock.staticSynchronizedMethod("static synchronised block");
    }

}
