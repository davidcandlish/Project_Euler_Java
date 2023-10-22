package com.projecteuler.java;

public class Project_Euler_4 {

    public static void main (String[] args) {
        /*
        A palindromic number reads the same both ways. The largest palindrome made from the product of two
        2-digit numbers is 9009 = 91*99.

Find the largest palindrome made from the product of two 3-digit numbers.

         */


        int largestPalindrome = 0;

        for (int primary = 100; primary < 1000; primary++)
        {
            for (int secondary = 100; secondary < 1000; secondary++)
            {
                int number = primary * secondary;
                if (checkPalindromic(number))
                {
                   if (number > largestPalindrome)
                    largestPalindrome = number;
                }
            }
        }

        System.out.println(largestPalindrome);


            }

            private static boolean  checkPalindromic (int number) {


                boolean result = true;
                int[] palindromeArray = convertToDigitArray(number);

                for (int i =0, j= palindromeArray.length - 1; i <j; i++,j--)
                {
                 if (palindromeArray[i] != palindromeArray[j])
                    {
                        result = false;
                        break;
                    }
                }

                return result;


            }

            private static int[] convertToDigitArray (int number)
            {
                String numString = String.valueOf(number);
                int[] numArray = new int[numString.length()];

                for (int i = 0; i < numString.length(); i++)
                {
                    numArray[i] = Character.getNumericValue(numString.charAt(i));
                }

                return numArray;
            }
}
