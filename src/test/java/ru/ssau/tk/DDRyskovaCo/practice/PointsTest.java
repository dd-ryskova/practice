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
        assertTrue(equalsApproximately(sumPoint, new Point(3.0, 6.0, 9.0)));
        assertTrue(equalsApproximately(Points.sum(new Point(-2.0, 3.5, -14.7), new Point(-12.0, -0.5, 24.6)), new Point(-14.0, 3.0, 9.9)));
    }

    @Test
    public void testSubtract() {
        assertTrue(equalsApproximately(subtractPoint, new Point(1.0, 2.0, 3.0)));
        assertTrue(equalsApproximately(Points.subtract(new Point(-12.7, 6.54, 38.2), new Point(-1.0, 26.5, 13.0)), new Point(-11.7, -19.96, 25.2)));
    }

    @Test
    public void testMultiply() {
        assertTrue(equalsApproximately(multiplyPoint, new Point(2.0, 8.0, 18.0)));
        assertTrue(equalsApproximately(Points.multiply(new Point(12.0, 0.2, -6.1), new Point(1.0, -10.0, 3.0)), new Point(12, -2, -18.3)));
    }

    @Test
    public void testDivide() {
        assertTrue(equalsApproximately(dividePoint, new Point(2.0, 2.0, 2.0)));
        assertTrue(equalsApproximately(Points.divide(new Point(12.0, -44.10, 36.3), new Point(-2, -4, -3)), new Point(-6, 11.025, -12.1)));
    }

    @Test
    public void testEnlarge() {
        assertTrue(equalsApproximately(enlargePoint, new Point(2.4, 4.8, 7.2)));
        assertTrue(equalsApproximately(Points.enlarge(new Point(-1.0, 8.9, -3.5), 2), new Point(-2, 17.8, -7)));
    }

    @Test
    public void testLength() {
        assertEquals(thirdPoint.length(), 3.0, DELTA);
        assertEquals((Points.length(new Point(-3, 2, 1))), Math.sqrt(14), DELTA);
    }

    @Test
    public void testOpposite() {
        assertTrue(Points.equalsApproximately(oppositePoint, new Point(-2.0, -4.0, -6.0)));
        assertTrue(Points.equalsApproximately(Points.opposite(new Point(-45.3, 11.21, 0)), new Point(45.3, -11.21, 0)));
    }

    @Test
    public void testInverse() {
        assertTrue(equalsApproximately(inversePoint, new Point(0.5, 0.5, 1)));
        assertTrue(equalsApproximately(Points.inverse(new Point(8, 5, -4)), new Point(0.125, 0.2, -0.25)));
    }

    @Test
    public void testScalarProduct() {
        assertEquals(scalarProduct(firstPoint, secondPoint), 28, DELTA);
        assertEquals(Points.scalarProduct(new Point(2.0, 0.5, 3.0), new Point(-5.5, 2.0, 3.0)), -1, DELTA);
    }

    @Test
    public void testVectorProduct() {
        assertTrue(Points.equalsApproximately(vectorPoint, new Point(-8.0, 10.0, -4.0)));
        assertTrue(Points.equalsApproximately(Points.vectorProduct(new Point(0.0, 1.0, 2.0), new Point(-1.5, 2.5, -3.5)), new Point(-8.5, -3, 1.5)));
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("PointsTest checked");
    }
}
