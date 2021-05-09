package com.espark.adarsh.weighted_cyclic_path;



import java.util.*;

public class CyclicPathGraph<T> {

    Integer nodeOrder = 0;
    Map<T, CyclicPathGraph.Node<T>> graphNode = new LinkedHashMap<>();

    public void createGraph(T data, HashMap<T, Integer> adjacentList) {
        CyclicPathGraph.Node node = createNode(data);
        node.setOrder(nodeOrder);
        nodeOrder++;
        for (Map.Entry<T, Integer> adjacentEntry : adjacentList.entrySet()) {
            CyclicPathGraph.Node adjacent = createNode(adjacentEntry.getKey());
            node.setAdjacent(adjacent, adjacentEntry.getValue());
        }
        graphNode.put(data, node);
    }

    private CyclicPathGraph.Node<T> createNode(T data) {
        CyclicPathGraph.Node<T> node = null;
        if (graphNode.containsKey(data)) {
            node = graphNode.get(data);
        } else {
            node = new CyclicPathGraph.Node<T>(data);
            graphNode.put(data, node);
        }
        return node;
    }

    public void displayTree() {
        System.out.println();
        for (Map.Entry<T, CyclicPathGraph.Node<T>> entry : graphNode.entrySet()) {
            CyclicPathGraph.Node<T> node = entry.getValue();
            System.out.print(entry.getKey() + " -0-> " + node.getData());
            for (Map.Entry<CyclicPathGraph.Node<T>, Integer> entryData : node.getAdjacent().entrySet()) {
                System.out.print(" -" + entryData.getValue() + "-> " + entryData.getKey().getData());
            }
            System.out.println();
        }
        System.out.println();
    }


    public void calculatePathBetweenAllNodes(T start) {
        CyclicPathGraph.Node<T> rootNode = graphNode.get(start);
        Queue<CyclicPathGraph.Node<T>> queue = new LinkedList<>();
        rootNode.setShortedPathWeight(0);
        rootNode.setLongestPathWeight(0);
        rootNode.setShortedNodePath(rootNode.getData());
        rootNode.setLongestNodePath(rootNode.getData());
        queue.add(rootNode);
        while (!queue.isEmpty()) {
            CyclicPathGraph.Node<T> node = queue.poll();
            for (Map.Entry<CyclicPathGraph.Node<T>, Integer> entryData : node.getAdjacent().entrySet()) {
                int shortWeight = node.getShortedPathWeight() + entryData.getValue();
                int longWeight = node.getLongestPathWeight() + entryData.getValue();
                CyclicPathGraph.Node<T> child = entryData.getKey();
                if (child.getShortedPathWeight() > shortWeight) {
                    child.setShortedPathWeight(shortWeight);
                    child.setShortedNodePath(new ArrayList(node.getShortedNodePath()));
                    child.setShortedNodePath(child.getData());
                }
                if (child.getLongestPathWeight() < longWeight
                        && !node.getLongestNodePath().contains(child.getData())) {
                    child.setLongestPathWeight(longWeight);
                    child.setLongestNodePath(new ArrayList(node.getLongestNodePath()));
                    child.setLongestNodePath(child.getData());
                }
                if (child.getOrder() > node.getOrder()) {
                    queue.add(child);
                }
            }
        }
        System.out.println();
        for (Map.Entry<T, CyclicPathGraph.Node<T>> entry : graphNode.entrySet()) {
            System.out.print(entry.getValue().getDetails(start));
            System.out.println();
        }
    }

    static class Node<T> {

        private T data;
        private Integer order;
        private int shortedPathWeight = Integer.MAX_VALUE;
        private int longestPathWeight = 0;
        private List<T> shortedNodePath = new LinkedList<>();
        private List<T> longestNodePath = new LinkedList<>();
        private Map<CyclicPathGraph.Node<T>, Integer> adjacent = new HashMap<>();

        public Node(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public Map<CyclicPathGraph.Node<T>, Integer> getAdjacent() {
            return adjacent;
        }

        public void setAdjacent(CyclicPathGraph.Node<T> node, Integer weight) {
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

        public List<T> getShortedNodePath() {
            return shortedNodePath;
        }

        public void setShortedNodePath(T shortedNode) {
            this.shortedNodePath.add(shortedNode);
        }

        public void setShortedNodePath(List<T> shortedNodePath) {
            this.shortedNodePath = shortedNodePath;
        }

        public List<T> getLongestNodePath() {
            return longestNodePath;
        }

        public void setLongestNodePath(T longestNode) {
            this.longestNodePath.add(longestNode);
        }

        public void setLongestNodePath(List<T> longestNodePath) {
            this.longestNodePath = longestNodePath;
        }

        public Integer getOrder() {
            return order;
        }

        public void setOrder(Integer order) {
            this.order = order;
        }

        public String getDetails(T start) {

            String shortPath = "";
            for (T n : shortedNodePath) {
                shortPath += " -> " + n;
            }

            String longPath = "";
            for (T n : longestNodePath) {
                longPath += " -> " + n;
            }

            return "From " + start + " to " + this.getData() +
                    " Shorted Path Weight " + this.getShortedPathWeight() +
                    " Longest Path Weight " + this.getLongestPathWeight() +
                    " Short Path " + shortPath +
                    " Long Path " + longPath;

        }
    }
}
