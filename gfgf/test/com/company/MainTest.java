package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void multiply() {
      assertEquals(Main.multiply(5, 3), 5 * 3);
    }

    @Test
    public void multiplyTwoNegativ() {
        assertEquals(Main.multiply(-5, -8), -5 * -8);
    }
    @Test
    public void multiplyNegativFirst() {
        assertEquals(Main.multiply(-4, 3), -4 * 3);
    }
    @Test
    public void multiplynNegativSecond() {
        assertEquals(Main.multiply(9, -4), 9 * -4);
    }
    @Test
    public void multiplyTwoZero() {
        assertEquals(Main.multiply(0, 0), 0 * 0);
    }
    @Test
    public void multiplyZeroFirst() {
        assertEquals(Main.multiply(0, -6), 0 * -6);
    }
    @Test
    public void multiplyZeroSecond() {
        assertEquals(Main.multiply(5, 0), 5 * 0);
    }
    @Test
    public void main()  {

    }
}