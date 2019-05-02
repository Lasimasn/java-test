package com.stackroute.pe1;

    public class TomJerry {


        public static String tomandjerry(int number)
        {

            if ((number > 20) && (number < 30) && (number % 2 != 0))//Checking if the number lies between 20 and 30 and is not divisible by 2

                return "Tom";


            else if ((number > 20) && (number < 30) && (number % 2 == 0))//Checking if the number lies between 20 and 30 and is divisible by 2
                return "Jerry";

            else
                return "Error!";
        }

    }

