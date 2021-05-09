package com.espark.adarsh;


import com.espark.adarsh.bidirectional.BiDirectionalGraph;
import com.espark.adarsh.unitdirectioanl.UniDirectionalGraph;
import com.espark.adarsh.weighted.WeightedGraph;
import com.espark.adarsh.weighted_cyclic_path.CyclicPathGraph;
import com.espark.adarsh.weighted_paths.PathWeightedGraph;

import java.util.*;

public class ApplicationMain {
    public static void main(String[] args) {
        Map<String, List<String>> data = new LinkedHashMap();
        data.put("A", Arrays.asList("B", "E"));
        data.put("B", Arrays.asList("A", "E", "C"));
        data.put("C", Arrays.asList("B", "D"));
        data.put("D", Arrays.asList("C", "E"));
        data.put("E", Arrays.asList("A", "B", "D"));
        //biDirectionOperation(data);
        System.out.println();
        //uniDirectionOperation(data);

        //weightedGraphOperation();

        //weightedPathGraphOperation();

        cyclicPathGraphOperation();
    }


    public static void cyclicPathGraphOperation() {
        Map<String, HashMap<String, Integer>> cyclicPathGraph = new LinkedHashMap();
        cyclicPathGraph.put("A", new HashMap<String, Integer>() {
            {
                put("B", 5);
                put("E", 12);
            }
        });
        cyclicPathGraph.put("B", new HashMap<String, Integer>() {
            {
                put("A", 5);
                put("C", 8);
                put("E", 12);
            }
        });
        cyclicPathGraph.put("C", new HashMap<String, Integer>() {
            {
                put("B", 8);
                put("D", 3);
            }
        });
        cyclicPathGraph.put("D", new HashMap<String, Integer>() {
            {
                put("C", 3);
                put("E", 11);
            }
        });
        cyclicPathGraph.put("E", new HashMap<String, Integer>() {
            {
                put("A", 12);
                put("B", 12);
                put("D", 11);
            }
        });
        CyclicPathGraph<String> graph = new CyclicPathGraph<>();
        for (Map.Entry<String, HashMap<String, Integer>> entry : cyclicPathGraph.entrySet()) {
            graph.createGraph(entry.getKey(), entry.getValue());
        }
        graph.displayTree();
        graph.calculatePathBetweenAllNodes("A");
        graph.calculatePathBetweenNodes("A","D");
    }

    public static void weightedPathGraphOperation() {
        Map<String, HashMap<String, Integer>> wightedPathData = new LinkedHashMap();
        wightedPathData.put("A", new HashMap<String, Integer>() {
            {
                put("B", 5);
                put("C", 12);
            }
        });
        wightedPathData.put("B", new HashMap<String, Integer>() {
            {
                put("C", 3);
                put("E", 10);
            }
        });
        wightedPathData.put("C", new HashMap<String, Integer>() {
            {
                put("D", 2);
                put("F", 6);
            }
        });
        wightedPathData.put("D", new HashMap<String, Integer>() {
            {
                put("E", 7);
                put("F", 1);
            }
        });
        wightedPathData.put("E", new HashMap<String, Integer>() {
            {
                put("F", 3);
            }
        });
        wightedPathData.put("F", new HashMap<String, Integer>() {
        });
        PathWeightedGraph<String> graph = new PathWeightedGraph<>();
        for (Map.Entry<String, HashMap<String, Integer>> entry : wightedPathData.entrySet()) {
            graph.createGraph(entry.getKey(), entry.getValue());
        }
        graph.displayTree();
        graph.calculatePathBetweenAllNodes("A");
        graph.calculatePathBetweenSpecificNodes("B", "F");
    }

    public static void weightedGraphOperation() {
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
