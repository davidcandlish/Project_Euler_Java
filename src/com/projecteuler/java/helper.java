package com.projecteuler.java;



public abstract class helper {

    // This is an abstract class because we cannot - do not - want to create an instance of "helper"
    // simply use what it can do

    public static boolean PrimeCheck(int num) {
        if (num ==2){
            return true;
        } else {
            if (num <= 1 || num % 2 == 0) {
                return false;
            }
            long topLimit = (int) Math.sqrt(num);
            for (long i = 3; i <= topLimit; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean PrimeCheck(long num) {
        if (num ==2){
            return true;
        } else {
            if (num <= 1 || num % 2 == 0) {
                return false;
            }
            long topLimit = (int) Math.sqrt(num);
            for (long i = 3; i <= topLimit; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }

        return true;
    }


    public static int sumSquares(int num) {
        // TODO Think if I need to refactor this to long
        // For loop to iterate integers to the integer passed in, square them and add to running total
        int total = 0;

        for (int i = 0; i <= num; i++) {
            total = total + (int) Math.pow(i,2);

        }
        return total;
    }

    public static int squareSums(int num) {
        // sum of integers is s = (n(a+1))/2


        return (int) Math.pow(((num*(num+1))/2),2);

    }
}


