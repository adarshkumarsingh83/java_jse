package com.espark.adarsh;

import java.util.List;
import java.util.stream.Collectors;

public class AppMain {
    public static void main(String[] args) {
        String name = "adarshkumarsingh83";
        List<Character> list = name.chars().mapToObj(e -> (char)e).collect(Collectors.toList());
        System.out.println(list);
    }
}
