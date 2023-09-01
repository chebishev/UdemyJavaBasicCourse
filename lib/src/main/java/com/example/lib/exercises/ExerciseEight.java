package com.example.lib.exercises;

import java.util.Scanner;

// Write a program to make a pyramid pattern with a number
// which will repeat the number in the same row
//     1
//    2 2
//   3 3 3
//  4 4 4 4
public class ExerciseEight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int rows = scanner.nextInt();

        int spaces = rows - 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            spaces--;
            for (int k = 1; k <= i; k++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        // works fine with numbers fro 1 to 9
    }
}
