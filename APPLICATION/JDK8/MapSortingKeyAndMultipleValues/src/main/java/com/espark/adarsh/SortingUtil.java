package com.espark.adarsh;

import static java.util.stream.Collectors.toMap;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SortingUtil {


    public Map<String, List<String>> sortMap(Map<String, List<String>> map) {

        LinkedHashMap<String, List<String>> linkedHashMap = map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey())
                .filter(element -> element != null)
                .map(element -> {
                    SortingUtil.sortList(element.getValue());
                    return element;
                })
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        return linkedHashMap;
    }



    public String getFilterIdFromExpression(String expression) {
        String filterId = null;
        if (expression != null && !expression.isEmpty()) {
            Map<String, List<String>> map = null;
            if (expression.contains("&")) {
                map = Arrays.asList(expression.split("&"))
                        .stream()
                        .filter(element -> element != null)
                        .map(stringElement -> stringElement.split("="))
                        .collect(toMap(str -> str[0]
                                , str -> {
                                    return (str[1].contains("+"))
                                            ? SortingUtil.sortList(Arrays.asList(str[1].split("\\+")))
                                            : Arrays.asList(str[1]);
                                }));
            }

            LinkedHashMap<String, List<String>> linkedHashMap = map.entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .filter(element -> element != null)
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                            (oldValue, newValue) -> oldValue, LinkedHashMap::new));

            System.out.println(linkedHashMap);
            filterId = linkedHashMap.toString();
        }
        return filterId;
    }

    public static List<String> sortList(List<String> list) {
        list.sort(((o1, o2) -> o1.compareTo(o2)));
        return list;
    }
}
