package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CaseCheckerTest {
    CaseChecker ck;

    @Before
    public void setUp() throws Exception {
        ck=new CaseChecker();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test

        public void testValidInputUpper()
        {
            /*Act*/
            String result = ck.capital('A');
            /*Assert*/
            assertEquals("Upper Case", result);
        }

    @Test
        public void testValidInputLower()
        {
            /*Act*/
            String result = ck.capital('a');
            /*Assert*/
            assertEquals("Lower Case", result);
        }

    @Test
        public void testValidInputDigit()
        {
            /*Act*/
            String result = ck.capital('1');
            /*Assert*/
            assertEquals("Digit", result);
        }

    @Test
    public void testValidInputSpecialCharacter()
    {
        /*Act*/
        String result = ck.capital(')');
        /*Assert*/
        assertEquals("Special Character", result);
    }





}