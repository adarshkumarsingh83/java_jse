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
package com.espark.adarsh.sequential;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * @author Adarsh Kumar
 * @author $LastChangedBy: Adarsh Kumar$
 * @version $Revision: 0001 $, $Date:: 1/1/10 0:00 AM#$
 * @Espark @copyright all right reserve
 */
public class Stream_of_Example {

    @Test
    public void stream() {
         /* string stream for names  */
        String[] array = new String[]{"adarsh", "radha", "amit"};
        Stream.of(array)
                .forEach(System.out::println);

        Stream.of(new String[]{"adarsh", "radha", "amit"})
                .forEach(System.out::println);

        Stream.of("adarsh", "radha", "amit")
                .forEach(System.out::println);
    }

    @Test
    public void intStream() {
         /* int stream for numbers  */
        int[] array = new int[]{1, 2, 3};
        IntStream.of(array)
                .forEach(System.out::println);

        IntStream.of(new int[]{1, 2, 3})
                .forEach(System.out::println);

        IntStream.of(1, 2, 3)
                .forEach(System.out::println);
    }

    @Test
    public void longStream() {
         /* long  stream for numbers  */
        long[] array = new long[]{1L, 2L, 3L};
        LongStream.of(array)
                .forEach(System.out::println);

        LongStream.of(new long[]{1L, 2L, 3L})
                .forEach(System.out::println);

        LongStream.of(1L, 2L, 3L)
                .forEach(System.out::println);
    }


    @Test
    public void doubleStream() {
         /* double stream for numbers  */
        double[] array = new double[]{1.0, 2.0, 3.0};
        DoubleStream.of(array)
                .forEach(System.out::println);

        DoubleStream.of(new double[]{1.0, 2.0, 3.0})
                .forEach(System.out::println);

        DoubleStream.of(1.0, 2.0, 3.0)
                .forEach(System.out::println);

    }

}
