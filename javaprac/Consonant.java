
import java.io.IOException;
import java.util.Scanner;
import java.lang.*;
import java.lang.String;

import static java.lang.Character.isLetter;

public class Consonant

{
    public static void main(String[] args) throws IOException
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string or character");
        String string = scan.nextLine();

        vowels(string);

    }

    private static void vowels(String string)

    {
        char [] ch=string.toCharArray();
        for (int i = 0; ch[i]!='\0' ; i++)

            if(isLetter(ch[i]))
            {
                if ((ch[i] == 'a') || (ch[i] == 'e') || (ch[i] == 'i') || (ch[i] == 'o') || (ch[i] == 'u') || (ch[i] == 'A') || (ch[i] == 'E') || (ch[i] == 'I') || (ch[i] == 'O') || (ch[i] == 'U'))
                    System.out.println(ch[i]+"-Vowel");
                else
                    System.out.println(ch[i]+"-Consonant");

            }
            else
                System.out.println("Error!!!");
    }

}