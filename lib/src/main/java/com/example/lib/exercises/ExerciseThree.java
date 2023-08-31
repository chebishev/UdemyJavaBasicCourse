package com.example.lib.exercises;

import java.util.Scanner;

// Write a program to convert a decimal number to binary number.
public class ExerciseThree {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter a decimal number: ");
        int num1 = s1.nextInt();
        int quot, i = 1, j;
        int[] bin_num = new int[100];

        quot = num1;
        // keep deleting the number by two
        // in order to get 0 or 1 after the module division
        while (quot != 0) {
            bin_num[i++] = quot % 2;
            quot = quot / 2;
        }

        System.out.println("The binary number of " + num1 + " is: ");
        // reversing the number by reading the array backwards
        for (j = i - 1; j >= 1; j--) {
            System.out.println(bin_num[j]);
        }

        // one row solution:
        //System.out.println(Integer.toBinaryString(num1));
    }
}
