package com.esprak.adarsh.pkg1;/*
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

import java.util.function.IntConsumer;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class IntConsumerExample {

    public static void intConsumer(Integer data, IntConsumer intConsumer) {
        intConsumer.accept(data);
    }


    public static void main(String[] args) {
        //1 approach
        final IntConsumer intConsumer = new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println("Data After processing " + (Long.MAX_VALUE - value));
            }
        };
        intConsumer(Integer.MAX_VALUE, intConsumer);


        //2 approach
        intConsumer(Integer.MAX_VALUE, new IntConsumer() {
            @Override
            public void accept(int value) {
                System.out.println("Data After processing " + (Long.MAX_VALUE - value));
            }
        });

        //3 approach
        intConsumer(Integer.MAX_VALUE, (int value) -> {
            System.out.println("Data After processing " + (Long.MAX_VALUE - value));
        });

        //4 approach
        intConsumer(Integer.MAX_VALUE, (value) -> System.out.println("Data After processing " + (Long.MAX_VALUE - value)));

        //5 approach
        intConsumer(Integer.MAX_VALUE,  value -> System.out.println("Data After processing " + (Long.MAX_VALUE - value)));

        //6 approach
        intConsumer(Integer.MAX_VALUE, System.out::print);
    }


}
