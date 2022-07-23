package com.espark.adarsh;

import java.util.ArrayDeque;
import java.util.Queue;

public class ApplicationMain {

    static int image3x3[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static int image4x4[][] = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
    static Queue<Integer> queue = new ArrayDeque<>();

    public static void main(String[] args) {

        display("ORIGINAL 3X3 MATRIX IMAGE BEFORE ROTATION ", image3x3);
        rotateMatrix(image3x3);
        display("ORIGINAL 3X3 MATRIX IMAGE AFTER ROTATION ", image3x3);

        display("ORIGINAL 4X4 MATRIX IMAGE BEFORE ROTATION ", image4x4);
        rotateMatrix(image4x4);
        display("ORIGINAL 4X4 MATRIX IMAGE AFTER ROTATION ", image4x4);
    }

    static void rotateMatrix(int image[][]) {
        int size = image.length - 1;
        for (int i = 0; i <= size; i++) {
            for (int j = size; j >= 0; j--) {
                queue.add(image[j][i]);
            }
        }

        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                image[i][j] = queue.remove();
            }
        }
    }

    static void display(String msg, int image[][]) {
        System.out.println(msg);
        int size = image.length - 1;
        for (int i = 0; i <= size; i++) {
            for (int j = 0; j <= size; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
