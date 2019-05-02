import java.io.IOException;
import java.util.Scanner;
import java.lang.*;
public class Reverse {

    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");
        String string = scan.nextLine();
        reverse(string);
    }

    private static void reverse(String s)

    {
        char [] ch= s.toCharArray();//Converts string to character array
        int l=s.length();
        char []rev=new char[100];
        int len=l;
        //Reversing the string
        for (int i=0; i<len; i++)
        {
            rev[l-1]=ch[i];
            l--;
        }

        for(int i=0;i<len;i++)
            System.out.print(rev[i]);
    }

}
