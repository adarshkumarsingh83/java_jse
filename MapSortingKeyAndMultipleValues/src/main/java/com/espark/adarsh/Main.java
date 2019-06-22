package com.espark.adarsh;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String args[]) {
        String filterId =
                new SortingUtil()
                        .getFilterIdFromExpression("id=dept20000014&brand=xersion+nike&name=zzz+aaa+ggg")
                        .toString();
        System.out.println(filterId);


        Map<String, List<String>> map = Main.getData();
        map = new SortingUtil().sortMap(map);
        map.entrySet().stream().forEach(System.out::println);
    }

    public static Map<String, List<String>> getData() {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < 5; i++) {
            List<String> list = new LinkedList<String>();
            for (int j = 0; j < 6; j++) {
                list.add(Main.getString());
            }
            map.put(getString(), list);
        }

        return map;
    }

    public static String getString() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();
        return generatedString;
    }
}
