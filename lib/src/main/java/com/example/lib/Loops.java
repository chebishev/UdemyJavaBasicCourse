package com.example.lib;

public class Loops {
    public static void main(String[] args) {
        int i = 1;

        // while loop
        System.out.println("While loop output:");
        while (i <= 10) {
            System.out.println(i);
            // i += 1;
            // i = i + 1;
            i++;
        }
        System.out.println("##################");

        // for loop
        System.out.println("For loop output:");
        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
        System.out.println(sumUpNumbers());
    }
    //We need to sum the numbers from  1 to 10 using the loops!

    //Given the following code:
    //Write a loop that allows us to sum the numbers from 0 to 10
    // and stores the result in the "sum" variable.

    public static int sumUpNumbers(){

        int sum = 0;

        // Write your loop here
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        /* while solution:
        int startNumber = 1;
        int endNumber = 10;



        // Write your loop here: Sum up numbers from 1 to 10
        while (startNumber <= endNumber){
            sum += startNumber;
            startNumber ++;
        }
         */

        return sum;
    }


}
