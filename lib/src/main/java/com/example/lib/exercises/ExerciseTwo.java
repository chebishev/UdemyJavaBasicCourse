package com.example.lib.exercises;

import java.util.Scanner;
// Write a program that gets from the user the radius
// and print the area and perimeter of a circle
public class ExerciseTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius: ");
        int radius = scanner.nextInt();

        double area = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;
        System.out.println("The area of the circle is: " + area);
        System.out.println("The perimeter of the circle is: " + perimeter);
    }
}
