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
package com.espark.adarsh.defaultinterface;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class DefaultMethodInterface {

    public static void main(String[] args) {
        final MyMessage myMessage=new MyMessage() {
            @Override
            public String getMessage(String userName) {
                return userName.toLowerCase();
            }
        };
        System.out.println(myMessage.getMessage(System.getProperty("user.name")));
        System.out.println(myMessage.getWishMessage(System.getProperty("user.name")));

        final MyMessage myMessage1=new MyMessage() {
            @Override
            public String getMessage(String userName) {
                return userName.toLowerCase();
            }

            @Override
            public String getWishMessage(final String userName){
                return "Hello "+userName.toUpperCase();
            }
        };
        System.out.println(myMessage1.getMessage(System.getProperty("user.name")));
        System.out.println(myMessage1.getWishMessage(System.getProperty("user.name")));
    }

}



interface MyMessage{


    public String getMessage (final String userName);

    default String getWishMessage(final String userName){
        return userName.toUpperCase()+" Hello";
    }
}

/*
  1.default keyword is use to declare the interface with the default method.
  2.we can override the default method for custom requirement.
  3.we can declare variable inside the interface.
  4.we can declare class inside the interface.
  5.we can declare enum inside the interface.
  6.we can declare interface inside the interface.
  7.we can't override java.lang.Object methods as the default methods.
  8.we can create static methods inside the interface without default keyword
*/