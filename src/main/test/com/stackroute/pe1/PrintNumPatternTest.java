package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrintNumPatternTest {
    PrintNumPattern pn;

    @Before
    public void setUp() throws Exception {
        pn=new PrintNumPattern();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
        public void testValidInput()
        {
            /*Act*/
            int result = pn.loop(4);
            /*Assert*/
            assertEquals("1223334444", result);
        }


}