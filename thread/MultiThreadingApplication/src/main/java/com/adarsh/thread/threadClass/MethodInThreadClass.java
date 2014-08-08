package com.adarsh.thread.threadClass;

public class MethodInThreadClass {
public static void main(String[] args) {
     Thread t=new Thread();
     System.out.println("Id of the Thread "+t.getId());
     System.out.println("Name of the Thread "+t.getName());
     System.out.println("Thread Priority "+t.getPriority());
     System.out.println("Thread is Alive "+t.isAlive());
     System.out.println("Thread State "+t.getState());
     System.out.println("Thread Group "+t.getThreadGroup());
     System.out.println("Thread is Demon "+t.isDaemon());
}
}
