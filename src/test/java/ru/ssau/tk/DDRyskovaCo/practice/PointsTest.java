package ru.ssau.tk.DDRyskovaCo.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static ru.ssau.tk.DDRyskovaCo.practice.Points.*;

import static org.testng.Assert.*;

public class PointsTest {

    private static final double DELTA = 0.0001;

    Point firstPoint = new Point(2, 4, 6);
    Point secondPoint = new Point(1, 2, 3);
    Point thirdPoint = new Point(2, 2, 1);

    Point sumPoint = sum(firstPoint, secondPoint);
    Point subtractPoint = subtract(firstPoint, secondPoint);
    Point multiplyPoint = multiply(firstPoint, secondPoint);
    Point dividePoint = divide(firstPoint, secondPoint);
    Point enlargePoint = enlarge(secondPoint, 2.4);
    Point oppositePoint = opposite(firstPoint);
    Point inversePoint = inverse(thirdPoint);
    Point vectorPoint = vectorProduct(firstPoint, thirdPoint);


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

    @Test
    public void testEnlarge() {
        assertEquals(enlargePoint.getX(), 2.4, DELTA);
        assertEquals(enlargePoint.getY(), 4.8, DELTA);
        assertEquals(enlargePoint.getZ(), 7.2, DELTA);
    }

    @Test
    public void testLength() {
        assertEquals(thirdPoint.length(), 3.0, DELTA);
    }

    @Test
    public void testOpposite() {
        assertEquals(oppositePoint.getX(), -2.0, DELTA);
        assertEquals(oppositePoint.getY(), -4.0, DELTA);
        assertEquals(oppositePoint.getZ(), -6.0, DELTA);
    }

    @Test
    public void testInverse() {
        assertEquals(inversePoint.getX(), 0.5, DELTA);
        assertEquals(inversePoint.getY(), 0.5, DELTA);
        assertEquals(inversePoint.getZ(), 1, DELTA);
    }

    @Test
    public void testScalarProduct() {
        assertEquals(scalarProduct(firstPoint, secondPoint), 28, DELTA);
    }

    @Test
    public void testVectorProduct() {
        assertEquals(vectorPoint.getX(), -8.0, DELTA);
        assertEquals(vectorPoint.getY(), 10.0, DELTA);
        assertEquals(vectorPoint.getZ(), -4.0, DELTA);
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("PointsTest checked");
    }
}
