import java.io.IOException;
import java.util.Scanner;

public class Repeat {
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scan.nextLine();
        System.out.println("Enter the number of times to be repeated");
        int number = scan.nextInt();

        repeat(string,number);

    }

    private static void repeat(String string,int number)
    {

        char[] ch = string.toCharArray();
        int length= string.length();
        int index = length - number;

        System.out.print(ch);

        //Loop to repeat last n values of the string n times
        for (int i = index; i < length; i++)
            for (int j = index; j < length; j++)
                System.out.print(ch[j]);


    }

}
