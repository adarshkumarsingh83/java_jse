package com.espark.adarsh.test;

import com.espark.adarsh.WorldCountService;
import org.junit.Test;
import java.util.List;
import java.util.Map;

public class WordCountTest {


    private static String data = "hi this is adarsh radha is wife and her husband is adarsh";

    @Test
    public void wordCountSortingJdk8Test() {
        List<Map.Entry<String, Long>> list = WorldCountService.wordCountSortingJdk8(data);
        list.forEach((entry) -> System.out.println(entry.getKey() + " " + entry.getValue()));
    }

    @Test
    public void wordCountSortingJdk7Test() {
        List<Map.Entry<String, Long>> entryList = WorldCountService.wordCountSortingJdk7(data);
        for (Map.Entry<String, Long> entry : entryList) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
