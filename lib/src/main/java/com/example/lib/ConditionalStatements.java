package com.example.lib;

public class ConditionalStatements {
    public static void main(String[] args) {

        int age = 15;
        if (age >= 18) {
            System.out.println("You are old enough to vote!");
        }else if (age >= 16) {
            System.out.println("You are old enough to drive.");
        }
        else {
            System.out.println("Sorry, you are too young to vote.");
        }

        System.out.println(checkPositive());
    }
    public static boolean checkPositive(){

        //Write a conditional statement, that checks if x is positive or not.

        //If x is positive, let the function returns true.

        //Else if x is negative, let the function returns false.

        int x = 99;

        // Write your conditional Statement Here
        /* if (x > 0) {
            return true;
        } else {
            return false;
        } */
        return x > 0;
        // Use    return true; for returning if the condition is true;







    }
}