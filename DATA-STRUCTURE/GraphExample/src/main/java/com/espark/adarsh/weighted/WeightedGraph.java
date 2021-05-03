package com.espark.adarsh.weighted;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class WeightedGraph<T> {

    Map<T, WeightedGraph.Node<T>> graphNode = new LinkedHashMap<>();

    public void createGraph(T data, HashMap<T, Integer> adjacentList) {
        WeightedGraph.Node node = createNode(data);
        if (adjacentList != null) {
            for (Map.Entry<T, Integer> adjacentEntry : adjacentList.entrySet()) {
                WeightedGraph.Node adjacent = createNode(adjacentEntry.getKey());
                node.setAdjacent(adjacent, adjacentEntry.getValue());
            }
            graphNode.put(data, node);
        }
    }

    private WeightedGraph.Node<T> createNode(T data) {
        WeightedGraph.Node<T> node = null;
        if (graphNode.containsKey(data)) {
            node = graphNode.get(data);
        } else {
            node = new WeightedGraph.Node<T>(data);
            graphNode.put(data, node);
        }
        return node;
    }

    public void displayTree() {
        System.out.println();
        for (Map.Entry<T, WeightedGraph.Node<T>> entry : graphNode.entrySet()) {
            WeightedGraph.Node<T> node = entry.getValue();
            System.out.print(entry.getKey()+" -0-> "+node.getData());
            for (Map.Entry<Node<T>, Integer> entryData : node.getAdjacent().entrySet()) {
                System.out.print(" -" + entryData.getValue() + "-> " + entryData.getKey().getData());
            }
            System.out.println();
        }
    }

    static class Node<T> {
        private T data;
        Map<Node<T>, Integer> adjacent = new HashMap<>();

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Map<Node<T>, Integer> getAdjacent() {
            return adjacent;
        }

        public void setAdjacent(Node<T> node, Integer weight) {
            this.adjacent.put(node, weight);
        }
    }
}
