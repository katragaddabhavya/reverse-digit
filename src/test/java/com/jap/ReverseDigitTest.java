package com.jap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseDigitTest {
    ReverseDigit reverse;


    @Before
    public void setUp() {
        reverse = new ReverseDigit();

    }

    @After
    public void tearDown() {
        reverse = null;

    }

    @Test
    public void givenInputPositiveNumberReverseTheDigit() {
        int actualoutput = reverse.getReverse(123);
        assertEquals(321, actualoutput);
    }

    @Test
    public void givenInputNegativeNumberReverseTheDigit() {
        int actualoutput = reverse.getReverse(-456);
        assertEquals(-654, actualoutput);


    }
}