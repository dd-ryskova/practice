package ru.ssau.tk.DDRyskovaCo.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static ru.ssau.tk.DDRyskovaCo.practice.Points.*;

import static org.testng.Assert.*;

public class PointsTest {

    private static final double DELTA = 0.0001;

    Point firstPoint = new Point(2, 4, 6);
    Point secondPoint = new Point(1, 2, 3);

    Point sumPoint = sum(firstPoint, secondPoint);
    Point subtractPoint = subtract(firstPoint, secondPoint);
    Point multiplyPoint = multiply(firstPoint, secondPoint);
    Point dividePoint = divide(firstPoint, secondPoint);

    @Test
    public void testsSum() {
        assertEquals(sumPoint.getX(), 3.0, DELTA);
        assertEquals(sumPoint.getY(), 6.0, DELTA);
        assertEquals(sumPoint.getZ(), 9.0, DELTA);
    }

    @Test
    public void testSubtract() {
        assertEquals(subtractPoint.getX(), 1.0, DELTA);
        assertEquals(subtractPoint.getY(), 2.0, DELTA);
        assertEquals(subtractPoint.getZ(), 3.0, DELTA);
    }

    @Test
    public void testMultiply() {
        assertEquals(multiplyPoint.getX(), 2.0, DELTA);
        assertEquals(multiplyPoint.getY(), 8.0, DELTA);
        assertEquals(multiplyPoint.getZ(), 18.0, DELTA);
    }

    @Test
    public void testDivide() {
        assertEquals(dividePoint.getX(), 2.0, DELTA);
        assertEquals(dividePoint.getY(), 2.0, DELTA);
        assertEquals(dividePoint.getZ(), 2.0, DELTA);
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("PointsTest checked");
    }
}
