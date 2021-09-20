package com.espark.adarsh.bidirectional;

import com.espark.adarsh.unitdirectioanl.UniDirectionalGraph;

import java.util.*;

public class BiDirectionalGraph<T> {

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

    public void displayTreeWithQueue() {
        BiDirectionalGraph.Node<T> root = graphNode.get("A");
        Queue<BiDirectionalGraph.Node<T>> queue = new LinkedList();
        if (queue.isEmpty()) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            BiDirectionalGraph.Node<T> node = queue.poll();
            node.setVisited(true);
            System.out.print(node.getData());
            node.getAdjacentNodes().forEach(e -> {
                System.out.print(" -> " + e.getData());
                if (!queue.contains(e) && !e.isVisited()) {
                    queue.add(e);
                }
            });
            System.out.println();
        }
    }

    static public class Node<T> {
        T data;
        private boolean visited;
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

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public Set<Node> getAdjacentNodes() {
            return adjacentNodes;
        }

        public void setAdjacentNodes(Node adjacentNodes) {
            this.adjacentNodes.add(adjacentNodes);
        }

    }


}
