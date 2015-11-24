package com.espark.adarsh.tree;

import java.util.Comparator;

/**
 * Created by Adarsh on 8/26/15.
 */
public class ApplicationMain {
    public static void main(String[] args) {
        final MyTree<Integer> myTree = new MyTree<Integer>(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Integer n1 = (Integer) o1;
                Integer n2 = (Integer) o2;
                return n1.compareTo(n2);
            }
        });
       final int[] data={50,25,75,12,37,1,30,19,41,62,83,69,56,100,80};
        for (int value:data) {
            myTree.insert(value);
        }

        myTree.inOrderTraversal();
        System.out.println();
        myTree.preOrderTraversal();
        System.out
                .println();
        myTree.postOrderTraversal();

        System.out.println("\nCount of the Tree Nodes "+myTree.countTreeNode());
        System.out.println("\nSearch the Value in Tree "+myTree.searchValue(1));

        myTree.deleteNode(62);
        System.out.println();
        myTree.inOrderTraversal();
    }
}
