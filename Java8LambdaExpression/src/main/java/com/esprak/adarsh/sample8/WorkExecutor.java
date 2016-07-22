package com.esprak.adarsh.sample8;

/**
 * Created by akumar6 on 6/29/2016.
 */
public class WorkExecutor<T> {

    public T executeWork(YourWork<T> yourWork, T data) {
        System.out.println("YourWork executeWork()");
        return yourWork.doWork(data);
    }

    public T executeWork(MyWork<T> myWork, T data) {
        System.out.println("MyWork executeWork()");
        return myWork.doWork(data);
    }
}
