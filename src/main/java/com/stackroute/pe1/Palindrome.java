package com.stackroute.pe1;

public class Palindrome
    {

        public static String checkPalindrome(int number)

        {

            int origNum = number;//Declaration and initialization
            int reverse = 0, digit;
            //FINDING PALINDROME
            while (number> 0)
            {
                digit = number % 10;
                reverse = reverse * 10 + digit;
                number= number/ 10;//Code for reversal

            }
            if (origNum == reverse)//Check if reverse is equal to original
                return "Number is Palindrome";
            else
            {
                int x, sum = 0;
                while (number>0)
                //CALCULATING SUM OF EVEN NUMBERS
                {
                    x = number% 10;
                    number = number / 10;
                    if (x % 2 == 0)
                        sum += x;
                }

                if (sum>25)
                    return "Number is not palindrome and sum of even number is greater than 25 ";
                else
                    return "Number is not palindrome and sum of even number is less than 25 ";
            }

        }

    }


