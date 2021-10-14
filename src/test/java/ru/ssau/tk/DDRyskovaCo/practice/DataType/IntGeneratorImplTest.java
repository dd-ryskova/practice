package ru.ssau.tk.DDRyskovaCo.practice.DataType;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntGeneratorImplTest {

    IntGenerator callNumber = new IntGeneratorImpl();

    @Test
    public void testNextInt() {
        assertEquals(callNumber.nextInt(), 0);
        callNumber.nextInt();
        assertEquals(callNumber.nextInt(), 2);
        callNumber.nextInt();
        assertEquals(callNumber.nextInt(), 4);
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("IntGeneratorImplTest checked");
    }
}