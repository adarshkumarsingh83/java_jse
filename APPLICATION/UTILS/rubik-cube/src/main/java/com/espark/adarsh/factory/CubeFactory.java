package com.espark.adarsh.factory;

import com.espark.adarsh.bean.Cube;
import com.espark.adarsh.bean.Node;
import com.espark.adarsh.lambda.TriConsumer;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

@Service
public class CubeFactory<T> {

    @Autowired
    NodeFactory<T> nodeFactory;

    @PostConstruct
    public void init() {
        buildCube.apply(3);
    }

    private final Consumer<Cube<T>> populateAxis = (cube) -> {
        Node<T> x = cube.getFront();
        Node<T>[] xAxis = new Node[cube.getSize()];
        for (int i = 0; i < cube.getSize(); i++) {
            xAxis[i] = x;
            x = x.getRight();
        }
        cube.setxHorizontalAxis(xAxis);
        Node<T>[] yVerticalAxis = new Node[cube.getSize()];
        Node<T> y = cube.getFront();
        for (int i = 0; i < cube.getSize(); i++) {
            yVerticalAxis[i] = y;
            y = y.getBottom();
        }
        cube.setyVerticalAxis(yVerticalAxis);
    };

    private Function<Integer, Cube<T>> rootCube = (Integer size) -> {
        Cube<T> cube = new Cube<T>();
        cube.setSize(size);
        return cube;
    };

    public BiFunction<Integer, T, Node<T>> generateMatrix = (Integer size, T data) -> {
        Node<T> baseNode = null;
        Node<T> rootNode = null;
        Node<T> tempNode = null;

        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {
                Node<T> node = nodeFactory.getNode((T) (data + "" + i + "" + j));
                if (rootNode == null) {
                    rootNode = node;
                    tempNode = rootNode;
                } else {
                    node.setLeft(tempNode);
                    tempNode.setRight(node);
                    tempNode = node;
                }
            }

            if (baseNode == null) {
                baseNode = rootNode;
                rootNode = null;
                tempNode = null;
            } else if (baseNode.getBottom() == null) {
                rootNode.setTop(baseNode);
                baseNode.setBottom(rootNode);
                rootNode = null;
                tempNode = null;
            } else {
                tempNode = baseNode;
                while (tempNode.getBottom() != null) {
                    tempNode = tempNode.getBottom();
                }
                rootNode.setTop(tempNode);
                tempNode.setBottom(rootNode);
                rootNode = null;
                tempNode = null;
            }
        }

        rootNode = baseNode;
        Node<T> preTopNode = null;
        for (int i = 0; i < (size - 1); i++) {


            preTopNode = rootNode;
            tempNode = preTopNode.getBottom();


            for (int j = 0; j < (size - 1); j++) {
                preTopNode = preTopNode.getRight();
                tempNode = tempNode.getRight();
                preTopNode.setBottom(tempNode);
                tempNode.setTop(preTopNode);
            }

            rootNode = rootNode.getBottom();
            preTopNode = null;
            tempNode = null;

        }

        return baseNode;
    };

    private final Consumer<Cube<T>> generateSides = (Cube<T> cube) -> {
        Integer size = cube.getSize();
        cube.setFront(generateMatrix.apply(size, (T) "F"));
        cube.setRight(generateMatrix.apply(size, (T) "R"));
        cube.setBack(generateMatrix.apply(size, (T) "B"));
        cube.setLeft(generateMatrix.apply(size, (T) "L"));
        cube.setTop(generateMatrix.apply(size, (T) "T"));
        cube.setBottom(generateMatrix.apply(size, (T) "D"));
    };

    public BiConsumer<Node<T>, Integer> display = (Node<T> node, Integer size) -> {

        if (node != null) {
            Node<T> xAxis = null;
            Node<T> yAxis = node;
            for (int i = 0; i < size; i++) {
                xAxis = yAxis;
                for (int j = 0; j < size; j++) {
                    System.out.print(xAxis.getDate() + "  ");
                    xAxis = xAxis.getRight();
                }
                yAxis = yAxis.getBottom();
                System.out.println();
            }
        }
    };

    private final Consumer<Cube<T>> displayAllSideOfCube = (cube) -> {
        System.out.println("\n");
        display.accept(cube.getFront(), cube.getSize());
        System.out.println("\n");
        display.accept(cube.getRight(), cube.getSize());
        System.out.println("\n");
        display.accept(cube.getBack(), cube.getSize());
        System.out.println("\n");
        display.accept(cube.getLeft(), cube.getSize());
        System.out.println("\n");
        display.accept(cube.getTop(), cube.getSize());
        System.out.println("\n");
        display.accept(cube.getBottom(), cube.getSize());
        System.out.println("\n");
    };

    public TriConsumer<Node<T>, Node<T>, Integer> associateSide = (oneSide, otherSide, size) -> {
        while (oneSide.getRight() != null)
            oneSide = oneSide.getRight();
        for (int i = 0; i < size; i++) {
            oneSide.setRight(otherSide);
            otherSide.setLeft(oneSide);
            oneSide = oneSide.getBottom();
            otherSide = otherSide.getBottom();
        }
    };

    public TriConsumer<Node<T>, Node<T>, Integer> associateTop = (top, fount, size) -> {
        boolean topFront = true;
        boolean topRight = false;
        boolean topBack = false;
        boolean topLeft = false;

        Node<T> sideTemp = fount;
        Node<T> topTemp = top;

        do {
            topTemp.setBottom(sideTemp);
            sideTemp.setTop(topTemp);

            if (topTemp.getRight() != null && topFront) {
                topTemp = topTemp.getRight();
            } else {
                topFront=false;
                topLeft= true;
                topBack =false;
                topRight =false;
                topTemp=topTemp.getBottom();
            }

            if (topTemp.getBottom() != null && topLeft) {
                topTemp = topTemp.getBottom();
            } else {
                topLeft = false;
                topBack = true;
                topTemp = topTemp.getLeft();
            }

            if (topTemp.getLeft() != null && topBack) {
                topTemp = topTemp.getLeft();
            }else {
                topBack=false;
                topRight = true;
                topTemp=topTemp.getTop();
            }

            if(topTemp.getTop()!=null && topRight){
                topTemp= topTemp.getTop();
            }else{
                topRight=false;
            }

            sideTemp = sideTemp.getRight();
        } while (sideTemp != fount);
    };

    public Consumer<Cube<T>> mergeSides = (cube) -> {
        Node<T> front = cube.getFront();
        Node<T> right = cube.getRight();
        Node<T> back = cube.getBack();
        Node<T> left = cube.getLeft();
        Node<T> top = cube.getTop();
        Node<T> bottom = cube.getBottom();

        Node<T> oneSide = front;
        Node<T> otherSide = right;
        associateSide.apply(oneSide, otherSide, cube.getSize());

        oneSide = right;
        otherSide = back;
        associateSide.apply(oneSide, otherSide, cube.getSize());

        oneSide = back;
        otherSide = left;
        associateSide.apply(oneSide, otherSide, cube.getSize());

        oneSide = left;
        otherSide = front;
        associateSide.apply(oneSide, otherSide, cube.getSize());

        associateTop.apply(top,front,cube.getSize());

    };


    public Function<Integer, Cube<T>> buildCube = (size) -> {
        Cube<T> cube = rootCube.apply(size);
        generateSides.accept(cube);
        populateAxis.accept(cube);
        displayAllSideOfCube.accept(cube);
        mergeSides.accept(cube);
        return cube;
    };

}
