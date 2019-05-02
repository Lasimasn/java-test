import java.util.Scanner;
import java.lang.*;

public class Caps {
    public static void main(String args[])
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a character");
        String string=scan.nextLine();//Reads the input

        capital(string);
    }
    private static void capital(String string)

    {

        char ch=string.charAt(0);

        if(Character.isUpperCase(ch))//Check for Uppercase
            System.out.println("Upper Case");
        else if  (Character.isLowerCase(ch))//Check for Lowercase
            System.out.println("Lower Case");
        else if (Character.isDigit(ch))//Check if digit
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }



}