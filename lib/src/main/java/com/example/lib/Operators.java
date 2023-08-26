package com.example.lib;

public class Operators {
    public static void main(String[] args) {
        // Arithmetic operators
        System.out.println(5 + 2);
        System.out.println(5 * 2);
        System.out.println(5 - 2);
        System.out.println(5 / 2);

        // modulus operator
        System.out.println(10 % 2);
        System.out.println(5 % 2);

        // comparison operators
        // ==, !=, >, <, >=, <=
        System.out.println(5 == 2); // false
        System.out.println(5 != 2); // true
        System.out.println(5 > 2); // true
        System.out.println(5 < 2); // false
        System.out.println(5 >= 2); // false
        System.out.println(5 <= 2); // false

        // logical operators
        // &&, ||, !
        boolean isReady = true;
        boolean isRaining = false;

        boolean isReadyOrRaining = isReady || isRaining; // true
        boolean isReadyAndRaining = isReady && isRaining; // false
        boolean isReadyNotRaining = !isRaining; // true
    }
    // We have 2 booleans in this code:

    //Your mission is to add a specific operator between x and y,
    // so that this function will return true (according to the boolean expressions)

    public boolean returnTrueExp(){

        boolean x = true;
        boolean y = true;

        return x && y;
    }
}