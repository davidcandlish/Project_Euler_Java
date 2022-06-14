package com.projecteuler.java;

public class Project_Euler_5 {
    public static void main(String[] args) {
        // https://projecteuler.net/problem=5
        // 2520 smallest number divided by 1>10 with no remainder
        // whats smallest for 1>20

        /* the answer must be an even number because no odd numbers can be divided cleanly
        so we can iterate up and ignore all odd numbers
        we also know it's not 2520
         */


        int limit = 2521;
        int a = 1;
        int b = 10;

        for (int i = 1; i <= limit; i+=2) {
            for ( a = 1; a <= b; a++){
                    if (i % a == 0) {
                        // todo this approach is wrong.
                    }
            }
        }

    }
}
