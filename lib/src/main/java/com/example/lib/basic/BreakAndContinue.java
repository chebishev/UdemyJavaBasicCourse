package com.example.lib.basic;

public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
            // expected output: 0 1 2 3 4
        }
        int i = 0;
        while (true) {

            i++;
            if (i == 5) {
                continue;
            }else if (i == 10) {
                break;
            }else{
                System.out.println(i);
            }

            // expected output: 1 2 3 4 6 7 8 9
        }
    }
}
