package ru.ssau.tk.DDRyskovaCo.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IdenticalOperationTest {

    private static final double DELTA = 0.0001;

    IdenticalOperation identical = new IdenticalOperation();

    @Test
    public void testApply() {
        assertEquals(identical.apply(4.6), 4.6, DELTA);
        assertEquals(identical.apply(-12.5), -12.5, DELTA);
        assertEquals(identical.apply(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(identical.applyTriple(2.3), 2.3, DELTA);
        assertEquals(identical.applyTriple(-37.16), -37.16, DELTA);
        assertEquals(identical.applyTriple(Double.NEGATIVE_INFINITY), Double.NEGATIVE_INFINITY, DELTA);
        assertEquals(identical.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(identical.applyTriple(Double.NaN), Double.NaN, DELTA);
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("IdenticalOperationTest checked");
    }
}