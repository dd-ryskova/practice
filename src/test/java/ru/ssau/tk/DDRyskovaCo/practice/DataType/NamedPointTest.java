package ru.ssau.tk.DDRyskovaCo.practice.DataType;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class NamedPointTest {

    NamedPoint firstPoint = new NamedPoint();
    NamedPoint secondPoint = new NamedPoint(1, 2, 3);
    NamedPoint thirdPoint = new NamedPoint(2, 2, 1, "O");

    @Test
    public void testGetName() {
        assertEquals(firstPoint.getName(), "Origin");
        assertEquals(secondPoint.getName(), null);
        assertEquals(thirdPoint.getName(), "O");
    }

    @Test
    public void testSetName() {
        firstPoint.setName("X");
        secondPoint.setName("Y");

        assertEquals(firstPoint.getName(), "X");
        assertEquals(secondPoint.getName(), "Y");
        assertEquals(thirdPoint.getName(), "O");
    }

    @Test
    public void testReset() {
        firstPoint.reset();
        assertEquals(firstPoint.getName(), "Absent");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("NamedPointTest checked");
    }

    @Test
    public void testTestToString() {
        System.out.println(firstPoint);
        System.out.println(secondPoint);
        System.out.println(thirdPoint);
    }
}