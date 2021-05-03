package com.espark.adarsh;


import com.espark.adarsh.bidirectional.BiDirectionalGraph;
import com.espark.adarsh.unitdirectioanl.UniDirectionalGraph;

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
        biDirectionOperation(data);
        System.out.println();
        uniDirectionOperation(data);
    }


    public static void biDirectionOperation(Map<String, List<String>> data) {
        BiDirectionalGraph<String> graph = new BiDirectionalGraph<>();
        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            graph.createTree(entry.getKey(), entry.getValue());
        }
        graph.displayTree();
    }

    public static void uniDirectionOperation(Map<String, List<String>> data) {
        UniDirectionalGraph<String> graph = new UniDirectionalGraph<>();
        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            graph.createTree(entry.getKey(), entry.getValue());
        }
        //graph.displayTree();
        graph.displayTreeWithQueue();
    }
}
