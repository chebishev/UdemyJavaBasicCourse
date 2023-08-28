package com.example.lib;

public class Strings {
    public static void main(String[] args) {
        String sayHello = "Hello";
        System.out.println(sayHello);

        String myName = "John";
        System.out.println(sayHello + " " + myName);

        int length = sayHello.length();
        System.out.println("The length of the first string is: " + length);

        System.out.println(sayHello());
    }
    // We need to concatenate 2 strings and return the result in our code:
    // Join the two strings and return the result using the "return" statement.

    public static String sayHello(){

        String str1 = "Hello ";
        String str2 = "My Friends";

        return str1 + str2;
    }
}
