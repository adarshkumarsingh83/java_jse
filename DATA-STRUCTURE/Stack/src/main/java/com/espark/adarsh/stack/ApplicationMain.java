package com.espark.adarsh.stack;

/**
 * Created by Adarsh on 8/28/15.
 */
public class ApplicationMain {

    public static void main(String[] args) {

        final MyStack<Integer> myStack = new MyStack<Integer>(10);
        for (int i = 10; i <= 100; i += 10) {
            myStack.pushData(i);
        }

        myStack.display();
        for (int i = 0; i < myStack.getSiz(); i++) {
            System.out.print(" " + myStack.popData());
        }
    }
}
