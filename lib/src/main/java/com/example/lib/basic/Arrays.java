package com.example.lib.basic;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        numbers[0] = 1;
        numbers[1] = 10;
        numbers[2] = 100;
        numbers[3] = 1000;
        numbers[4] = 10000;

        System.out.println(java.util.Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
