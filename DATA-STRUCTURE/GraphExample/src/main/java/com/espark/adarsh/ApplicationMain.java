package com.espark.adarsh;


import com.espark.adarsh.bidirectional.BiDirectionalGraph;
import com.espark.adarsh.unitdirectioanl.UniDirectionalGraph;
import com.espark.adarsh.weighted.WeightedGraph;

import java.util.*;

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


        Map<String, HashMap<String, Integer>> wightedData = new LinkedHashMap();
        wightedData.put("A", new HashMap<String, Integer>() {
            {
                put("B", 5);
                put("E", 3);
            }
        });
        wightedData.put("B", new HashMap<String, Integer>() {
            {
                put("A", 7);
                put("C", 1);
                put("E", 8);
            }
        });
        wightedData.put("C", new HashMap<String, Integer>() {
            {
                put("B", 2);
                put("D", 9);
            }
        });
        wightedData.put("D", new HashMap<String, Integer>() {
            {
                put("C", 4);
                put("E", 6);
            }
        });
        wightedData.put("E", new HashMap<String, Integer>() {
            {
                put("A", 8);
                put("B", 1);
                put("D", 9);
            }
        });

        weightedGraphOperation(wightedData);
    }

    public static void weightedGraphOperation(Map<String, HashMap<String, Integer>> wightedData) {
        WeightedGraph<String> graph = new WeightedGraph<>();
        for (Map.Entry<String, HashMap<String, Integer>> entry : wightedData.entrySet()) {
            graph.createGraph(entry.getKey(), entry.getValue());
        }
        graph.displayTree();
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
