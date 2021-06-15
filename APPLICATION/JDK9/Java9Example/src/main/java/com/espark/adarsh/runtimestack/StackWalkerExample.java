package com.espark.adarsh.runtimestack;

import java.util.List;
import java.util.stream.Collectors;

public class StackWalkerExample {

    public static void main(String[] args) {
        a();
    }

    public static void a() {
        b();
    }

    public static void b() {
        c();
    }

    public static void c() {
        StackWalker sw = StackWalker.getInstance();
        List<StackWalker.StackFrame> frames;

        frames = sw.walk(frames_ -> frames_.collect(Collectors.toList()));
        frames.forEach(System.out::println);
        System.out.println();

        long numFrames = sw.walk(frames_ -> frames_.count());
        System.out.printf("Total number of frames: %d%n%n", numFrames);

        frames = sw.walk(frames_ -> frames_.limit(2).collect(Collectors.toList()));
        frames.forEach(System.out::println);
    }
}
