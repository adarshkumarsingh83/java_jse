package com.esprak.adarsh.sample5;


/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
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
