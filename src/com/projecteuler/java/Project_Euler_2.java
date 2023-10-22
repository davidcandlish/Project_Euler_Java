package com.projecteuler.java;



import java.util.ArrayList;


public class Project_Euler_2 {

    public static void main(String[] args) {

        // Iterate through collection to find and save down even numbers


//        Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
        ArrayList<Integer> fiboArray = new ArrayList<>();
        int curr_term = 1;
        int next_term = 2;
        int limit = 4000000;
        fiboArray.add(curr_term);
        fiboArray.add(next_term);
        while (next_term < limit)
        {

            int holding_term = next_term;
            next_term = curr_term + next_term;
            curr_term = holding_term;
            fiboArray.add(next_term);
        //System.out.println(next_term);
        }

        int answer =0;
        for (Integer element : fiboArray)
        {
         //   System.out.println(element);
            if (element % 2 == 0)
            {
                answer = answer + element;
            }

        }

        System.out.println(answer);

    }
}