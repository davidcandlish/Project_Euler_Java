package com.projecteuler.java;

public class Project_Euler_6 {
    public static void main(String[] args) {
        /* sum of squares, square of the sum of first 10 numbers
        so 1^2 + 2^2 + 3^2 ... = 385
        vs
        (1+2+3...)^2 = 55^2 = 3025
        Difference  = 3025 - 385

        Find the difference between the sum of first 100 natural numbers and square of sum

         */

        int limit = 100;
        int result = helper.squareSums(limit) - helper.sumSquares(limit);
        System.out.println(result);
    }
}
