package com.stackroute.pe1;

public class PrintNumPattern
{
    public int loop(int number)
    //Prints Pattern
    {
        for (int i = 1; i <= number; i++)//Nested loop
        {
            for (int j = 1; j <= i; j++)
                System.out.print(i);//Prints pattern
        }

        return number;
    }
}
