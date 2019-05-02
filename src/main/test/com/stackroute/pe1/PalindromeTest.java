package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;

    @Before
    public void setUp() throws Exception {
        p=new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
     public void testValidInput()
        {
            /*Act*/
            String result = p.checkPalindrome(1221);
            /*Assert*/
            assertEquals("Number is Palindrome", result);
        }

    @Test
     public void testLessPalindromeInput()
         {
            String result=p.checkPalindrome(1202);
            assertEquals("Number is not palindrome and sum of even number is less than 25 ",result);
         }

    @Test
    public void testGreaterPalindromeInput()
    {
        String result=p.checkPalindrome(8868);
        assertEquals("Number is not palindrome and sum of even number is greater than 25 ",result);
    }



}