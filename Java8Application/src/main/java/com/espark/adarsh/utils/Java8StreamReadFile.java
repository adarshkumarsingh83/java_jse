package com.espark.adarsh.utils;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8StreamReadFile {

    @Test
    public void fileReading() {
        try {
            Stream<String> lines = Files.lines(Paths.get("src\\main\\resources\\sample.txt"));
            lines.forEach(System.out::println);
            lines.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void distinctWord() {
        try {
            Stream<String> lines = Files.lines(Paths.get("src\\main\\resources\\sample.txt")).
                    map(line -> line.split("[\\s]+")).
                    flatMap(Arrays::stream).distinct();

            lines.forEach(System.out::println);
            lines.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void fileDataReplace() {
        try {
            Path path = Paths.get("src\\main\\resources\\sample.txt");
            Stream<String> lines = Files.lines(path);
            List<String> replaced = lines.map(line -> line.replaceAll("sonu", "sonu singh")).collect(Collectors.toList());
            Files.write(path, replaced);
            lines.close();
            System.out.println("Find and Replace done!!!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void skipFileLines() {
        int lineNumber = 2;
        try {
            String str = Files.lines(Paths.get("src\\main\\resources\\sample.txt")).skip(lineNumber - 1).findFirst().get();
            System.out.println("Content at " + lineNumber + " Number:- " + str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}