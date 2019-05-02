package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomJerryTest {

    TomJerry tomJerry;

    @Before
    public void setUp() throws Exception
    {
        tomJerry = new TomJerry();
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void testValidInput()
        {
            /*Act*/
            String result = tomJerry.tomandjerry(24);
            /*Assert*/
            assertEquals("Jerry", result);
        }
    @Test
    public void testInvalidInput()
    {
        /*Act*/
        String result = tomJerry.tomandjerry(35);
        /*Assert*/
        assertEquals("Error!", result);
    }
    @Test
    public void testInvalidResult()
    {
        /*Act*/
        String result = tomJerry.tomandjerry(24);
        /*Assert*/
        assertEquals("Jerry", result);
    }
    @Test
    public void testValidResult()
    {
        /*Act*/
        String result = tomJerry.tomandjerry(23);
        /*Assert*/
        assertEquals("Tom", result);
    }


}
