package com.example.lib.exercises;

// Write a Java program to count the number of even and odd
// elements in a given array of integers
public class ExerciseSeven {
    public static void main(String[] args) {
        int[] array = {5, 7, 2, 4, 9};
        int even = 0, odd = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;

            }
        }
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
