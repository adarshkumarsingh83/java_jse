package com.espark.adarsh.weighted_paths;


import java.util.*;

public class PathWeightedGraph<T> {

    Map<T, PathWeightedGraph.Node<T>> graphNode = new LinkedHashMap<>();

    public void createGraph(T data, HashMap<T, Integer> adjacentList) {
        PathWeightedGraph.Node node = createNode(data);

        for (Map.Entry<T, Integer> adjacentEntry : adjacentList.entrySet()) {
            PathWeightedGraph.Node adjacent = createNode(adjacentEntry.getKey());
            node.setAdjacent(adjacent, adjacentEntry.getValue());
        }

        graphNode.put(data, node);
    }

    private PathWeightedGraph.Node<T> createNode(T data) {
        PathWeightedGraph.Node<T> node = null;
        if (graphNode.containsKey(data)) {
            node = graphNode.get(data);
        } else {
            node = new PathWeightedGraph.Node<T>(data);
            if (graphNode.isEmpty()) {
                node.setShortedPathWeight(0);
                node.setLongestPathWeight(0);
                node.setLongestNodePath(node);
                node.setShortedNodePath(node);
            }
            graphNode.put(data, node);
        }
        return node;
    }

    public void displayTree() {
        System.out.println();
        for (Map.Entry<T, PathWeightedGraph.Node<T>> entry : graphNode.entrySet()) {
            PathWeightedGraph.Node<T> node = entry.getValue();
            System.out.print(entry.getKey() + " -0-> " + node.getData());
            for (Map.Entry<PathWeightedGraph.Node<T>, Integer> entryData : node.getAdjacent().entrySet()) {
                System.out.print(" -" + entryData.getValue() + "-> " + entryData.getKey().getData());
            }
            System.out.println();
        }
    }


    public void calculatePath() {
        Node<T> rootNode = graphNode.get("A");
        Queue<Node<T>> queue = new LinkedList<Node<T>>();
        queue.add(rootNode);
        while (!queue.isEmpty()) {
            Node<T> node = queue.poll();
            for (Map.Entry<PathWeightedGraph.Node<T>, Integer> entryData : node.getAdjacent().entrySet()) {
                int shortWeight = node.getShortedPathWeight() + entryData.getValue();
                int longWeight = node.getLongestPathWeight() + entryData.getValue();
                Node<T> child = entryData.getKey();
                if (child.getShortedPathWeight() > shortWeight) {
                    child.setShortedPathWeight(shortWeight);
                    child.setShortedNodePath(node.getShortedNodePath());
                    child.setShortedNodePath(child);
                }
                if (child.getLongestPathWeight() < longWeight) {
                    child.setLongestPathWeight(longWeight);
                    child.setLongestNodePath(node.getLongestNodePath());
                    child.setLongestNodePath(child);
                }
                queue.add(child);
            }
        }

        System.out.println();
        for (Map.Entry<T, PathWeightedGraph.Node<T>> entry : graphNode.entrySet()) {
            PathWeightedGraph.Node<T> node = entry.getValue();
            System.out.print(entry.getValue().getDetails());
            for (Map.Entry<PathWeightedGraph.Node<T>, Integer> entryData : node.getAdjacent().entrySet()) {
                System.out.print(entryData.getKey().getDetails());
            }
            System.out.println();
        }
    }
    

    static class Node<T> {
        private T data;
        private Map<PathWeightedGraph.Node<T>, Integer> adjacent = new HashMap<>();
        private int shortedPathWeight = Integer.MAX_VALUE;
        private int longestPathWeight = 0;
        private List<Node> shortedNodePath = new LinkedList<>();
        private List<Node> longestNodePath = new LinkedList<>();

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Map<PathWeightedGraph.Node<T>, Integer> getAdjacent() {
            return adjacent;
        }

        public void setAdjacent(PathWeightedGraph.Node<T> node, Integer weight) {
            this.adjacent.put(node, weight);
        }

        public int getShortedPathWeight() {
            return shortedPathWeight;
        }

        public void setShortedPathWeight(int shortedPathWeight) {
            this.shortedPathWeight = shortedPathWeight;
        }

        public int getLongestPathWeight() {
            return longestPathWeight;
        }

        public void setLongestPathWeight(int longestPathWeight) {
            this.longestPathWeight = longestPathWeight;
        }

        public List<Node> getShortedNodePath() {
            return shortedNodePath;
        }

        public void setShortedNodePath(Node shortedNode) {
            this.shortedNodePath.add(shortedNode);
        }

        public void setShortedNodePath(List<Node> shortedNodePath) {
            this.shortedNodePath = shortedNodePath;
        }

        public List<Node> getLongestNodePath() {
            return longestNodePath;
        }

        public void setLongestNodePath(Node longestNode) {
            this.longestNodePath.add(longestNode);
        }

        public void setLongestNodePath(List<Node> longestNodePath) {
            this.longestNodePath = longestNodePath;
        }

        public String getDetails() {
            String shortPath = "";
            for (Node n : shortedNodePath) {
                shortPath += " -> " + n.getData();
            }
            String longPath = "";
            for (Node n : longestNodePath) {
                longPath += " -> " + n.getData();
            }
            return "Name " + this.getData() + " Shorted Path Weight " + this.getShortedPathWeight() + " Longest Path Weight " + this.getLongestPathWeight()
                    + " Short Path " + shortPath + " Long Path " + longPath;

        }
    }
}
