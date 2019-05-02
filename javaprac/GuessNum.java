import java.lang.*;
import java.util.Scanner;

public class GuessNum
{
        public static void main(String[] args)
        {
            guess();
        }

        //Method
        private static void guess()

        {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            int number = scan.nextInt();
            System.out.println("Enter the limit");
            int limit = scan.nextInt();

            for (int i = 0; i < limit; i++)
            {
                System.out.println("Enter Your Guess");
                int guess = scan.nextInt();
                if (number == guess)
                {
                    System.out.println("Correct Guess!!");
                    break;
                }

                else if(number>guess)
                    System.out.println("The number guesses is less than the original, Guess again!!");

                else
                    System.out.println("The number guesses is greater than the original, Guess again!!");

            }
        }



}



