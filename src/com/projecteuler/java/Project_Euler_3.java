package com.projecteuler.java;

public class Project_Euler_3 {

    /* The prime factors of 13195 are 5,7,13,29
    What is the largest prime factor of the number 600851475143?

    A prime factor is a number that can divide into another without leaving a remainder.
    Logically, the highest prime factor a number N can have is N/2 which reduces the number of values to check

     */

    public static void main(String[] args) {
        long target = 600851475143L;
        long maxval = 0;
        if (helper.PrimeCheck(target))
        {maxval = target;
        }
        for (int i = 1; i < (Math.sqrt(target)); i++) {
            if (target % i == 0 && helper.PrimeCheck(i))
            {
                maxval = i;
            }

        }
        System.out.println(maxval);
    }
}