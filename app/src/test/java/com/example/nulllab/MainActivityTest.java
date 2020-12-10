package com.example.nulllab;

import junit.framework.TestCase;

import org.junit.Test;


public class MainActivityTest extends TestCase {
    MainActivity mainActivity = new MainActivity();
    @Test
    public void testMin() {
        int a = 3;
        int b = 5;

        assertEquals(3, mainActivity.min(a,b));
    }

    @Test
    public void testMin2() {
        int a = -3;
        int b = 5;

        assertEquals(-3, mainActivity.min(a,b));
    }

    @Test
    public void testMax() {
        int a = 3;
        int b = 5;

        assertEquals(5, mainActivity.max(a,b));
    }

    @Test
    public void testMax2() {
        int a = -10;
        int b = 7;

        assertEquals(7, mainActivity.max(a,b));
    }
}