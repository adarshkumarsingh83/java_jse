package com.adarsh.thread.mySynchronized.BlockCode;

public class SynchronizedBlockClient {

    public static void main(String[] args) {

        Object object = new Object();

        new SynchronizedBlock(" adarsh ", " sonu ", object);

        new SynchronizedBlock(" amit ", " monu ", object);

        new SynchronizedBlock(" adarsh ", " sonu ", object);

        new SynchronizedBlock(" amit ", " monu ", object);
    }

}
