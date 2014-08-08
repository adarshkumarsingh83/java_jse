package com.adarsh.thread.deadLock;

public class ComputerClient {
    public static void main(String[] args) {

        @SuppressWarnings("unused")
        ComputerSystem1 s1 = new ComputerSystem1(new Object(), new Object());
        @SuppressWarnings("unused")
        ComputerSystem2 s2 = new ComputerSystem2(new Object(), new Object());
    }
}
