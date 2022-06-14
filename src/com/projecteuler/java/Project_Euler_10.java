package com.projecteuler.java;

public class Project_Euler_10 {

    /*
    The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
    Find the sum of all the primes below two million.
     */
    public static void main(String[] args) {

        long i = 0;
        int x = 0;

        while (x != 2000000) {
            if (helper.PrimeCheck(x)) {
                i+=x;

            }
                x++;

        }
        System.out.println(i);

    }
}
