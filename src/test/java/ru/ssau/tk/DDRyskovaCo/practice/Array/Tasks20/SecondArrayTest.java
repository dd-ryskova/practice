package ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
import static ru.ssau.tk.DDRyskovaCo.practice.Array.Tasks20.SecondArray.*;

public class SecondArrayTest {

    public int[] firstArray = createArrayOfDivisors(45);

    @Test
    public void testCreateArrayOfDivisors() {
        assertEquals(firstArray.length, 3);
        assertEquals(firstArray[0], 1);
        assertEquals(firstArray[1], 3);
        assertEquals(firstArray[2], 5);
    }
}