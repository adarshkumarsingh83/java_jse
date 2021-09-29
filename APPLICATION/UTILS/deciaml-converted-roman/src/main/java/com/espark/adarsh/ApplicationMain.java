package com.espark.adarsh;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

import static com.espark.adarsh.service.DecimalToRoman.romanToInteger;

public class ApplicationMain {

    public static void main(String[] args) {
        fileRead("src/main/resources/input.txt");
    }

    public static void fileRead(String fileName) {
        try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
            AtomicInteger atomicInteger = getInit();
            stream.map(data -> data.replace(atomicInteger.incrementAndGet() + "-> ", ""))
                    .forEach(data -> {
                             System.out.println(romanToInteger(data) + " " + data);
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static AtomicInteger getInit() {
        return new AtomicInteger(0);
    }
}
