/*
 * Copyright (c) 2015 Espark And ©Adarsh Development Services @copyright All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Espark nor the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.esprak.adarsh.sample5;


/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class LambdaExpressionExample {

    public static void main0(String[] args) {
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

    public static void main(String[] args) {
        WorkExecutor<Integer> workExecutor = new WorkExecutor<Integer>();
        final Integer returnValueByMyWorkLambda = workExecutor.executeWork((MyWork<Integer>) value -> value, 100);
        System.out.println("Return Value is " + returnValueByMyWorkLambda);

        final Integer returnValueByYourWorkLambda = workExecutor.executeWork((YourWork<Integer>) value -> value, 100);
        System.out.println("Return Value is " + returnValueByYourWorkLambda);
    }
}
