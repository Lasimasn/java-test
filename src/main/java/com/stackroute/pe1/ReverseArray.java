package com.stackroute.pe1;

public class ReverseArray {
    public String reverse(String s)

    {
        char [] ch= s.toCharArray();//Converts string to character array
        int l=s.length();
        char []rev=new char[100];
        int len=l;
        //Reversing the string
        for (int i=0; i<len; i++)
        {
            rev[i]=ch[l-1];
            l--;
        }
        String reverse=new String(rev);

        return reverse;
    }
}
