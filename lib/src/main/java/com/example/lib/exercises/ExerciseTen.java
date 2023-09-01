package com.example.lib.exercises;

import java.util.Scanner;

// Write a program to calculate the average value of array elements
public class ExerciseTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }
        if (n == 0) {
            System.out.println("The array is empty!");
        }else {
            System.out.println("The average value of array elements is: " + (double) sum / n);
        }
    }
}
