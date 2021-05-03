package com.espark.adarsh;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ApplicationMain {
    public static void main(String[] args) {
        Map<String, List<String>> data = new LinkedHashMap();
        data.put("A", Arrays.asList("B", "E"));
        data.put("B", Arrays.asList("A", "E", "C"));
        data.put("C", Arrays.asList("B", "D"));
        data.put("D", Arrays.asList("C", "E"));
        data.put("E", Arrays.asList("A", "B", "D"));
        Graph<String> graph = new Graph<>();
        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            graph.createTree(entry.getKey(), entry.getValue());
        }
        graph.displayTree();
    }
}
