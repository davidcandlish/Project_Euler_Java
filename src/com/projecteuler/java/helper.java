package com.projecteuler.java;

import java.io.*;
import java.math.*;


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
}

