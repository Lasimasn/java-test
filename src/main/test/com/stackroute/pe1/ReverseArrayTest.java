package com.stackroute.pe1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseArrayTest {
    ReverseArray rev;

    @Before
    public void setUp() throws Exception {
        rev= new ReverseArray();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
        public void testValidInput() throws Exception
        {
            String result=rev.reverse("Stack");
            assertEquals("kcatS",result);
        }



}