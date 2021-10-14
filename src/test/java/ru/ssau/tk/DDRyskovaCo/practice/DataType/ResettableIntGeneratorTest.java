package ru.ssau.tk.DDRyskovaCo.practice.DataType;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResettableIntGeneratorTest {

    ResettableIntGenerator callNumber = new ResettableIntGenerator();

    @Test
    public void testNextInt() {
        assertEquals(callNumber.nextInt(), 0);
        callNumber.nextInt();
        assertEquals(callNumber.nextInt(), 2);
        callNumber.nextInt();
        callNumber.nextInt();
        assertEquals(callNumber.nextInt(), 5);
    }

    @Test
    public void testReset() {
        assertEquals(callNumber.nextInt(), 6);
        callNumber.reset();
        callNumber.nextInt();
        callNumber.nextInt();
        assertEquals(callNumber.nextInt(), 2);
        callNumber.reset();
        assertEquals(callNumber.nextInt(), 0);
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("ResettableIntGeneratorTest checked");
    }

}