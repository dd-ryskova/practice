package ru.ssau.tk.DDRyskovaCo.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TangentOperationTest {

    private static final double DELTA = 0.0001;

    TangentOperation tangent = new TangentOperation();

    @Test
    public void testApply() {
        assertEquals(tangent.apply(Math.PI / 4), 1, DELTA);
        assertEquals(tangent.apply(Math.PI / 3), Math.sqrt(3), DELTA);
        assertEquals(tangent.apply(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangent.apply(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangent.apply(Double.NaN), Double.NaN, DELTA);
    }

    @Test
    public void testTriple() {
        assertEquals(tangent.applyTriple(Math.PI / 4), Math.tan(Math.tan(1)), DELTA);
        assertEquals(tangent.applyTriple(Math.PI / 3), Math.tan(Math.tan(Math.sqrt(3))), DELTA);
        assertEquals(tangent.applyTriple(Double.NEGATIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangent.applyTriple(Double.POSITIVE_INFINITY), Double.NaN, DELTA);
        assertEquals(tangent.applyTriple(Double.NaN), Double.NaN, DELTA);
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("TangentOperationTest checked");
    }
}