package com.esprak.adarsh.sample8;

/**
 * Created by akumar6 on 6/29/2016.
 */
public class WithoutLambdaExpressionExample {
    
    public static void main(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWork = workExecutor.executeWork(
                new MyWork<Integer>() {
                    @Override
                    public Integer doWork(Integer data) {
                        return data;
                    }
                }, 100
        );
        System.out.println("Return Value is " + returnValueByMyWork);

        final Integer returnValueByYourWork = workExecutor.executeWork(
                new YourWork<Integer>() {
                    @Override
                    public Integer doWork(Integer data) {
                        return data;
                    }
                }, 100
        );
        System.out.println("Return Value is " + returnValueByYourWork);
    }
}
