package com.example.lib;

import java.util.Arrays;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] theMatrix = new int[3][8];
        theMatrix[0][0] = 1;
        theMatrix[0][1] = 2;
        theMatrix[2][7] = 100;
        System.out.println(Arrays.deepToString(theMatrix));

        int[][] theMatrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println(Arrays.deepToString(theMatrix2));
    }

}
