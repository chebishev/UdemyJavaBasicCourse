package com.example.lib.exercises;

// Write a program to multiply corresponding elements of two arrays of integers
public class ExerciseSix {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, -5, 4};
        int[] arr2 = {1, 4, -5, -2};
        int[] arr3 = new int[arr1.length];

        System.out.print("Result: ");
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] * arr2[i];
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        System.out.println(java.util.Arrays.toString(arr3));
    }
}
