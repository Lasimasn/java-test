package java;

import java.util.Scanner;


public class Palindrome
{

        public static void main(String[] args)
        {
            Scanner scan = new Scanner(System.in);

            System.out.println("Enter a number");

            int number= scan.nextInt();

            checkPalindrome(number);
        }

        private static void checkPalindrome(int number)

        {

            int origNum = number;
            int reverse = 0, digit;
            //FINDING PALINDROME
            while (number> 0)
            {
                digit = number % 10;
                reverse = reverse * 10 + digit;
                number= number/ 10;

            }
            if (origNum == reverse)
                System.out.println("Number is palindrome");
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
                    System.out.println("Number is not palindrome and sum of even number is greater than 25 ");
                else
                    System.out.println("Number is not palindrome and sum of even number is less than 25 ");
            }
        }

}