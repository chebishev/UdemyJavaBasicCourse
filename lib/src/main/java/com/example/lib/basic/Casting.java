package com.example.lib.basic;

public class Casting {
    // Implicit casting:
    int numInt = 10;
    double numDouble = numInt;

    // Explicit casting:
    double pi = 3.14;
    int numPI = (int) pi; // 3 (possible data loss)

    int myInt = 10;
    char myChar = (char) (myInt + 'A'); // 75 -> 'K'
}