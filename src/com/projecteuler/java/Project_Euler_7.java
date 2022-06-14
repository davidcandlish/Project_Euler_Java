package com.projecteuler.java;

public class Project_Euler_7 {

    public static void main(String[] args) {

        /*
        By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13,
        we can see that the 6th prime is 13.

        What is the 10 001st prime number?
                */

        int i = 0;
        int x = 0;

        while (x != 10001) {
            i++;
            if (helper.PrimeCheck(i) == true) {
                x += 1;
            }


        }
        System.out.println(i);


    }
}
