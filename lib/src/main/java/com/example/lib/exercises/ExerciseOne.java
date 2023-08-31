package com.example.lib.exercises;

import java.util.Scanner;

// Write a program that gets from the user 2 numbers
// and displays their division and remainder.
public class ExerciseOne {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = s1.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = s1.nextInt();

        float division = (float) num1 / num2;
        int remainder = num1 % num2;
        System.out.println("The operations between " + num1 + " and " + num2 + " are: ");
        System.out.println("The division: " + division);
        System.out.println("The remainder: " + remainder);
    }
}
