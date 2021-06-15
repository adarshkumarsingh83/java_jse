package com.esprak.adarsh.sample8;

/**
 * Created by akumar6 on 6/29/2016.
 */
public class LambdaExpressionExample {

    public static void main(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) (Integer value) -> {
            System.out.println("MyWork doWork method execution started");
            System.out.println("MyWork doWork method execution ended");
            return value;
        }, 100);

        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>) (Integer value) -> {
            System.out.println("YourWork doWork method execution started");
            System.out.println("YourWork doWork method execution ended");
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }

    //OR

    public static void main1(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) ( value) -> {
            System.out.println("MyWork doWork method execution started");
            System.out.println("MyWork doWork method execution ended");
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>) ( value) -> {
            System.out.println("YourWork doWork method execution started");
            System.out.println("YourWork doWork method execution ended");
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }

    //OR

    public static void main2(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) value -> {
            System.out.println("MyWork doWork method execution started");
            System.out.println("MyWork doWork method execution ended");
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>)  value -> {
            System.out.println("YourWork doWork method execution started");
            System.out.println("YourWork doWork method execution ended");
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }

   // ---------------------------------------------------------------------------------

    public static void main3(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) (Integer value) -> {
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>) (Integer value) -> {
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }

    //OR

    public static void main4(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) (value) -> {
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>) (value) -> {
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }

    //OR

    public static void main5(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) value -> {
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>) value -> {
            return value;
        }, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }

    //---------------------------------------------------------------------------------

    public static void main6(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) (Integer value) -> value, 100);
        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>) (Integer value) -> value, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }

    //OR

    public static void main7(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) (value) -> value, 100);
        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>) (value) -> value, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }

    //OR

    public static void main8(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) value -> value, 100);
        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>) value -> value, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }
}
