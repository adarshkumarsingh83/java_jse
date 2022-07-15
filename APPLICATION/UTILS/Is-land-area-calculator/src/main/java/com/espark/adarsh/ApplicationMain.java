package com.espark.adarsh;

import java.util.*;

public class ApplicationMain {

    static final int xSize = 8;
    static final int ySize = 12;

    static Stack<int[]> stack = new Stack<>();
    static Set<String> dataSet = new HashSet<>();
    static final int grid[][] = {
            {0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0}
            , {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}
            , {0, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0}
            , {0, 1, 0, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0}
            , {0, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 0}
            , {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0}
            , {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0}
            , {0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 0, 0, 0}
    };


    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        String positionMark = "";
        for (int i = 0; i < xSize; i++) {
            for (int j = 0; j < ySize; j++) {
                x = i;
                y = j;
                if (grid[x][y] == 1) {
                    calculateIsLandArea(x, y);
                    if (!stack.isEmpty()) {
                        int areaCount = 0;
                        while (!stack.isEmpty()) {
                            int[] position = stack.pop();
                            positionMark += position[0] + ":" + position[1] + " ,";
                            areaCount++;
                        }
                        System.out.println("Area size " + areaCount + " Positions " + positionMark);
                        positionMark = "";
                    }
                }
            }
        }
    }

    public static void calculateIsLandArea(int x, int y) {
        if (!dataSet.contains(x + ":" + y)) {
            dataSet.add(x + ":" + y);
            stack.push(new int[]{x, y});
            if (x < xSize && y + 1 < ySize && grid[x][y + 1] == 1) {
                calculateIsLandArea(x, y + 1);
            }
            if (x + 1 < xSize && y < ySize && grid[x + 1][y] == 1) {
                calculateIsLandArea(x + 1, y);
            }
            if (y - 1 >= 0 && grid[x][y - 1] == 1) {
                calculateIsLandArea(x, y - 1);
            }
            if (x - 1 >= 0 && grid[x - 1][y] == 1) {
                calculateIsLandArea(x - 1, y);
            }
        }
    }

}
