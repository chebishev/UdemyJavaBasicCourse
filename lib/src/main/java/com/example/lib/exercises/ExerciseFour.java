package com.example.lib.exercises;

import java.util.Scanner;

// Write a program to count the letters, spaces,
// numbers and other characters in a string
public class ExerciseFour {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        int letters = 0;
        int spaces = 0;
        int numbers = 0;
        int other = 0;

        // variant with inbuilt methods
        for (int i = 0; i < input.length(); i++) {
            if (Character.isLetter(input.charAt(i))) {
                letters++;
            } else if (Character.isSpaceChar(input.charAt(i))) {
                spaces++;
            } else if (Character.isDigit(input.charAt(i))) {
                numbers++;
            } else {
                other++;
            }

            // variant with ASCII table
            // for (int i = 0; i < input.length(); i++) {
            //     if (input.charAt(i) >= 65 && input.charAt(i) <= 90) {
            //         letters++;
            //     } else if (input.charAt(i) >= 97 && input.charAt(i) <= 122) {
            //         letters++;
            //     } else if (input.charAt(i) >= 48 && input.charAt(i) <= 57) {
            //         numbers++;
            //     } else if (input.charAt(i) == 32) {
            //         spaces++;
            //     } else {
            //         other++;
            //         }

            }
        System.out.println("letters: " + letters);
        System.out.println("spaces: " + spaces);
        System.out.println("numbers: " + numbers);
        System.out.println("other: " + other);

        }
    }


