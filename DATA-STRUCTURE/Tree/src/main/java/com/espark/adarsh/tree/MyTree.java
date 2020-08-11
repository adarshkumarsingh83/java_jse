package com.espark.adarsh.tree;

import java.util.Comparator;

/**
 * Created by Adarsh on 8/26/15.
 */
public class MyTree<T> {

    private TreeNode<T> rootTreeNode = null;
    private Comparator comparator;

    public class TreeNode<T> {

        private T data;
        private TreeNode<T> leftNode;
        private TreeNode<T> rightNode;

        public TreeNode() {
            this.data = null;
            this.leftNode = null;
            this.rightNode = null;
        }

        public TreeNode(T data) {
            this.data = data;
            this.leftNode = null;
            this.rightNode = null;
        }

        public void setLeftNode(TreeNode<T> leftNode) {
            this.leftNode = leftNode;
        }

        public TreeNode<T> getLeftNode() {
            return this.leftNode;
        }

        public void setRightNode(TreeNode<T> rightNode) {
            this.rightNode = rightNode;
        }

        public TreeNode<T> getRightNode() {
            return this.rightNode;
        }

        public void setNodeData(T data) {
            this.data = data;
        }

        public T getNodeData() {
            return this.data;
        }
    }

    public MyTree(Comparator comparator) {
        this.comparator = comparator;
    }

    public boolean isTreeEmpty() {
        return (this.rootTreeNode == null ? Boolean.TRUE : Boolean.FALSE);
    }

    public void insert(T data) {
        this.rootTreeNode = this.insertData(rootTreeNode, data);
    }

    private TreeNode<T> insertData(TreeNode<T> rootNode, T data) {
        if (rootNode == null) {
            rootNode = new TreeNode<T>(data);
        } else {
            final int comparisonResult = comparator.compare(data, rootNode.getNodeData());
            if (comparisonResult == -1) {
                // object1 is lesser then object2
                rootNode.setLeftNode(insertData(rootNode.getLeftNode(), data));

            } else if (comparisonResult == 1) {
                // object1 is greater then object2
                rootNode.setRightNode(insertData(rootNode.getRightNode(), data));
            } else {
                //object1 is equals then object2
                rootNode.setLeftNode(insertData(rootNode.getLeftNode(), data));
            }
        }
        return rootNode;
    }

    public void inOrderTraversal() {
        this.inOrderTraversal(rootTreeNode);
    }

    private void inOrderTraversal(TreeNode<T> rootTreeNode) {
        if (rootTreeNode != null) {
            this.inOrderTraversal(rootTreeNode.getLeftNode());
            System.out.print(" " + rootTreeNode.getNodeData());
            this.inOrderTraversal(rootTreeNode.getRightNode());
        }
    }

    public void preOrderTraversal() {
        this.preOrderTraversal(rootTreeNode);
    }

    private void preOrderTraversal(TreeNode<T> rootTreeNode) {
        if (rootTreeNode != null) {
            System.out.print(" " + rootTreeNode.getNodeData());
            this.preOrderTraversal(rootTreeNode.getLeftNode());
            this.preOrderTraversal(rootTreeNode.getRightNode());
        }
    }

    public void postOrderTraversal() {
        this.postOrderTraversal(rootTreeNode);
    }

    private void postOrderTraversal(TreeNode<T> rootTreeNode) {
        if (rootTreeNode != null) {
            this.postOrderTraversal(rootTreeNode.getLeftNode());
            this.postOrderTraversal(rootTreeNode.getRightNode());
            System.out.print(" " + rootTreeNode.getNodeData());
        }
    }

    public int countTreeNode() {
        return this.countTreeNode(rootTreeNode);
    }

    private int countTreeNode(TreeNode<T> rootTreeNode) {
        if (rootTreeNode == null) {
            return 0;
        } else {
            int size = 1;
            size += countTreeNode(rootTreeNode.getLeftNode());
            size += countTreeNode(rootTreeNode.getRightNode());
            return size;
        }
    }

    public boolean searchValue(T data) {
        return searchValue(rootTreeNode, data);
    }

    private boolean searchValue(TreeNode<T> rootTreeNode, T data) {
        boolean foundResult = false;

        while (rootTreeNode != null && !foundResult) {
            T dataValue = rootTreeNode.getNodeData();
            final int comparisonResult = comparator.compare(dataValue, data);
            if (comparisonResult == -1) {
                rootTreeNode = rootTreeNode.getRightNode();
            } else if (comparisonResult == 1) {
                rootTreeNode = rootTreeNode.getLeftNode();
            } else {
                foundResult = true;
                break;
            }
            foundResult = searchValue(rootTreeNode, data);
        }
        return foundResult;
    }

    public void deleteNode(T data) {
        if (this.isTreeEmpty()) {
            System.out.println("Tree is Empty ");
        }
        if (!this.searchValue(data)) {
            System.out.println("Tree Doesn't Contains Value");
        } else {
            this.rootTreeNode = deleteNode(rootTreeNode, data);
            System.out.println("Data Delete from Tree " + data);
        }
    }

    public TreeNode<T> deleteNode(TreeNode<T> treeNode, T data) {

        TreeNode<T> treeNodeTemp1, treeNodeTemp2, treeNodeTemp;

        if (treeNode.getNodeData() == data) {
            TreeNode<T> treeNodeLeft, treeNodeRight;
            treeNodeLeft = treeNode.getLeftNode();
            treeNodeRight = treeNode.getRightNode();

            if (treeNodeLeft == null && treeNodeRight == null) {
                return null;
            } else if (treeNodeLeft == null) {
                treeNodeTemp1 = treeNodeRight;
                return treeNodeTemp1;
            } else if (treeNodeRight == null) {
                treeNodeTemp1 = treeNodeLeft;
                return treeNodeTemp1;
            } else {
                treeNodeTemp2 = treeNodeRight;
                treeNodeTemp1 = treeNodeRight;
                while (treeNodeTemp1.getLeftNode() != null) {
                    treeNodeTemp1 = treeNodeTemp1.getLeftNode();
                }
                treeNodeTemp1.setLeftNode(treeNodeLeft);
                return treeNodeTemp2;
            }
        }

        if (this.comparator.compare(data, treeNode.data) == -1) {
            treeNodeTemp = deleteNode(treeNode.getLeftNode(), data);
            treeNode.setLeftNode(treeNodeTemp);
        } else {
            treeNodeTemp = deleteNode(treeNode.getRightNode(), data);
            treeNode.setRightNode(treeNodeTemp);
        }
        return treeNode;
    }
}
