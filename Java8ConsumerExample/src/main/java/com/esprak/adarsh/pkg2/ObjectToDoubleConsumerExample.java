package com.esprak.adarsh.pkg2;/*
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

import java.util.function.ObjDoubleConsumer;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class ObjectToDoubleConsumerExample {

    public static void objDoubleConsumer(String value1, Double value2, ObjDoubleConsumer<String> objDoubleConsumer) {
        objDoubleConsumer.accept(value1, value2);
    }

    public static void main(String[] args) {

        //1 approach
        final ObjDoubleConsumer<String> objDoubleConsumer = new ObjDoubleConsumer<String>() {
            @Override
            public void accept(String object, double value) {
                System.out.println("Data After Processing " + (Double.parseDouble(object) + value));
            }
        };
        objDoubleConsumer("10", 20D, objDoubleConsumer);

        //2 approach
        objDoubleConsumer("10", 20D, new ObjDoubleConsumer<String>() {
            @Override
            public void accept(String object, double value) {
                System.out.println("Data After Processing " + (Double.parseDouble(object) + value));
            }
        });

        //3 approach
        objDoubleConsumer("10", 20D, (String object, double value) -> {
            System.out.println("Data After Processing " + (Double.parseDouble(object) + value));
        });

        //4 approach
        objDoubleConsumer("10", 20D, (object, value) -> System.out.println("Data After Processing " + (Double.parseDouble(object) + value)));
    }


}
