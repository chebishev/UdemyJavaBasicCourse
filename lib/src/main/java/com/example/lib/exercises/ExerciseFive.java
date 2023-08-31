package com.example.lib.exercises;

import java.util.Scanner;

// Write a program to reverse a string.
public class ExerciseFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse: ");
        String input = scanner.nextLine();
        // 1. easy method:
        // 1. StringBuilder sb = new StringBuilder(input);
        // 1. System.out.println(sb.reverse());

        // 2. other solution with append method:
        // 2. StringBuilder output = new StringBuilder();
        String output = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            // 2. output.append(input.charAt(i));
            output += input.charAt(i);
            // 3. or we can directly print elements on current line:
            // 3. System.out.print(input.charAt(i));
        }
        // 3. System.out.print("\n");
        System.out.println(output);
    }
}
