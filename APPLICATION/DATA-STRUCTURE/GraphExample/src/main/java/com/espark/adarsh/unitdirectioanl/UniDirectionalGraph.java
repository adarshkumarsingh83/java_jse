package com.espark.adarsh.unitdirectioanl;

import java.util.*;

public class UniDirectionalGraph<T> {

    Map<T, UniDirectionalGraph.Node<T>> graphNode = new LinkedHashMap<>();

    public void createTree(T data, List<T> adjacentList) {
        Node node = createNode(data);
        if (adjacentList != null) {
            for (T adj : adjacentList) {
                Node adjacent = createNode(adj);
                node.setAdjacentNode(adjacent);
            }
            graphNode.put(data, node);
        }
    }

    private Node<T> createNode(T data) {
        Node<T> node = null;
        if (graphNode.containsKey(data)) {
            node = graphNode.get(data);
        } else {
            node = new Node<T>(data);
            graphNode.put(data, node);
        }
        return node;
    }

    public void displayTree() {
        for (Map.Entry<T, UniDirectionalGraph.Node<T>> entry : graphNode.entrySet()) {
            System.out.print(entry.getKey());
            UniDirectionalGraph.Node<T> node = entry.getValue();
            for (UniDirectionalGraph.Node<T> d : node.getAdjacentNodes()) {
                System.out.print(" -> " + d.getData());
            }
            System.out.println();
        }
    }

    public void displayTreeWithQueue() {
        Node<T> root = graphNode.get("A");
        Queue<Node<T>> queue = new LinkedList();
        if (queue.isEmpty()) {
            queue.offer(root);
        }
        while (!queue.isEmpty()) {
            Node<T> node = queue.poll();
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

    public static class Node<T> {
        private T data;
        private boolean visited;
        Set<Node<T>> adjacentNodes = new HashSet();

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public boolean isVisited() {
            return visited;
        }

        public void setVisited(boolean visited) {
            this.visited = visited;
        }

        public Set<Node<T>> getAdjacentNodes() {
            return adjacentNodes;
        }

        public void setAdjacentNode(Node<T> adjacentNode) {
            this.adjacentNodes.add(adjacentNode);
        }

    }
}
