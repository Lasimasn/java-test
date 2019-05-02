package com.stackroute.pe1;

public class CaseChecker {

    public String capital(char string)

    {

        //char ch=string.charAt(0);

        if(Character.isUpperCase(string))//Check for Uppercase
            return"Upper Case";
        else if  (Character.isLowerCase(string))//Check for Lowercase
            return"Lower Case";
        else if (Character.isDigit(string))//Check if digit
            return "Digit";
        else return "Special Character";//Else Special Character
    }

}
