package com.projecteuler.java;

import org.junit.Assert;
import org.junit.Test;
import static junit.framework.TestCase.*;

public class TestHelper {

    @Test
    public void testPrimeCheck() {
        int a = 0;
        assertFalse(helper.PrimeCheck(a));
        int b = 1;
        assertFalse(helper.PrimeCheck(b));
        int c = 2;
        assertTrue(helper.PrimeCheck(c));

    }
    @Test
    public void testSumSquares() {
        int a =0;
        int b = 10;
        // todo test how I pass floats

    }
}
