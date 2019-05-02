package com.stackroute.pe1;
import java.io.IOException;
import java.util.Scanner;

public class SortNum {

        private static String sort(int number)
        {
            int i=0,sum=0,newnum=0,a=0;
            int [] array = new int[10];

            /* INSERTING NUMBERS INTO THE ARRAY */
            while (number > 0)
            {
                array[i] = number % 10;
                number = number / 10;
                i++;
            }

            /*SUM OF EVEN DIGITS*/
            for(int x=0 ;x<i;x++)
            {
                if(array[x]%2==0)
                    sum+=array[x];
            }

            /*SORTING*/
            for(int j=0;j<i-1;j++)
                for(int k=0;k<i-j-1;k++)
                    if(array[k]<array[k+1])
                    {
                        int temp = array[k];
                        array[k] = array[k + 1];
                        array[k + 1] = temp;
                    }

            /*CONVERTING THE ARRAY INTO A NUMBER*/
            while(a<i)
            {
                newnum=array[a]+newnum*10;
                a++;
            }

            return "Array = +newnum+";
            if(sum>15)
                return "Sum= +sum+ is greater than 15";
            else
                System.out.println("False");

        }

    }
}
