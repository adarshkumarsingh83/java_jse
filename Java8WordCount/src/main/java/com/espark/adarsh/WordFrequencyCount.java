package com.espark.adarsh;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WordFrequencyCount {

    public static Map<String, Integer> countWord(String inputData) {
        List<String> list = Stream.of(inputData).map(word -> word.split("\\s+")).flatMap(Arrays::stream)
                .collect(Collectors.toList());
        Map<String, Integer> wordCounter = list.stream()
                .collect(Collectors.toMap(word -> word.toLowerCase(), word -> 1, Integer::sum));
        return wordCounter;
    }

    public static Map<String, Integer> countWordFromFile(String filePath) {

        try {
            Path textFilePath = Paths.get(filePath);
            Stream<String> inputData = Files.lines(textFilePath, Charset.defaultCharset());
            List<String> list = inputData.map(word -> word.split("\\s+")).flatMap(Arrays::stream)
                    .collect(Collectors.toList());
            Map<String, Integer> wordCounter = list.stream()
                    .collect(Collectors.toMap(word -> word.toLowerCase(), word -> 1, Integer::sum));
            return wordCounter;
        }catch (Exception e){
            return null;
        }
    }

    public static void main(String[] args) {
        String str = "hi my name is adarsh radha is my wife her husband is adarsh and his wife is radha ";
        System.out.println("Word Count From String "+countWord(str));

        System.out.println("Word Count From File "+countWordFromFile("src\\main\\resources\\sample.txt"));
    }
}
