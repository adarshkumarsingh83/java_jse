package com.espark.adarsh;

import java.util.*;

public class Graph<T> {

    Map<T, Node<T>> graphNode = new LinkedHashMap<>();

    public void createTree(T data, List<T> adjacentList) {
        Node node = null;
        if (!graphNode.containsKey(data)) {
            node = addNodeToGraph(data, null);
        } else {
            node = graphNode.get(data);
        }
        for (T d : adjacentList) {
            addNodeToGraph(d, node);
        }
    }

    public Node<T> addNodeToGraph(T data, Node<T> adjacent) {
        if (adjacent == null) {
            Node node = new Node<T>(data);
            graphNode.put(data, node);
            return node;
        } else {
            Node<T> node = null;
            if (!graphNode.containsKey(data)) {
                node = new Node<>(data);
            } else {
                node = graphNode.get(data);
            }
            adjacent.setAdjacentNodes(node);
            node.setAdjacentNodes(adjacent);
            graphNode.put(data, node);
            graphNode.put(adjacent.getData(), adjacent);
            return node;
        }
    }

    public void displayTree() {
        for (Map.Entry<T, Node<T>> entry : graphNode.entrySet()) {
            System.out.print(entry.getKey());
            Node<T> node = entry.getValue();
            for (Node<T> d : node.getAdjacentNodes()) {
                System.out.print(" -> " + d.getData());
            }
            System.out.println();
        }
    }

    static public class Node<T> {
        T data;
        Set<Node> adjacentNodes = new HashSet<>();

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Set<Node> getAdjacentNodes() {
            return adjacentNodes;
        }

        public void setAdjacentNodes(Node adjacentNodes) {
            this.adjacentNodes.add(adjacentNodes);
        }

    }


}
