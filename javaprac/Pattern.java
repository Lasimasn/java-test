
import java.util.Scanner;


public class Pattern


{
    public static void main(String args[])
    {
        loop();
    }

     private static void loop()
             //Prints Pattern

     {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number");
            int number= scan.nextInt();
            for (int i = 1; i <= number; i++)
                for (int j = 1; j <= i; j++)
                    System.out.print(i);
     }



}

