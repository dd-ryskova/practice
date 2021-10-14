package ru.ssau.tk.DDRyskovaCo.practice.DataType;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SqrtOperationTest {

    private static final double DELTA = 0.0001;

    SqrtOperation sqrt = new SqrtOperation();

    @Test
    public void testApply() {
        assertEquals(sqrt.apply(25.), 5., DELTA);
        assertEquals(sqrt.apply(81.), 9, DELTA);
        assertEquals(sqrt.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqrt.apply(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(sqrt.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testApplyTriple() {
        assertEquals(sqrt.applyTriple(256.), 2., DELTA);
        assertEquals(sqrt.applyTriple(43046721.), 9., DELTA);
        assertEquals(sqrt.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(sqrt.applyTriple(Double.POSITIVE_INFINITY), Double.POSITIVE_INFINITY, DELTA);
        assertEquals(sqrt.applyTriple(Double.NaN), Double.NaN, DELTA);
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("SqrtOperationTest checked");
    }
}